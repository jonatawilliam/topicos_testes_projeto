package po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningObjectivesPage extends BasePage {
    public LearningObjectivesPage (WebDriver driver){
        super (driver);
    }

    @FindBy(id = "create-objective")
    WebElement botaoCreate;

    @FindBy(id = "hevinci_form_objective_name")
    WebElement name;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[8]/a")
    WebElement associate;

    @FindBy(xpath = "/html/body/div[9]/div/div/div[2]/ul/li/a")
    WebElement java;

    @FindBy(xpath = "/html/body/div[9]/div/div/div[2]/ul/li")
    WebElement java2;

    @FindBy(id = "save")
    WebElement botaoOk;

    JavascriptExecutor executor = (JavascriptExecutor)driver;

    public LearningObjectivesPage btnAssociate() {
        executor.executeScript("arguments[0].click();", associate);
        return this;
    }

    public LearningObjectivesPage btnJava() {
        executor.executeScript("arguments[0].click();", java);
        return this;
    }

    public LearningObjectivesPage btnJava2() {
        executor.executeScript("arguments[0].click();", java2);
        return this;
    }

    public LearningObjectivesPage btnCreate() {
        botaoCreate.click();
        return this;
    }

    public LearningObjectivesPage setName(String nome) {
        name.clear();
        name.sendKeys(nome);
        return this;
    }

    public LearningObjectivesPage btnOk() {
        botaoOk.click();
        return new LearningObjectivesPage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getBtnJava() {
        return "/html/body/div[9]/div/div/div[2]/ul/li/a";
    }

    public String getBtnJava2() {
        return "/html/body/div[9]/div/div/div[2]/ul/li";
    }

    public String getBtnOk() {
        return "save";
    }
}
