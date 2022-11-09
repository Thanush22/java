package type;

import java.util.Scanner;

public class SwapNo {
    public static void main(String[]args){
        int a ,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("before swapping:"+a+" "+b);
        a =a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:"+a+" "+b);
    }

}
