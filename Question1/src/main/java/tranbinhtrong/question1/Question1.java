package tranbinhtrong.question1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CDManagement listCD = new CDManagement();
        int n = 0;
        while (n != 9) {
            toDo();
            n = sc.nextInt();
            switch (n) {
                case 1 -> listCD.importCD();
                case 2 -> listCD.searchByTitle();
                case 3 -> listCD.searchByCollection();
                case 4 -> listCD.searchByTypes();
                case 5 -> listCD.removeCDbyID();
                case 6 -> listCD.editCDbyID();
                case 7 -> listCD.displayAllCD();
                case 8 -> listCD.sortByYearsRelease();
            }
        }

    }

    public static void toDo() {
        System.out.print("What do you want to do with the list of CD: \n");
        System.out.println("1.ADD CD");
        System.out.println("2. Search CD by CD title ");
        System.out.println("3. Search CDs by collection (game/movie/music) ");
        System.out.println("4. Search CDs by type (audio/video) ");
        System.out.println("5. Delete CD by CD Id ");
        System.out.println("6. Edit CD information by Id ");
        System.out.println("7. Display all CDs ");
        System.out.println("8. Sort the CD list ascending by year of release");
        System.out.println("9.Exit");
    }
}
