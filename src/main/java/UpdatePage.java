import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UpdatePage {
    SelenideElement upTitle = $(By.xpath("//* [text() = 'Update Profile']"));
    SelenideElement emailUp = $(By.xpath("//input[contains(@name,'email')]"));
    SelenideElement newUserName = $(By.xpath("//input[contains(@name, 'name')]"));
    SelenideElement saveButton = $(By.xpath("//button [text() = 'Save']"));
}
