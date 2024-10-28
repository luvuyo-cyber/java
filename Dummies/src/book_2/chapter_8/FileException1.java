package book_2.chapter_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException1 {

    public static void main(String[] args) {
        openFile("c:\test.txt");
    }

    public static void openFile(String file) {
        // 1st Way to handle Exceptions:

        try {
            FileInputStream f = new FileInputStream(file);
        } catch (FileNotFoundException error) {
            System.out.println("File not found.");
        }
    }
}
