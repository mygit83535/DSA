package com.sunbeam;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
     
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(101, "Shivani", 50000);
        employees[1] = new Employee(102, "Jyoti", 60000);
        employees[2] = new Employee(103, "Snehal", 55000);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter search criteria:");
        System.out.println("1. Search by empid");
        System.out.println("2. Search by name");
        System.out.println("3. Search by salary");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter empid to search: ");
                int empId = sc.nextInt();
                searchById(employees, empId);
                break;
            case 2:
                System.out.print("Enter name to search: ");
                sc.nextLine(); // Consume newline
                String name = sc.nextLine();
                searchByName(employees, name);
                break;
            case 3:
                System.out.print("Enter salary to search: ");
                double salary = sc.nextDouble();
                searchBySalary(employees, salary);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void searchById(Employee[] employees, int empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                System.out.println("Employee found: " + emp.getName() + ", Salary: " + emp.getSalary());
                return;
            }
        }
        System.out.println("Employee with empid " + empId + " not found.");
    }

    public static void searchByName(Employee[] employees, String name) {
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                System.out.println("Employee found: " + emp.getName() + ", Salary: " + emp.getSalary());
                return;
            }
        }
        System.out.println("Employee with name \"" + name + "\" not found.");
    }

    public static void searchBySalary(Employee[] employees, double salary) {
        for (Employee emp : employees) {
            if (emp.getSalary() == salary) {
                System.out.println("Employee found: " + emp.getName() + ", Empid: " + emp.getEmpId());
                return;
            }
        }
        System.out.println("Employee with salary " + salary + " not found.");
    }
}

