package ExceptionHandling;

import java.util.*;

public class ExceptionEx3 {
    public static void main(String[] args) {

        int balance = 5000;
        int withdrawal = 5001;
        try {
            if (balance < withdrawal) {
                throw new ArithmeticException("Insufficient Balance");

            }
            balance -= withdrawal;
            System.out.println("Transaction Successfully Completed");
        } catch (ArithmeticException e) {
            System.out.println("Exception " + e.getMessage());
        }

        System.out.println("Program Continue...");
    }
}
