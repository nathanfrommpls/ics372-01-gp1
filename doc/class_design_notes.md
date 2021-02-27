UI

Store (Facade)

	* 1
	
	* 2
	
	* 3
	
	* 4
	
 	…
 	
	* 15

Inventory

	* newProduct
	
	* removingProduct
	
	* getProductInfo
	
	* updateProduct
	
- Product
	- id
	- Name
	- Quantity
	- ReorderThreshold
	- Price

MemberList

	* newMember
	
	* removingMember
	
	* getMemberInfo
	
	* updateProduct
	
- Members
	- id
	- name
	- address
	- dateJoined
	- phoneNumber
	- feePaid


OrderList

	* newOrder
	
	* removingOrder
	
	* getOrderInfo
	
	* updateOrder
	
- Order
	- id (order)
	- id (product)
	- quantity?



TransactionHistory

	* newTransaction
	
	* removingTransaction
	
	* getTransactionInfo
	
	* updateTransaction
	
- Transaction
	- id (memberid)
	- date
	- id (productid)