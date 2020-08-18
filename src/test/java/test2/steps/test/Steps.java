package test2.steps.test;

import org.junit.Assert;
import test2.steps.*;
import cucumber.api.java.ru.*;

public class Steps {
    City city;
    ResultCity resultCity;

    @Пусть("^пользователь открывает сайт https://www\\.invitro\\.ru/radiology/$")
        public void oden (){
        city.openUrl();

        }
    @Пусть("^меню смены города закрыто$")
    public void check () throws InterruptedException {
        city.popupCityVisible();

    }


    @Когда("^пользоватеь нажиимает 'Ваш город'$")
        public void openPopup(){
        city.openPopupClick();

    }

    @Тогда("^Появляется окно для смены города$")
    public void changeCity(){
        Assert.assertTrue(resultCity.popupCityVisible());

    }

    @Когда("^пользователь нажимае 'Выбрать другой'$")
    public void searchCity(){
        city.serchCyti();
    }

    @Тогда("^появляется окно смены города$")
    public void LabelSearch(){
        Assert.assertTrue(resultCity.cityLabelSearch());
    }

    @Когда("^пользователь ищет город 'Омск'$")
    public void InputSearch(){
        city.inputSearch();
    }

    @Тогда("^отображаются результаты поиска с городом 'Омск'$")
    public void resultSearch(){
        Assert.assertTrue(resultCity.citySearch());
    }

    @Когда("^выбирает город 'Омск' в результате поиска$")
    public void clickSearch() throws InterruptedException {
        Thread.sleep(2000);
        city.citySearch();
    }

    @Тогда("^окно поиска становится не видно$")
    public void LabelSerchHide() {
       Assert.assertFalse(resultCity.cityLabelSearchHide());
    }


    @Тогда("^на сайте выбран город 'Омск'$")
    public void checkCity() throws Exception {
        Assert.assertTrue(resultCity.checkCity());

    }
}
