package po;

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

    @FindBy(id = "save")
    WebElement botaoOk;

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
}
