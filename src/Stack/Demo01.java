package Stack;
/*
* 演示栈内存溢出  Exception in thread "main" java.lang.StackOverflowError
* VmOption里设置：-Xss256k  可以设置栈的内存大小
* */
public class Demo01 {
    private static int count;

    public static void main(String[] args) {
        try {
            method1();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(count);
        }

    }

    private static void method1() {
        count++;
        method1();
    }
}
