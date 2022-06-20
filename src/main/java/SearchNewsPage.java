import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchNewsPage {
    SelenideElement searchNews = $(By.xpath("//*[contains(@class, 'MuiTypography-h5 ')]"));

    SelenideElement inputSearch = $(By.xpath("//input[contains(@class, 'search')]"));

    SelenideElement searchButton = $(By.xpath("//button [text() = 'Search']"));
}
