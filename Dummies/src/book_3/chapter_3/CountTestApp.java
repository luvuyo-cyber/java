package book_3.chapter_3;

import book_3.chapter_3.CountTest;

public class CountTestApp {
    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 100; i++) {
            CountTest c1 = new CountTest();
            printCount();
        }
    }

    private static void printCount() {
        System.out.println("There are now " + CountTest.getInstanceCount() + " instances of the CountTest class.");
    }
}