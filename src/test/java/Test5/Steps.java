package Test5;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;

public class Steps {
    Poisk poisk;
    @Пусть("^открыт сайт https://www\\.invitro\\.ru/radiology/$")
    public void searshSteps() {
        poisk.openPoisk();

    }

    @Когда("^вводится (.*) код анализа в поле поиска$")
    public void inputSearchSteps(String a)  {
        poisk.inputPoisk(a);

    }

    @Когда("^нажимает поиск$")
    public void serchTextSteps()  {
        poisk.serchTextPoisk();

    }

    @Тогда("^в поиске появляется введнная (.*) строка$")
    public void cheeckSearchSteps(String a)  {
        Assert.assertTrue(poisk.checkInputPoisk(a));

    }

}
