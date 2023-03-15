package dmikhaylov.qa.pages.cards.debit;

import java.util.List;
import dmikhaylov.qa.pages.components.CommonComponents;
import static com.codeborne.selenide.Selenide.*;

public class DebitCardsPage {

    CommonComponents common = new CommonComponents();
    public DebitCardsPage verifyFirstMainMenu(List<String> items) {
        common.verifyMenuItems(0, items);
        return this;
    }

    public DebitCardsPage verifySecondMainMenu(List<String> items) {
        common.verifyMenuItems(1, items);
        return this;
    }

    public DebitCardsPage clickItemOnFirstMenu(String item) {
        common.clickItemOnMenu(0, item);
        return this;
    }

    public DebitCardsPage clickItemOnSecondMenu(String item) {
        common.clickItemOnMenu(1, item);
        return this;
    }

    public DebitCardsPage clickMoreAboutCard(String cardName) {
        $x("//p[text()='" + cardName
                + "']/ancestor::div[@data-test='slideLink']/following-sibling::div//span[text()='Подробнее']").click();
//        $(byText(cardName)).ancestor("div[data-test='slideLink']")
//                .sibling(0).$(byText("Подробнее")).click();
        return this;
    }
}
