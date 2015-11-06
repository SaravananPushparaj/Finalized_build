package Day2;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Search c1=new Google();
		Google c1=new Google();
		c1.launch();
		String Actual_Result = c1.SearchResult("Sachin");
		System.out.println(Actual_Result);
		c1.close();
		c1.Hi();
		
		Search c2=new Yahoo();
		c2.launch();
		String Actual_Result2 = c2.SearchResult("Dhoni");
		System.out.println(Actual_Result2);
		c2.close();
		
		
		
		

	}

}
