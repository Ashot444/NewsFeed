import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PaginationPostTest extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final SearchNewsPage searchNewsPage = new SearchNewsPage();
    private final Methods methods = new Methods();

    @Epic(value = "Pagination post.")
    @Feature("Pagination.")
    @Story("Valid Post.")
    @Description(value = "Pagination post all")
    @Test
    public void PaginationPostTest(){
        open(loginPage.homePageURL);
        //pagination

        methods.poginaciaPostAll();
    }
}
