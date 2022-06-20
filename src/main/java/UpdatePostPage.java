import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UpdatePostPage {
    SelenideElement updatePostTitle = $(By.xpath("//* [text() = 'Update post']"));
    SelenideElement upTitle = $(By.xpath("//input[contains(@name, 'title')]"));
    SelenideElement upPost = $(By.xpath("//textarea[contains(@name, 'body')]"));
    SelenideElement upPicture = $(By.xpath("//input[contains(@name,'picture')]"));
    SelenideElement upTags = $(By.xpath("//input[contains(@name, 'tags')]"));
    SelenideElement saveButton = $(By.xpath("//button [text() = 'Save']"));
}
