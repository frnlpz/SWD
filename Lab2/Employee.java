package Lab2;

public class Employee {

    private int Employeeid;
    private String LoginName, Password, Department, FirstName, LastName;

    public Employee(int employeeid, String loginName, String password, String department, String firstName, String lastName){
        this.Employeeid = employeeid;
        this.LoginName  = loginName;
        this.Password   = password;
        this.Department = department;
        this.FirstName  = firstName;
        this.LastName   = lastName;
    }

    public int getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(int employeeid) {
        Employeeid = employeeid;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        if (ensureCorrectPasswordLength (password))
            Password = password;
        else System.out.println("Password length must be >8 chars.");
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public boolean ensureCorrectPasswordLength(String pass){
        if (pass.length()>8) return true;
        return false;
    }
}
