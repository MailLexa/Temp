package Test4;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
public class Steps {
    Resultat resultat;
    Action action;

    @Пусть("^пользователь открывает сайт https://www\\.invitro\\.ru/analizes/for-doctors/$")
    public void openUrl() {
        action.openUrl();
    }

    @Пусть("^запоминает цену продукта$")
    public void savePriceProduct()  {
        action.priceProductSave();
    }
    @Пусть("^всплывающее окно 'Политика в отношении Персональных данных' не будет видимо$")
    public void hideCockie()  {
        action.hidenElement();

    }

    @Когда("^пользователь нажимает кнопку 'В корзину'$")
    public void buttonBasket()  {
        action.addProduct();

    }

    @Тогда("^меняяется надпись на кнопке на 'Добавлено'$")
    public void changesTextButton()  {
        Assert.assertTrue(resultat.checkTextButton());
    }
    @Когда("^пользователь нажимает на кнопку 'Корзина'$")
    public void buttonBasketPress()  {
        action.basket();
    }

    @Тогда("^переходит на страницу 'Корзина'$")
    public void basketProduct() {
        Assert.assertTrue(resultat.checkUrl());
    }

    @Тогда("^в корзине есть товар$")
    public void basketFull() {
        Assert.assertTrue(resultat.emptyBasket());
    }

    @Тогда("^сравнивается запомненная сумма товара и текущая , в корзине\\.$")
    public void sumSteps()  {
       Assert.assertTrue( resultat.sumResult());
    }

}
