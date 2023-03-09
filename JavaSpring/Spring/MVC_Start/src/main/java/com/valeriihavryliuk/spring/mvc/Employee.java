package com.valeriihavryliuk.spring.mvc;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Employee {

    @Size(min = 2, message = "Name bust be > 2")
    private String name;

    //@NotEmpty(message = "Enter you Surname") Проверяет на пустоту
    @NotBlank(message = "Dont use placeholder") //проверяет на пробелы
    private String surname;

    private String department;

    private int salary;

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
