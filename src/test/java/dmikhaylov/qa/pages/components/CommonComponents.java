package dmikhaylov.qa.pages.components;

import java.util.List;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class CommonComponents {
    final protected ElementsCollection headerMenus = $$("nav[data-qa-type='uikit/navigation.menu']");

    public void verifyMenuItems(int index, List<String> items) {
        headerMenus.get(index).$$("a[data-qa-type='uikit/navigation.menuItem']>span")
                .filter(visible).shouldHave(texts(items));
    }

    public void clickItemOnMenu(int index, String item) {
        headerMenus.get(index).$$("a[data-qa-type='uikit/navigation.menuItem']>span")
                .filter(visible).findBy(text(item)).click();
    }
}
