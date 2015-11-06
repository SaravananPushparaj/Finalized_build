package Day2;

public class acc_mod_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acc_mod_methods c1=new acc_mod_methods();
		System.out.println(c1.Add(4, 1));
		System.out.println(c1.Mul(7, 8));
		System.out.println(c1.Add(4.0, 10.3));
		System.out.println(c1.Add(4.6, 1.3,2.8));
	}
	
	public int Add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	protected int Mul(int a, int b)
	{
		int c=a*b;
		return c;
	}
	
	//method overloading
	private double Add(double a, double b)
	{
		double c=a+b;
		return c;
	}
	
	 double Add(double a, double b, double c)
	{
		double d=a+b+c;
		return d;
	}
	

}
