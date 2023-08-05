
public class Dog {
	String name;
	String breed;
	String color;
	int age;
	
	public void eat()
	{
		System.out.println(name+" Dog is eating ");
	}
	
	public void bark()
	{
		System.out.println("Angry"+name+" "+color+" coloured dog which is aged "+age+"is barking");
	}
	public void sleep()
	{
		System.out.println(name+" "+color+ " Colored Dog is Sleeping");
	}
	public Dog()
	{
		name="Lobby";
		breed="Bull Dog";
		color="Brown";
		age=15;
				
	}
	public Dog (String a)
	{
		name=a;
		breed="GS";
		age=4;
		color="Black";
	}
	public Dog (String a ,String b)
	{
		name=a;
		breed=b;
		age=6;
		color="Golden";
	}
	public Dog (String a ,String b ,int c)
	{
		name=a;
		breed=b;
		age=c;
		color="White";
	}
	public Dog (String a ,String b ,int c, String d)
	{
		name=a;
		breed=b;
		age=c;
		color=d;
		
	}

}
