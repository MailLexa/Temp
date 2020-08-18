package Test1;


import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;

public class Steps {
    Menu menu;




    @Пусть("^пользователь открывает сайт https://www\\.invitro\\.ru/radiology/$")
    public void openUrlSteps(){

        menu.openUrl();
    }

    @Пусть("^вспылывающее меню 'Политика в отношении Персональных данных' не видно$")
    public void hidenMenuSteps() {
        menu.hidenMenu();
    }

    @Когда("^кликаю по меню и подменю$")
    public void clickElementSteps() {
        menu.clickElement();
    }

    @Тогда("^проверяю производился ли переход после кликанья на меню$")
    public void cheeckMenuStep()  {
        Assert.assertTrue(menu.checckUrl());
    }


}