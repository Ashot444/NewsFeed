import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {

    SelenideElement deleteUser = $(By.xpath("//button[contains(text(),'Delete profile')]"));
    SelenideElement updateUser = $(By.xpath("//button[contains(text(),'Update')]"));
    SelenideElement submitNewPostButton = $(By.xpath("//button[text() = 'New Post']"));
    SelenideElement deletePostButton = $(By.xpath("//button [text() = 'Delete']"));
    SelenideElement updatePostButton = $(By.xpath("//button [contains(@class, 'UpdatePost_button')]"));

}
