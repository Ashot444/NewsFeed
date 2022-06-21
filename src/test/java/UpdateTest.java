import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UpdateTest extends SetUp{
        private final LoginPage loginPage = new LoginPage();
        private final HeaderElements headerElements = new HeaderElements();
        private final Methods methods = new Methods();

        @Epic(value = "Update page.")
        @Feature("Update.")
        @Story("Valid Update.")
        @Description(value = "Update user")
        @Test
        public void UpdateTest() throws InterruptedException {
                open(loginPage.homePageURL);
                //update
                methods.update();

                assertEquals(("Hello, " + methods.loginText + " "), headerElements.helloHeader.getText());
                assertNotEquals((methods.emailText), "default@mail.ru");

                methods.updatedefault();
        }
}
