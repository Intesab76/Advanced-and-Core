import java.util.*;

class GetDetails {

    private String name;
    private int employeeID;
    private float salary;

    public String getName() {
        return name;
    }

    public int getID() {
        return employeeID;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String assignedName) {

        name = assignedName;
    }

    public void setID(int assignedID) {

        employeeID = assignedID;
    }

    public void setSalary(float assignedSalary) {

        salary = assignedSalary;
    }
}

class EmployeeMain {
    public static void main(String Intesab[]) {

        GetDetails getDetails = new GetDetails();

        Scanner scanner = new Scanner(System.in);

        getDetails.setName(scanner.next());
        getDetails.setID(scanner.nextInt());
        getDetails.setSalary(scanner.nextFloat());

        System.out.println("\n Name is :: " + getDetails.getName() + "\n Employee ID is :: " + getDetails.getID()
                + "\n Salary is :: " + getDetails.getSalary());

        scanner.close();
    }
}
