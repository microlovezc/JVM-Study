package MethodArea;
/*
* 演示 StringTable 垃圾回收
* -Xmx10m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails -verbose:gc
* */
public class Demo5 {
    public static void main(String[] args) {
        int i=0;
        try {
            for (int i1 = 0; i1 < 10000; i1++) {
                String.valueOf(i1).intern();
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
        }finally {
            System.out.println(i);
        }
    }
}
