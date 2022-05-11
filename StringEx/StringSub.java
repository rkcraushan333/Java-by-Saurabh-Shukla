package StringEx;

import java.lang.String;

public class StringSub {
    public static void main(String[] args) {

        String s1 = new String("computer");
        String s2 = s1.substring(3);
        String s3 = s1.substring(2, 6);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
