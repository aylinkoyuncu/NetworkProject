package network.pages;

import network.driver.BaseTest;
import network.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static network.driver.BaseTest.driver;

public class Anasayfa {
    Methods methods;
public Anasayfa(){methods= new Methods();}

    public void giris() {
        methods.waitBySecond(3);
        methods.click(By.id("onetrust-accept-btn-handler"));
        methods.waitBySecond(3);
        methods.checkurl();
        methods.waitBySecond(3);
}
public  void kontrol(){
    methods.click(By.xpath("//*[@class='header__icon -shoppingBag']"));
    methods.waitBySecond(3);
    methods.click(By.xpath("//*[@class='header__basketProductRemove']"));
    methods.waitBySecond(3);
    methods.click(By.xpath("//*[@class='btn -black o-removeCartModal__button']"));
    methods.waitBySecond(3);
    methods.checkBasket(By.xpath("//*[@class='header__basket--count']"));
}
}

