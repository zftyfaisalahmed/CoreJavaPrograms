package p1;

class Calculator {
	static int a,b,c;
	int p,q,r;
	
	static {
		a=100;
		b=200;
		c=300;
		
//		p=1001;
//		q=1001;
//		r=1001;   doesn"t not 
	}
	
	{
		p=100;
		q=200;
		r=300;
		a=100;
		b=200;
		c=300;
	}
	
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(p);
//		System.out.println(q);
//		System.out.println(r);
	}
	
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
	
	
}

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.a);
		System.out.println(Calculator.b);
		System.out.println(Calculator.c);
		System.out.println("==============");
		
		Calculator.display();
		System.out.println("==============");
		
		Calculator ca = new Calculator();
		ca.display1();
		System.out.println("==============");
		
	}

}
