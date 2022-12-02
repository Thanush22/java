package type;

import java.util.Scanner;

public class copystr {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String s1 = scan.nextLine();
        StringBuilder s2 = new StringBuilder();
            s2.append(s1);
        System.out.println(s2);
    }
}
