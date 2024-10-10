package p1;

class Calculation {
	void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
		System.out.println("=======");
	}
	void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
		System.out.println("=======");
	}
}

public class Test3 {
//LocalVariable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c = new Calculation();
		c.add(10, 20);
		c.sub(30, 20);
	}

}
