import PageObject.HomePageSamokat;
import PageObject.OrderPageSamokat;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

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
        objOrderPageSamokat.inputTextForm("Сергей", "Устинов", "89215853447");
        objOrderPageSamokat.metroSelect("Сокольники");
        objOrderPageSamokat.clickDoneButton();
        objOrderPageSamokat.dateSelect("01.02.2023");
        objOrderPageSamokat.rentPeriodSelect("трое суток");
        objOrderPageSamokat.clickFinalOrderButton();
        objOrderPageSamokat.clickYesButton();
        assertTrue(objOrderPageSamokat.orderDoneCheck());
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
        objOrderPageSamokat.inputTextForm("Андрей", "Иванов", "89522455520");
        objOrderPageSamokat.metroSelect("Черкизовская");
        objOrderPageSamokat.clickDoneButton();
        objOrderPageSamokat.dateSelect("05.02.2023");
        objOrderPageSamokat.rentPeriodSelect("сутки");
        objOrderPageSamokat.clickFinalOrderButton();
        objOrderPageSamokat.clickYesButton();
        assertTrue(objOrderPageSamokat.orderDoneCheck());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}