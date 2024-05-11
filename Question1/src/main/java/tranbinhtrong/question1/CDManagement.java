package tranbinhtrong.question1;

import java.util.*;

public class CDManagement {

    ArrayList<CD> listCD;

    public CDManagement() {
    }

    public CDManagement(ArrayList<CD> listCD) {
        this.listCD = listCD;
    }

    public void importCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many CDs? : ");
        int n = sc.nextInt();
        listCD = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            CD cd = new CD();
            cd.getCD();
            listCD.add(cd);
        }
    }

    public void searchByTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The title you wanna search: ");
        String title = sc.nextLine();
        boolean flag = false;
        int i = 0;
        while (flag == false && i < listCD.size()) {
            if (title.equals(listCD.get(i).getTitle())) {
                System.out.print("CD found: ");
                listCD.get(i).displayCD();
                flag = true;
            }
            i++;
        }
        if (flag == false) {
            System.out.print("CD not found!");
        }
    }

    public void searchByCollection() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The collection you wanna search: ");
        String collection = sc.nextLine();
        boolean flag = false;
        int i = 0;
        while (i < listCD.size()) {
            if (collection.equals(listCD.get(i).getCollection())) {
                flag = true;
                System.out.println("CD found! The title of the CD is: " + listCD.get(i).getTitle());
            }
            i++;
        }
        if (flag == false) {
            System.out.print("CD not found!");
        }
    }

    public void searchByTypes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The types you wanna search: ");
        String type = sc.nextLine();
        boolean flag = false;
        int i = 0;
        while (i < listCD.size()) {
            if (type.equals(listCD.get(i).getTypes())) {
                flag = true;
                System.out.println("CD found! The title of the CD is: " + listCD.get(i).getTitle());
            }
            i++;
        }
        if (flag == false) {
            System.out.print("CD not found!");
        }
    }

    public void removeCDbyID() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The id of CD that you want to remove: ");
        int id = sc.nextInt();
        int i = 0;
        while (i < listCD.size()) {
            if (id == listCD.get(i).getiD()) {
                listCD.remove(i);
                System.out.print("CD removed!");
                break;
            }
            i++;
        }
    }

    public void editCDbyID() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The id of CD that you want to edit: ");
        int id = sc.nextInt();
        int i = 0;
        while (i < listCD.size()) {
            if (id == listCD.get(i).getiD()) {
                listCD.get(i).edit();
                break;
            }
            i++;
        }
    }

    public void displayAllCD() {
        Iterator<CD> it = listCD.iterator();
        while (it.hasNext()) {
            it.next().displayCD();
        }
    }

    public void sortByYearsRelease() {
        Collections.sort(listCD, new sortByYears());
        System.out.print("Has been sorted!");
    }

    private class sortByYears implements Comparator<CD> {

        @Override
        public int compare(CD o1, CD o2) {
            if (o1.getYearsOfRelease() > o2.getYearsOfRelease()) {
                return 1;
            } else if (o1.getYearsOfRelease() < o2.getYearsOfRelease()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
