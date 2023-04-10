package ru.plnvoran;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkPartTwo {

    @Test
    public void homeHoverGitHubTest() {

        open("https://github.com");

        $(".Header-old").$(byText("Solutions")).click();
        $(".border-bottom").$(byText("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));

    }

    @Test
    public void  dragAndDropTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a>header").shouldHave(text("A"));
        $("#column-b>header").shouldHave(text("B"));

        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a>header").shouldHave(text("B"));
        $("#column-b>header").shouldHave(text("A"));

    }
}

