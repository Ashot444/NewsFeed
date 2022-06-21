import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchPostAll extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final SearchNewsPage searchNewsPage = new SearchNewsPage();
    private final Methods methods = new Methods();

    @Epic(value = "Search page.")
    @Feature("Search.")
    @Story("Valid Post.")
    @Description(value = "Search post all")
    @Test
    public void SearchPostAll() throws InterruptedException {
        open(loginPage.homePageURL);

        methods.searchPostAll();
    }
}
