package dmikhaylov.qa.tests;

import dmikhaylov.qa.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;

import static io.qameta.allure.Allure.step;

public class TinkoffCardsTest extends BaseTest {

    @MethodSource("firstHeadMenuProvider")
    @ParameterizedTest(name="Наличие пунктов первого меню в заголовке главной страницы")
    public void verifyFirstMenuOnMainPageParametrizedTest(List<String> items) {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие кнопок первого меню в заголовке главной страницы", () -> {
            mainPage.verifyFirstMainMenu(items);
        });
    }

    @MethodSource("secondHeadMenuProvider")
    @ParameterizedTest(name="Наличие пунктов второго меню в заголовке главной страницы")
    public void verifySecondMenuOnMainPageParametrizedTest(List<String> items) {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие кнопок второго меню в заголовке главной страницы", () -> {
            mainPage.verifySecondMainMenu(items);
        });
    }

    @MethodSource("firstHeadMenuProvider")
    @ParameterizedTest(name="Наличие пунктов первого меню в заголовке страницы дебетовых карт")
    public void verifyFirstMenuOnDebitCardsPageParametrizedTest(List<String> items) {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Клик по пункту меню Дебетовые карты", () -> {
            mainPage.clickItemOnSecondMenu("Дебетовые карты");
        });
        step("Проверяем наличие кнопок первого меню в заголовке страницы дебетовых карт", () -> {
            debitCardsPage.verifyFirstMainMenu(items);
        });
    }

    @MethodSource("secondHeadMenuProvider")
    @ParameterizedTest(name="Наличие пунктов второго меню в заголовке страницы дебетовых карт")
    public void verifySecondMenuOnDebitCardsParametrizedTest(List<String> items) {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Клик по пункту меню Дебетовые карты", () -> {
            mainPage.clickItemOnSecondMenu("Дебетовые карты");
        });
        step("Проверяем наличие кнопок второго меню в заголовке страницы дебетовых карт", () -> {
            debitCardsPage.verifySecondMainMenu(items);
        });
    }
}
//    step("", () -> {});