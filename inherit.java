import javax.xml.namespace.QName;
import java.util.Scanner;

public class inherit {
     Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        inherit obj = new inherit();
        obj.info();
    }
        public void info() {
            System.out.println("Enter the name:");
            String name = scan.nextLine();

            System.out.println("Enter roll number:");
            int roll = scan.nextInt();

            System.out.println("enter the semester:");
            int sem = scan.nextInt();
    }

}