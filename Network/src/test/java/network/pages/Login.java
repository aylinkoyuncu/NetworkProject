package network.pages;

import network.methods.Methods;
import org.openqa.selenium.By;

public class Login {
    Methods methods;

    public Login() {
        methods = new Methods();
    }

    public void Login() {
        methods.check(By.xpath("//*[@class='n-button large block text-center -primary ']"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@class='headerCheckout__logo__img']"));
        methods.waitBySecond(3);
    }
}
