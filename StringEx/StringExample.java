package StringEx;

import java.lang.String;

public class StringExample {
    public static void main(String[] args) {

        String s1 = "computer";
        String s2 = "computer";
        String s3 = new String("computer");
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

    }
}
