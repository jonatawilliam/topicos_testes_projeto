package po;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    public LoginPage (WebDriver driver){
        super (driver);
    }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    WebElement botaoLogin;

    public LoginPage setUsername(String name) {
        username.clear();
        username.sendKeys(name);
        return this;
    }

    public LoginPage setPassword(String senha) {
        password.clear();
        password.sendKeys(senha);
        return this;
    }

    public HomePage botaoLogin() {
        botaoLogin.click();
        return new HomePage(driver);
    }
}
