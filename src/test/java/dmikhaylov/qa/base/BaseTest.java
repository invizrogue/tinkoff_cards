package dmikhaylov.qa.base;

import com.codeborne.selenide.logevents.SelenideLogger;
import dmikhaylov.qa.config.WebDriverProvider;
import dmikhaylov.qa.helpers.Attach;
import dmikhaylov.qa.pages.MainPage;
import dmikhaylov.qa.pages.cards.debit.DebitCardsPage;
import dmikhaylov.qa.pages.cards.debit.TinkoffBlackPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    protected MainPage mainPage = new MainPage();
    protected DebitCardsPage debitCardsPage = new DebitCardsPage();
    protected TinkoffBlackPage tinkoffBlackPage = new TinkoffBlackPage();

    protected static Stream<List<String>> firstHeadMenuProvider() {
        return Stream.of(List.of("Банк", "Бизнес", "Касса", "Инвестиции",
                "Сим-карта", "Страхование", "Путешествия", "Город", "Долями"));
    }

    protected static Stream<List<String>> secondHeadMenuProvider() {
        return Stream.of(List.of("Кредитные карты", "Дебетовые карты", "Ипотека", "Вклады и счета",
                "Премиум", "Подписка", "Кредит наличными", "Автокредит", "Рефинансирование"));
    }

    @BeforeAll
    static void setUp() {
        WebDriverProvider.setUp();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}
