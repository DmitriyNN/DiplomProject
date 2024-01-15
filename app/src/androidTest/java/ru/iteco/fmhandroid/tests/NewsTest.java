package ru.iteco.fmhandroid.tests;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Story;
import io.qameta.allure.kotlin.junit4.Tag;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.steps.ClaimSteps;
import ru.iteco.fmhandroid.steps.MainSteps;
import ru.iteco.fmhandroid.steps.NewsSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class NewsTest {
    @Rule
    public ActivityTestRule<AppActivity> activityTestRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void authorization() {
        AuthorizationSteps.login();
    }

    @Test
    @Tag("26")
    @Story("Создание новости")
    public void creationNewsInControlPanel() {
        MainSteps.clickButtonAllNews();
        NewsSteps.clickEditNewsInNewsPage();
        NewsSteps.clickAddNews();
        NewsSteps.clickButtonCategoryCreatingNews();
        NewsSteps.clickButtonTitleCreatingNews();
        NewsSteps.clickButtonDateCreatingNews();
        NewsSteps.clickButtonOkDateCreatingNews();
        NewsSteps.clickButtonTimeCreatingNews();
        NewsSteps.clickButtonOkTimeCreatingNews();
        NewsSteps.clickDescriptionCreatingNews();
        NewsSteps.clickButtonSaveCreatingNews();
        MainSteps.checkDDListNewInBlock();
        ClaimSteps.chooseItemIfVisible("Главные новости сегодня");
    }
}
