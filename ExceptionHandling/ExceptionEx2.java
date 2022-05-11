package ExceptionHandling;

import java.util.*;

public class ExceptionEx2 {
    public static void main(String[] args) {

        int balance = 5000;
        int withdrawal;
        Scanner sc = new Scanner(System.in);
        if (balance < withdrawal) {
            throw new ArithmeticException("Insufficient Balance");

        }
        balance -= withdrawal;
        System.out.println("Transaction Successfully Completed");
        System.out.println("Program Continue...");
    }
}
