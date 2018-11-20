package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursusManagementPage extends BasePage {
    public CursusManagementPage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"cursus-management-panel\"]/div/div[2]/div[1]/button")
    WebElement botaoSetting;

    @FindBy(xpath = "//*[@id=\"cursus-management-panel\"]/div/div[2]/div[1]/ul/li[1]")
    WebElement botaoCreateTraining;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[1]/div/input")
    WebElement title;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/input")
    WebElement code;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[6]/div/input")
    WebElement publicRegistry;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[7]/div/input")
    WebElement publicUnregistry;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[3]/button[2]")
    WebElement botaoOk;


    public CursusManagementPage setTitle(String titulo) {
        title.clear();
        title.sendKeys(titulo);
        return this;
    }

    public CursusManagementPage setCode(String codigo) {
        code.clear();
        code.sendKeys(codigo);
        return this;
    }

    public CursusManagementPage setResgistry() {
        publicRegistry.isEnabled();
        return this;
    }

    public CursusManagementPage setUnresgistry() {
        publicUnregistry.isEnabled();
        return this;
    }

    public CursusManagementPage btnSetting() {
        botaoSetting.click();
        return this;
    }

    public CursusManagementPage btnCreateTraining() {
        botaoCreateTraining.click();
        return this;
    }

    public CursusManagementPage btnOk() {
        botaoOk.click();
        return new CursusManagementPage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
