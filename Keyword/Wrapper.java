package Keyword;

public class Wrapper {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("123");
        Double d1 = Double.valueOf("23.89");
        int i = Integer.parseInt("881");
        double d = Double.parseDouble("45.99");
        int c = i1.intValue();
        double f = d1.doubleValue();
        System.out.println(c + "\n" + f + "\n" + i + "\n" + d);
    }
}
