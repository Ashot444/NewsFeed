import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NegativeUpdateTest extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final HeaderElements headerElements = new HeaderElements();
    private final Methods methods = new Methods();

    @Epic(value = "NegativeUpdate page.")
    @Feature("NegativeUpdate.")
    @Story("Valid NegativeUpdate.")
    @Description(value = "Check sign in with email and password.")
    @Test
    public void NegativeUpdateTest() throws InterruptedException {
        open(loginPage.homePageURL);
        //update
        methods.negativeUpdate();
    }
}
