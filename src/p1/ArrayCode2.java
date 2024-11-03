package p1;

import java.util.Scanner;

public class ArrayCode2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the class count: ");
        int m = sc.nextInt();
        System.out.println("enter the students count");
        int n = sc.nextInt();
        
        ArrayOperation2 ao = new ArrayOperation2();
        ao.createArray(m, n);
        ao.addData();
        ao.displayData();
        
	}

}
class ArrayOperation2{
	int arr[][];
	Scanner sc = new Scanner(System.in);
	
	public void createArray(int m, int n) {
		arr = new int[m][];
		System.out.println("array created");
	}
	public void addData() {
		for(int i=0;i<arr.length;i++)  //class count
		{
			System.out.println("Inside class no:" +(i+1));
			for(int j=0;j<arr.length;j++)  //student count
			{
				//collecting student marks
				System.out.println("enter the marks of student no: " +(j+1));
				arr[i][j] = sc.nextInt();
			}			
		}
		System.out.println("data is added");		
	}
	void displayData() {
		//displaying student marks
		for(int i=0;i<arr.length;i++)  //class count
		{
			System.out.println("Inside class no:" +(i+1));
			for(int j=0;j<arr.length;j++)  //student count
			{
				//collecting student marks
				System.out.println("enter the marks of student no: " +(j+1) + " is = " +arr[i][j]);
				
			}			
		}		
	}
}