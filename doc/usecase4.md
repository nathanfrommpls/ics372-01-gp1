# Use Case No. 4

| Actions performed by the actor | Responses from the system |
|---|---|
| The member arrives at checkout counter with cart of grocery items. The cashier inputs product id and quantity of each item in cart.| |
| | The systems computers the price of a item type, i.e. price times quantity, then adds that value to the aggregate price of the cart. It then displays the descriptions of item, quantity, unit price, total price for item, and aggregate cart price. If there are items remaining in the cart it loops back and again computes for that item type. |
| Member pays cashier for total price of cart. | |
| | System removes quantity of item from inventory, if that quantity drops below the reorder value of that item, create an order for two times the reorder value and if ordered display description, quantity, and order number. System will loop back until there are no items left from cart. |