package ch1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.next();//当前线程阻塞
        method1();
        method2();
    }

    public static void method2(){
        System.out.println("method 2");
    }

    public static void method1(){
        System.out.println("method 1");
    }
}
