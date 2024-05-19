package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class SortEmployeesBySalary {

    public static void insertionSort(Employee[] employees) {
        for (int i = 1; i < employees.length; i++) {
            Employee key = employees[i];
            int j = i - 1;
            while (j >= 0 && employees[j].getSalary() > key.getSalary()) {
                employees[j + 1] = employees[j];
                j--;
            }
            employees[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Snehal", 50000),
                new Employee("Shivani", 60000),
                new Employee("Jyoti", 45000)
        };

        System.out.println("Employees before sorting:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        insertionSort(employees);

        System.out.println("\nEmployees after sorting by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
