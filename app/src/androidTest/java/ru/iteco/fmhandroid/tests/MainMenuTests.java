package ru.iteco.fmhandroid.tests;

import org.junit.Test;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Story;
import ru.iteco.fmhandroid.steps.AboutAppSteps;
import ru.iteco.fmhandroid.steps.HeaderPageSteps;
import ru.iteco.fmhandroid.steps.MainMenuSteps;

public class MainMenuTests  extends BeforeRunTests {

    @Description("Проверка раскрывающегося меню навигация")
    @Story("Проверка Раскрывающегося Меню")
    @Test
    public void menuShouldHaveRequiredElements() {
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.mainPageButtonCheck();
        clickBack();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.mainPageButtonNotClickCheck();

        MainMenuSteps.newsPageButtonCheck();
        MainMenuSteps.aboutPageButtonCheck();
        MainMenuSteps.claimPageButtonCheck();
        clickBack();
    }

    @Description("Проверка и переход между страницами из главного меню")
    @Story("Проверка Раскрывающегося Меню")
    @Test
    public void shouldOpenCascadePageA() {
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.newsPageButtonClick();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.newsPageButtonNotClickCheck();
        clickBack();
        clickBack();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.claimPageButtonClick();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.claimPageButtonNotClickCheck();
        clickBack();
        clickBack();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.aboutPageButtonClick();
        AboutAppSteps.versionTitleIdCheck();

        clickBack();


        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.claimPageButtonClick();
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.mainPageButtonClick();


        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.claimPageButtonClick();
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.newsPageButtonClick();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.claimPageButtonClick();
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.aboutPageButtonClick();
        AboutAppSteps.versionTitleIdCheck();
        clickBack();

        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.newsPageButtonClick();
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.mainPageButtonClick();


        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.newsPageButtonClick();
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.claimPageButtonClick();


        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.newsPageButtonClick();
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.aboutPageButtonClick();
        AboutAppSteps.versionTitleIdCheck();
        clickBack();
    }
}
