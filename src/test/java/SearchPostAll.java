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
    @Description(value = "Check sign in with email and password.")
    @Test
    public void SearchPostAll() throws InterruptedException {
        open(loginPage.homePageURL);

        for (int i = 0; i < 100; i++) {
            Selenide.$$x("//*[@class ='MuiPaper-root MuiPaper-elevation MuiPaper-rounded" +
                    " MuiPaper-elevation1 MuiCard-root Post_posts__1Y3K- css-w88nxk']").get(i).scrollIntoView(true);
        }
    }
}
