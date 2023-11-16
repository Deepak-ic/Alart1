package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Documents\\Alart\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		WebElement pro = d.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		pro.click();
		WebElement alrt = d.findElement(By.xpath("//button[contains(text(),'prompt box')]"));
		alrt.click();
		Thread.sleep(3000);
		Alert a = d.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("HI Hello!!");
        Thread.sleep(2000);
        a.accept();
		
	}

}
