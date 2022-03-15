
package com. simplilearn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://id.heroku.com/login");


        driver.findElement(By.cssSelector("input#email")).sendKeys("pratiksha@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("pratiksha");



        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login > form > button")).click();

	}

}
