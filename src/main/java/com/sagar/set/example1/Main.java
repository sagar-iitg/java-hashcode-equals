package com.sagar.set.example1;

import java.util.HashSet;
import java.util.Objects;

class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;  // Mutable field
    }

    // equals method based on empId and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empId == employee.empId && Objects.equals(name, employee.name);
    }

    // hashCode method based on empId and name
    @Override
    public int hashCode() {
        return Objects.hash(empId, name);
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", name='" + name + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        Employee emp1 = new Employee(101, "John");
        employees.add(emp1);  // Add to HashSet
        
        System.out.println("Before modification: " + employees.contains(emp1));  // true
        
        emp1.setEmpId(102);  // Mutate the object (change hashCode and equals outcome)
        
        // Now contains() returns false because the hash code changed
        System.out.println("After modification: " + employees.contains(emp1));  // false
        
        // Trying to remove the modified object
        System.out.println("Can remove modified object: " + employees.remove(emp1));  // false
    }
}