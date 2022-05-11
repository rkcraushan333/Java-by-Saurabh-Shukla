package ExceptionHandling;

import java.io.*;

public class Example4 {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // System.out.println("After Exception");
    }
}
