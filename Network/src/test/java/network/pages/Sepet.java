package network.pages;

import network.methods.Methods;
import org.openqa.selenium.By;

public class Sepet {
    Methods methods;

    public Sepet() {
        methods = new Methods();
    }

    public void sepet() {
        methods.click(By.xpath("//*[@class='button -primary header__basket--checkout header__basketModal -checkout']"));
        methods.waitBySecond(3);
        methods.checkValue();
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@class='continueButton n-button large block text-center -primary']"));
        methods.waitBySecond(3);
    }
}
