package Day2;

public class nullpointer_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String i= null;
		System.out.println(i.length());
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//;

	}

}
