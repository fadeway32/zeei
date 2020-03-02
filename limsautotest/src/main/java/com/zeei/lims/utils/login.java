package com.zeei.lims.utils;

import com.zeei.lims.pages.basepage;
import com.zeei.lims.pages.loginVo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Properties;

public class login {

    basepage n =new basepage();

    public void loginUtils() throws IOException {

        //使用输入流读取文件

        InputStream in =new BufferedInputStream(new FileInputStream("E:\\workspace\\zeei\\limsautotest\\src\\main\\resources\\lims.properties"));
        Properties properties = new Properties();
        //加入配置文件内容
        properties.load(in);

        WebDriver driver = n.startChrome(n.path);
        driver.navigate().to(basepage.url);

        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated((loginVo.username)));
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated((loginVo.password)));
//        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated((loginVo.loginbutton)));
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(loginVo.loginbutton));
        driver.findElement(loginVo.username).sendKeys(properties.getProperty("lims.username"));
        driver.findElement(loginVo.password).sendKeys(properties.getProperty("lims.password"));
        driver.findElement(loginVo.loginbutton).click();

    }


    public static void main(String[] args) throws IOException {
        login a =new login();
        a.loginUtils();
    }
}
