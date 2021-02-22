package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Task1PM extends TimerTask {       // 1 PM

    public void run() {
        System.setProperty("webdriver.chrome.driver", "/Users/dannyg/IdeaProjects/Test_Selenium_Project/chromedriver");
        WebDriver obj = new ChromeDriver();     // Initialize Chrome Browser
        obj.manage().window().maximize();       // Maximize Screen

        obj.get("https://wrc.fiu.edu/Program/GetProgramDetails?courseId=3b990f59-63a0-480a-83ab-56f1b0b8e1a5&semesterId=72dc3729-af15-4d58-86ee-7e1aa73e2b50");
        obj.findElement(By.linkText("Log In")).click();     // Log In Button
        obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //wait

        obj.findElement(By.className("loginOption")).click();       // Panther ID button

        // COMMENTED OUT BECAUSE IT NEEDS TO FULLY RUN TO SCHEDULE
       /* obj.findElement(By.id("username")).sendKeys("");    //Username typing (Type Username)
        obj.findElement(By.id("password")).sendKeys("");   //Password typing (Type Password)

        obj.findElement(By.name("submit")).click();     //Submit log in

        WebElement webElement = obj.findElement(By.id("push"));     // Push Notification sent using JS
        JavascriptExecutor executor = (JavascriptExecutor) obj;
        executor.executeScript("arguments[0].click();", webElement);

        obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);       //wait

        obj.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[7]/div[9]/div/div/div/button")).click();  // Choose time(1pm);

        obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);       //wait

        obj.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/form[2]/div[2]/button[2]")).click(); // Add to cart

        obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ((JavascriptExecutor) obj).executeScript("scroll(0,400)"); //scrolls page to avoid accepting cookies

        obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        obj.findElement(By.id("checkoutButton")).click();       // Checkout button

        obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        obj.findElement(By.xpath("//*[@id=\"CheckoutModal\"]/div/div[2]/button[2]")).click();   // Final checkout click finishes here and receipt sent to email*/
    }





}
