package Employee_Q1;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee emp ;
        emp = new FullTimeEmployee(101, "Rahul", 50000);
        emp.displayDetails();
        System.out.println();

        emp = new PartTimeEmployee(102, "Amit", 80, 500);
        emp.displayDetails();

    }
}