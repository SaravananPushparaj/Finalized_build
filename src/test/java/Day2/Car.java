package Day2;

public class Car {
	
	String model;
	public static void main(String[] args) {
		
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.model="BMW";
		b.model="Audi";
		c.model="Nano";		
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		//*****************************************
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("******************");
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		
		
		
	}
	

}
