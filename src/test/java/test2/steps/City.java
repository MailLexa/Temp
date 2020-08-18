package test2.steps;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class City  extends  PageObject{

       @FindBy(className="city__label")
       WebElementFacade openPopup;
       @FindBy(className="change-city-search-input")
       WebElementFacade searchLabel;
       @FindBy (className = "city__change")
       WebElementFacade setCity;
       @FindBy(css=".btn.btn--narrow.btn--empty.city__change-btn")
       WebElementFacade btnCity;
       public void openPopupClick(){
           openPopup.click();
       }
        @FindBy (className = "eac-item")
        List<WebElement> listElement;

    public void openUrl(){
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().get("https://www.invitro.ru/radiology/");
    }

    public  void popupCityVisible () throws InterruptedException {
        setCity.waitUntilVisible();
        if ( setCity.isDisplayed())
            openPopup.click();
        //Thread.sleep(1000);


    }

    public void serchCyti(){
           btnCity.click();
    }

    public void inputSearch(){
           searchLabel.sendKeys("Омск", Keys.ENTER);
    }
    public void citySearch() {
        for (Integer i = 0; i < listElement.size(); i++) {
            if (listElement.get(i).getAttribute("innerHTML").contains("Омск")) {
                listElement.get(i).click();
                break;

            }
        }

    }



}
