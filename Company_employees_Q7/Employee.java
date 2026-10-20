package Company_employees_Q7_Correction;

import java.util.Scanner;

abstract class Employee {


    private int employeeId;
    private String name;
    private String address;
    private double salary;
    private String jobTitle;


    public Employee(int employeeId, String name, String address,
                    double salary, String jobTitle) {

        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public abstract double calculateBonus();

    public abstract void generatePerformanceReport();

    public abstract void manageProjects();
}