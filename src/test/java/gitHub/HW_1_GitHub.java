package gitHub;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class HW_1_GitHub {

    @Test
    void HW_1GitHub() {


        // открыть главную страницу
        open("https://github.com");
        // ввести в поле поиска selenide и нажать enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        // Откройте страницу Selenide в Github
        $$("ul.repo-list li").first().$("a").click();
        //Перейдите в раздел Wiki проекта
        $$("ul.UnderlineNav-body  li").get(5).$("a#wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $$("#wiki-body").shouldHave(CollectionCondition.texts("Soft assertions"));
        $$("#wiki-body div.markdown-body ul li").get(7).$("a.internal").click();
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $$("div.markdown-body").shouldHave(CollectionCondition.texts("com.codeborne.selenide." +
                "junit5.SoftAssertsExtension"));


        sleep(2000);
    }

}
