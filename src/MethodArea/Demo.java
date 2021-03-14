package MethodArea;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
/*
* 演示元空间内存溢出  Exception in thread "main" java.lang.OutOfMemoryError: Compressed class space
*       -XX:MaxMetaspaceSize=16m
* */
public class Demo extends ClassLoader{
    public static void main(String[] args) {
        int j = 0;
        try {
            Demo demo = new Demo();
            for (int i = 0; i < 20000; i++,j++) {
                ClassWriter classWriter = new ClassWriter(0);
                classWriter.visit(Opcodes.V1_8,Opcodes.ACC_PUBLIC,"Class"+i,null,"java/lang/Object",null);
                byte[] bytes = classWriter.toByteArray();
                demo.defineClass("Class"+i,bytes,0,bytes.length);
            }

        }finally {
            System.out.println(j);
        }
    }
}
