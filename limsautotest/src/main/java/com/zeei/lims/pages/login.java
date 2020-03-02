package com.zeei.lims.pages;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.apache.commons.httpclient.HttpClient;

import java.io.IOException;

public class login extends basepage {


    WebDriver webDriver;
    boolean flag =false;
    CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    public boolean login () throws IOException {
        webDriver.navigate().to(url);

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpClient client = new DefaultHttpclient();
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);

        //获取响应实体
        HttpEntity entity = response.getEntity();
        StatusLine statuscode = response.getStatusLine();
        if (flag = statuscode.toString().equals("200")) {
            Assert.assertTrue(flag);

            return flag;
        }else {
            return false;
        }

    }
}
