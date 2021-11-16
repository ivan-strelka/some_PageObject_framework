package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class ListingPage extends BasePage {


    private final By card = By.xpath("//div[@class='listing view-format']/div");

    public ListingPage(WebDriver driver) {
        super(driver);
    }

    public ListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 24);
        return this;
    }


}
