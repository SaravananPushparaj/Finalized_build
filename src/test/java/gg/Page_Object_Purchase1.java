package gg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Object_Purchase1 {
	
	WebDriver browser;
	Utility_Class1 c1= new Utility_Class1();
	
	public void SetBrowser(WebDriver browser)
	{
		this.browser=browser;
	}
	
	public void Select_firstbook()
	{
		browser.findElement(By.cssSelector("html body div#wrap div#myDataDiv.hide div div.divbooklist div.book-thumbnail.relative a img.imgheight")).click();
	}
	
	public void Click_Buy()
	{
		browser.findElement(By.cssSelector("html body div#wrap div#home_page.content div.leftcontainer.floatL div.search-grid-view div.book-details-wrap div.proddetailinforight div.btn-holder a.noUline div.addtocartbtn")).click();
				
	}
	
	public String getbookname()
	{
		return browser.findElement(By.xpath("//*[@id='currentcartdiv']/div/form/div/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/div[2]/span[2]")).getText();
	}
	
	public void Remove_book()
	{
		
		browser.findElement(By.cssSelector("html body div.container span#currentcartdiv div.products_cont form div table tbody tr.selected_graybg td table tbody tr td div div")).click();
		
	}
	
	public String getDeletemsg()
	{
		return browser.findElement(By.cssSelector("html body div.container span#currentcartdiv span#currentcartdiv div.products_cont form div.cart_product.border_none span")).getText();
	}
	
	public void Click_home()
	{
		
		browser.findElement(By.cssSelector("html body div.container div.logo div div a")).click();
	}
	
	public void Click_Signout()
	{
		browser.findElement(By.linkText("Sign out")).click();
	}
	
	public void Close_browser()
	{
		browser.quit();
	}
	

}
