import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import po.HomePage;
import po.LoginPage;
import po.Setup;


import static junit.framework.TestCase.assertEquals;

public class CasoTeste01 {
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
    public void testCT01() {
        driver.get(Setup.endereco);
        LoginPage login = new LoginPage(driver);
        HomePage home = login.menuLogin();
        home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());

    }
}
