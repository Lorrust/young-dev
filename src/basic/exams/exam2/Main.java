package basic.exams.exam2;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    static List<SaleItem> saleItemList = new ArrayList<>();

    public static void main(String[] args) {

        Sale sale = new Sale();

        Client client = new Client();
        client.setName(JOptionPane.showInputDialog("Enter the client's name:"));
        client.setBirthDate(
                LocalDate.parse(JOptionPane.showInputDialog("Enter the client's birth date (dd/MM/yyyy):"),
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(client.getBirthDate());

        sale.setClient(client);

        String userInput = "";

        do {
            userInput = JOptionPane.showInputDialog("Enter the product name (or 'end'):");

            if (!userInput.equals("end")) {
                addNewProduct(userInput);
            }

        } while (!userInput.equals("end"));

        System.out.println(client.toString());
        System.out.println(sale.toString());

        sale.setSaleList(saleItemList);

        for (int i = 0; i < sale.getSaleList().size(); i++) {
            Product item = sale.getSaleList().get(i).getItem();
            System.out.println(item.getName());
        }

        sale.setPaymentType(Integer.parseInt(JOptionPane.showInputDialog(
                "Enter the payment type:\n1 - Credit Card\n2 - Debit Card\n3 - Cash")));

        JOptionPane.showMessageDialog(null, generateReceipt(sale));

    }

    public static void addNewProduct(String itemName) {
        Product p = new Product();
        p.setName(itemName);
        p.setUnitPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter the unit price:")));

        do {
            try {
                p.setAmount(Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:")));
                validateProductAmount(p.getAmount());
            } catch (ProductAmountException e) {
                JOptionPane.showMessageDialog(null, "Quantity cannot be less than 0 or greater than 50.");
            }
        } while (p.getAmount() < 0 || p.getAmount() > 50);

        SaleItem saleItem = new SaleItem();
        saleItem.setItem(p);

        saleItemList.add(saleItem);
        System.out.println(saleItemList.toString());
    }

    static void validateProductAmount(int amount) throws ProductAmountException {
        if (amount < 0 || amount > 50) {
            throw new ProductAmountException();
        }
    }

    static String generateReceipt(Sale sale) {
        String message = "****************** RECEIPT ******************\n\n";

        double subTotal = 0;

        for (int i = 0; i < sale.getSaleList().size(); i++) {
            Product item = sale.getSaleList().get(i).getItem();
            double itemTotalPrice = item.getAmount() * item.getUnitPrice();
            subTotal += itemTotalPrice;

            message += item.getName() + "\n";
            message += "  " + item.getAmount() + "x " + String.format("%.2f", item.getUnitPrice())
                    + " ...................................... " + String.format("%.2f", itemTotalPrice) + "\n";
        }

        message += "\nSubTotal ......................................... " + String.format("%.2f", subTotal) + "\n";

        int clientDiscount = determineDiscount(sale.getClient());
        System.out.println(clientDiscount);
        String discountDesc = "";

        switch (clientDiscount) {
            case 30:
                discountDesc = "30% Birthday Discount";
                break;
            case 20:
                discountDesc = "20% Premium Client Discount";
                break;
            case 10:
                discountDesc = "10% Senior Discount";
                break;
            default:
                discountDesc = "No Discount";
        }

        message += discountDesc + "\n\n";

        double total = subTotal - (subTotal * clientDiscount / 100);

        message += "Total .................................................. " + String.format("%.2f", total);
        message += "\nPayment Method: " + determinePaymentType(sale) + "\n";

        message += "Client: " + maskName(sale.getClient());

        return message;
    }

    static long calculateAge(Client client) {
        LocalDate clientBirthDate = client.getBirthDate();
        LocalDate currentDate = LocalDate.now();

        return Period.between(clientBirthDate, currentDate).toTotalMonths() / 12;
    }

    static int determineDiscount(Client client) {
        if (client.getBirthDate().getDayOfYear() == LocalDate.now().getDayOfYear()) {
            return 30;
        }
        if (calculateAge(client) > 60) {
            return 10;
        }
        if (client instanceof PremiumClient) {
            return 20;
        }
        return 0;
    }

    static String determinePaymentType(Sale sale) {
        switch (sale.getPaymentType()) {
            case 1:
                return "Credit Card";
            case 2:
                return "Debit Card";
            case 3:
                return "Cash";
            default:
                return "Cash";
        }
    }

    static String maskName(Client client) {
        char clientInitial = client.getName().charAt(0);
        return clientInitial + client.getName().replaceAll("[a-zA-Z0-9!@#$%&*]", "*");
    }
}
