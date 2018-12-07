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

public class CasoTeste04 {

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
    public void testCT04() {
        driver.get(Setup.endereco);
        LoginPage login = new LoginPage(driver);
        CursusManagementPage cursus = new CursusManagementPage(driver);
        HomePage home = login.menuLogin();
        home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());
        home.btnAdmin();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(home.getBtnUserManager())));
        home.btnCourse();
        cursus.btnSetting().btnCreateTraining();
        cursus.setTitle("Curso de Testes")
                .setCode("CT")
                .setResgistry()
                .setUnresgistry();
        cursus = cursus.btnOk();
        assertEquals("Administration - Cursus management", cursus.getTitle());


    }
}
