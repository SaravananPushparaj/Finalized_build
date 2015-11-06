package lp;

public class google_open extends Initialize_browser {
	
	public void googleopen()
	{
		super.openBrowser();
		driver.get("http://google.com");
		driver.close();
	}

}
