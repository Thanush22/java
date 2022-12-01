package type;

public class pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 & j == 2 || i==2 & j==3) {
                    System.out.print(" \t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            System.out.println("*\t");
        }
    }
}
