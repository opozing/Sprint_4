import PageObject.HomePageSamokat;
import PageObject.OrderPageSamokat;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Тесты заказа самоката
public class TestOrderSamokat {

    private WebDriver driver;

    @Test
    public void testOrderFirstButtonChrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePageSamokat objHomePageSamokat = new HomePageSamokat(driver);
        OrderPageSamokat objOrderPageSamokat = new OrderPageSamokat(driver);
        objHomePageSamokat.acceptCookie();
        objHomePageSamokat.clickToOrderButtonFirst();
        objOrderPageSamokat.inputOrderForm("Сергей", "Устинов", "89215853447");

    }

    @Test
    public void testOrderSecondButtonChrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePageSamokat objHomePageSamokat = new HomePageSamokat(driver);
        OrderPageSamokat objOrderPageSamokat = new OrderPageSamokat(driver);
        objHomePageSamokat.acceptCookie();
        objHomePageSamokat.goToOrderButtonSecond();
        objHomePageSamokat.clickToOrderButtonSecond();
        objOrderPageSamokat.inputOrderForm("Андрей", "Иванов", "89522455520");
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
