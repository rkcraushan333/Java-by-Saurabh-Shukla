package Array;

public class ArrayExample2 {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[5];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
    }
}
