package Intitalization_block;

public class InstanceIn {
    private int x;
    {
        System.out.println("Intialization Block:x=" + x);
        x = 5;
    }

    public InstanceIn() {
        System.out.println("Constructor:x=" + x);
    }

    public static void main(String[] args) {
        InstanceIn i1 = new InstanceIn();
        InstanceIn i2 = new InstanceIn();
    }
}
