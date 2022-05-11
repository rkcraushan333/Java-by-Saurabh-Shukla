package Filehandle;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File myobj = new File("myfile2.txt");
            if (myobj.createNewFile()) {
                System.out.println("File created: " + myobj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}