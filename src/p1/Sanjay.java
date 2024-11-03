package p1;

import java.util.Scanner;

public class Sanjay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        
        	// S
            for (int j = 0; j < n; j++) {
                if (i==0&&j!=0||j==0&&i!=0&&i<=4||i==n/2&&j!=0&&j!=n-1||j==n-1&&i>=6&&i<=9||i==n-1&&j!=n-1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            
            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i != 0) || (j == (n - 1) && i != 0) ||
                        (i == 0 && j != 0 && j != (n - 1)) ||
                        i == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            
         // N
            for (int j = 0; j < n; j++) {
                if (j==0||j==n-1||j==i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            
            // J
            for (int j = 0; j < n; j++) {
                if (i==0||j==n/2||i-j==(n/2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            
            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i != 0) || (j == (n - 1) && i != 0) ||
                        (i == 0 && j != 0 && j != (n - 1)) ||
                        i == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            
            // Y
            for (int j = 0; j < n; j++) {
                if (i==j&&i<=n/2||i+j==n-1&&i<=n/2||j==n/2&&i>=n/2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
        System.out.println();
        }
	}

}
