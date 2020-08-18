package Test3.test.test;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
public class ResultAnalizes extends  PageObject{
    @FindBy(id="popupResult")
    WebElementFacade popupAnalizy;
    @FindBy(id="inz")
    WebElementFacade inz;
    @FindBy(id="born")
    WebElementFacade born;
    @FindBy(id="surname")
    WebElementFacade surname;
    @FindBy(className = "attention__content")
    WebElementFacade lableText;

    public boolean popup(){
        popupAnalizy.waitUntilVisible();
        return popupAnalizy.isDisplayed();
    }

    public boolean readFormEdit(){

        if ((inz.getCssValue("color").equals("rgba(255, 0, 0, 1)") & (born.getCssValue("color").equals("rgba(255, 0, 0, 1)") & (surname.getCssValue("color").equals("rgba(255, 0, 0, 1)") ))==true))
            return true;
        else
            return false;

    }

    public boolean cheeckText(){
        if((popupAnalizy.getAttribute("innerHTML").contains("Поля")) & (popupAnalizy.getAttribute("innerHTML").contains("Код ИНЗ")) & (popupAnalizy.getAttribute("innerHTML").contains("Фамилия"))
                & (popupAnalizy.getAttribute("innerHTML").contains("Поля")) & (popupAnalizy.getAttribute("innerHTML").contains("обязательны для заполнения.")))
            return true;
        else
            return false;
    }

    public boolean labelTextSearch(){
        if((lableText.getAttribute("innerHTML").contains("Ваши результаты анализов не найдены.")) & (lableText.getAttribute("innerHTML").contains("Ваши результаты анализов не найдены.")))
            return true;
        else
            return false;
    }

    public boolean popupHide(){
        return popupAnalizy.isVisible();

    }

}
