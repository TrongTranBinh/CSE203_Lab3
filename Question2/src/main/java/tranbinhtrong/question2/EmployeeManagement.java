package tranbinhtrong.question2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManagement {

    private ArrayList<Employee> fullTimeEms = new ArrayList<>();
    private ArrayList<Employee> partTimeEms = new ArrayList<>();

    public EmployeeManagement() {
    }

    public void addFullTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many full time employee you want to add?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee e = new FullTimeEmployee();
            e.input();
            fullTimeEms.add(e);
        }
    }

    public void addPartTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many part time employee you want to add?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee e = new PartTimeEmployee();
            e.input();
            partTimeEms.add(e);
        }
    }

    public void showAllFull() {
        for (Employee e : fullTimeEms) {
            System.out.print(e.getInfo());
        }
    }

    public void showAllPart() {
        for (Employee e : partTimeEms) {
            System.out.print(e.getInfo());
        }
    }

    public void showAllEmployee() {
        showAllFull();
        showAllPart();
    }

    public void searchById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        String id = sc.nextLine();
        boolean notFound = true;
        for (int i = 0; i < fullTimeEms.size(); i++) {
            if (fullTimeEms.get(i).getEmployeeID().equalsIgnoreCase(id)) {
                System.out.println("Found employee! + \nInformation down here:");
                System.out.print(fullTimeEms.get(i).getInfo());
                notFound = false;
                break;
            }
        }
        for (int i = 0; i < partTimeEms.size(); i++) {
            if (partTimeEms.get(i).getEmployeeID().equalsIgnoreCase(id)) {
                System.out.println("Found employee! + \nInformation down here:");
                System.out.print(partTimeEms.get(i).getInfo());
                notFound = false;
                break;
            }
        }
        if (notFound) {
            System.out.println("Can not find the employee with this ID: " + id);
        }
    }

    public void deleteById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        String id = sc.nextLine();
        boolean notFound = true;
        for (int i = 0; i < fullTimeEms.size(); i++) {
            if (fullTimeEms.get(i).getEmployeeID().equalsIgnoreCase(id)) {
                System.out.println("Deleted!");
                fullTimeEms.remove(i);
                notFound = false;
                break;
            }
        }
        for (int i = 0; i < partTimeEms.size(); i++) {
            if (partTimeEms.get(i).getEmployeeID().equalsIgnoreCase(id)) {
                System.out.println("Deleted!");
                partTimeEms.remove(i);
                notFound = false;
                break;
            }
        }
        if (notFound) {
            System.out.println("Can not find the employee with this ID: " + id);
        }
    }

    public void editById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which types of employee you want to edit? \n1:Full-time \n2: Part-time \n");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the ID of employee: ");
        String id = sc.nextLine();
        switch (n) {
            case 1 -> {
                for (int i = 0; i < fullTimeEms.size(); i++) {
                    if (fullTimeEms.get(i).getEmployeeID().equalsIgnoreCase(id)) {
                        fullTimeEms.get(i).edit();
                        System.out.print("Completed!");
                        break;
                    } else {
                        System.out.print("Can't find the Full-time employee with this iD: " + id);
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < partTimeEms.size(); i++) {
                    if (partTimeEms.get(i).getEmployeeID().equalsIgnoreCase(id)) {
                        partTimeEms.get(i).edit();
                        System.out.print("Completed!");
                        break;
                    } else {
                        System.out.print("Can't find the Part-time employee with this iD: " + id);
                    }
                }
            }
        }
    }

    public void searchByPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        float startingVal = sc.nextFloat();
        System.out.print("Enter the end value: ");
        float endVal = sc.nextFloat();
        boolean notFound = true;
        for (int i = 0; i < fullTimeEms.size(); i++) {
            if (fullTimeEms.get(i).getPayment() <= endVal && fullTimeEms.get(i).getPayment() >= startingVal) {
                System.out.print(fullTimeEms.get(i).getInfo());
                notFound = false;
            }
        }
        for (int i = 0; i < partTimeEms.size(); i++) {
            if (partTimeEms.get(i).getPayment() <= endVal && partTimeEms.get(i).getPayment() >= startingVal) {
                System.out.print(partTimeEms.get(i).getInfo());
                notFound = false;
            }
        }
        if (notFound) {
            System.out.println("Can't find the employee with the payment between: " + startingVal + " and : " + endVal);
        }
    }

    public void sort() { // vt soer ra 2 class con la fulltime va parttime

        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                if (e1.yearOfBirth == e2.yearOfBirth) {
                    if (e1.getPayment() > e2.getPayment()) {
                        return 1;
                    } else if (e1.getPayment() < e2.getPayment()) {
                        return -1;

                    } else {
                        return 0;
                    }
                }
                if (e1.yearOfBirth > e2.yearOfBirth) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        System.out.println("Sorting Full-time employee....");
        fullTimeEms.sort(com);
        System.out.println("Sorting Part-time employee....");
        partTimeEms.sort(com);
        System.out.println("Completed!");
    }
}
