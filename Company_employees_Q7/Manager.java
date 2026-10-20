package Company_employees_Q7_Correction;

class Manager extends Employee {

    private int teamSize;

    public Manager(int employeeId, String name, String address,
                   double salary, String jobTitle, int teamSize) {

        super(employeeId, name, address, salary, jobTitle);
        this.teamSize = teamSize;
    }


    public double calculateBonus() {
        return getSalary() * 0.20;
    }


    public void generatePerformanceReport() {
        System.out.println("Manager Performance Report");
        System.out.println("Team Size: " + teamSize);
        System.out.println("Rating: Excellent");
    }


    public void manageProjects() {
        System.out.println(getName() + " is managing multiple projects.");
    }
}

