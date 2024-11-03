package p1;

import java.util.Scanner;

public class ArrayCode3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class count: ");
        int m = sc.nextInt();

        ArrayOperation3 ao = new ArrayOperation3();
        ao.createArray(m);
        ao.addData();
        ao.displayData();
    }
}

class ArrayOperation3 {
    int arr[][];
    Scanner sc = new Scanner(System.in);

    public void createArray(int m) {
        arr = new int[m][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter student count for class number: " + (i + 1));
            int n = sc.nextInt();
            arr[i] = new int[n];
        }
        System.out.println("Array created");
    }

    public void addData() {
        for (int i = 0; i < arr.length; i++) { // class count
            System.out.println("Inside class no: " + (i + 1));
            System.out.println("Array of i " + arr.length);
            for (int j = 0; j < arr[i].length; j++) { // student count
                // collecting student marks
                System.out.println("Enter the marks of student no: " + (j + 1));
                System.out.println("Array of i " + arr.length);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Data is added");
    }

    void displayData() {
        // displaying student marks
        for (int i = 0; i < arr.length; i++) { // class count
            System.out.println("Inside class no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) { // student count
                System.out.println("Marks of student no: " + (j + 1) + " is = " + arr[i][j]);
            }
        }
    }
}