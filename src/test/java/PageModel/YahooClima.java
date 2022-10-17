package PageModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class YahooClima extends PageModel.Base {

	String[][] ls;

	private By buscar = By.xpath("//input[@aria-label= 'Search']");
	private By centigrados = By.xpath("//button[@aria-label = '°Centígrados']");
	private By maxima = By.xpath("//span[@class = 'high D(ib) Miw(32px)']");
	private By minima = By.xpath("//span[@class = 'low Pstart(10px) C(#a5d6ff) D(ib) Miw(32px)']");
	private By cambiarUbicacion = By.xpath("//span[text() = 'Cambiar ubicación']");
	private By buscarCiudad = By.xpath("//input[@placeholder =  'Introducir la ciudad o el código postal']");
	private By cordobaAr = By.xpath("//button[contains(text(),  'Córdoba, CBA, AR')]");
	private By dias = By.cssSelector("div.Fz\\(1\\.2em\\) > div:nth-child(1) > span");

	/// div.Fz\(1\.2em\):nth-child(1) > div:nth-child(1) > span
	/// LIST MAX //span[@class = 'high D(ib) Miw(32px)']
	/// LIST MIN //span[@class = 'low Pstart(10px) C(#a5d6ff) D(ib) Miw(32px)']

	public YahooClima(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCentigrados() {
		clickElemento(centigrados);
	}

	public void clickCambiarUbicacion() {
		clickElemento(cambiarUbicacion);
	}

	public void clickCordobaList() {
		clickElemento(cordobaAr);
	}

	public void enviarCordoba() {
		sendKey(buscarCiudad, "cordoba argentina");
	}

	public void listaMaxima() {
		ListaString(maxima);
	}

	public void listaMinima() {
		ListaString(minima);
	}

	public void listaDias() {
		ListaString(dias);

	}

	/*
	 * public String[][] lise() { return listae(dias, maxima , minima); }
	 */
	/*
	 * public void lis() throws InterruptedException { listae(dias,maxima,minima); }
	 */
	public void listaArray() throws InterruptedException {
		String[][] ls = new String[11][3];
		int c =0, e=0,f=0;
			try {
				for (WebElement elemen : listaElementos(dias)) {
						if(elemen!=null | elemen.toString() != "") {
							String tex = elemen.getText();
							ls[c][0] = tex;
							//System.out.println("Dias: "+ls[c][0].toString());
							c++;
							}
					}
				}catch(Exception err){}
				
			
			try {
				for (WebElement elemen : listaElementos(maxima)) {
					if(elemen!=null | elemen.toString() != "") {
						String tex = elemen.getText();
						ls[e][1] = tex;
						//System.out.println("Maxima: "+ls[e][1].toString());
						e++;
						}
					}
				}catch(Exception err){}
			
			try {
				for (WebElement elemen : listaElementos(minima)) {
					if(elemen!=null | elemen.toString() != "") {
						String tex = elemen.getText();
						ls[f][2] = tex;
						//System.out.println("Minima: "+ls[f][2].toString());
						f++;
						}
					}
				
				}catch(Exception err){
					System.out.println(err.toString());
				}
			
			
				for(int i=0 ; i+1<ls.length; i++) {
					System.out.println("Dia: "+ls[i][0].toString()+ " | Maxima: "+ls[i][1].toString()+
							" | Minima: "+ls[i][2].toString());
				}
			
			
			///////
	}
		
		
}
	
	


