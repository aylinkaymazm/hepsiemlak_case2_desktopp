import org.openqa.selenium.By;

public class WebElementsConstants {

    public static By  btn_kiralik_icon =By.cssSelector("[title='Kiralık İlanlar']");


    public static By btn_select_city = By.xpath("//span[contains(@class,'he-select-base__placeholder') and contains(text(),'İl Seçiniz')]");
    public static By btn_city_search = By.cssSelector("input[placeholder='İl Ara']");
    public static By btn_select_city_radio= By.cssSelector("[class=he-select__list-item]");

    public static By input_town = By.xpath("//span[contains(@class,'he-select-base__placeholder') and contains(text(),'İlçe Seçiniz')]");
    public static By btn_town_search = By.cssSelector("input[class=he-select-base__search][placeholder='İlçe Ara']");
    public static By btn_select_town_square= By.cssSelector("[class=he-multiselect__list-item]");

    public static By btn_kategori=By.cssSelector("label[for='category0']");





}
