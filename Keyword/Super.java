package Keyword;

class A {
    int x;

    void f1() {
        System.out.println(this.x);
    }
}

class B extends A {
    int x;

    void f1() {
    }

    void f2(int a, int b) {
        this.x = a;
        super.x = b;
        super.f1();
    }
}

public class Super {
    public static void main(String[] args) {
        B b1 = new B();
        b1.f2(5, 7);
    }
}
