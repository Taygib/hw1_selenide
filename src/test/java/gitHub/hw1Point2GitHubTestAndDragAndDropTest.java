package gitHub;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class hw1Point2GitHubTestAndDragAndDropTest {

    @Test
    void hw1Point2GitHubTest() {

        open("https://github.com");
        //$("div.header-menu-wrapper ul.d-lg-flex").find(byText("Solutions")).click();
        $("div.header-menu-wrapper ul.d-lg-flex").hover();
        $("ul.list-style-none", 0).find(byText("Enterprise")).click();
        $$("div.col-9-max h1").shouldHave(CollectionCondition.texts("Build like the best"));


    }

    @Test
    void hw1Point2DragAndDropTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $$("#column-a").shouldHave(CollectionCondition.texts("B"));






       // sleep(4000);

    }




}
