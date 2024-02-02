package ru.iteco.fmhandroid.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.core.AllOf.allOf;

import androidx.test.espresso.ViewInteraction;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.elements.BasePage;

public class LKMenuSteps extends BasePage {
    private static final ViewInteraction logoutButton = onView(
            allOf(withId(android.R.id.title), withText("Выйти"),
                    isDisplayed()));


    public static void logoutButtonCheck(){
        Allure.step("Кнопка видна и кликабельна, текст соответстует");
        existNotClickableText(logoutButton, "Выйти");
    }

    public static void logoutButtonClick(){
        Allure.step("Тап по кнопке Выйти");
        waitUntilElement("Выйти");
        logoutButton.perform(click());
    }
}
