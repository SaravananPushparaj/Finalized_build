package Day2;

public class Launch_Inheritence extends Browser_Inheritence {
	
	public void openbrowser()
	{
		super.Initialize_Browser();
		browser.get("http://www.google.com");
		browser.close();
		
		
	}

}
