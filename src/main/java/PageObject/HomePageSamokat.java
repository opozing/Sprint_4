package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSamokat {

    //Создали драйвер
    private WebDriver driver;

    //Локатор согласия с куки
    private By cookie = By.id("rcc-confirm-button");
    
    //Локатор первой кнопки "Заказать"
    private By orderButtonFirst = By.className("Button_Button__ra12g");

    //Локатор второй кнопки "Заказать"
    private By orderButtonSecond = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Локатор блока "Вопросы о важном" с выпадающими списками
    private By downList = By.xpath(
            ".//div[@class='Home_FourPart__1uthg']/div[@class='Home_SubHeader__zwi_E']");

    // Локатор 1 элемента выпадающего списка "Вопросы о важном"
    private By downListFirst = By.id("accordion__heading-0");

    //Локатор текста открытого 1 элемента выпадающего списка "Вопросы о важном"
    private By downListFirstOpen = By.xpath(".//div[@id='accordion__panel-0']/p");

    // Конструктор класса
    public HomePageSamokat(WebDriver driver) {
        this.driver = driver;
    }

    //Функция принятия куки
    public void acceptCookie() {
        driver.findElement(cookie).click();
    }

    //Функция прокрутки к блоку с выпадающими списками
    public void goToDownlist() {
        WebElement element = driver.findElement(downList);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //Функция нажатия на первый элемент выпадающего списка
    public void clickToDownListFirst() {
        driver.findElement(downListFirst).click();
    }

    //Функция получения текста из выпадайки первого элемента списка
    public String downListFirstOpenText() {
        return driver.findElement(downListFirstOpen).getText();
    }

    //Функция нажатия на первую кнопку "Заказать"
    public void clickToOrderButtonFirst() {
        driver.findElement(orderButtonFirst).click();
    }

    //Функция прокрутки до второй кнопки "Заказать"
    public void goToOrderButtonSecond() {
        WebElement element = driver.findElement(orderButtonSecond);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //Функция нажатия на вторую кнопку "Заказать"
    public void clickToOrderButtonSecond() {
        new WebDriverWait(driver, 3)
        .until(ExpectedConditions.elementToBeClickable(orderButtonSecond));
        driver.findElement(orderButtonSecond).click();
    }
}
