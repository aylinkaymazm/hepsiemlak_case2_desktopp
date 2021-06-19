import org.junit.Test;

public class TestCases extends TestSteps {

    @Test
    public void desktopTests() throws InterruptedException {
        anasayfa();

        kiralik();
        konum();
        kategori();

//        exit();
    }

    /*public void exit(){
        driver.quit();
    }*/

}