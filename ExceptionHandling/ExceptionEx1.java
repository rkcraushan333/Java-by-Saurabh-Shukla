package ExceptionHandling;

public class ExceptionEx1 {
    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
            System.out.println("try block");

        } catch (ArithmeticException e) {
            System.out.println("Catch block1\n" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Catch block2\n" + e.getMessage());
        } finally {
            System.out.println("finally block");
        }
        System.out.println("End of program");
    }
}
