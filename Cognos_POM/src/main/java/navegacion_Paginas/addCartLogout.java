package navegacion_Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clases_Comunes.Clase_Base;

public class addCartLogout {

	public addCartLogout(WebDriver driver) {
		PageFactory.initElements(driver, this); // inicializamos los pageobject / elementos con page factorey
	}

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement btnaddtocart;
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement btnaburgermenu;

	@FindBy(id = "logout_sidebar_link")
	private WebElement logout;
	
	
	public void seleccionaProducto() {
		Clase_Base.click(btnaddtocart);
	}
		
	public void cierraSesion() {
		Clase_Base.click(btnaburgermenu);
		Clase_Base.click(logout);
	}
	
}
