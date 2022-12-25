package gitHub;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HW_1_2_GitHub {

    @Test
    void HW_1_2() {

        open("https://github.com");
        //$("div.header-menu-wrapper ul.d-lg-flex").find(byText("Solutions")).click();
        $("div.header-menu-wrapper ul.d-lg-flex").hover();
        $("ul.list-style-none", 0).find(byText("Enterprise")).click();
        $$("div.col-9-max h1").shouldHave(CollectionCondition.texts("Build like the best"));


    }

    @Test
    void HW_1_2option() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $$("#column-a").shouldHave(CollectionCondition.texts("B"));






       // sleep(4000);

    }




}
