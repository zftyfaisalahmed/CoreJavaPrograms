package p1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
        int n = sc.nextInt();
        ArrayOperation ao= new ArrayOperation();
        ao.createArray(n);
        ao.addData();
        ao.displayData();
	}

}
class ArrayOperation{
	int[] arr;
	Scanner sc = new Scanner(System.in);
	public void createArray(int n) {
		arr = new int[n];
		System.out.println("array created");
	}
	public void addData() {
		for(int i=0;i<arr.length;i++) {
			//collecting student marks
			System.out.println("enter the marks of the student: "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("data is addded");
	}
	public void displayData() {
		//displaying student marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("the marks of the student no: "+(i+1) +" is = "+arr[i]);
		}		
	}
}
