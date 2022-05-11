package InputScanner;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("Enter your name and age: ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

}
