import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
        driver.get("http://192.168.30.62/web/app.php/login");
        LoginPage login = new LoginPage(driver);
        LearningObjectivesPage learning = new LearningObjectivesPage(driver);
        HomePage home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());
        home.btnAdmin();
        driver.get("http://192.168.30.62/web/app.php/admin/open/learning-objectives");
        learning.btnCreate();
        learning.setName("Aprender sobre Testes de Software");
        learning = learning.btnOk();
        assertEquals("Administration - Learning objectives", learning.getTitle());


    }
}
