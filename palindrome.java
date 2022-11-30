package type;

import java.util.Scanner;

public class palindrome {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String s1 = input.nextLine();
        String s2 = "";
        for( int i=s1.length()-1;i>=0;i--){
            char c = s1.charAt(i);
           s2 = s2 + c;
        }
        System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}