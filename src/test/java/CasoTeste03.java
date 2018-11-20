import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import po.HomePage;
import po.LoginPage;
import po.Setup;

import static junit.framework.TestCase.assertEquals;

public class CasoTeste03 {
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
    public void testCT03() {
        driver.get("http://192.168.30.62/web/app.php/login");
        LoginPage login = new LoginPage(driver);
        HomePage home = login.setUsername("josesilva").setPassword("123456").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());


    }
}
