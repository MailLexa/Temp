package test2.steps;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultCity extends  PageObject{
    @FindBy (className = "city__change")
    WebElementFacade setCityRes;
    @FindBy (className="change-city-search-input")
    WebElementFacade labelSearch;
    @FindBy (className = "eac-item")
    List<WebElement> listElement;
    @FindBy (className = "easy-autocomplete-container")
    WebElementFacade search;
    @FindBy (css=".city__name.city__btn.city__name--label")
    WebElementFacade city;


    public boolean popupCityVisible (){
        setCityRes.waitUntilVisible();
        return setCityRes.isDisplayed();
    }

    public boolean cityLabelSearch(){
        labelSearch.waitUntilVisible();
        return labelSearch.isDisplayed();
    }

    public boolean citySearch(){
        search.waitUntilVisible();
        if(search.isDisplayed()){
            for(Integer i=0;i<listElement.size();i++){
                if (listElement.get(i).getAttribute("innerHTML").contains("Омск")){
                   return true;
                }
            }
        }
        return false;
    }

    public boolean cityLabelSearchHide(){
         return setCityRes.isVisible();
    }

    public boolean checkCity(){
       if (city.getAttribute("innerHTML").contains("Омск"))
           return true;
           else return false;
    }

}
