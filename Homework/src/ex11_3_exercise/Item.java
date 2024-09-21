package ex11_3_exercise;

/*
1. The Item class represents a product with properties like id, desc (description), price, and isBackOrdered.
2. There's a static nextId variable used to assign unique IDs to each item.
3. The constructor takes a description and price, sets the ID, and checks the stock.
4. checkStock() simulates a stock check by generating a random number. If it's odd, the item is considered back-ordered.
5. setId() assigns a unique ID to each item and increments the nextId.
6. The class includes getter and setter methods for its properties.
*/

public class Item {

    private int id;
    private String desc;
    private double price;
    private boolean isBackOrdered;
    private static int nextId = 1;

    public Item(String desc, double price) {
        setId();
        this.desc = desc;
        this.price = price;
        checkStock();
    }

    private void checkStock() { // Typically you would query a database

        // Generate a random number between 0 and 999

        int num = (int)(Math.random() * 1000);
        if (num % 2 == 1) {
            this.isBackOrdered = true;
            System.out.println(getDesc() + " is back ordered.");
        }
        else {
            this.isBackOrdered = false;
        }
    }


    private void setId() {
        id = Item.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBackOrdered() {
        return isBackOrdered;
    }
}
