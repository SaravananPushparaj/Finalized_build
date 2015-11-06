package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Object_Purchase {
	
	WebDriver browser;
	public void SetBrowser(WebDriver browser)
	{
		
		this.browser=browser;
		
	}
	
	public void SelectBook()
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
	
	public void RemoveBook()
	{
		
		browser.findElement(By.cssSelector("html body div.container span#currentcartdiv div.products_cont form div table tbody tr.selected_graybg td table tbody tr td div div")).click();
	}
	
	public String getDeletemsg()
	{
		
		return browser.findElement(By.cssSelector("html body div.container span#currentcartdiv span#currentcartdiv div.products_cont form div.cart_product.border_none span")).getText();
	}
	
	public void Close_Browser()
	{
		browser.quit();
	}
	
	
	

}
	