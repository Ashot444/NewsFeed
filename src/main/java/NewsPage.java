import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    SelenideElement newPostTitle = $(By.xpath("//* [text() = 'Add new post']"));
    SelenideElement title = $(By.xpath("//input[contains(@name, 'title')]"));
    SelenideElement post = $(By.xpath("//textarea[contains(@name, 'body')]"));
    SelenideElement picture = $(By.xpath("//input[contains(@name,'picture')]"));
    SelenideElement tags = $(By.xpath("//input[contains(@name, 'tags')]"));
    SelenideElement saveButton = $(By.xpath("//button [text() = 'Save']"));
    SelenideElement getTitle = $(By.xpath("//div[contains(@class, 'MuiTypography-h5 ')][1]"));







}


