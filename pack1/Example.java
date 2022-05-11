package pack1;

import pack2.Student;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(2004180);
        s1.setName("Raushan Kumar");
        System.out.println("Roll no: " + s1.getRollno());
        System.out.println("Name: " + s1.getName());
    }
}
