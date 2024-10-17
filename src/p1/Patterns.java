package p1;

import java.util.*;

class Pattern {
	void ChoosePatterns() {
		System.out.println("Patterns : ");
		System.out.println("Select the Pattren to be performed : ");
		System.out.println("1. Pattern1\n" + "2. Pattern2\n" + "3. Pattern3\n" + "4. Pattern4\n" + "5. Pattern5\n" + "6. Pattern6\n" + "8. Pattern8\n" + "9. Pattern9\n" + "10. Pattern10\n");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		switch (choose) {
			case 1 : {
				Pattern pa = new Pattern();
				pa.Pattern1();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern1();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			case 2 : {
				Pattern pa = new Pattern();
				pa.Pattern2();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern2();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			case 3 : {
				Pattern pa = new Pattern();
				pa.Pattern3();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern3();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}

			case 4 : {
				Pattern pa = new Pattern();
				pa.Pattern4();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern4();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}

			case 5 : {
				Pattern pa = new Pattern();
				pa.Pattern5();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern5();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			case 6 : {
				Pattern pa = new Pattern();
				pa.Pattern6();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern6();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			case 7 : {
				Pattern pa = new Pattern();
				pa.Pattern7();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern7();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			case 8 : {
				Pattern pa = new Pattern();
				pa.Pattern8();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern8();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			case 9 : {
				Pattern pa = new Pattern();
				pa.Pattern9();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern9();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			case 10 : {
				Pattern pa = new Pattern();
				pa.Pattern10();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    Pattern10();
                    break;
                } else if (num == 2) {
                    ChoosePatterns();
                    break;
                } else {
                    break;
                }
			}
			
			default:
				break;
		}
	}
	
	void Pattern1() {
		System.out.println("#");
	}
	
	void Pattern2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		for (int i=1; i<=size; i++) {
			System.out.println("#");
		}
	}
	
	void Pattern3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		for (int i=1; i<=size; i++) {
			System.out.print("# ");
		}
	}
	
	void Pattern4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		for (int i=1; i<=size; i++) {
			System.out.println(i);
		}
	}
	
	void Pattern5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		for (int i=1; i<=size; i++) {
			System.out.print(i+" ");
		}
	}
	
	void Pattern6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++) {
			for (int j=1; j<=size; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	void Pattern7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++) {
			for (int j=1; j<=size; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	void Pattern8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++) {
			for (int j=1; j<=size; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void Pattern9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int count = 1;
		
		for(int i=1; i<=size; i++) {
			for (int j=1; j<=size; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	void Pattern10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int count = size * size;
		
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=size; j++) {
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}
	}
}

public class Patterns {
	public static void main(String[] args) {
		Pattern pa = new Pattern();
		pa.ChoosePatterns();
	}
}
