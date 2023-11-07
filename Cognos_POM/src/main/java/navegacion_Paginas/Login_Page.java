package navegacion_Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clases_Comunes.Clase_Base;

public class Login_Page 
{
	public Login_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this); // inicializamos los pageobject / elementos con page factorey
	}
	
	//Identificamos los elementos con los que vamos a trabajar
	//LOGIN
	@FindBy(id="user-name")
	private WebElement user_nameTXT;
	//Password
	@FindBy(id="password")
	private WebElement passwordTXT;
	//Boton Login
	@FindBy(id="login-button")
	private WebElement btnLogin;
	
	
	//Creamos el metodo de Login
	
	public void login (String usuario, String Password) 
	{
		Clase_Base.sendKeys(user_nameTXT, usuario);
		Clase_Base.sendKeys(passwordTXT, Password);
		Clase_Base.click(btnLogin);
	}
}
