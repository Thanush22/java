package type;

import java.util.Scanner;

public class info {
    public void show() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scan.nextLine();

        System.out.println("Enter roll number:");
        String roll = scan.nextLine();

        System.out.println("enter the semester:");
        int sem = scan.nextInt();
    }
}

