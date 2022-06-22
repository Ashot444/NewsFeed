import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeSearchNewsOne extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final SearchNewsPage searchNewsPage = new SearchNewsPage();
    private final Methods methods = new Methods();

    @Epic(value = "Negative Search page.")
    @Feature("Negative Search.")
    @Story("Valid Post.")
    @Description(value = "Negative Search post.")
    @Test
    public void NegativeSearchNewsOne() throws InterruptedException {
        open(loginPage.homePageURL);
        //negative search post

        methods.negativeSearchPostOne();
    }
}
