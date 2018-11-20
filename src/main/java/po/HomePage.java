package po;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/a")
    WebElement botaoAdministrartor;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[3]")
    WebElement botaoUser;

    public HomePage btnAdmin() {
        botaoAdministrartor.click();
        return this;
    }

    public AdministratorPage btnUserManager() {
        botaoUser.click();
        return new AdministratorPage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }


}
