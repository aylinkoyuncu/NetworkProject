package network.methods;


import network.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static network.driver.BaseTest.driver;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;
    Logger logger = LogManager.getLogger((Methods.class));

    public Methods() {
        driver = BaseTest.driver;
        wait=new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchFieldException.class);
        jsdriver=(JavascriptExecutor) driver;
    }
    public WebElement findElement(By by ){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void checkurl(){
      String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.network.com.tr/");
    }
    public void checkurl2(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.network.com.tr/search?searchKey=ceket&page=2");
    }
    public void click(By by){findElement(by).click();
           }
           public  void  randomClick (By by){ findElement(by).click();

               Random random = new Random();
               List<WebElement> links = driver.findElements(by);
               int value = links.size();
               System.out.println(value);
               links.get(random.nextInt(value)).click();

           }
           public void checkValue (){

               String value =  driver.findElement(By.xpath("//*[@class='cartItem__price -old -labelPrice']")).getText().replace(" TL","");
               System.out.println(value);
               String value2 = driver.findElement(By.xpath("//*[@class='cartItem__price -sale']")).getText().replace(" TL", "");
               System.out.println(value2);

               Assert.assertNotEquals(value,value2);

           }
    public void hover(){
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("(//*[@class='product__imageItem'])"));
        builder.moveToElement(element).build().perform();
    }
    public void check (By by){findElement(by).isEnabled();
        System.out.println("Buton var");
    }
    public boolean checkBasket (By by){
        try
        {
            if(findElement(by).isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            System.out.println("No element displayed");
            return true;
        }


    }


    public void waitBySecond(long second){
        try {
            Thread.sleep(second*500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void sendKeys(By by,String text){
        findElement(by).sendKeys((text));
    }
    public boolean isElementVisible(By by){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("True");
            return true;
        }catch (Exception e){
            logger.info("False"+e.getMessage());
            return false;
        }
    }
    public void scroll(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }


}
