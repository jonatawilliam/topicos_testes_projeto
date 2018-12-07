import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import po.AdministratorPage;
import po.HomePage;
import po.LoginPage;
import po.Setup;
import static junit.framework.TestCase.assertEquals;

public class CasoTeste02 {
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
    public void testCT02() throws InterruptedException {
        driver.get(Setup.endereco);
        LoginPage login = new LoginPage(driver);
        AdministratorPage admin = new AdministratorPage(driver);
        HomePage home = login.menuLogin();
        home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());
        home.btnAdmin();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(home.getBtnUserManager())));
        home.btnUserManager();
        admin.botaoAddUser();
        admin.setLastName("Silva").setFirstName("José")
                .setEmail("josesilva@utfpr.edu.br")
                .setUsername("josesilva")
                .setPassword("123456")
                .botaoSave();
        admin = admin.botaoX();
        assertEquals("Administration - Users", admin.getTitle());


    }
}
