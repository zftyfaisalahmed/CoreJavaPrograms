package p1;

import java.util.Scanner;

public class ArrayCode4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of schools: ");
        int m = sc.nextInt();

        ArrayOperation4 ao = new ArrayOperation4();
        ao.createArray(m);
        ao.addData();
        ao.displayData();
    }
}

class ArrayOperation4 {
    int[][][] arr;
    Scanner sc = new Scanner(System.in);

    // Method to create a 3D array for schools, classes, and students
    void createArray(int m) {
        arr = new int[m][][];  // m = number of schools

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of classes in school-" + (i + 1) + ": ");
            arr[i] = new int[sc.nextInt()][];  // Initialize the classes array

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the number of students in class-" + (j + 1) + ": ");
                arr[i][j] = new int[sc.nextInt()];  // Initialize the students array
            }
        }
        System.out.println("Array structure created successfully.");
    }

    // Method to add data (student marks) into the 3D array
    public void addData() {
        for (int i = 0; i < arr.length; i++) {  // Loop through schools
            System.out.println("Entering marks for School-" + (i + 1));

            for (int j = 0; j < arr[i].length; j++) {  // Loop through classes
                System.out.println("Inside Class-" + (j + 1));

                for (int k = 0; k < arr[i][j].length; k++) {  // Loop through students
                    System.out.println("Enter the marks for Student-" + (k + 1) + ": ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Data is added.");
    }

    // Method to display the data (student marks)
    void displayData() {
        for (int i = 0; i < arr.length; i++) {  // Loop through schools
            System.out.println("Displaying marks for School-" + (i + 1));

            for (int j = 0; j < arr[i].length; j++) {  // Loop through classes
                System.out.println("Inside Class-" + (j + 1));

                for (int k = 0; k < arr[i][j].length; k++) {  // Loop through students
                    System.out.println("Marks of Student-" + (k + 1) + " = " + arr[i][j][k]);
                }
            }
        }
    }
}