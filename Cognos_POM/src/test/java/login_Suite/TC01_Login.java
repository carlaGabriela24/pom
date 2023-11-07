package login_Suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import clases_Comunes.SetupDriver;
import clases_Comunes.Variables_Globales;
import navegacion_Paginas.Login_Page;
import navegacion_Paginas.addCartLogout;

public class TC01_Login {
	//Declaramos el WebDriver
	
	WebDriver driver=SetupDriver.setupDriver(); // inicializamos el driver
	
	//Creamos un objeto de login page
	
	Login_Page login = new Login_Page(driver); //usamos los objetos de la pagina de login
	
	//ccc
	addCartLogout addCartL = new addCartLogout(driver);
	//
	
	@BeforeTest
	public void iniciarWebDriver() 
	{
		//obtenemos la url
		driver.get(Variables_Globales.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_01() throws InterruptedException
  {
	login.login(Variables_Globales.USER_ADMIN, Variables_Globales.PASSWORD_ADMIN);
	
	Thread.sleep(5000);
	//ccc
	addCartL.seleccionaProducto();
	
	Thread.sleep(5000);
	
	addCartL.cierraSesion();
	  
  }
  //Cerramos el navegador 
  /*@AfterTest
  public void closeDriver() 
  {
	  driver.quit();
  }*/
}
