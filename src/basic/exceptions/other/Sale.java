package basic.exceptions.other;

import java.util.ArrayList;

public class Sale {

	private String clientName;
	private ArrayList<Item> sale;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public ArrayList<Item> getSale() {
		return sale;
	}

	public void setSale(ArrayList<Item> sale) {
		this.sale = sale;
	}

}
