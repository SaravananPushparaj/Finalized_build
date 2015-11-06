package Day2;

public class numberformat_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String i= "10.98";
		int j=Integer.parseInt(i);
		System.out.println(j);
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
