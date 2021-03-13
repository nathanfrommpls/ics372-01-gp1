package store.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;
	private Calendar date;
	private int memberID;
	private int transactionID;
	private static int idCounter;
	private ArrayList<Product> list = new ArrayList<Product>();

	public Transaction(int memberID) {
		this.date = new GregorianCalendar();
		this.memberID = memberID;
		this.transactionID = idCounter;
		idCounter++;
	}

	public boolean onDate(Calendar date) {
		return ((date.get(Calendar.YEAR) == this.date.get(Calendar.YEAR))
				&& (date.get(Calendar.MONTH) == this.date.get(Calendar.MONTH))
				&& (date.get(Calendar.DATE) == this.date.get(Calendar.DATE)));
	}

	public String getDate() {
		return date.get(Calendar.MONTH) + "/" + date.get(Calendar.DATE) + "/" + date.get(Calendar.YEAR);
	}

	public int getMemberID() {
		return memberID;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
}