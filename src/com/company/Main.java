package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(EmployeeBook.employee4.getId());
        System.out.println(EmployeeBook.employee3.getName());
        System.out.println(EmployeeBook.employee6.getSalary());
        EmployeeBook.employee7.setSalary(100000);
        System.out.println(EmployeeBook.employee7.getSalary());
        System.out.println(EmployeeBook.employee5);
        System.out.println();


        printAllEmployees(EmployeeBook.employees);
        printAllSalaries(EmployeeBook.employees);
        maxSalary(EmployeeBook.employees);
        minSalary(EmployeeBook.employees);
        averageSalary(EmployeeBook.employees);
        printAllNames(EmployeeBook.employees);
        indexationOfSalaries(EmployeeBook.employees, 10);
        minSalaryByDepartment(EmployeeBook.employees,1);
        maxSalaryByDepartment(EmployeeBook.employees, 3);
        indexationOfSalariesByDepartment(EmployeeBook.employees, 2, 30);
        averageSalaryByDepartment(EmployeeBook.employees, 4);
        printEmployeesByDepartment(EmployeeBook.employees,5);
        printEmployeesAbove(EmployeeBook.employees, 100000);
        printEmployeesBelow(EmployeeBook.employees, 75000);
        maxSalary(EmployeeBook.employees);

    }

    public static void printAllEmployees(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
        System.out.println();
    }

    public static void  printAllSalaries(Employee[] employees){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Вся зп: " + sum);
        System.out.println();
    }

    public static  void maxSalary(Employee[] employees){
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max){
                max = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зп: " + max);
        System.out.println();
    }

    public static void minSalary(Employee[] employees){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min){
                min = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зп: " + min);
        System.out.println();
    }

    public static void  averageSalary(Employee[] employees){
        int sum = 0;
        int count = 0;
        int average = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
            count++;
        }
        average = sum / count;
        System.out.println("Зп в среднем: " + average);
        System.out.println();
    }

    public static void printAllNames(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getName());
        }
        System.out.println();
    }

    public static void indexationOfSalaries(Employee[] employees, int percent){
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((employees[i].getSalary() + (employees[i].getSalary() * percent/100)));
            System.out.println(employees[i].getName() + " Проиндексированная зп: " + " " + employees[i].getSalary());
        }
        System.out.println();
    }

    public static void minSalaryByDepartment (Employee[] employees, int dep){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].getDep() && employees[i].getSalary() < min){
                    min = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зп по отделу: " + min);
        System.out.println();
    }

    public static void maxSalaryByDepartment (Employee[] employees, int dep){
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].getDep() && employees[i].getSalary() > max){
                    max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зп по отделу: " + max);
        System.out.println();
    }

    public static void averageSalaryByDepartment (Employee[] employees, int dep){
        int sum = 0;
        int count = 0;
        int average = 0;
        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].getDep()) {
                sum = sum + employees[i].getSalary();
                count++;
            }
        }
        average = sum / count;
        System.out.println("Зп в среднем по отделу: " + average);
        System.out.println();
    }

    public static void indexationOfSalariesByDepartment(Employee[] employees, int dep, int percent){
        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].getDep()) {
                employees[i].setSalary((employees[i].getSalary() + (employees[i].getSalary() * percent / 100)));
                System.out.println(employees[i].getName() + " Проиндексированная зп: " + " " + employees[i].getSalary());
            }
        }
        System.out.println();
    }

    public static void printEmployeesByDepartment (Employee[] employees, int dep){
        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].getDep()) {
                System.out.println(employees[i].getName());
            }
        }
        System.out.println();
    }

    public static void printEmployeesAbove (Employee[] employees, int number){
        System.out.println("Сотрудники получающие больше чем " + number + ":");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= number)
                System.out.println(employees[i].getId() + " " + employees[i].getName() + " " + employees[i].getSalary());
        }
        System.out.println();
    }

    public static void printEmployeesBelow (Employee[] employees, int number){
        System.out.println("Сотрудники получающие меньше чем " + number + ":");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < number)
                System.out.println(employees[i].getId() + " " + employees[i].getName() + " " + employees[i].getSalary());
        }
        System.out.println();
    }
}