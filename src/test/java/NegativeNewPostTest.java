import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeNewPostTest extends SetUp {
    private final LoginPage loginPage = new LoginPage();
    private final NewsPage newsPage = new NewsPage();
    private final Methods methods = new Methods();

    @Epic(value = "Post page.")
    @Feature("Post.")
    @Story("Valid Post.")
    @Description(value = "Check sign in with email and password.")
    @Test
    public void NegativeNewPostTest() throws InterruptedException {
        open(loginPage.homePageURL);
        // negative new post
        methods.negativeNewPost();
    }

}
