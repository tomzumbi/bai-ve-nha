package com.example.baitapvenha.service;

import com.example.baitapvenha.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(027,"Mark",23,15000000,"RnD"));
        employees.add(new Employee(021,"Jacob",23,18000000,"Human Resource"));
        employees.add(new Employee(024,"Larry",22,12000000,"Marketing"));
    }
    public static void delete(int id){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id){
                employees.remove(i);
            }
        }
    }

    public static Employee findbyid(int id){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id){
                return employees.get(i);
            }
        }
        return null;
    }

}
