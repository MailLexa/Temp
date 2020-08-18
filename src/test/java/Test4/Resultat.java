package Test4;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Resultat extends  PageObject{
    Action action;
    @FindBy(xpath = "//*[@id=\"bvi-block\"]/div[1]/div[1]/section/div/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/span/div[2]/div[2]/div")
    WebElementFacade product;
    @FindBy(xpath = "//*[@id=\"bvi-block\"]/div[1]/div[1]/section/div/form/div/div[2]/div/div[1]/div[6]/div[4]/div[1]/div[2]")
    WebElementFacade sumTotal;


    public boolean checkTextButton(){
        if (product.getAttribute("innerHTML").contains("Добавлено"))
            return true;
        else return false;
    }
    public boolean checkUrl(){
       if (getDriver().getCurrentUrl().equals("https://www.invitro.ru/personal/basket/"))
           return true;
       else return false;
    }

    public boolean emptyBasket(){
        System.out.println(sumTotal.getAttribute("innerHTML").substring(0,sumTotal.getAttribute("innerHTML").indexOf(" ")+1));
        if("0".equals(sumTotal.getAttribute("innerHTML").substring(0,sumTotal.getAttribute("innerHTML").indexOf(" ")+1)))
            return false;
        else return true;
    }

    public boolean sumResult(){

        if(action.price.equals(sumTotal.getAttribute("innerHTML").substring(0,sumTotal.getAttribute("innerHTML").indexOf(" ")+1)))
            return true;
        else return false;

    }



}