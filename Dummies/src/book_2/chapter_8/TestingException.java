package book_2.chapter_8;

public class TestingException {
        public static void main(String[] args) {
            int a = 5, b = 0;

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("You may not divide by zero");
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
