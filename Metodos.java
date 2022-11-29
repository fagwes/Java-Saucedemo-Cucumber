package metodos;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}
}
