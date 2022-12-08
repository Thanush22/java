package type;

import java.util.Scanner;

public class reversechar {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str1= scan.nextLine();
        StringBuilder str2= new StringBuilder();
        int i=str1.length()-1;
        while(i>=0){
            char c = str1.charAt(i);
            str2.append(c);
            i--;
        }
        System.out.println(str2);
    }
}
