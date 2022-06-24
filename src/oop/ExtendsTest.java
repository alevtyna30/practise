package oop;

public class MyExtends extends Extends {
    public void multiplication (int a, int b) {
        c = a * b;
        System.out.println("произведение чисел " + c);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        MyExtends ext = new MyExtends();
        ext.addition(a, b);
        ext.subtraction(a, b);
        ext.multiplication(a, b);
    }

}
