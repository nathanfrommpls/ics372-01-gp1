import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;
	private Calendar date;
	private int memberID;
	private int productID;

	public Transaction(int memberID) {
		super();
		this.date = new GregorianCalendar();
		this.memberID = memberID;
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

	public int getProductID() {
		return productID;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}
}