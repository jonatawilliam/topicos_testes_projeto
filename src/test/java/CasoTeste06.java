import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import po.*;
import static junit.framework.TestCase.assertEquals;

public class CasoTeste06 {

    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void before() {
        driver = Setup.setup();
    }

    @After
    public void after() {
        driver.close();
    }

    @Test
    public void testCT06() {
        driver.get(Setup.endereco);
        LoginPage login = new LoginPage(driver);
        LearningObjectivesPage learning = new LearningObjectivesPage(driver);
        HomePage home = login.menuLogin();
        home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());
        home.btnAdmin();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(home.getBtnLearning())));
        home.btnLearning();
        learning.btnCreate();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(learning.getBtnOk())));
        learning.setName("Aprender sobre Testes de Software");
        learning = learning.btnOk();
        learning.btnAssociate();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(learning.getBtnJava())));
        learning.btnJava();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(learning.getBtnJava2())));
        learning.btnJava2();
        learning.btnOk();
        learning.btnOk();


        assertEquals("Administration - Learning objectives", learning.getTitle());


    }
}
