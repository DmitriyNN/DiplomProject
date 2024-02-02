package ru.iteco.fmhandroid.tests;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Story;
import ru.iteco.fmhandroid.elements.BasePage;
import ru.iteco.fmhandroid.steps.SplashScreenPageSteps;

@RunWith(AllureAndroidJUnit4.class)
public class SplashScreenTests extends BasePage {
    @Description("На Стартовой странице представлены необходимые элементы")
    @Story("Проверка Стартовой Страницы")
    @Test
    public void shouldHaveRequiredUIElements(){
        SplashScreenPageSteps.screenSplashCheK();
    }
}
