package network.test;

import network.driver.BaseTest;
import network.pages.Anasayfa;
import network.pages.Login;
import network.pages.Search;
import network.pages.Sepet;
import org.junit.Test;

public class AppTest extends BaseTest {
    @Test
    public void appTest(){
        Anasayfa anasayfa = new Anasayfa();
        Login  login = new Login();
        Search search = new Search();
        Sepet sepet = new Sepet();
        anasayfa.giris();
        search.search();
        sepet.sepet();
        login.Login();
        anasayfa.kontrol();
    }
}
