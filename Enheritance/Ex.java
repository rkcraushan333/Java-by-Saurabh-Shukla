package Enheritance;

public class Ex {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(2004180);
        s1.setAge(23);
        s1.setName("Raushan Kumar");
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll no: " + s1.getRollno());
        System.out.println("Age: " + s1.getAge());
    }
}
