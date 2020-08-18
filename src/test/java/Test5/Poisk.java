package Test5;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Poisk extends PageObject {
    @FindBy(css=".search__input")
    WebElementFacade searchInput;
    @FindBy(xpath="//*[@id=\"bvi-block\"]/header/div[4]/div/div[2]/form")
    WebElementFacade searchText;
    public void openPoisk(){
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().get("https://www.invitro.ru/radiology/");
    }

    public void inputPoisk(String a){
        searchInput.click();
        searchInput.sendKeys(a);

    }
    public void serchTextPoisk(){
        searchInput.click();
        searchInput.sendKeys(Keys.ENTER);
    }

    public boolean checkInputPoisk(String a){
       if( searchText.getAttribute("innerHTML").contains(a))
           return true;
       else return false;
    }


}
