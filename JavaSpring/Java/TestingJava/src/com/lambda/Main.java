package com.lambda;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        Students s1 = new Students(2, "Fedorov", "Ivan", 'm');
        Students s2 = new Students(1, "Sidorov", "Aleksey", 'm');
        Students s3 = new Students(6, "Petrov", "Nikolay", 'm');
        Students s4 = new Students(4, "Valinyuk", "Kristina", 'f');
        Students s5 = new Students(5, "Feduk", "Anastasiya", 'f');
        Students s6 = new Students(3, "Redov", "Anton", 'm');
        Students s7 = new Students(1, "Kelov", "Anatoliy", 'm');

        ArrayList student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);
        student.add(s6);
        student.add(s7);

        Check info = new Check();

        Collections.sort(student);
        System.out.println(student);
        System.out.println("--------------------");

        System.out.println("Course more 3");
        info.CheckStudent(student,p -> p.course>3);

        System.out.println("--------------------");

        System.out.println("Female");

        info.CheckStudent(student,p -> p.sex=='f');

        System.out.println("--------------------");

        System.out.println("Surname less 5");

        info.CheckStudent(student,p -> p.surname.length()<7);






    }


}
