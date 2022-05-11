package Filehandle;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("myfile2.txt");
            f.write("Hello This is SHAN");
            f.close();
            System.out.println("Successfully written");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
