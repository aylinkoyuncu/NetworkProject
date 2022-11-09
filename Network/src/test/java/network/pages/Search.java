package network.pages;

import network.methods.Methods;
import org.openqa.selenium.By;

import java.lang.reflect.Method;
public class Search {
    Methods methods;

    public Search() {
        methods = new Methods();
    }

    public void search() {

        methods.sendKeys(By.id("search"), "ceket");
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@class='sgm-search-show-all']"));
        methods.waitBySecond(3);
        methods.scroll(By.xpath("//*[@class='button -secondary -sm relative']"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@class='button -secondary -sm relative']"));
        methods.waitBySecond(3);
        methods.checkurl2();
        methods.scroll(By.xpath("//*[@class='product__discountPercent -dualSmall -end']"));
        methods.hover();
        methods.waitBySecond(3);
        methods.randomClick(By.xpath("(//*[@class='product__sizeList'])[1]//*[@class='radio-box__label']"));
        methods.waitBySecond(3);
    }
}
