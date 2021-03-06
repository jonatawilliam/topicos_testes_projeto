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

public class CasoTeste09 {

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
    public void testCT09() {
        driver.get(Setup.endereco);
        LoginPage login = new LoginPage(driver);
        MyProfilePage my = new MyProfilePage(driver);
        AgendaPage agenda = new AgendaPage(driver);
        HomePage home = login.menuLogin();
        home = login.setUsername("teste").setPassword("utfpr").botaoLogin();
        assertEquals("Desktop - Home", home.getTitle());
        home.btnAgenda();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(home.getBtnAgenda())));
        agenda.btnItemAgenda();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(agenda.getItemAgenda())));
        agenda.setTitle("Entrega do Projeto - Parte 1")
                //.setDescription("Entrega a primeira parte do Projeto de Testes")
                .setTask()
                .setItemSelected()
                .setItemSelectedPriority()
                .btnAddUser()
                .setUser()
                .btnOk();
        agenda.btnNewEvent();

    }
}
