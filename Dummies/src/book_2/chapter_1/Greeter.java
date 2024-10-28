package book_2.chapter_1;

// This class creates a Greeter object →1
// that displays a hello message on
// the console.


//public class Greeter {
//    public void sayHello() {
//        System.out.println("Hello, World!");
//    }
//}



// This class creates a Greeter object
// that displays a hello message
// in a dialog box.

import javax.swing.*;

public class Greeter {
    public void sayHello() {
        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}