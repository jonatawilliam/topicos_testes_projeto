import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import po.*;
import static junit.framework.TestCase.assertEquals;

public class CasoTeste07 {

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
    public void testCT07() {
        driver.get("http://192.168.30.62/web/app.php/login");
        LoginPage login = new LoginPage(driver);
        WorkspacesManagementPage workspace = new WorkspacesManagementPage(driver);
        HomePage home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());
        home.btnAdmin();
        driver.get("http://192.168.30.62/web/app.php/admin/open/workspace_management");
        workspace.btnAdd();
        workspace.setName("Estudo de Teste")
                .setCode("ET")
                .setDescription("Espaço para registrar os estudos sobre Testes");
        workspace = workspace.btnOk();
        assertEquals("Administration - Workspaces management", workspace.getTitle());


    }
}
