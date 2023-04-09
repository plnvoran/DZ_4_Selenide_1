package ru.plnvoran;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkPartOne {

    @Test
    public void differenceCheckTest() {

        open("https://qatest76.ucoz.net/index/dz_1/0-6");

        SelenideElement variantOne = $("h1 div");
        SelenideElement variantTwo = $("h1").$("div");

        System.out.println("variantOne is " + variantOne);
        System.out.println("variantTwo is " + variantTwo);

        open("https://qatest76.ucoz.net/index/iskljuchenie/0-7");

        variantOne = $("h1 div");
        variantTwo = $("h1").$("div");

        System.out.println("variantOne is " + variantOne);
        System.out.println("variantTwo is " + variantTwo);

    }

    @Test
    public void checkThatPageHasSpecialCodeTest() {

        open("https://github.com/selenide/selenide");
        $("#repository-container-header a").shouldHave(text("selenide"));

        $("#wiki-tab").click();
        $("#wiki-body h1").shouldHave(text("Welcome to the selenide wiki!"));
        $("#wiki-pages-box").$("button").click();

        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$("a[href = '/selenide/selenide/wiki/SoftAssertions']").click();

        $("#wiki-body").shouldHave(text("JUnit5 extension"));

    }

}

