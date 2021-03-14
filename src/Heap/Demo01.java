package Heap;

import java.util.ArrayList;

/*
* 堆内存溢出  java.lang.OutOfMemoryError: Java heap space
* -Xmx8m
* */
public class Demo01 {
    public static void main(String[] args) {

        int i = 0;
        try {
            ArrayList<String> list = new ArrayList<>();
            String a = "hello";
            while (true){
                list.add(a);
                a = a+a;
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(i);
        }

    }
}

