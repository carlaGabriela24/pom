package clases_Comunes;

import org.openqa.selenium.WebElement;

public class Clase_Base {
	
	public static void sendKeys(WebElement webElementUI, String textToSend ) 
	{
		webElementUI.sendKeys(textToSend);
	}
	
	public static void click(WebElement webElementUI) 
	{
		webElementUI.click();
	}

}
