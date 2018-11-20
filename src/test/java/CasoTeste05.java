import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import po.*;
import static junit.framework.TestCase.assertEquals;

public class CasoTeste05 {

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
    public void testCT05() {
        driver.get("http://192.168.30.62/web/app.php/login");
        LoginPage login = new LoginPage(driver);
        CompetencyFrameworksPage competency = new CompetencyFrameworksPage(driver);
        HomePage home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());
        home.btnAdmin();
        driver.get("http://192.168.30.62/web/app.php/admin/open/competencies");
        competency.btnCreate();
        competency.setName("Java")
                .setDescription("Desenvolvimento em Java");
        competency = competency.btnOk();
        assertEquals("Administration - Competency frameworks", competency.getTitle());


    }
}
