package com.company.homework;

public class HomeworkObj {

    String name;
    String surname;
    int year;
    double avMath;
    double avEcon;
    double avEng;


    HomeworkObj(String name1, String surname1, int year1, double avMAth1,double avEcon1, double avEng1) {

        name = name1;
        surname = surname1;
        year = year1;
        avMath = avMAth1;
        avEcon = avEcon1;
        avEng = avEng1;

        System.out.println(name + " " + surname + " " + year + " " + avMath + " first construct ");
    }

    HomeworkObj(String name1, String surname1, int year1) {

        name = name1;
        surname = surname1;
        year = year1;

        System.out.println(name + " " + surname + " " + year + " second construct ");
    }

    HomeworkObj() {
        System.out.println(" No parametrs ");
    }


}




class StudentTest {


 public static void main(String[] args) {


     HomeworkObj Vasya = new HomeworkObj("Vasya", "Petrov",3, 3.0,4.0, 3.5);
     HomeworkObj Petr = new HomeworkObj("Petr", "Petrov",5);
     HomeworkObj pusto = new HomeworkObj();





 }
}
