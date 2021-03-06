package com.shareku.FirstMaven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.DriverFactory;

public class Cookies {
    /**
     * @author Young
     * 
     */
    public static void addCookies() {

        //WebDriver driver = DriverFactory.getChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://jingxiang.linkpet.com.cn/Home/Login/user_login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement user = driver.findElement(By.id("username"));
        user.clear();
        user.sendKeys("13701382571");
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("123456");

        WebElement submit = driver.findElement(By.id("loginfrom"));
        submit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        File file = new File("broswer.data");
        try {
            // delete file if exists
            file.delete();
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Cookie ck : driver.manage().getCookies()) {
                bw.write(ck.getName() + ";" + ck.getValue() + ";"
                        + ck.getDomain() + ";" + ck.getPath() + ";"
                        + ck.getExpiry() + ";" + ck.isSecure());
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("cookie write to file");
        }
        driver.quit();
    }
    
}