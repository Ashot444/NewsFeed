import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderElements {
    SelenideElement enterButton = $(By.xpath("//button [text() = 'Sign Up']"));
    SelenideElement homeButton = $(By.xpath("//a[contains(@class,'Nav_navigation__item__3eTUx Nav_active__XSt-p')]"));
    SelenideElement accountMyProfile = $(By.xpath("//a[contains(text(),'My profile')]"));
    SelenideElement quitButton = $(By.xpath("//a[contains(@class,'Authorization_signout_button')]"));
    SelenideElement helloHeader = $(By.xpath("//div[contains(@class,'Header_header')]"));

}
