package po;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage (WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/a")
    WebElement botaoAdministrartor;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[19]/a")
    WebElement botaoUser;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[4]/a")
    WebElement botaoCourse;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[3]/a")
    WebElement botaoCompetency;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[8]/a")
    WebElement botaoLearning;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[21]/a")
    WebElement botaoWorkspace;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[3]/a")
    WebElement botaoMy;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[3]/ul/li[2]/a")
    WebElement botaoPreferences;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[1]/li[3]/a")
    WebElement botaoAgenda;

    @FindBy(xpath = "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[3]/ul/li[1]/a")
    WebElement botaoProfile;

    JavascriptExecutor executor = (JavascriptExecutor)driver;

    public HomePage btnAdmin() {
        botaoAdministrartor.click();
        return this;
    }

    public HomePage btnMy() {
        botaoMy.click();
        return this;
    }

    public AgendaPage btnAgenda() {
        botaoAgenda.click();
        return new AgendaPage(driver);
    }

    public AdministratorPage btnUserManager() {
        executor.executeScript("arguments[0].click();", botaoUser);
        return new AdministratorPage(driver);
    }

    public CursusManagementPage btnCourse() {
        executor.executeScript("arguments[0].click();", botaoCourse);
        return new CursusManagementPage(driver);
    }

    public CompetencyFrameworksPage btnCompetency() {
        executor.executeScript("arguments[0].click();", botaoCompetency);
        return new CompetencyFrameworksPage(driver);
    }

    public LearningObjectivesPage btnLearning() {
        executor.executeScript("arguments[0].click();", botaoLearning);
        return new LearningObjectivesPage(driver);
    }

    public WorkspacesManagementPage btnWorkspace() {
        executor.executeScript("arguments[0].click();", botaoWorkspace);
        return new WorkspacesManagementPage(driver);
    }

    public PreferencesPage btnPreferences() {
        executor.executeScript("arguments[0].click();", botaoPreferences);
        return new PreferencesPage(driver);
    }

    public MyProfilePage btnProfile() {
        executor.executeScript("arguments[0].click();", botaoProfile);
        return new MyProfilePage(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getBtnAdmin() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/a";
    }

    public String getBtnUserManager() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[19]/a";
    }

    public String getBtnCourse() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[4]/a";
    }

    public String getBtnCompetency() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[3]/a";
    }

    public String getBtnLearning() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[8]/a";
    }

    public String getBtnWorkspace() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[1]/ul/li[21]/a";
    }

    public String getBtnPreferences() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[3]/ul/li[2]/a";
    }

    public String getBtnMy() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[3]/a";
    }

    public String getBtnAgenda() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[1]/li[3]/a";
    }

    public String getBtnProfile() {
        return "//*[@id=\"top_bar\"]/div/div[2]/ul[2]/li[3]/ul/li[1]/a";
    }


}
