package dmikhaylov.qa.pages.cards.debit;

import static com.codeborne.selenide.Selenide.open;

public class DebitCardsPage {
    public DebitCardsPage openPage() {
        open("/cards/debit-cards");
//        open("/");
        return this;
    }
}
