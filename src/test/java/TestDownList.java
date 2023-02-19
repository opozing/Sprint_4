import PageObject.HomePageSamokat;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

//Тесты выпадающего списка в разделе "Вопросы о важном"
public class TestDownList {

    private WebDriver driver;

    @Test
    public void testDownListText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePageSamokat objHomePageSamokat = new HomePageSamokat(driver);
        objHomePageSamokat.goToDownlist();
        objHomePageSamokat.clickToDownListFirst();
        String textFromFirstOpen = objHomePageSamokat.downListFirstOpenText();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expectedText, textFromFirstOpen);

    }

    @After
    public void teardown() {
        driver.quit();
    }
}