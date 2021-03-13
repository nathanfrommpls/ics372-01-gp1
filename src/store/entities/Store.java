package store.entities;
import java.util.Date;
import java.util.Hashtable;

public class Store {
	private static Store store;
	
    /**
     * Private for the singleton pattern Creates the catalog and member collection
     * objects
     */
    private Store() {
    }

    /**
     * Supports the singleton pattern
     * 
     * @return the singleton object
     */
    public static Store instance() {
        if (store == null) {
            return store = new Store();
        } else {
            return store;
        }
    }
    
    public int enrollMember(String name, String address, String phoneNumber,
    Date joined, boolean Paid ) {
    	int memberId = 123456;
        return memberId;
    }
    
    public void removeMember(int memberId) { 
    	System.out.println("Remove Member: " + memberId);
    }
    
    public int addProduct(String name, int reorderLevel,int priceDollars,
    int priceCents) {
    	int productId = 123456;
    	return productId;
    }
    
    public String checkout(Hashtable<String,Integer> cart) {
    	return "Checkout Output.";
    }
    
    public String processShipment(Hashtable<String,Integer> shipment) {
    	return "Process Output.";
    }
    
    public String changePrice(int productId, int priceDollars, int priceCents) {
    	return "Successfully changed price on " + productId + " to $"
    	+ priceDollars + "." + priceCents + ".";
    }
    
    public String retrieveProductInfo(int productId) {
    	return "Product details for " + productId;
    }
    
    public String retrieveMemberInfo(int memberId) {
    	return "Product details for " + memberId;
    }
    
    public String printTransactions(int memberId) {
    	return "Transactions for " + memberId;
    }
    
    public String listOutstandingOrders() {
    	return "Here are your orders.";
    }
    
    public String listAllMembers() {
    	return "Here are all the members.";
    }
    
    public String listAllProducts() {
    	return "Here are all the products.";
    }
    
    public void save() {
    	System.out.println("Save.");
    }
}
