package Test1;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.concurrent.TimeUnit;
@DefaultUrl("https://www.invitro.ru/radiology/")
public class Menu  extends PageObject{
    boolean cheeck;

    @FindBy(css=".attention-close-button.btn-icon.btn-icon--fill")
    WebElementFacade accpect;
    @FindBy(css = ".side-bar-second__items")
    List<WebElement> list;

        public void openUrl(){

       getDriver().manage().window().maximize();
       getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       getDriver().get("https://www.invitro.ru/radiology/");
    }

    public void hidenMenu(){

        if(accpect.isVisible())
            accpect.click();
    }

    public void clickElement() {

        List<WebElement> listt = getDriver().findElements(By.xpath("//*[@id=\"bvi-block\"]/div[1]/div[1]/section/div/div[1]/div/div/div[2]/a"));
        String text, textUrl;
        double coordian;
        Integer one = 0;
        Actions action = new Actions(getDriver());
        text = getDriver().getCurrentUrl();
        if (list.size() > 0) {
            for (Integer b = 0; b < list.size(); b++) {
                one++;
                list.get(b).click();
                textUrl = getDriver().getCurrentUrl();
                if (!text.equals(textUrl))
                    cheeck = true;
                else {
                    cheeck = false;
                    break;
                }
                coordian = Integer.valueOf(list.get(b).getSize().toString().substring(list.get(b).getSize().toString().indexOf("(") + 1, list.get(b).getSize().toString().indexOf(",")));
                System.out.println(coordian);
                coordian = Math.round(coordian / 3);
                if (coordian > 2)
                    coordian--;
                open();
                List<WebElement> element = list.get(b).findElements(By.cssSelector(".side-bar-third__items"));
                //    JavascriptExecutor java= (JavascriptExecutor)getDriver();
                //    java.executeScript("arguments[0].setAttribute('style','display: block');", test);
                for (Integer i = 0; i < element.size(); i++) {
                    action.moveToElement(list.get(b), (int) coordian, 0).click().build().perform();
                    //getDriver().get("https://www.invitro.ru/radiology/");
                    element.get(i).click();
                    textUrl = getDriver().getCurrentUrl();
                    if (!text.equals(textUrl))
                        cheeck = true;
                    else {
                        cheeck = false;
                        b = -1;
                        break;
                    }
                    open();
                    element = list.get(b).findElements(By.cssSelector(".side-bar-third__items"));
                    one++;
                }
            }

            for (Integer i = 0; i < listt.size(); i++) {

                open();
                list.get(i).click();
                textUrl = getDriver().getCurrentUrl();
                if (!text.equals(textUrl))
                    cheeck = true;
                else {
                    cheeck = false;
                    i = -1;
                    break;
                }
                one++;
            }
            if (one==49)
                cheeck=true;
             else cheeck=false;
        }
    }
    public boolean checckUrl(){
        return cheeck;
    }

}
