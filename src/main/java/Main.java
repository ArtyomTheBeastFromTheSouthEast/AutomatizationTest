import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\WebDriver\\chromedriver.exe");
        SimbirSoft();
    }
    static void SimbirSoft()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement input=driver.findElement(By.xpath("//input[@aria-label=\"Найти\"]"));

        input.sendKeys("Калькулятор");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        input.sendKeys(Keys.ENTER);



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        WebElement element = driver.findElement(By.xpath("//div[.='1']"));
        element.click();





        WebElement elementOne = driver.findElement(By.xpath("//div[@aria-label=\"умножение\"]"));
        elementOne.click();



        WebElement elementTwo = driver.findElement(By.xpath("//div[.='2']"));
        elementTwo.click();



        WebElement elementThree = driver.findElement(By.xpath("//div[@aria-label=\"вычитание\"]"));
        elementThree.click();



        WebElement elementFour = driver.findElement(By.xpath("//div[.='3']"));
        elementFour.click();



        WebElement elementFive = driver.findElement(By.xpath("//div[@aria-label=\"сложение\"]"));
        elementFive.click();



        WebElement elementSix = driver.findElement(By.xpath("//div[.='1']"));
        elementSix.click();



        WebElement elementSeven = driver.findElement(By.xpath("//div[@aria-label=\"равно\"]"));
        elementSeven.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
        
    }





}
