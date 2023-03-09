package TraineeStream;

import java.util.ArrayList;
import java.util.Collection;

public class StreamTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vasiliy", "Petrov", 'm', 7.2);
        Student s2 = new Student(3, "Egor", "Petrov", 'm', 8.3);
        Student s3 = new Student(4, "Vasilisa", "Petrova", 'f', 9.2);

        ArrayList<Student> StList = new ArrayList<>();
        StList.add(s1);
        StList.add(s2);
        StList.add(s3);


       double avGradeSt =  StList.stream().filter(e -> e.getSex()=='m').mapToDouble(e ->e.getAvGrade()).average().getAsDouble();

        System.out.println(avGradeSt);

    }
}

class Student {
    private int course;
    private String name;
    private String surname;
    private char sex;
    private double avGrade;

    public Student(int course, String name, String surname, char sex, double avGrade) {
        this.course = course;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.avGrade = avGrade;
    }

    public int getCourse() {
        return course;
    }


    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", avGrade=" + avGrade +
                '}';
    }
}
