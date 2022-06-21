import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(("Hello,  "), headerElements.helloHeader.getText());
    }
}
