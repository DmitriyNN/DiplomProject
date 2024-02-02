package ru.iteco.fmhandroid.tests;

import org.junit.Test;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Story;
import ru.iteco.fmhandroid.steps.AboutAppSteps;
import ru.iteco.fmhandroid.steps.HeaderPageSteps;
import ru.iteco.fmhandroid.steps.MainMenuSteps;

public class AboutAppTests extends BeforeRunTests {

    @Description("На странице О приложении видны все элементы")
    @Story("Проверка Страницы о Приложении")

    @Test
    public void shouldHaveRequiredUIElements() {
        HeaderPageSteps.mainMenuButtonClick();
        MainMenuSteps.aboutPageButtonClick();
        AboutAppSteps.versionTitleIdCheck();
        AboutAppSteps.backButtonCheck();
        AboutAppSteps.logoCheck();
        AboutAppSteps.versionTextIdCheck();
        AboutAppSteps.policyTextIdCheck();
        AboutAppSteps.policyLinkIdCheck();
        AboutAppSteps.userAgreementTextIdCheck();
        AboutAppSteps.userAgreementLinkIdCheck();
        AboutAppSteps.companyIdCheck();
        AboutAppSteps.backButtonClick();
    }

}
