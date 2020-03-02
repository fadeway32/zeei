package com.zeei.lims.pages;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

//import org.apache.commons.httpclient.HttpClient;

import java.io.IOException;

public class login extends basepage {



    boolean flag =false;
    CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    public boolean login () throws IOException {

        WebDriver driver = super.startChrome(path);
        driver.navigate().to(url);
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

//        HttpClient client = new DefaultHttpclient();
        HttpGet get = new HttpGet(url);
        HttpResponse response = httpClient.execute(get);

        //获取响应实体
        HttpEntity entity = response.getEntity();
        int statuscode = response.getStatusLine().getStatusCode();
        if( flag = (statuscode == 200)) {
            Assert.assertTrue(flag);
            System.out.println("断言成功");
            return flag;

        }else {
            System.out.println("断言失败");
            return false;
        }

    }

    public static void main(String[] args)   {
        login a =new login();
        try {
            boolean login = a.login();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
