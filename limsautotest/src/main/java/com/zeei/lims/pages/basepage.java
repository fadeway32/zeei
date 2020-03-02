package com.zeei.lims.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {


    public static String url ="http://47.111.169.199:8080/web/system/";
//    public static String path="D:\\工具集合\\Chrome 78.0.3904.87增强版\\Chrome\\App\\webdriver.exe";
    public static String path="C:\\Program Files (x86)\\Google\\Chrome\\Application\\80.0.3987.122\\chromedriver.exe";
    public  static WebDriver webDriver;
    public  static WebElement webElement;
    public  static void sendkeys(String str){
        webElement.clear();
        webElement.sendKeys(str);

    }
    public WebElement init_wait(String s){

        ExpectedCondition<WebElement> isTrue = ExpectedConditions.presenceOfElementLocated(By.xpath(s));


        return  new WebDriverWait(webDriver,10).until(isTrue);

    }

    public WebDriver startChrome(String path){
        System.setProperty("webdriver.chrome.driver",path);
        return webDriver =new ChromeDriver();

    }

    public static void main(String[] args) {
        basepage a = new basepage();
        a.startChrome(path);
    }
}
