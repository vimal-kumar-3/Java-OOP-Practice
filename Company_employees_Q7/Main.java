package Company_employees_Q7_Correction;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Employee manager = new Manager(
                101,
                "Rahul",
                "Delhi",
                80000,
                "Project Manager",
                10
        );


        Employee developer = new Developer(
                102,
                "Amit",
                "Mumbai",
                60000,
                "Software Developer",
                "Java"
        );


        Employee programmer = new Programmer(
                103,
                "Deepak",
                "Mandawar",
                50000,
                "Software Programmer",
                "Backend Development"
        );



        System.out.println("========== MANAGER ==========");

        System.out.println("Employee ID : " + manager.getEmployeeId());
        System.out.println("Name        : " + manager.getName());
        System.out.println("Address     : " + manager.getAddress());
        System.out.println("Salary      : " + manager.getSalary());
        System.out.println("Job Title   : " + manager.getJobTitle());

        System.out.println("Bonus       : " + manager.calculateBonus());

        manager.generatePerformanceReport();
        manager.manageProjects();



        System.out.println("\n========== DEVELOPER ==========");

        System.out.println("Employee ID : " + developer.getEmployeeId());
        System.out.println("Name        : " + developer.getName());
        System.out.println("Address     : " + developer.getAddress());
        System.out.println("Salary      : " + developer.getSalary());
        System.out.println("Job Title   : " + developer.getJobTitle());

        System.out.println("Bonus       : " + developer.calculateBonus());

        developer.generatePerformanceReport();
        developer.manageProjects();


        System.out.println("\n========== PROGRAMMER ==========");

        System.out.println("Employee ID : " + programmer.getEmployeeId());
        System.out.println("Name        : " + programmer.getName());
        System.out.println("Address     : " + programmer.getAddress());
        System.out.println("Salary      : " + programmer.getSalary());
        System.out.println("Job Title   : " + programmer.getJobTitle());

        System.out.println("Bonus       : " + programmer.calculateBonus());

        programmer.generatePerformanceReport();
        programmer.manageProjects();
    }
}