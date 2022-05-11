package Keyword;

class Box {
    private int l, b, h;

    public void set(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void get() {
        System.out.println(this.l + " " + this.b + " " + this.h);
    }
}

public class This {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.set(19, 23, 56);
        b1.get();
    }
}
