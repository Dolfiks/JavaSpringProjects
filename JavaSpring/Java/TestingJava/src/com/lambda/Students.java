package com.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;


public class Students implements Comparable<Students> {
    int course;
    String surname;
    String name;
    char sex;

    public Students(int course, String surname, String name, char sex) {
        this.course = course;
        this.surname = surname;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Students{" +
                "course=" + course +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int compareTo(Students secVal) {
        int result = this.course - secVal.course;

        if (result == 0) {
            result = this.surname.compareTo(secVal.surname);
        }
        return result;
    }
}

class Check{
    public void CheckStudent(ArrayList<Students> alS, Predicate<Students> fs){
        for(Students s : alS){
            if (fs.test(s)){
                System.out.println(s);
            }
        }
    }
}
