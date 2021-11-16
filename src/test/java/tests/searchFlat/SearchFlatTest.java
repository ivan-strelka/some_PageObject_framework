package tests.searchFlat;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constats.URLs.REAL_HOME_PAGE;

public class SearchFlatTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        basePage.open(REAL_HOME_PAGE);
        homePage
                .enterCountRooms()
                .clickFind();
        listingPage.checkCountCards();
    }

}
