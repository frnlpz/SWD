package Lab2;

public class MainEmp {
    public static void main(String[] args) {
        Employee employee = new Employee (201781923,
                "fraloag","123456789","Computer Engineering","Francisco","Lopez");

        System.out.println("New employee added: "+employee.getFirstName()+" "+employee.getLastName());
        System.out.println("\t Login name: "+employee.getLoginName()+", Password: ********, Department: "+employee.getDepartment());
    }
}
