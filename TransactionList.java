import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TransactionList implements Iterable<Transaction>, Serializable {
	private List<Transaction> transactions = new LinkedList<Transaction>();

	public boolean addTransaction(Transaction transaction) {
		transactions.add(transaction);
		return true;
	}

	public Transaction removeTransaction(int transactionID) {
		for (ListIterator<Transaction> iterator = transactions.listIterator(); iterator.hasNext();) {
			Transaction transaction = iterator.next();
			int id = transaction.getTransactionID();
			if (transaction.getTransactionID() == transactionID) {
				iterator.remove();
				return transaction;
			}
		}
		return null;
	}

	public String getTransactionInfo(int transactionID) {
		String result = null;
		for (ListIterator<Transaction> iterator = transactions.listIterator(); iterator.hasNext();) {
			Transaction transaction = iterator.next();
			int id = transaction.getTransactionID();
			if (transaction.getTransactionID() == transactionID) {
				result = "Transaction ID: " + transaction.getTransactionID() + "/nDate: " + transaction.getDate();
			}
		}
		return result;

	}

	public Iterator<Transaction> iterator() {
		return transactions.iterator();
	}

}
