package clases_Comunes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	
	public static WebDriver setupDriver() 
	{
		String exePath ="./driver/chromedriver.exe";// Especificamos la ruta del chromedriver
		System.setProperty("webdriver.chrome.driver", exePath); //Agregamos la ruta de la propiedad con la ruta del chrome
		WebDriver driver = new ChromeDriver();//Objeto de Webdriver
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		return driver;
	}

}
