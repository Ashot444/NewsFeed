import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchNewsOne extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final SearchNewsPage searchNewsPage = new SearchNewsPage();
    private final Methods methods = new Methods();

    @Epic(value = "Search page.")
    @Feature("Search.")
    @Story("Valid Post.")
    @Description(value = "Check sign in with email and password.")
    @Test
    public void SearchNewsOne() throws InterruptedException {
        open(loginPage.homePageURL);
        // search post

        methods.searchPostOne();
        assertEquals(("cb95ef4bb5"), searchNewsPage.searchNews.getText());
    }
}
