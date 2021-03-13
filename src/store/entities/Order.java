package store.entities;

import java.io.Serializable;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private Product product;
	private int newStock;
	private static final String ORDER_STRING = "OR";
	private static int idCounter;

	public Order(Product product) {
		this.product = product;
		newStock = 2 * product.getReorderThreshold();
		id = ORDER_STRING + ++idCounter;
	}

	public String getId() {
		return id;
	}

	public String getProduct() {
		return product;
	}

	public int getNewStock() {
		return newStock;
	}

	/**
	 * String form of the member
	 * 
	 */
	@Override
	public String toString() {
		String string = "id: " + id + ", Product name: " + product.getName() + ", New Stock: " + newStock;
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
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
