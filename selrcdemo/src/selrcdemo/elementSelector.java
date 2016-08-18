package selrcdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementSelector {
	
	private static WebDriver firefox;
	String URL = "http://www.speakingcs.com/";

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","C:\\seleniumFirefoxDriver\\geckodriver.exe");
         // if above property is not working or not opening the application in browser then try below property
         //System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
        firefox = new FirefoxDriver();
        
        elementSelector ese = new elementSelector();
		ese.getPostTitles();

		firefox.quit();
		
	}*/

	private void getPostTitles() {
		// TODO Auto-generated method stub
		firefox.get(URL);
		List<WebElement> postTitles = firefox.findElements(By.className("entry-header"));
		for(WebElement eachTitle : postTitles){
			System.out.println(eachTitle.getText());
		}
		
	}
	

}
