package Company_employees_Q7_Correction;

class Programmer extends Employee {

    private String specialization;

    public Programmer(int employeeId, String name, String address,
                      double salary, String jobTitle,
                      String specialization) {

        super(employeeId, name, address, salary, jobTitle);
        this.specialization = specialization;
    }


    public double calculateBonus() {
        return getSalary() * 0.10;
    }


    public void generatePerformanceReport() {
        System.out.println("Programmer Performance Report");
        System.out.println("Specialization: " + specialization);
        System.out.println("Rating: Good");
    }


    public void manageProjects() {
        System.out.println(getName() + " is working on assigned projects.");
    }
}