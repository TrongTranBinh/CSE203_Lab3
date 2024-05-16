package tranbinhtrong.question2;

import java.util.Scanner;

public abstract class Employee {

    protected String employeeID;
    protected String employeeName;
    protected int yearOfBirth;
    protected String address;
    protected String phone;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    

    public Employee(String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public Employee() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee ID: ");
        employeeID = sc.nextLine();
        System.out.print("Employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Year of birth: ");
        yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Phone: ");
        phone = sc.nextLine();
    }

    public abstract String getInfo();

    public abstract float getPayment();
    
    public abstract void edit();
}
