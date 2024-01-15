package ru.iteco.fmhandroid.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isFocusable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementAddClaimInMainPage;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonAddClaim;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonCancelClaim;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonClaims;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonFilter;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonMainMenu;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonOk;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonOkDate;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonOkError;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonOkNotification;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonOkTime;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsButtonSave;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsCheckBoxCancelled;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsCheckBoxExecuted;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsDateField;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsDescriptionField;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsExecutorField;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsRemoveCheckBoxInProgress;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsRemoveCheckBoxOpen;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsTimeField;
import static ru.iteco.fmhandroid.elements.Claim.getClaimsElementsTitleField;

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.R;

public class ClaimSteps {


    public static void clickButtonMainMenu() {
        Allure.step("Нажать на кнопку Главное Меню");
        onView(getClaimsElementsButtonMainMenu())
                .perform(click());
    }

    public static void clickButtonClaims() {
        Allure.step("Нажать на кнопку Заявки");
        onView(getClaimsElementsButtonClaims())
                .perform(click());
    }

    public static void clickButtonFilter() {
        Allure.step("Нажать на кнопку Фильтрация");
        onView(getClaimsElementsButtonFilter())
                .perform(click());
    }

    public static void clickRemoveCheckBoxOpen() {
        Allure.step("Снять флажок с чекбокса Открыт");
        onView(getClaimsElementsRemoveCheckBoxOpen())
                .perform(click());
    }

    public static void clickButtonOk() {
        Allure.step("Нажать кнопку ОК");
        onView(getClaimsElementsButtonOk())
                .perform(click());
    }

    public static void clickRemoveCheckBoxInProgress() {
        Allure.step("Снять флажок с чекбокса В работе");
        onView(getClaimsElementsRemoveCheckBoxInProgress())
                .perform(click());
    }

    public static void clickCheckBoxExecuted() {
        Allure.step("Выбрать критерий для фильтрации Выполнена");
        onView(getClaimsElementsCheckBoxExecuted())
                .perform(click());
    }

    public static void clickCheckBoxCancelled() {
        Allure.step("Выбрать критерий для фильтрации Отмененные");
        onView(getClaimsElementsCheckBoxCancelled())
                .perform(click());
    }

    public static void clickButtonAddClaim() {
        Allure.step("Нажать на кнопку Создание Заявки");
        onView(getClaimsElementsButtonAddClaim())
                .perform(click());
    }

    public static void clickTitleField(String value) {
        Allure.step("Ввести в поле Наименование темы");
        onView(getClaimsElementsTitleField())
                .perform(replaceText(value), closeSoftKeyboard());
    }

    public static void clickCheckBoxExecutorField(String value) {
        Allure.step("В поле Исполнитель выбрать из списка ФИО исполнителя");
        onView(getClaimsElementsExecutorField())
                .perform(replaceText(value), closeSoftKeyboard());
    }

    public static void clickDateField() {
        Allure.step("Нажать на поле Дата");
        onView(getClaimsElementsDateField())
                .perform(click());
    }

    public static void clickButtonOkDate() {
        Allure.step("Нажать кнопку ОК");
        onView(getClaimsElementsButtonOkDate())
                .perform(click());
    }

    public static void clickTimeField() {
        Allure.step("Нажать на поле Время");
        onView(getClaimsElementsTimeField())
                .perform(click());
    }

    public static void clickButtonOkTime() {
        Allure.step("Нажать кнопку ОК");
        onView(getClaimsElementsButtonOkTime())
                .perform(click());
    }

    public static void clickDescriptionField(String value) {
        Allure.step("Ввести в поле Описание описание заявки");
        onView(getClaimsElementsDescriptionField())
                .perform(replaceText(value), closeSoftKeyboard());
    }

    public static void clickButtonSave() {
        Allure.step("Нажать на кнопку Сохранить");
        onView(getClaimsElementsButtonSave())
                .perform(click());
    }

    public static void clickButtonOkError() {
        Allure.step("Нажать кнопку ОК в всплывающем окне ошибки");
        onView(allOf(withId(R.id.message), isFocusable()));
        onView(getClaimsElementsButtonOkError())
                .perform(click());
    }

    public static void errorIconInField() {
        Allure.step("Отображается пометка в необходимом для заполнения поле");
        onView(allOf(withId(R.id.text_input_end_icon), isFocusable()));
    }


    public static void clickButtonCancelClaim() {
        Allure.step("Нажать кнопку Отмена");
        onView(getClaimsElementsButtonCancelClaim())
                .perform(click());
    }

    public static void clickButtonOkNotification() {
        Allure.step("Нажать кнопку ОК в уведомлениях");
        onView(getClaimsElementsButtonOkNotification())
                .perform(click());
    }

    public static void clickTitleFieldMaximumCharacters(String value) {
        Allure.step("Ввести в поле Тема максимально-допустимое количество символов");
        onView(getClaimsElementsTitleField())
                .perform(replaceText(value), closeSoftKeyboard());
    }

    public static void clickAddClaimInMainPage() {
        Allure.step("Добавить заявку с главной страницы");
        onView(getClaimsElementAddClaimInMainPage())
                .perform(click());
    }

    @Step("Найти элемент по тексту и выбрать его")
    public static void chooseItemIfVisible(String value) {
        Allure.step("Найти элемент по тексту и выбрать его");
        onView(allOf(withId(R.id.news_item_title_text_view), withText(value)));
    }
}
