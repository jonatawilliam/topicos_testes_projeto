package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompetencyFrameworksPage extends BasePage {
    public CompetencyFrameworksPage (WebDriver driver){
        super (driver);
    }

    @FindBy(id = "create-framework")
    WebElement botaoCreate;

    @FindBy(id = "hevinci_form_framework_name")
    WebElement name;

    @FindBy(id = "hevinci_form_framework_description")
    WebElement description;

    @FindBy(id = "save")
    WebElement botaoOk;

    public CompetencyFrameworksPage btnCreate() {
        botaoCreate.click();
        return this;
    }

    public CompetencyFrameworksPage setName(String nome) {
        name.clear();
        name.sendKeys(nome);
        return this;
    }

    public CompetencyFrameworksPage setDescription(String descricao) {
        description.clear();
        description.sendKeys(descricao);
        return this;
    }

    public CompetencyFrameworksPage btnOk() {
        botaoOk.click();
        return new CompetencyFrameworksPage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
