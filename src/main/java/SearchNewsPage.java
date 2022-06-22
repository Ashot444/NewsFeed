import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchNewsPage {
    SelenideElement searchNews = $(By.xpath("//*[contains(@class, 'MuiTypography-h5 ')]"));

    SelenideElement inputSearch = $(By.xpath("//input[contains(@class, 'search')]"));

    SelenideElement news = $(By.xpath("//div[contains(@class, 'MuiPaper-root')]"));

    SelenideElement searchButton = $(By.xpath("//button [text() = 'Search']"));

    ElementsCollection arrNews = $$(By.xpath("//*[@class ='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-t1nuxs']"));

    ElementsCollection arrAreaNews = $$(By.xpath("//*[@class ='MuiTypography-root MuiTypography-body2 css-u30lmt']"));


}


