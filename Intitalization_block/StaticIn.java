package Intitalization_block;

public class StaticIn {
    private static int n;
    static {
        System.out.println("Static inititalization:n= " + n);
        n = 10;
    }

    public static void main(String[] args) {
        StaticIn s1 = new StaticIn();
        StaticIn s2 = new StaticIn();
    }
}
