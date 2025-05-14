package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayPage {
	WebDriver driver;
	public EbayPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void search(String data)
	{
		WebElement dat=driver.findElement(By.xpath("//input[@class='gh-search-input gh-tb ui-autocomplete-input']")); 
		dat.sendKeys(data);
	}
	public void selectcategory()
	{
		WebElement cat=driver.findElement(By.xpath("//select[@class='gh-search-categories']"));
		Select sel=new Select(cat);
		sel.selectByVisibleText("Smart Watches");
		cat.click();
	}
	public void searchbtn()
	{
		WebElement button=driver.findElement(By.xpath("//span[text()='Search']"));
		button.click();
	}
}
