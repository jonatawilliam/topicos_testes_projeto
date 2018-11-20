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

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[1]/li[3]/a")
    WebElement botaoAgenda;

    public PreferencesPage btnMenuBar() {
        botaoMenuBar.click();
        return this;
    }

    public PreferencesPage setItemAgenda() {
        itemAgenda.isEnabled();
        return this;
    }

    public PreferencesPage btnEdit() {
        botaoEdit.click();
        return this;
    }

    public AgendaPage btnAgenda() {
        botaoAgenda.click();
        return new AgendaPage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
