package org.example;

import org.testng.Assert;
import org.junit.Test;
import utils.BaseClass;

public class FirstTest extends BaseClass {

    @Test
    public void openPageGoogle(){
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().equals("Google"),"Title tidak sesuai");
    }

    @Test
    public void selectTop(){

    }
}
