package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class HomePage extends BasePage {

    private final By countRooms = By.id("rooms");
    private final By optionsToRooms = By.xpath("//option[contains(text(),'2к квартира')]");
    private final By findButton = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(optionsToRooms).click();
        return this;
    }

    public HomePage clickFind() {
        WebElement bntFind = driver.findElement(findButton);
        waitElementIsVisible(bntFind).click();
        return this;
    }


}
