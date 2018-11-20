package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministratorPage extends BasePage {
    public AdministratorPage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"wrap\"]/div[2]/main/header/nav/a")
    WebElement botaoAddUser;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "plainPassword")
    WebElement plainPassword;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div[2]/main/header/nav/span/button")
    WebElement botaoSave;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div[2]/main/header/nav/span/a")
    WebElement botaoX;

    public AdministratorPage setLastName(String last) {
        lastName.clear();
        lastName.sendKeys(last);
        return this;
    }

    public AdministratorPage setFirstName(String first) {
        firstName.clear();
        firstName.sendKeys(first);
        return this;
    }

    public AdministratorPage setEmail(String emailIn) {
        email.clear();
        email.sendKeys(emailIn);
        return this;
    }

    public AdministratorPage setUsername(String name) {
        username.clear();
        username.sendKeys(name);
        return this;
    }

    public AdministratorPage setPassword(String senha) {
        plainPassword.clear();
        plainPassword.sendKeys(senha);
        return this;
    }

    public AdministratorPage botaoAddUser() {
        botaoAddUser.click();
        return new AdministratorPage(driver);
    }

    public AdministratorPage botaoSave() {
        botaoSave.click();
        return new AdministratorPage(driver);
    }

    public AdministratorPage botaoX() {
        botaoX.click();
        return new AdministratorPage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
