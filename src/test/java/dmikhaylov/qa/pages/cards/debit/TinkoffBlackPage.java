package dmikhaylov.qa.pages.cards.debit;

import java.util.List;
import dmikhaylov.qa.pages.components.CommonComponents;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TinkoffBlackPage {

    CommonComponents common = new CommonComponents();

    public TinkoffBlackPage verifyFirstMainMenu(List<String> items) {
        common.verifyMenuItems(0, items);
        return this;
    }

    public TinkoffBlackPage verifySecondMainMenu(List<String> items) {
        common.verifyMenuItems(1, items);
        return this;
    }

    public TinkoffBlackPage clickItemOnFirstMenu(String item) {
        common.clickItemOnMenu(0, item);
        return this;
    }

    public TinkoffBlackPage clickItemOnSecondMenu(String item) {
        common.clickItemOnMenu(1, item);
        return this;
    }

    public TinkoffBlackPage clickSubmitButton() {
//        $("button").$(byText("Оформить")).scrollTo().click();
        $x("//button//span[text()='Оформить']").click();
        return this;
    }

    public TinkoffBlackPage checkOcurFioError() {
        $(withTagAndText("div", "Укажите фамилию, имя и отчество через пробел")).shouldBe(visible);
        return this;
    }

    public TinkoffBlackPage checkOcurPhoneError() {
        $(withTagAndText("div", "Укажите номер телефона")).shouldBe(visible);
        return this;
    }

    public TinkoffBlackPage checkOcurBirthdayError() {
        $(withTagAndText("div", "Укажите дату рождения")).shouldBe(visible);
        return this;
    }
}
