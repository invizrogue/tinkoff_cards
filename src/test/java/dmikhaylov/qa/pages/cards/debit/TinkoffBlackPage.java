package dmikhaylov.qa.pages.cards.debit;

import dmikhaylov.qa.pages.components.CommonComponents;

import java.util.List;

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
}
