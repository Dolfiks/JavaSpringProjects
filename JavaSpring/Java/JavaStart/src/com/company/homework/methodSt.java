package com.company.homework;

public class methodSt {

    static int umn(int a, int b, int c){

        int mn = a*b*c;
        System.out.println("mn = " + mn);
        return mn;
    }

    static void dele(double a, double b){
        double dl = a/b;
        System.out.println("dl = "+dl);

    }

}


class methodStTest{

    public static void main(String [] args) {

        methodSt.umn(4,3,8);
        methodSt.umn(7,3,9);
        methodSt.dele(5,1);
        methodSt.dele(7,3);


    }





}


