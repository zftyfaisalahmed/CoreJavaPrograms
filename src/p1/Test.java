package p1;

class Dog {
    String name;
    int cost;
    String breed;

    void addData(int a, String b, String c) {
        name = b;
        cost = a;
        breed = c;
    }

    void display() {
        System.out.println(name);
        System.out.println(cost);
        System.out.println(breed);
        System.out.println("============");
    }
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
        d.display();
        d.addData(2000, "Rockys", "GR");
        d.display();
	}

}
