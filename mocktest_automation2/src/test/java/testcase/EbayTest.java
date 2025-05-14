package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import page.EbayPage;


public class EbayTest extends BaseTest {
EbayPage obj;
@BeforeClass
public void objinit()
{
 obj=new EbayPage(driver);
}
@Test
public void searchitems()
{
	obj.search("Apple watches");
	obj.selectcategory();
	obj.searchbtn();
	
}
}
