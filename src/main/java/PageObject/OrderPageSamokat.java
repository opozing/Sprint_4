package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderPageSamokat {

    //Создали драйвер
    private WebDriver driver;

    //Локатор поля имя
    private By name = By.xpath(".//input[@placeholder='* Имя']");

    //Локатор поля фамилия
    private By surname = By.xpath(".//input[@placeholder='* Фамилия']");

    //Локатор выпадайки метро
    private By metro = By.className("select-search__input");

    //Локатор открытого списка станций метро
    private By metroList = By.className("select-search__select");

    //Локатор станции метро Черкизовскя
    private By metro4erkizon = By.xpath(".//*[text()='Черкизовская']");

    //Локатор кнопки Далее
    private By done = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Локатор поля телефон
    private By phone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //Локатор поля дата
    private By date = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //Локатор сегоняшней даты в календаре
    private By todayDate = By.xpath(".//*[contains(@class, 'react-datepicker__day--today')]");

    //Локатор поля срока аренды
    private By rentPeriod = By.className("Dropdown-placeholder");

    //Локатор первого элемента выпадайки срока аренды
    private By rentPeriodOneDay = By.xpath(".//div[@class='Dropdown-menu']/div[text()='сутки']");

    //Локатор кнопки "Заказать" в форме заказа
    private By finalOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Локатор кнопки подтеврждения заказа
    private By yesButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public OrderPageSamokat(WebDriver driver) {
        this.driver = driver;
    }

    //Функция заполнения формы заказа самоката
    public void inputOrderForm(String newName, String newSurname, String newPhone) {
        driver.findElement(name).sendKeys(newName);
        driver.findElement(surname).sendKeys(newSurname);
        driver.findElement(phone).sendKeys(newPhone);
        driver.findElement(metro).click();
        driver.findElement(metro4erkizon).click();
        driver.findElement(done).click();
        driver.findElement(date).click();
        driver.findElement(todayDate).click();
        driver.findElement(rentPeriod).click();
        driver.findElement(rentPeriodOneDay).click();
        driver.findElement(finalOrderButton).click();
        driver.findElement(yesButton).click();
    }


}
