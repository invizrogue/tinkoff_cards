package dmikhaylov.qa.pages;

import java.util.List;
import dmikhaylov.qa.pages.components.CommonComponents;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    CommonComponents common = new CommonComponents();
    public MainPage openPage() {
        open("/");
        return this;
    }

    public MainPage verifyFirstMainMenu(List<String> items) {
        common.verifyMenuItems(0, items);
        return this;
    }

    public MainPage verifySecondMainMenu(List<String> items) {
        common.verifyMenuItems(1, items);
        return this;
    }

    public MainPage clickItemOnFirstMenu(String item) {
        common.clickItemOnMenu(0, item);
        return this;
    }

    public MainPage clickItemOnSecondMenu(String item) {
        common.clickItemOnMenu(1, item);
        return this;
    }
}
