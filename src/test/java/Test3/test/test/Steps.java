package Test3.test.test;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;

public class Steps {
    Analizes analizes;
    ResultAnalizes resultAnalizes;

    @Пусть("^пользователь открывает сайт https://www\\.invitro\\.ru/radiology/$")
    public void openUrl() {
        analizes.openUrl();
    }


    @Когда("^нажимает в меню пункт 'Получить результаты анализов'$")
    public void analizesRezult()  {
        analizes.result();
    }

    @Тогда("^появляется окно , для ввода данных$")
    public void analizesPopup()  {
        Assert.assertTrue(resultAnalizes.popup());
    }

    @Когда("^пользователь нажимае кнопку 'Найти результаты'$")
    public void resultAnalizes() {
        analizes.serchRezultAnalizes();
    }

    @Тогда("^поля ввода выделяются красным$")
    public void поля_ввода_выделяются_красным() throws Exception {
        Assert.assertTrue(resultAnalizes.readFormEdit());
    }

    @Тогда("^появляется надпись 'Поля, Код ИНЗ, Дата рождения, Фамилия обязательны для заполнения'$")
    public void checkText() {
        Assert.assertTrue(resultAnalizes.cheeckText());
    }

    @Когда("^заполняем поля 'Код ИНЗ, Дата рождения, Фамилия' данными$")
    public void stepsInputtext() throws Exception {
        analizes.inputText();
    }

    @Когда("^нажимаем кнопку 'Найти результаты'$")
    public void searchRezultes() {
        analizes.serchRezultAnalizes();
    }

    @Тогда("^окно с вводимыми данными исчезает$")
    public void windowsHide() throws Exception {
        Assert.assertTrue(resultAnalizes.popup());
    }

    @Тогда("^появляется предупреждение 'Ваши результаты анализов не найдены\\.Пожалуйста измените параметры и повторите поиск'$")
    public void stepsTextSearch() throws Exception {
        Assert.assertTrue(resultAnalizes.labelTextSearch());
    }

}
