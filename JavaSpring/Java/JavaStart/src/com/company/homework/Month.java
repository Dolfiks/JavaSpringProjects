package com.company.homework;

public class Month {

   static byte month = 5;

    public static void main(String [] args){

        switch (month){

            case 1: System.out.println("January = 31 day");
            case 2:
            case 3: break;
            case 4: System.out.println("31"); break;

            default:System.out.println("Nema");
        }

    }
}
