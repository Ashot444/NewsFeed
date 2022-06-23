import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DeleteUserTest extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final HeaderElements headerElements = new HeaderElements();
    private final Methods methods = new Methods();

    @Epic(value = "Delete user.")
    @Feature("Delete.")
    @Story("Valid Delete.")
    @Description(value = "Delete.")
    @Test
    public void DeleteUserTest() throws InterruptedException {
        open(loginPage.homePageURL);
        // delete user
        methods.deleteUser();
    }

    @Epic(value = "Negative Delete user.")
    @Feature("Negative Delete.")
    @Story("Valid Negative Delete.")
    @Description(value = "Negative Delete.")
    @Test
    public void NegativeDeleteUserTest() throws InterruptedException {
        open(loginPage.homePageURL);
        // delete user
        methods.negativeDeleteUser();

        //assertNotEquals(("Hello,  "), headerElements.helloHeader.getText());
    }
}
