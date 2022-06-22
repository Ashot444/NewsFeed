import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Methods {

    private final LoginPage loginPage = new LoginPage();

    private final RegistrationPage registrationPage = new RegistrationPage();
    private final HeaderElements headerElements = new HeaderElements();
    private final AccountPage accountPage = new AccountPage();
    private final UpdatePage updatePage = new UpdatePage();
    private final NewsPage newsPage = new NewsPage();

    private final SearchNewsPage searchNewsPage = new SearchNewsPage();
    private final UpdatePostPage updatePostPage = new UpdatePostPage();


    protected static String emailText = "default@mail.ru";
    protected static String loginText = "defaultName";
    protected static String passwordText = "12345";
    private static String userName;
    protected static String titleText;
    protected static String upTitleText;
    private static String postText;
    private static String upPostText;
    private static String tagsText;
    private static String upTagsText;

    // random string generation
    public static String generateRandomHexString (int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }

    public void allmethods(){
        headerElements.helloHeader.shouldBe(Condition.visible);
        loginPage.email.sendKeys(emailText);
        loginPage.password.sendKeys(passwordText);
        loginPage.submitButton.click();
        headerElements.helloHeader.shouldBe(Condition.exactText(headerElements.helloHeader.getText()));
    }
    public void negativeAllMethods() throws InterruptedException {
        headerElements.helloHeader.shouldBe(Condition.visible);
        loginPage.email.sendKeys(generateRandomHexString(5) + "@gmail.com");
        loginPage.password.sendKeys(generateRandomHexString(5));
        loginPage.submitButton.click();
        Thread.sleep(1000);
        loginPage.alertError.shouldBe(Condition.visible);
    }


    public void registration() throws InterruptedException {
        headerElements.enterButton.shouldBe(Condition.visible).click();
        registrationPage.regTitle.shouldBe(Condition.visible);

        registrationPage.emailReg.sendKeys(generateRandomHexString(5) + "@gmail.com");
        emailText = registrationPage.emailReg.getAttribute("value");


        registrationPage.loginReg.sendKeys(generateRandomHexString(5));
        loginText = registrationPage.loginReg.getAttribute("value");

        registrationPage.passwordReg.sendKeys(generateRandomHexString(6));
        passwordText = registrationPage.passwordReg.getAttribute("value");

        String avatarPath = "src/main/resources/avatar.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        registrationPage.avatarReg.sendKeys(file.getAbsolutePath());

        registrationPage.submitRegButton.click();

        headerElements.helloHeader.shouldBe(Condition.visible);

        Thread.sleep(3000);
    }

    public void negativeRegistration() throws InterruptedException {
        headerElements.enterButton.shouldBe(Condition.visible).click();
        registrationPage.regTitle.shouldBe(Condition.visible);

        registrationPage.loginReg.sendKeys(generateRandomHexString(5));
        loginText = registrationPage.loginReg.getAttribute("value");

        registrationPage.passwordReg.sendKeys(generateRandomHexString(6));
        passwordText = registrationPage.passwordReg.getAttribute("value");

        String avatarPath = "src/main/resources/avatar.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        registrationPage.avatarReg.sendKeys(file.getAbsolutePath());

        registrationPage.submitRegButton.click();

        headerElements.helloHeader.shouldBe(Condition.visible);

        Thread.sleep(1000);

        loginPage.alertError.shouldBe(Condition.visible);
    }


    public void login() throws InterruptedException {
        allmethods();
    }

    public void negativeLoginText() throws InterruptedException{
        negativeAllMethods();

    }


    public void update() throws InterruptedException {
        allmethods();
        headerElements.accountMyProfile.shouldBe(Condition.visible).click();
        accountPage.updateUser.shouldBe(Condition.visible).click();
        updatePage.upTitle.shouldBe(Condition.visible);

        loginPage.email.sendKeys(generateRandomHexString(5) + "@gmail.com");
        emailText = updatePage.emailUp.getAttribute("value");

        updatePage.newUserName.sendKeys(generateRandomHexString(5));
        loginText = updatePage.newUserName.getAttribute("value");

        String avatarPath = "src/main/resources/avatar.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        registrationPage.avatarReg.sendKeys(file.getAbsolutePath());

        updatePage.saveButton.shouldBe(Condition.visible).click();

        Thread.sleep(3000);
    }

    public void negativeUpdate(){
        allmethods();
        headerElements.accountMyProfile.shouldBe(Condition.visible).click();
        accountPage.updateUser.shouldBe(Condition.visible).click();
        updatePage.upTitle.shouldBe(Condition.visible);

        loginPage.email.sendKeys(generateRandomHexString(5) + "@gmail.com");
        emailText = updatePage.emailUp.getAttribute("value");

        updatePage.newUserName.sendKeys(generateRandomHexString(2));
        loginText = updatePage.newUserName.getAttribute("value");

        String avatarPath = "src/main/resources/avatar.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        registrationPage.avatarReg.sendKeys(file.getAbsolutePath());

        updatePage.saveButton.click();

        loginPage.alertError.shouldBe(Condition.visible);
    }

    public void updatedefault(){
        accountPage.updateUser.shouldBe(Condition.visible).click();
        updatePage.upTitle.shouldBe(Condition.visible);

        loginPage.email.sendKeys("default@mail.ru");
        emailText = updatePage.emailUp.getAttribute("value");

        updatePage.newUserName.sendKeys("defaultName");
        loginText = updatePage.newUserName.getAttribute("value");

        updatePage.saveButton.shouldBe(Condition.visible).click();
    }

    public void deleteUser() throws InterruptedException {
        registration();
        headerElements.quitButton.click();
        allmethods();
        headerElements.accountMyProfile.shouldBe(Condition.visible).click();
        accountPage.deleteUser.shouldBe(Condition.visible).click();
        Selenide.switchTo().alert().accept();
        Thread.sleep(1000);
    }

    public void negativeDeleteUser() throws InterruptedException {
        registration();
        headerElements.quitButton.click();
        allmethods();
        headerElements.accountMyProfile.shouldBe(Condition.visible).click();
        accountPage.deleteUser.shouldBe(Condition.visible).click();
        Selenide.switchTo().alert().dismiss();
        Thread.sleep(1000);
    }


    public void newPost() throws InterruptedException {
        registration();
        headerElements.quitButton.click();
        allmethods();
        headerElements.accountMyProfile.shouldBe(Condition.visible).click();

        accountPage.submitNewPostButton.shouldBe(Condition.visible).click();
        newsPage.newPostTitle.shouldBe(Condition.visible);

        newsPage.title.sendKeys(generateRandomHexString(10));
        titleText = newsPage.title.getAttribute("value");

        newsPage.post.sendKeys(generateRandomHexString(25));
        postText = newsPage.post.getAttribute("value");

        String avatarPath = "src/main/resources/novosti.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        newsPage.picture.sendKeys(file.getAbsolutePath());

        newsPage.tags.sendKeys(generateRandomHexString(5));
        tagsText = newsPage.tags.getAttribute("value");

        newsPage.saveButton.click();
    }

    public void negativeNewPost() throws InterruptedException {
        registration();
        headerElements.quitButton.click();
        allmethods();
        headerElements.accountMyProfile.shouldBe(Condition.visible).click();

        accountPage.submitNewPostButton.shouldBe(Condition.visible).click();
        newsPage.newPostTitle.shouldBe(Condition.visible);

        newsPage.title.sendKeys(generateRandomHexString(10));
        titleText = newsPage.title.getAttribute("value");

        String avatarPath = "src/main/resources/novosti.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        newsPage.picture.sendKeys(file.getAbsolutePath());

        newsPage.tags.sendKeys(generateRandomHexString(5));
        tagsText = newsPage.tags.getAttribute("value");

        newsPage.saveButton.click();

        loginPage.alertError.shouldBe(Condition.visible);
    }

    public void deletePost() throws InterruptedException {
        newPost();
        accountPage.deletePostButton.shouldBe(Condition.visible).click();
    }

    public void updatePost() throws InterruptedException {
        newPost();
        accountPage.updatePostButton.click();

        updatePostPage.upTitle.sendKeys(generateRandomHexString(10));
        upTitleText = updatePostPage.upTitle.getAttribute("value");

        updatePostPage.upPost.sendKeys(generateRandomHexString(25));
        upPostText = updatePostPage.upPost.getAttribute("value");

        String avatarPath = "src/main/resources/newNov.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        updatePostPage.upPicture.sendKeys(file.getAbsolutePath());

        updatePostPage.upTags.sendKeys(generateRandomHexString(5));
        upTagsText = updatePostPage.upTags.getAttribute("value");

        updatePostPage.saveButton.click();

        Thread.sleep(5000);
    }

    public void negativeUpdatePost() throws InterruptedException{
        newPost();
        accountPage.updatePostButton.click();


        updatePostPage.upTitle.sendKeys(generateRandomHexString(5));
        upTitleText = updatePostPage.upTitle.getAttribute("value");

        updatePostPage.upPost.clear();
        updatePostPage.upPost.sendKeys(generateRandomHexString(1));
        upPostText = updatePostPage.upPost.getAttribute("value");

        String avatarPath = "src/main/resources/newNov.jpeg";
        File file = new File(new File(avatarPath).getAbsolutePath());
        updatePostPage.upPicture.sendKeys(file.getAbsolutePath());

        updatePostPage.upTags.sendKeys(generateRandomHexString(5));
        upTagsText = updatePostPage.upTags.getAttribute("value");

        updatePostPage.saveButton.click();

        Thread.sleep(5000);

        loginPage.alertError.shouldBe(Condition.visible);
    }


    public void searchPostOne(){
        List<String> titleNewsTwo = new ArrayList<>();

        titleNewsTwo.add((searchNewsPage.arrNews.get(4).scrollIntoView(true).getText()));

        searchNewsPage.inputSearch.shouldBe(Condition.visible);
        searchNewsPage.inputSearch.setValue(titleNewsTwo.get(0));

        searchNewsPage.searchButton.shouldBe(Condition.visible).click();
        searchNewsPage.searchNews.shouldBe(Condition.visible);
    }

    public void negativeSearchPostOne(){
        searchNewsPage.inputSearch.shouldBe(Condition.visible);
        searchNewsPage.inputSearch.setValue(generateRandomHexString(5));
        searchNewsPage.searchButton.shouldBe(Condition.visible).click();
        searchNewsPage.news.shouldNot(Condition.visible);
    }

    public void poginaciaPostAll() {
        List<String> titleNews = new ArrayList<>();
        List<String> textNews = new ArrayList<>();
        List<String> tagsNews = new ArrayList<>();


        for(int i = 0; i < 100; i = i + 2){
            titleNews.add((searchNewsPage.arrNews.get(i).scrollIntoView(true).getText()));
        }

        for(int i = 1; i < 100; i = i + 2){
            textNews.add((searchNewsPage.arrAreaNews.get(i).scrollIntoView(true).getText()));
        }

        for(int i = 1; i < 100; i = i + 2){
            tagsNews.add((searchNewsPage.arrNews.get(i).scrollIntoView(true).getText()));
        }

        int j = 0;
        for (int i = 0; i < 50; i++){
            System.out.println(titleNews.get(j));
            System.out.println(textNews.get(j));
            System.out.println(tagsNews.get(j) + "\n");
            j++;
        }
    }

}
