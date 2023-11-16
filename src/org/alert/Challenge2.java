package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Documents\\Alart\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		WebElement con = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		con.click();
		WebElement alrt = d.findElement(By.xpath("//button[contains(text(),'confirm box')]"));
		alrt.click();
		Thread.sleep(3000);
		Alert a = d.switchTo().alert();
		a.accept();
	}

}
