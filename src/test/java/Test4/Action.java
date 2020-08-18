package Test4;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class Action extends  PageObject{
    public String price;
    @FindBy(xpath = "//*[@id=\"bvi-block\"]/div[1]/div[1]/section/div/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/span/div[2]/div[2]/span")
    WebElementFacade product;
    @FindBy(css = ".icon.icon-icon-cart")
    WebElementFacade basket;
    @FindBy(xpath = "//*[@id=\"bvi-block\"]/div[1]/div[1]/section/div/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/span/div[2]/div[2]/div")
    WebElementFacade addBasket;
    @FindBy(css = ".attention-close-button.btn-icon.btn-icon--fill")
    WebElementFacade popupCoocie;

    public void openUrl(){
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().get("https://www.invitro.ru/analizes/for-doctors/");
    }

    public void priceProductSave(){

        price= product.getAttribute("innerHTML").substring(0,product.getAttribute("innerHTML").indexOf(" ")+1);

    }

    public void addProduct(){
        addBasket.click();
    }

    public void basket(){
        basket.click();
    }



    public void hidenElement(){
        if (popupCoocie.isVisible())
            popupCoocie.click();
    }
}

