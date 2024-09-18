
package ex10_2_exercise;

public class ShoppingCart {
    public static void main(String[] args){
        Order order = new Order("Luvuyo Mazibuko", 910.00, "LA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
