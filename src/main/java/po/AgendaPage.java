package po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgendaPage extends BasePage {
    public AgendaPage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[2]/div[2]/table/thead/tr/td[5]")
    WebElement itemAgenda;

    @FindBy(id = "agenda_form_title")
    WebElement title;

    @FindBy(id = "agenda_description_218_ifr")
    WebElement description;

    @FindBy(id = "agenda_form_isTask")
    WebElement task;

    @FindBy(xpath = "//*[@id=\"agenda_form_workspace\"]/option[2]")
    WebElement selectItem;

    @FindBy(xpath = "//*[@id=\"agenda_form_priority\"]/option[1]")
    WebElement selectItemPriority;

    @FindBy(xpath = "//*[@id=\"agenda_form\"]/div[7]/div/div/span")
    WebElement addUSer;

    @FindBy(id = "picker-user-chk-6")
    WebElement selectedUser;

    @FindBy(xpath = "//*[@id=\"user-picker-body\"]/div[3]/button[2]")
    WebElement botaoOk;

    @FindBy(xpath = "//*[@id=\"form-event\"]/div[2]/button[2]")
    WebElement botaoNewEvent;


    JavascriptExecutor executor = (JavascriptExecutor)driver;

    public AgendaPage btnItemAgenda() {
        itemAgenda.click();
        return this;
    }

    public AgendaPage setTitle(String titulo) {
        title.sendKeys(titulo);
        return this;
    }

    public AgendaPage setDescription(String descricao) {
        description.sendKeys(descricao);
        return this;
    }

    public AgendaPage setTask() {
        task.click();
        return this;
    }

    public AgendaPage setItemSelected() {
        selectItem.isSelected();
        return this;
    }

    public AgendaPage setItemSelectedPriority() {
        selectItemPriority.isSelected();
        return this;
    }

    public AgendaPage setUser() {
        selectedUser.isEnabled();
        return this;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public AgendaPage btnAddUser() {
        addUSer.click();
        return this;
    }

    public AgendaPage btnOk() {
        botaoOk.click();
        return this;
    }

    public AgendaPage btnNewEvent() {
        botaoNewEvent.submit();
        return this;
    }

    public String getItemAgenda() {
        return "//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[2]/div[1]/table/tbody/tr/td[5]";
    }
}

