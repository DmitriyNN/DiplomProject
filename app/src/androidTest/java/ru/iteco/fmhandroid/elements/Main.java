package ru.iteco.fmhandroid.elements;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static ru.iteco.fmhandroid.WaitId.waitUntilElement;
import static ru.iteco.fmhandroid.utils.Utils.withIndex;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.steps.MainSteps;


public class Main extends MainSteps {

    public static Matcher<View> getMainElementsButtonAllNews() {
        waitUntilElement(R.id.all_news_text_view);
        return withId(R.id.all_news_text_view);
    }

    public static Matcher<View> getMainElementsButtonClaims() {
        waitUntilElement(R.id.all_claims_text_view);
        return withId(R.id.all_claims_text_view);
    }

    public static Matcher<View> clickDropDownListNews() {
        waitUntilElement(R.id.expand_material_button);
        return withIndex(withId(R.id.expand_material_button), 0);
    }

    public static Matcher<View> clickDropDownListNewInBlock() {
        waitUntilElement(R.id.container_list_news_include_on_fragment_main);
        return withIndex(withId(R.id.container_list_news_include_on_fragment_main), 0);
    }

    public static Matcher<View> clickDropDownListClaims() {
        waitUntilElement(R.id.expand_material_button);
        return withIndex(withId(R.id.expand_material_button), 1);
    }
}