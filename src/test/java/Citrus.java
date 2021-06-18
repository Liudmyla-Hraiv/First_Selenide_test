import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Citrus {
    private SelenideElement search = $(byName("search"));
    private SelenideElement icon = $(byXpath("//i[@class='el-dialog__close el-icon el-icon-close']"));
    private SelenideElement buyButton1 = $(byXpath("(//i[@class='icon-new-citrus-cart el-tooltip item'])[1]"));
    private SelenideElement openItem = $(byXpath("(//*[@class='card-product-link'])[8]"));
    private SelenideElement buyButton2 = $(byXpath("(//button[@class='btn orange buy-section__btn buy-section__buy-btn limited full'])[1]"));
    private SelenideElement item1 = $(byXpath("(//*[@class='ctrs-basket-product'])[1]"));
    private SelenideElement item2 = $(byXpath("(//*[@class='ctrs-basket-product'])[2]"));

    @Test
    public void CitrusTest(){
        open("https://www.citrus.ua/");
        search.setValue("Apple TV").pressEnter();
        buyButton1.shouldBe(Condition.visible).click();
        icon.click();
        openItem.click();
        buyButton2.click();
        item1.shouldBe(Condition.visible);
        item2.shouldBe(Condition.visible);
    }
}
