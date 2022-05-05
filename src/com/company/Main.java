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

        EmployeeBook.printAllEmployees(EmployeeBook.employees);
        EmployeeBook.printAllSalaries(EmployeeBook.employees);
        EmployeeBook.maxSalary(EmployeeBook.employees);
        EmployeeBook.minSalary(EmployeeBook.employees);
        EmployeeBook.averageSalary(EmployeeBook.employees);
        EmployeeBook.printAllNames(EmployeeBook.employees);
        EmployeeBook.indexationOfSalaries(EmployeeBook.employees, 10);
        EmployeeBook.minSalaryByDepartment(EmployeeBook.employees,1);
        EmployeeBook.maxSalaryByDepartment(EmployeeBook.employees, 3);
        EmployeeBook.indexationOfSalariesByDepartment(EmployeeBook.employees, 2, 30);
        EmployeeBook.averageSalaryByDepartment(EmployeeBook.employees, 4);
        EmployeeBook.printEmployeesByDepartment(EmployeeBook.employees,5);
        EmployeeBook.printEmployeesAbove(EmployeeBook.employees, 100000);
        EmployeeBook.printEmployeesBelow(EmployeeBook.employees, 75000);
        EmployeeBook.maxSalary(EmployeeBook.employees);

    }

}