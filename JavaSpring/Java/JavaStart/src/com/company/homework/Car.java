package com.company.homework;

public class Car {

    public  String color;
    public  String engine;
    public int door = 4;


    public Car (String color,String engine, int door){
        this.color = color;
        this.engine = engine;
        this.door = door;
    }

}

class CarTest{

    void ChangeCol(Car c, int doorc){
        c.door=doorc;
    }


    void SwapCol(Car c, Car c1){
        int c2 = c1.door;
        c1.door = c.door;
        c.door= c2;
    }


    public static void main(String [] args){
        CarTest check = new CarTest();
        Car frst = new Car("Red","v8",2);
        Car second = new Car("Blue", "v6", 4);

        check.ChangeCol(frst,frst.door);
        check.SwapCol(frst,second);


    System.out.println(frst.color + " " + frst.engine + " " + frst.door);
    System.out.println(second.color + " " + second.engine + " " + second.door);


    }




}