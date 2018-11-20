package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BasePage {
    public MyProfilePage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/main/header/div[2]/nav/div[1]/span/button")
    WebElement botaoSave;

    @FindBy(id = "meta-description")
    WebElement description;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/main/header/div[2]/nav/div[1]/a")
    WebElement botaoEdit;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/main/header/div[2]/nav/div[1]/span/a")
    WebElement botaoCancel;

    public MyProfilePage btnEdit() {
        botaoEdit.click();
        return this;
    }

    public MyProfilePage setDescription(String descricao) {
        description.clear();
        description.sendKeys(descricao);
        return this;
    }

    public MyProfilePage btnSave() {
        botaoSave.click();
        return this;
    }

    public MyProfilePage btnCancel() {
        botaoCancel.click();
        return new MyProfilePage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getDescription(){
        return driver.findElement(By.id("meta.description")).getText();
    }
}
