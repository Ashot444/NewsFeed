import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final HeaderElements headerElements = new HeaderElements();
    private final Methods methods = new Methods();


    @Epic(value = "Registration page.")
    @Feature("Registration.")
    @Story("Valid Registration.")
    @Description(value = "Check sign in with email and password.")
    @Test
    public void RegistrationTest() throws InterruptedException {
        open(loginPage.homePageURL);

        // Registration

        methods.registration();
    }


    @Epic(value = "Negative Email Registration page.")
    @Feature("Negative Email Registration.")
    @Story("Valid Negative Email Registration.")
    @Description(value = "Check sign in with email and password.")
    @Test
    public void NegativeEmailRegistrationTest() throws InterruptedException {
        open(loginPage.homePageURL);

        // negativeRegistration

        methods.negativeEmailRegistration();
        assertEquals(("Hello,  "), headerElements.helloHeader.getText());
    }

    @Epic(value = "Negative Password Registration page.")
    @Feature("Negative Password Registration.")
    @Story("Valid Negative Password Registration.")
    @Description(value = "Check sign in with email and password.")
    @Test
    public void NegativePasswordRegistrationTest() throws InterruptedException {
        open(loginPage.homePageURL);

        // negativeRegistration
        methods.negativePasswordRegistration();
        assertEquals(("Hello,  "), headerElements.helloHeader.getText());
    }

    @Epic(value = "Negative Login Registration page.")
    @Feature("Negative Login Registration.")
    @Story("Valid Negative Login Registration.")
    @Description(value = "Check sign in with email and password.")
    @Test
    public void NegativeLoginRegistrationTest() throws InterruptedException {
        open(loginPage.homePageURL);

        // negativeRegistration
        methods.negativeLoginRegistration();
        assertEquals(("Hello,  "), headerElements.helloHeader.getText());
    }

}
