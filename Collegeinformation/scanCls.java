package stringtypes;

import java.util.Scanner;

public class scanCls {
    public static void main(String[]args){
        scanCls obj = new scanCls();
        obj.scanner();

    }
    public void scanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String S1 = input.nextLine();
        System.out.println("Enter your SurName :");
        String s2 = input.nextLine();
        System.out.println("Enter your RegisterNumber :");
        String S3 = input.nextline();
        System.out.println("Enter the age : ");
        String S4 = input.nextLine();
        System.out.println("Enter your gender :");
        String S5 = input.nextLine();
        System.out.println("Enter your collegeName :");
        String S6 = input.nextLine();
        System.out.println("Enter your Native :");
        String S7 = input.nextLine();
        System.out.println("Enter your FatherName :");
        String S8 = input.nextLine();
        System.out.println("Enter your motherName :");
        String S9 = input.nextLine();
        System.out.println("Enter your PhoneNumber :");
        String S0 = input.nextLine();
    }
}
