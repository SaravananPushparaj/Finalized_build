package lp;

public class B extends A {
	int res;
	public void add2sub10()
	{
		super.add();
		int i = super.result;
		res=i-10;
		System.out.println(res);
	}
	
	public void add()
	{
		res =10+20+30;
		System.out.println(res);
	}

}
