package Test6;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;

public class Steps {
    NameMenu nameMenu;
    @Пусть("^открыт сайт https://www\\.invitro\\.ru/radiology/$")
    public void openUrlMenu()  {
        nameMenu.openUrlMenu();
    }

    @Когда("^вводится (.*)  название меню$")
    public void inputSteps(String b) {
        nameMenu.inputSymbolMenu(b);
    }

    @Тогда("^происходит проверка названия в списке$")
    public void checkSteps() {
        Assert.assertTrue(nameMenu.checkMenu());
    }

    @Тогда("^при совпадении происходит переход по ссылке$")
    public void transitionUrl() {
        Assert.assertTrue(nameMenu.urlMenu());
    }
}
