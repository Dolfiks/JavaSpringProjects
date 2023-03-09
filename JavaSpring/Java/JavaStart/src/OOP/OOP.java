package OOP;


import org.jetbrains.annotations.NotNull;

class Student {
    private StringBuilder name;

    public StringBuilder getName() {
        return name;
    }

    public void setName(@NotNull StringBuilder sname) {
        if (sname.length() > 2) {
            name = sname;
        } else {
            System.out.println("Имя должно содержать больлше 3х символов");
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int scourse) {
        if (scourse > 0 && scourse < 5) {
            course = scourse;
        }

    }

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int sgrade) {
        if (sgrade > 0 && sgrade < 11) {
            grade = sgrade;
        }
    }

    public void ShowInfo() {
        System.out.println("Name: " + getName() + " Course: " + getCourse() + " Grade: " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student one = new Student();
        StringBuilder s1 = new StringBuilder("Sergey");
        one.setName(s1);
        one.setCourse(3);
        one.setGrade(9);
        one.ShowInfo();

        Student two = new Student();
        StringBuilder s2 = new StringBuilder("Vasiliy");
        one.setName(s2);
        one.setCourse(2);
        one.setGrade(9);
        one.ShowInfo();
    }
}


public class OOP {

}
