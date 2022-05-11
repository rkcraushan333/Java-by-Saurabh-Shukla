package Keyword;

final class Dummy1 { // final class (can't be inherited)

}

class Dummy2 {
    public final void Fun2() { // final method (can't be overridden)

    }
}

public class Final {
    private final int x; // final instance member variable
    private final static int y; // final static member variable

    Final() {
        x = 6;
    }

    static {
        y = 9;
    }

    public void fun() {
        final int k; // final local variable
    }

    public static void main(String[] args) {
        Final f = new Final();
        System.out.println(f.x + Final.y);
    }
}
