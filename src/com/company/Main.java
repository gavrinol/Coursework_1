package com.company;

public class Main {

    public static void main(String[] args) {

	Employee employee1 = new Employee("Леонид Валерьевич Укупник", 3, 45033);
    Employee employee2 = new Employee("Валерий Герасимович Рубинштейн", 4, 29034);
    Employee employee3 = new Employee("Илья Вадимович Макаревич", 1, 68988);
    Employee employee4 = new Employee("Рудольф Николаевич Кутузов", 5, 90766);
    Employee employee5 = new Employee("Мария Герасимовна Овсиенко", 2, 72334);
    Employee employee6 = new Employee("Виктория Афанасиевна Бордюр", 3, 140990);
    Employee employee7 = new Employee("Григорий Кириллович Пластилинов", 5, 105900);
    Employee employee8 = new Employee("Марфа Ильинична Журавлева", 1, 55200);
    Employee employee9 = new Employee("Виктор Григорьевич Сухоруков", 4, 210500);
    Employee employee10 = new Employee("Лада Алексеевна Дэнс", 2, 88400);

        System.out.println(employee4.getId());
        System.out.println(employee3.getName());
        System.out.println(employee6.getSalary());
        employee7.setSalary(100000);
        System.out.println(employee7.getSalary());
        System.out.println(employee5);
        System.out.println();

        Employee[] employees = new Employee[10];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        printAllEmployees(employees);
        printAllSalaries(employees);
        maxSalary(employees);
        minSalary(employees);
        averageSalary(employees);
        printAllNames(employees);
        indexationOfSalaries(employees, 10);
        minSalaryByDepartment(employees,1);
        maxSalaryByDepartment(employees, 3);
        indexationOfSalariesByDepartment(employees, 2, 30);
        averageSalaryByDepartment(employees, 4);
        printEmployeesByDepartment(employees,5);
        printEmployeesAbove(employees, 100000);
        printEmployeesBelow(employees, 75000);
        maxSalary(employees);

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
            if (dep == employees[i].getDep()){
                if (employees[i].getSalary() < min){
                    min = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зп по отделу: " + min);
        System.out.println();
    }

    public static void maxSalaryByDepartment (Employee[] employees, int dep){
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].getDep()){
                if (employees[i].getSalary() > max){
                    max = employees[i].getSalary();
                }
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

