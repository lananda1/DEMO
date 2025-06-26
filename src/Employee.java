import javax.swing.*;

public class Employee {
    private int eid;

    public int getEid() {
        return eid;
    }

    private void setEid(int eid) {
        this.eid = eid;
    }

    public float getSalary() {
        return salary;
    }

    private void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    void setEname(String ename) {
        this.ename = ename;
    }

    private float salary;
    private String ename;

//    Employee(int eid, float salary, String ename) {
//        this.eid = eid;
//        this.salary = salary;
//        this.ename = ename;
//    }

    void display() {
        System.out.println("Name " + this.ename);
        System.out.println("EID  " + eid);
        System.out.println("Salary " + salary);

    }
}
