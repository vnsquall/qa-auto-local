package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 6/4/2015.
 */
public class HomePage {
    By homePageTitle = By.xpath("//*[@id='content']/h1");
    String homePageTxt = "Welcome to the Internet";

    By loginPageRef = By.xpath("//*[@id='content']/ul/li[16]/a");
    By basicAuthRef = By.xpath("//*[@id='content']/ul/li[2]/a");
    By geoLocationRef = By.xpath("//*[@id='content']/ul/li[18]/a");

    public Boolean homePageLoaded (WebDriver driver){
        return find_element(driver, homePageTitle).getText().equals(homePageTxt);
    }

    public void gotoLoginPage (WebDriver driver){
        find_element(driver, loginPageRef).click();
    }

    public void gotoBasicAuthPage (WebDriver driver){
        find_element(driver, basicAuthRef).click();
    }

    public void gotoGeolocationPage (WebDriver driver){
        find_element(driver, geoLocationRef).click();
    }
}