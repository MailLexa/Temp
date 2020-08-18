package Test6;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NameMenu extends PageObject {
    CheckMenu checkMenu;
    String a;
    @FindBy(xpath = "//*[@id=\"bvi-block\"]/header/div[1]/div/ul/li")
    List<WebElementFacade> product;

    public void openUrlMenu(){
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().get("https://www.invitro.ru/radiology/");
    }
    public void inputSymbolMenu(String b){
        a=b;
    }
    public boolean checkMenu(){
        for (CheckMenu s : CheckMenu.values()){
            if (s.getTitle().equals(a))
                return true;
        }
        return false;
    }
    public boolean urlMenu(){
        for(Integer i=0; i<product.size();i++){
            if (product.get(i).getAttribute("innerHTML").contains(a)){
                product.get(i).click();
                return true;
            }
        }
        return false;
    }
}
