/***
 * @author Keith Butterfield
 * 
 * Took code and inspiration from Andrew's Member List java file
 * 
 */

package store.entities;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Took code from Andrew's Member List java file

public class ProductList implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Product> products = new LinkedList<Product>();

	public void addProduct(int id) {
		for (Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
			Product product = iterator.next();
			if (product.getId() == id) {
				product.setInventory(product.getReorderThreshold() * 2); // can't remember is its * 2 all the time of
																			// just first time
				break; // breaking loop and function - no longer needs it since item found
			}
		}

		// sloppy now - in rush to finish this by tonight
		// create input (either here or in new function) to create new constructor and
		// add product into list
//		Product newProduct = new Product();

		// products.add(newProduct);

	}

	// business case 7
	public void showProductInfo(int id) {
		for (Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
			Product product = iterator.next();
			if (product.getId() == id) {
				product.toString();
			}
		}
	}

	// business case 6
	public void changePrice(int id, double newPrice) {
		for (Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
			Product product = iterator.next();
			if (product.getId() == id) {
				product.setPrice(newPrice);
			}
		}
	}

	public boolean removeProduct(Product product) {
		int index = products.indexOf(product);
		products.remove(index);
		return true;
	}

	public Iterator<Product> iterator() {
		return products.iterator();
	}

	@Override
	public String toString() {
		return products.toString();
	}

	// Change from business case 6 to house every aspect of product that can be
	// Can be discarded since he is not asking for this in assignment
	// changed
//	public void changeProduct(int id, String choice) {
//		for (Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
//			Product product = iterator.next();
//			if (product.getId() == id) {
//				switch(choice) {
//					case "name":
//						product.setName(choice);
//						break;
//					case "price":
//						product.setPrice(choice);
//						break;
//				}
//
//			}
//		}
//	}

}
