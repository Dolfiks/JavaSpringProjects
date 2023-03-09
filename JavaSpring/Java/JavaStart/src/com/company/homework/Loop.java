package com.company.homework;

public class Loop {
    static byte hours = 0;
    static byte minute = 0;
    static byte second = 0;

     static void time(){
     for (hours=0; hours<=23; hours++) {
         for (minute = 0; minute <= 59; minute++) {
             for (second = 0; second <= 59; second++) {
                 System.out.println("Hours: " + hours + "  Minute: " + minute + " Second: " + second);
             }
         }
         if (hours == 23){
             break;
         }
     }
     }

     static void timedo() {
FIRST:
     while (hours<24) {

         MIDLE:
         while (minute < 59) {
             minute++;
             System.out.println("H: " + hours + " minute: " + minute);
             if(minute == 59){
                    minute = 0;
                     break ;
         }
         }
         hours++;
         if (hours==24){
             break;

         }
     }

     }


    public static void main (String [] args){


        timedo();





        }









    }

