import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    SelenideElement regTitle = $(By.xpath("//* [text() = 'Registration']"));
    SelenideElement loginReg = $(By.xpath("//input[contains(@name,'loginReg')]"));
    SelenideElement emailReg = $(By.xpath("//input[contains(@name,'emailReg')]"));
    SelenideElement passwordReg = $(By.xpath("//input[contains(@name,'passwordReg')]"));
    SelenideElement avatarReg = $(By.xpath("//input[contains(@name,'avatar')]"));
    SelenideElement submitRegButton = $(By.xpath("//button[text() = 'Save']"));
}
