import org.openqa.selenium.JavascriptExecutor;


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
    public void kategori()throws InterruptedException{
        clickToElement(WebElementsConstants.btn_kategori);
        Thread.sleep(3000);
    }

    public void oda_seçimleri(){
        jse.executeScript("window.scrollBy(0,800)");
        clickToElement(WebElementsConstants.btn_oda_tipi);
        clickToElement(WebElementsConstants.btn_oda_tipi_1);
        jse.executeScript("window.scrollBy(0,800)");
    }

    public void site_secim()throws InterruptedException{
        clickToElement(WebElementsConstants.switch_site_sec);
        Thread.sleep(1000);
        clickToElement(WebElementsConstants.btn_search);
    }

    /*public void select_3rd_offer() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,400)");
        clickToElement(WebElementsConstants.third_offer);
        Thread.sleep(2000);

    }*/

    public void select_3rd_offer()  throws InterruptedException{
        jse.executeScript("window.scrollBy(0,400)");
        clickToElement(WebElementsConstants.third_offer);
        String detailPageUrl = "https://www.hepsiemlak.com/ankara-cankaya-isci-bloklari-kiralik/daire/33002-6678";
        String detailPageC = getUrl();

        if(detailPageC.equals(detailPageUrl)){
            logger.info("Detay sayfadasınız");
        }else{
            logger.info("Sayfa geçişi başarısız oldu.");
        }
        Thread.sleep(2000);
    }

    public void phone_numbers() throws InterruptedException {
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        findElement(WebElementsConstants.btn_phone_number).click();
        Thread.sleep(2000);
    }

    public void deleteAllCookies() throws InterruptedException{
        driver.manage().deleteAllCookies(); //delete all cookies
        Thread.sleep(7000); //wait 7 seconds to clear cookies.
    }

}