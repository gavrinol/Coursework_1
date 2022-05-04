package com.company;

public class Employee {
    private final String name;
    private int dep;
    private int salary;
    private final int id;
    static  int counter = 1;


    public Employee(String name, int dep, int salary){
        this.name = name;
        this.dep = dep;
        this.salary = salary;
        id = counter++;
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public  int getDep(){
        return dep;
    }
    public int getId() {
        return id;
    }
    public void setDep(int dep){
        this.dep = dep;
    }
    public void  setSalary(int salary){
        this.salary = salary;
    }
    public  String toString(){
        return name + " Отдел: " + id + " Зарплата " + salary;
    }
}
