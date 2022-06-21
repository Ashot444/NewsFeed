import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NegativeUpdatePostTest extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final Methods methods = new Methods();

    @Epic(value = "Update Post page.")
    @Feature("Update Post.")
    @Story("Valid Post.")
    @Description(value = "Update post.")
    @Test
    public void NegativeUpdatePostTest() throws InterruptedException {
        open(loginPage.homePageURL);
        // negative update post
        methods.negativeUpdatePost();
    }
}
