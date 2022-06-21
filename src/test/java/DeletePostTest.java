import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DeletePostTest extends SetUp{
    private final LoginPage loginPage = new LoginPage();
    private final NewsPage newsPage = new NewsPage();
    private final HeaderElements headerElements = new HeaderElements();
    private final Methods methods = new Methods();

    @Epic(value = "Delete post.")
    @Feature("Delete.")
    @Story("Valid Delete.")
    @Description(value = "Delete.")
    @Test
    public void DeletePostTest() throws InterruptedException {
        open(loginPage.homePageURL);
        // delete user
        methods.deletePost();

        newsPage.getTitle.shouldNot(Condition.visible);
    }

}
