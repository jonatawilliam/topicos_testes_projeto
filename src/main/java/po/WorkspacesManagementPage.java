package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkspacesManagementPage extends BasePage {
    public WorkspacesManagementPage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/main/header/nav/a")
    WebElement botaoAdd;

    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "code")
    WebElement code;

    @FindBy(id = "meta-description")
    WebElement description;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/main/header/nav/span/button")
    WebElement botaoOk;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/main/header/nav/span/a")
    WebElement botaoX;

    public WorkspacesManagementPage btnAdd() {
        botaoAdd.click();
        return this;
    }

    public WorkspacesManagementPage setName(String nome) {
        name.clear();
        name.sendKeys(nome);
        return this;
    }

    public WorkspacesManagementPage setCode(String codigo) {
        code.clear();
        code.sendKeys(codigo);
        return this;
    }

    public WorkspacesManagementPage setDescription(String descricao) {
        description.clear();
        description.sendKeys(descricao);
        return this;
    }

    public WorkspacesManagementPage btnOk() {
        botaoOk.click();
        return this;
    }

    public WorkspacesManagementPage btnX() {
        botaoX.click();
        return new WorkspacesManagementPage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
