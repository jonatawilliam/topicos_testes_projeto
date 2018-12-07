package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreferencesPage extends BasePage {
    public PreferencesPage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/ul/li[1]")
    WebElement botaoMenuBar;

    @FindBy(xpath = "//*[@id=\"tools-table-body\"]/tr[5]/td[2]/input")
    WebElement itemAgenda;

    @FindBy(id = "edit-tools-btn")
    WebElement botaoEdit;


    public PreferencesPage btnMenuBar() {
        botaoMenuBar.click();
        return this;
    }

    public PreferencesPage setItemAgenda() {
        itemAgenda.click();
        return this;
    }

    public PreferencesPage btnEdit() {
        botaoEdit.click();
        return this;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getItemAgenda() {
        return "//*[@id=\"tools-table-body\"]/tr[5]/td[2]/input";
    }
}
