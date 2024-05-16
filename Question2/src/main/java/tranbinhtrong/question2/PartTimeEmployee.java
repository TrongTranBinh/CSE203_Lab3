package tranbinhtrong.question2;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {

    private int workingHours;
    private float payRate;

    public PartTimeEmployee() {
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHours, float payRate, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.workingHours = workingHours;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHours, float payRate) {
        this.workingHours = workingHours;
        this.payRate = payRate;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Working hours: ");
        workingHours = sc.nextInt();
        System.out.print("Pay rate: ");
        payRate = sc.nextFloat();
    }

    @Override
    public String getInfo() {
        return "Employee ID: " + employeeID
                + "\nEmployee Name: " + employeeName
                + "\nYear of birth: " + yearOfBirth
                + "\nPhone: " + phone
                + "\nWorking hours: " + workingHours
                + "\nPay rate: " + payRate + "\n";
    }

    @Override
    public float getPayment() {
        return workingHours * payRate;
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("What do you want to edit?\n1: Full Name \n2: Year of Birth \n3: Address \n4: Phone \n5: Working hours \n6: Pay rate \n7: Exit");
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
                    setWorkingHours(sc.nextInt());
                }
                case 6 -> {
                    System.out.print("Enter new data: ");
                    setPayRate(sc.nextFloat());
                }
            }
        } while (n != 7);
    }
    
}
