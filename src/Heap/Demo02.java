package Heap;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        System.out.println("1..........");
        Thread.sleep(30000);
        byte[] bytes = new byte[1024*1024*10];
        System.out.println("2............");
        Thread.sleep(20000);
        bytes = null;
        System.gc();
        System.out.println("3.............");
        Thread.sleep(1000000L);
    }
}
