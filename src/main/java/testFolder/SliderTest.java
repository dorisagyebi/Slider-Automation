package testFolder;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {
    private SliderPage sliderPage;

    @BeforeClass
    public void setupTest() {
        sliderPage = new SliderPage(driver);
    }

    @Test
    void testPageTitle() {
        String actualTitle = sliderPage.getPageTitle();
        Assert.assertEquals(actualTitle, TestData.EXPECTED_TITLE, "Page title does not match");
    }
}
