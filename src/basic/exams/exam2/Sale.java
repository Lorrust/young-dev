package basic.exams.exam2;

import java.util.List;

public class Sale {

	Client client;
	List<SaleItem> saleList;
	int paymentType;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<SaleItem> getSaleList() {
		return saleList;
	}

	public void setSaleList(List<SaleItem> saleList) {
		this.saleList = saleList;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

}
