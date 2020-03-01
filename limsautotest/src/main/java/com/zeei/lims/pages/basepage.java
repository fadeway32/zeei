package com.zeei.lims.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {


    public static String url ="http://47.101.169.199:9000/web/system";


    public  static WebDriver webDriver = new ChromeDriver();

    public  static WebElement webElement;
    public  static void sendkeys(String str){
        webElement.clear();
        webElement.sendKeys(str);

    }
    public WebElement init_wait(String s){

        ExpectedCondition<WebElement> isTrue = ExpectedConditions.presenceOfElementLocated(By.xpath(s));


        return  new WebDriverWait(webDriver,10).until(isTrue);

    }
}
