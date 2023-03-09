package com.company.homework;

public class Employee{

    int id;
    String surname;
    int age;
    int salary;
    double department;

         Employee(int a, String b, int c, int d, double e) {
                  id = a;
                  surname = b;
                  age = c;
                  salary = d;
                  department = e;

         }


    double Zarplata (){
        salary*=2;
        return salary;
    }


}

class EmployeeTest {



    public static void main(String[] args) {

        Employee First = new Employee(1, "Fed" , 23, 267, 352.2);
        First.Zarplata();
        System.out.println("Id " + First.id + " Surname " + First.surname + " age " + First.age + " salary " + First.salary + " department " + First.department );
        Employee Second = new Employee(2, "Kim", 34,123, 385.5);
        Second.Zarplata();
        System.out.println("Id " + Second.id + " Surname " + Second.surname + " age " + Second.age + " salary " + Second.salary + " department " + Second.department );





        }
    }
