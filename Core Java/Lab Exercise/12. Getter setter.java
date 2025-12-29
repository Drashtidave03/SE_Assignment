public class Employee {
    
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) { // Validates that salary is always positive
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be a positive value.");
        }
    }
}
