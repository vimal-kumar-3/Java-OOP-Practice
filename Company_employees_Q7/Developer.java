package Company_employees_Q7_Correction;

class Developer extends Employee {

    private String programmingLanguage;

    public Developer(int employeeId, String name, String address,
                     double salary, String jobTitle,
                     String programmingLanguage) {

        super(employeeId, name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }


    public double calculateBonus() {
        return getSalary() * 0.15;
    }


    public void generatePerformanceReport() {
        System.out.println("Developer Performance Report");
        System.out.println("Language: " + programmingLanguage);
        System.out.println("Rating: Very Good");
    }


    public void manageProjects() {
        System.out.println(getName() + " is managing development projects.");
    }
}