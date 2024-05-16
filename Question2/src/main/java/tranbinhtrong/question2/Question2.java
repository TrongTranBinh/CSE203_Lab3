package tranbinhtrong.question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        EmployeeManagement listEms = new EmployeeManagement();
        StringBuilder sb = new StringBuilder();
        sb.append("1: Add Full-time employee\n").append("2: Add Part-time employee\n")
                .append("3: Show all Full-time employee\n").append("4: Show all Part-time employee\n")
                .append("5: Show all employee\n").append("6: Searh employee by ID\n").append("7: Delete employee by ID\n")
                .append("8: Edit employee information by ID\n").append("9: Search Employee by payment\n")
                .append("10: Sort full-time employee & part-time employee by age and payment\n").append("11: Exit.\n");
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("What do you want to do? \n" + sb + "\nEnter your option: ");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    listEms.addFullTime();
                case 2 ->
                    listEms.addPartTime();
                case 3 ->
                    listEms.showAllFull();
                case 4 ->
                    listEms.showAllPart();
                case 5 ->
                    listEms.showAllEmployee();
                case 6 ->
                    listEms.searchById();
                case 7 ->
                    listEms.deleteById();
                case 8 ->
                    listEms.editById();
                case 9 ->
                    listEms.searchByPayment();
                case 10 ->
                    listEms.sort();
            }
        } while (n != 11);
    }
}
