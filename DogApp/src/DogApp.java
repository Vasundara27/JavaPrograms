
public class DogApp {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.eat();
		d.sleep();
		d.bark();
		System.out.println("===============");
		Dog d1= new Dog("Rockey");
		d1.eat();
		d1.sleep();
		d1.bark();
		System.out.println("===============");
		Dog d2= new Dog("Goldy","Golden ");
		d2.eat();
		d2.sleep();
		d2.bark();
		System.out.println("===============");
		Dog d3= new Dog("Whity","Gr",10,"White");
		d3.eat();
		d3.sleep();
		d3.bark();

	}

}
