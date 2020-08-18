package Test3.test.test;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class Analizes extends  PageObject{
    @FindBy(css=".header-nav__get-result.popupBtn")
    WebElementFacade receiveAnalizes;
    @FindBy(id="getAnalisisBtn")
    WebElementFacade searchRezult;
    @FindBy(id="inz")
    WebElementFacade inz;
    @FindBy(id="born")
    WebElementFacade born;
    @FindBy(id="surname")
    WebElementFacade surname;

    public void openUrl(){
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().get("https://www.invitro.ru/radiology/");
    }

    public void result (){
        receiveAnalizes.click();
    }

    public void serchRezultAnalizes(){
        searchRezult.click();
    }

    public void inputText(){
        inz.click();
        inz.sendKeys("231231231");
        born.click();
        born.sendKeys("11.12.2000");
        surname.click();
        surname.sendKeys("тест");

    }
}
