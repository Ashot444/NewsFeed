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

        // registration

        methods.registration();
        assertEquals(("Hello, " + methods.loginText + " "), headerElements.helloHeader.getText());
    }

}