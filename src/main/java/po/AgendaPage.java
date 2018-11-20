package po;

import org.openqa.selenium.WebDriver;

public class AgendaPage extends BasePage {
    public AgendaPage (WebDriver driver){
        super (driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
