package Day2;

public class arithmetic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		int div=4/0;
		System.out.println("A");
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("B");
		
		

	}

}
