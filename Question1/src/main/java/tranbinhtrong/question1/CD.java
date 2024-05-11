package tranbinhtrong.question1;

import java.util.Comparator;
import java.util.Scanner;

public class CD {

    private int iD;
    private String collection;
    private String types;
    private String title;
    private double price;
    private int yearsOfRelease;

    public CD(int iD, String collection, String types, String title, int price, int yearsOfRelease) {
        this.iD = iD;
        this.collection = collection;
        this.types = types;
        this.title = title;
        this.price = price;
        this.yearsOfRelease = yearsOfRelease;
    }

    public int getiD() {
        return iD;
    }

    public String getCollection() {
        return collection;
    }

    public int getYearsOfRelease() {
        return yearsOfRelease;
    }

    public String getTypes() {
        return types;
    }

    public String getTitle() {
        return title;
    }

    public CD() {
    }

    public void getCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        iD = sc.nextInt();
        sc.nextLine();
        System.out.print("Collection: ");
        collection = sc.nextLine();
        System.out.print("Types: ");
        types = sc.nextLine();
        System.out.print("Title: ");
        title = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Years of release: ");
        yearsOfRelease = sc.nextInt();
    }

    public void displayCD() {
        System.out.println("ID: " + iD);
        System.out.println("Collection: " + collection);
        System.out.println("Types: " + types);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Years of release: " + yearsOfRelease);
    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What do you want to edit? \n1:Collection \n2:Types \n3:Title \n4:Price \n5:Years Of Release \n6:Exit");
        int n = sc.nextInt();
        while (n != 6) {
            switch (n) {
                case 1 -> collection = sc.nextLine();
                case 2 -> types = sc.nextLine();
                case 3 -> title = sc.nextLine();
                case 4 -> price = sc.nextDouble();
                case 5 -> yearsOfRelease = sc.nextInt();
            }
            System.out.print("What do you want to edit? \n1:Collection \n2:Types \n3:Title \n4:Price \n5:Years Of Release \n6:Exit");
            n = sc.nextInt();
        }

    }
}
