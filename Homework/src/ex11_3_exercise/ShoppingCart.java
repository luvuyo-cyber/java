
package ex11_3_exercise;

/*
1. The ShoppingCart class has an array of Item objects, initialized with three items.
2. The main method creates a ShoppingCart object and calls its displayTotal() method.
3. displayTotal() calculates the total price of items in the cart:
* It iterates through the items array.
* If an item is back-ordered, it skips it using the continue statement.
* Otherwise, it adds the item's price to the total.


4. Finally, it prints the total price of the shopping cart.
This setup simulates a simple e-commerce scenario where:
* Items can be added to a shopping cart.
* Items may be back-ordered randomly.
* The total price is calculated only for items that are in stock (not back-ordered).

The random back-order status in Item.checkStock() means that each time you run the program,
you might get different results for which items are available and what the total price is.
*/

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",1.00), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){   
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx].isBackOrdered()) 
		continue;
            total += items[idx].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
}
