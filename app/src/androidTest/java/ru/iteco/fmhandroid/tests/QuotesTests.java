package ru.iteco.fmhandroid.tests;

import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Story;
import ru.iteco.fmhandroid.steps.AboutAppSteps;
import ru.iteco.fmhandroid.steps.HeaderPageSteps;
import ru.iteco.fmhandroid.steps.MainMenuSteps;
import ru.iteco.fmhandroid.steps.QuotesSteps;

public class QuotesTests extends BeforeRunTests {
    @Before
    public void openPage(){
        HeaderPageSteps.thematicButtonClick();
    }

    @Description("проверка работы выпадающего меню на странице Тематические Цитаты")
    @Story("Проверка Страницы Тематические Цитаты")
    @Test
    public void shouldHaveRequiredElements(){
        HeaderPageSteps.mainMenuButtonClick();
        clickBack();
        QuotesSteps.titleTextCheck();
        menuContainCheck();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.mainPageButtonClick();
        clickBack();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.newsPageButtonClick();
        clickBack();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.claimPageButtonClick();
        clickBack();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.aboutPageButtonClick();
        AboutAppSteps.versionTitleIdCheck();
        clickBack();

        headerCheck();

        QuotesSteps.thematicBlockOneCheck();
        QuotesSteps.titleTextCheck();
    }

    @Description("Проверка заголовка на странице Тематические цитаты")
    @Story("Проверка Страницы Тематические Цитаты")
    @Test
    public void shouldHaveHeaderAndHeaderShouldBeWhenSwipeUp(){
        headerCheck();
        QuotesSteps.swipeUp();
        headerCheck();
        QuotesSteps.titleCheck();
    }

    @Description("Работа кнопки развернуть на странице Тематические цитаты")
    @Story("Проверка Страницы Тематические Цитаты")
    @Test
    public void shouldShowDescriptionWhenTapOnCard(){
        QuotesSteps.descriptionCheck();
    }
}
