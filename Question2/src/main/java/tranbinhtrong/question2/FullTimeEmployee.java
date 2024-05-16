package tranbinhtrong.question2;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {

    protected float salary;

    public FullTimeEmployee(float salary, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee() {
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Salary: ");
        salary = sc.nextFloat();
    }

    @Override
    public String getInfo() {
        return "Employee ID: " + employeeID
                + "\nEmployee Name: " + employeeName
                + "\nYear of birth: " + yearOfBirth
                + "\nPhone: " + phone
                + "\nSalary: " + salary + "\n";
    }

    @Override
    public float getPayment() {
        return salary;
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("What do you want to edit?\n1: Full Name \n2: Year of Birth \n3: Address \n4: Phone \n5: Salary \n6:Exit\n");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("Enter new data: ");
                    setEmployeeName(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter new data: ");
                    setYearOfBirth(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter new data: ");
                    setAddress(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Enter new data: ");
                    setPhone(sc.nextLine());
                }
                case 5 -> {
                    System.out.print("Enter new data: ");
                    setSalary(sc.nextFloat());
                }
            }
        } while (n != 6);
    }
    
}
