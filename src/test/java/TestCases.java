import org.junit.Test;

public class TestCases extends TestSteps {

    @Test
    public void desktopTests() throws InterruptedException {
        anasayfa();
        deleteAllCookies();
        kiralik();
        konum();
        kategori();
        oda_seçimleri();
        site_secim();
        select_3rd_offer();
        phone_numbers();
        exit();
    }

    public void exit(){
        driver.quit();
    }

}