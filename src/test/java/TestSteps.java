import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class TestSteps extends BaseMethods {
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    public void anasayfa() {
        String mainPageUrl = getUrl();
        String mainPageUrlC = "https://www.hepsiemlak.com/";

        if (mainPageUrl.equals(mainPageUrlC)) {
            logger.info("Anasayfadasınız");
        }
    }

    public void kiralik() throws InterruptedException {
        clickToElement(WebElementsConstants.btn_kiralik_icon);
        Thread.sleep(2000);
    }

    public void konum() throws InterruptedException{
        clickToElement(WebElementsConstants.btn_select_city);
        findElement(WebElementsConstants.btn_city_search).sendKeys("Ankara");
        clickToElement(WebElementsConstants.btn_select_city_radio);
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.input_town);
        findElement(WebElementsConstants.btn_town_search).sendKeys("Çankaya");
        clickToElement(WebElementsConstants.btn_select_town_square);
        Thread.sleep(2000);

    }

    public void kategori(){
        clickToElement(WebElementsConstants.btn_kategori);
    }
}