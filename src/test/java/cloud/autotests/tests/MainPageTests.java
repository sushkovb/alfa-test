package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTests extends TestBase {

    @Test
    @DisplayName("Заголовок главной страницы")
    void titleTest() {
        step("Открыть сайт 'https://digital.alfabank.ru'", () ->
                open("https://digital.alfabank.ru"));

        step("Страница должна иметь заголовок 'Alfa Digital'", () -> {
            String expectedTitle = "Alfa Digital";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Отклик на вакансию")
    void projectCost() {
        step("Открыть сайт 'https://digital.alfabank.ru'", () ->
                open("https://digital.alfabank.ru"));

        step("Нажать 'Вакансии'", () -> {
            $(".nav__item", 3).click();
        step("Выбрать QA", () ->
            $(byText("QA")).click());
        step("Нажать QA Automation", () ->
            $(".item-preview_image__icSRW", 1).click());
        });
        step("На открытой странице содержится текст, содержащий 'Павел Иванов'", () ->
            $(".tn-atom").shouldHave(Condition.ownText("Павел Иванов")));
    }


}