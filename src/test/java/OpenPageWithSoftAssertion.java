import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenPageWithSoftAssertion {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
    @Test
    void openPageSoftAssertionWithJUnit5(){
        open("https://github.com/selenide/selenide");
        $(".js-repo-nav").$("#wiki-tab").click();
        $(".mt-4").$(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
