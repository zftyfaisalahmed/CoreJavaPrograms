package p1;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			// A
			for(int j = 0; j<n; j++) {
				if(i==0 && j!=0 && j!=(n-1) || j==0 && i!=0 || j==(n-1)&& i!=0 || i==(n/2)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
			
			//B
			for(int j = 0; j<n; j++) {
				if( ((i==0 || i==(n-1) || (i==(n/2))) && j!=(n-1)) || (j==(n-1) && i!=0 && i!=(n-1) && i!=(n/2)) || j==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//C
			System.out.print("  ");
			for(int j = 0; j<n; j++) {
				if(j==0 && i!=0 && i!=(n-1) || (i==0 || i==(n-1))&& j!=0) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			//D
			System.out.print("  ");
			for(int j = 0; j<n; j++) {
				if( (j==(n-1) && i!=0 && i!=(n-1)) || j==0 || (i==0 || i==(n-1)) && j!=(n-1) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//E
			System.out.print("  ");
			for(int j = 0; j<n; j++) {
				if( i==0 || i==(n/2) || i==(n-1) || j==0 ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			//F
			System.out.print("  ");
			for(int j = 0; j<n; j++) {
				if( i==0 || i==(n/2) || j==0 ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for G
			for(int j = 0; j<n; j++) {
				if( i==0 || j==0  || i==n-1 && j>0 && j<=(n/2)
						|| j==n/2 && i>=n/2 || i==(n/2) && j>=(n/2) || j==n-1 && i>(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for H
			for(int j = 0; j<n; j++) {
				if(j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for I
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || j==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for J
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) && j<=(n/2) || j==(n/2) || j==0 && i>=( (3*n)/4 )) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.print("  ");
			//for K
			for(int j = 0; j<n; j++) {
				if(j==0 || i+j ==(n/2) || i-j == (n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for L
			for(int j = 0; j<n; j++) {
				if(j==0 || i==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for M
			for(int j = 0; j<n; j++) {
				if(j==0 || j==(n-1) || i==j && i<=(n/2) || i+j == (n-1) && j>=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for N
			for(int j = 0; j<n; j++) {
				if(j==0 || j==(n-1) || i==j ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for O
			for(int j = 0; j<n; j++) {
				if((i==0 || i==(n-1)) && j!=0 && j!=(n-1) || (j==0 || j==(n-1)) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	
}