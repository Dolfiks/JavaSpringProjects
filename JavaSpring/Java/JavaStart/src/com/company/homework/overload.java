package com.company.homework;

public class overload {

    String sum(String s) {
       String  a = s;
        System.out.println("Parametr not found! ");
        return a;
    }

    int sum(int a) {
       int b = a;
        System.out.println("Summa odnogo " + b);
        return b;
    }

    int sum(int a, int b) {
        int s = a + b;
        System.out.println("Summa " + a + " + " + b + " result = " + s);
        return s;
    }

    int sum(int a, int b, int c) {
        int s = a + b + c;
        System.out.println("Summa " + a + " + " + b + " +  " + c +" result = " + s);
        return s;
    }

    int sum(int a, int b, int c, int d) {
        int s = a + b + c + d;
        System.out.println("Summa " + a + " + " + b + " + " + c + " + " + " result = " + s);
        return s;
    }
}

    class overloadTest{

    public static void main(String [] args){

        overload first = new overload();
        int a = first.sum(3);
        String b = first.sum("ss");
        int c = first.sum(5,6);
        int d = first.sum(8,4,2);
        int e = first.sum(1,8,4,2);

    }
}
