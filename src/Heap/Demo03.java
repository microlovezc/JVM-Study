package Heap;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) throws Exception{
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            students.add(new Student());
        }
        Thread.sleep(1000000L);
    }
}
class Student{
    byte[] big = new byte[1024*1024];
}