import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    String homePageURL = "https://news-feed-2.dunice-testing.com/";





    // login
    SelenideElement email = $(By.xpath("//input[contains(@name, 'email')]"));
    SelenideElement password = $(By.xpath("//input[contains(@name, 'password')]"));
    SelenideElement submitButton = $(By.xpath("//button[contains(@class, 'Authorization_button')]"));


}
