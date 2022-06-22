import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UpdatePostTest extends SetUp{
        private final LoginPage loginPage = new LoginPage();
        private final Methods methods = new Methods();

        @Epic(value = "Update Post page.")
        @Feature("Update Post.")
        @Story("Valid Post.")
        @Description(value = "Update post")
        @Test
        public void UpdatePostTest() throws InterruptedException {
            open(loginPage.homePageURL);
            // update post
            methods.updatePost();

            assertNotEquals((methods.titleText), methods.upTitleText);
        }

    @Epic(value = "Negative Update Post.")
    @Feature("Negative Update Post.")
    @Story("Valid Post.")
    @Description(value = "Negative Update post.")
    @Test
    public void NegativeUpdatePostTest() throws InterruptedException {
        open(loginPage.homePageURL);
        // negative update post
        methods.negativeUpdatePost();
    }
}
