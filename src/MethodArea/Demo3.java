package MethodArea;

public class Demo3 {
    public static void main(String[] args) {
        String x = new String("a") + new String("b");
        String x1 = "ab";
        String x2 = x.intern();
        System.out.println(x1 == x);
        System.out.println(x1 == x2);
    }
}
