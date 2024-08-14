package basic.oop.exercise7;

public class Invoice {

	private String issuer;
	private double amount;

	public void calculateAmount(double grossAmount, double discount) {
		this.amount = grossAmount - discount;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public double getAmount() {
		return amount;
	}
}
