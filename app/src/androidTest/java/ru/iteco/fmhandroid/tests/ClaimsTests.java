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

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class ClaimsTests {
    @Rule
    public ActivityTestRule<AppActivity> activityTestRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void authorization() {
        AuthorizationSteps.login();
    }

    @Test
    @Tag("20")
    @Story("Фильтрация заявок по критерию Открыта во вкладке Заявки")
    public void applicationFilterInProgress() {
        MainSteps.clickButtonClaims();
        ClaimSteps.clickButtonFilter();
        ClaimSteps.clickRemoveCheckBoxOpen();
        ClaimSteps.clickButtonOk();
        MainSteps.claims();
    }

    @Test
    @Tag("21")
    @Story("Фильтрация заявок по критерию В работе во вкладке Заявки")
    public void applicationFilterOpen() {
        MainSteps.clickButtonClaims();
        ClaimSteps.clickButtonFilter();
        ClaimSteps.clickRemoveCheckBoxInProgress();
        ClaimSteps.clickButtonOk();
        MainSteps.claims();
    }

    @Test
    @Tag("22")
    @Story("Фильтрация заявок по критерию Выполнена во вкладке Заявки")
    public void applicationFilterExecuted() {
        MainSteps.clickButtonClaims();
        ClaimSteps.clickButtonFilter();
        ClaimSteps.clickRemoveCheckBoxOpen();
        ClaimSteps.clickRemoveCheckBoxInProgress();
        ClaimSteps.clickCheckBoxExecuted();
        ClaimSteps.clickButtonOk();
        MainSteps.claims();
    }

    @Test
    @Tag("23")
    @Story("Фильтрация заявок по критерию Отмененные во вкладке Заявки")
    public void applicationFilterCancelled() {
        MainSteps.clickButtonClaims();
        ClaimSteps.clickButtonFilter();
        ClaimSteps.clickRemoveCheckBoxOpen();
        ClaimSteps.clickRemoveCheckBoxInProgress();
        ClaimSteps.clickCheckBoxCancelled();
        ClaimSteps.clickButtonOk();
        MainSteps.claims();
    }

    @Test
    @Tag("24")
    @Story("Создание заявки во вкладке Заявки")
    public void addNewClaim() {
        ClaimSteps.clickButtonMainMenu();
        ClaimSteps.clickButtonClaims();
        ClaimSteps.clickButtonAddClaim();
        ClaimSteps.clickTitleField("Осмотр нового пациента окончился печально");
        ClaimSteps.clickCheckBoxExecutorField("Иванов Сергей Викторович");
        ClaimSteps.clickDateField();
        ClaimSteps.clickButtonOkDate();
        ClaimSteps.clickTimeField();
        ClaimSteps.clickButtonOkTime();
        ClaimSteps.clickDescriptionField("Описание не будет полным");
        ClaimSteps.clickButtonSave();
        MainSteps.claims();
    }

    @Test
    @Tag("25")
    @Story("Поле Тема пустое, при создании заявки, во вкладке Заявки")
    public void titleFieldIsEmpty() {
        ClaimSteps.clickButtonMainMenu();
        ClaimSteps.clickButtonClaims();
        ClaimSteps.clickButtonAddClaim();
        ClaimSteps.clickCheckBoxExecutorField("Иванов Сергей Викторович");
        ClaimSteps.clickDateField();
        ClaimSteps.clickButtonOkDate();
        ClaimSteps.clickTimeField();
        ClaimSteps.clickButtonOkTime();
        ClaimSteps.clickDescriptionField("Описание не будет полным");
        ClaimSteps.clickButtonSave();
        ClaimSteps.clickButtonOkError();
        ClaimSteps.errorIconInField();
        ClaimSteps.clickButtonCancelClaim();
        ClaimSteps.clickButtonOkNotification();
    }
}
