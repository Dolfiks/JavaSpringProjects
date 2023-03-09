package com.company.homework;

public class ObjT {
    ObjT(int a, int b){
        System.out.println(1);
    }

    ObjT(int a){
        System.out.println(2);
    }

    ObjT(int a, String c){
        System.out.println(3);
    }


    ObjT(String c, int a){
        System.out.println(4);
    }

    public static void main(String [] args){

    ObjT o2 = new ObjT(1, 4);
    ObjT o1 = new ObjT(1);
    ObjT o3 = new ObjT(1,"kek");
    ObjT o4 = new ObjT("kek",1);

    o1 =null;
    o2= null;


    }
}
