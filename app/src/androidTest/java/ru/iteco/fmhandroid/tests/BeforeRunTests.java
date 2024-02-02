package ru.iteco.fmhandroid.tests;

import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.elements.BasePage;
import ru.iteco.fmhandroid.steps.HeaderPageSteps;
import ru.iteco.fmhandroid.steps.MainMenuSteps;

@RunWith(AllureAndroidJUnit4.class)
public class BeforeRunTests extends BasePage {

    public static void headerCheck() {
        HeaderPageSteps.mainMenuButtonCheck();
        HeaderPageSteps.logoCheck();
        HeaderPageSteps.thematicButtonCheck();
        HeaderPageSteps.lkButtonCheck();
    }

    public static void menuContainCheck() {
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.menuConsist();
        clickBack();
    }




}
