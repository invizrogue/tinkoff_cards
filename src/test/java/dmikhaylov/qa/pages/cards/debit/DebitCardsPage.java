package dmikhaylov.qa.pages.cards.debit;

import dmikhaylov.qa.pages.components.CommonComponents;

import java.util.List;

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
}
