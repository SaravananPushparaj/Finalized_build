package Day2;

public class B extends A {
	
	int res,a=20,b=40,c=10;
	public int add2sub()
	{
		 res =super.add();
		 res=res-10;
		 return res;
		
	}
	
	public int add()
	{
		res=a+b+c;
		return res;
	}

}
