package book_2.chapter_2;

import javax.swing.*;

public class DialogApp
{

    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog("Enter an integer:");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }

}
