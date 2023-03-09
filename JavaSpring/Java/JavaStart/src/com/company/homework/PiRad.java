package com.company.homework;

public class PiRad {


    static final double pi = 3.14;

    double rad(double a){

        double rd = pi*a*a;
        System.out.println("Radius = " + rd);
        return rd;}

    static double rds(double b){

        double rs = 2 * pi * b;
        System.out.println( "Dlina = " + rs);
        return rs;

    }
}


class PiRadTest{

    public static void main(String [] args) {
        PiRad rd = new PiRad();
        rd.rad(8.3);
        rd.rds(12.4);

    }
}
