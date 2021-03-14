package store.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String address;
	private Calendar dateJoined;
	private String phoneNumber;
	private boolean feePaid;
	private static final String MEMBER_STRING = "XM";
	private static int idCounter;
	private TransactionList membersTransactions = new TransactionList();

	public Member(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.dateJoined = new GregorianCalendar();
		this.phoneNumber = phoneNumber;
		id = MEMBER_STRING + ++idCounter;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Calendar getDateJoined() {
		return dateJoined;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isFeePaid() {
		return feePaid;
	}

	public void setFeePaid(boolean feePaid) {
		this.feePaid = feePaid;
	}

	public void addMemberTransaction(Transaction transaction) {
		membersTransactions.addTransaction(transaction);
	}

	public Iterator<Transaction> iterator() {
		return membersTransactions.iterator();
	}

	/**
	 * String form of the member
	 * 
	 */
	@Override
	public String toString() {
		String string = "Member name: " + name + ", address: " + address + ", id: " + id + ", date joined: "
				+ dateJoined + ", phone number: " + phoneNumber;
		if (isFeePaid()) {
			string += ", Fee has been paid";
		} else {
			string += ", Fee has not been paid";
		}

		return string;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
