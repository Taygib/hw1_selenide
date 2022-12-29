package gitHub;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class hw1GithubTest {

    @Test
    void hw_1GitHub() {

        // открыть главную страницу
        open("https://github.com");
        // ввести в поле поиска selenide и нажать enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        // Откройте страницу Selenide в Github
        $$("ul.repo-list li").first().$("a").click();
        //Перейдите в раздел Wiki проекта
        $$("ul.UnderlineNav-body  li").get(5).$("a#wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("ul.m-0 .js-wiki-more-pages-link").click();
        $$("#wiki-pages-box").shouldHave(CollectionCondition.texts("SoftAssertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(Selectors.byText("SoftAssertions")).click();
           $$("div.markdown-body").shouldHave(CollectionCondition.texts("com.codeborne.selenide." +
                "junit5.SoftAssertsExtension"));


      //  sleep(5000);
    }

}
