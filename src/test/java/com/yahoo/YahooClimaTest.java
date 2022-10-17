package com.yahoo;

import org.testng.annotations.Test;

import Driver.BrowserFactory;
import Driver.DriverFactory;
import PageModel.Yahoo;
import PageModel.YahooClima;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class YahooClimaTest {
	BrowserFactory bf;
	WebDriver driver;
	Yahoo yh;
	YahooClima yhc;
	String[][] ll = null;
	
  @Test
  public void f() throws InterruptedException {
	  yh = new Yahoo(driver);
	  yh.navegar("https://espanol.yahoo.com/");
	  yh.clickVerMas();
	  
	  yhc = new YahooClima(driver);
	  yhc.clickCentigrados();
	  yhc.clickCambiarUbicacion();
	  yhc.enviarCordoba();
	  yhc.clickCordobaList();
	  Thread.sleep(2000);
	  yhc.listaArray();

  }
  

    @BeforeTest
	@Parameters({"browser", "nodeUrl"})
	public void setUp(String browser, String nodeUrl) {
		try {
		bf = new BrowserFactory();
		DriverFactory.getInstance().setDriver(bf.setDriver(browser, nodeUrl));
		driver = DriverFactory.getInstance().getDriver();
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		bf.removeDriver();
	}
}
