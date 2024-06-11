package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.core.IsNot.not;

import static ru.iteco.fmhandroid.ui.page.TopicalQuotesPage.getDescriptionText;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.page.NewsPage;
import ru.iteco.fmhandroid.ui.utils.Utils;

public class NewsSteps {

    NewsPage news = new NewsPage();

    public void clickEditNews(String newsTitle) {
        Allure.step("Нажатие кнопки 'редактировать новость'");
        news.editNewsButton(newsTitle).perform(click());
    }

    public void doActiveNews() {
        Allure.step("Кликаем на чекбокс (активная или неактивная новость)");
        news.buttonActive.perform(click());
    }

    public void checkIfNewsWithTitle(String titleText) {
        Allure.step("Проверка наличия новости с указанным заголовком");
        onView(allOf(withText(titleText), isDisplayed())).check(matches(isDisplayed()));
    }
    public void openNews(String titleText) {
        Allure.step("Проверка наличия новости с указанным заголовком");
        onView(allOf(withText(titleText), isDisplayed())).check(matches(isDisplayed())).perform(click());
    }

    public void clickDeleteNews(String newsTitle) {
        Allure.step("Удаление новости с указанным заголовком");
        news.deleteNewsButton(newsTitle).perform(click());
        Allure.step("Подтверждение удаления новости с указанным заголовком");
        news.buttonOk.perform(click());
    }

    public void randomDescriptionNews() {
        Allure.step("Нажатие на вкладку 'description'");
        news.description.perform(click());
        Allure.step("Добавление в поле 'description' текста с любым числом");
        String newsDescription = Utils.getRandomNewsDescription();
        news.description.perform(replaceText(newsDescription), closeSoftKeyboard());
    }
    public void goToTabCreatingNews() {
        Allure.step("Переход во вкладку 'creating news'");
        news.createdNews.perform(click());
    }
    public void goToTabControlPanel () {
        Allure.step("Переход во вкладку 'Control panel'");
        news.materialButton.perform(click());
    }

    public void enterTittle(String title) {
        Allure.step("Ввод заголовка");
        news.createTitle.perform(replaceText(title));
    }

    public void checkPageControlPanek() {
        Allure.step("Проверка страницы 'Control panel'");
        news.controlPanel.check(matches(isDisplayed()));
    }

    public void checkPageNews() {
        Allure.step("Проверка страницы 'News'");
        news.newsPage.check(matches(isDisplayed()));
    }
    public void checkDeleteNews(String title) {
        Allure.step("Проверка отсутствия новости с указанным заголовком");
        onView(allOf(withText(title))).check(doesNotExist());
    }

    public void checkEditNews(String title) {
        Allure.step("Проверка того, что новость с указанным заголовком отредактирована");
        onView(allOf(withText(title))).check(matches(isDisplayed()));
    }

    public void filterNews() {
        Allure.step("Нажатие на фильтр новостей");
        news.filterPage.perform(click());
    }

    public void choseCategory(String category) {
        Allure.step("Выбор категории");
        news.createCategory.perform(replaceText(category));
    }

    public void pushCategory() {
        Allure.step("Нажатие на поле 'category'");
        news.createCategory.perform(click());
    }
    public void saveFilter() {
        Allure.step("Сохранение фильтрацию");
        news.filterButton.perform(click());
    }

    public void checkNews(String title) {
        Allure.step("Проверка созданной новости");
        onView(allOf(withText(title), isDisplayed()));
    }

    public void checkIfNoNewsWithTitle(String title) {
        Allure.step("Проверка отсутствия новости с указанным заголовком");
        onView(allOf(withText(title), isDisplayed())).check(doesNotExist());
    }

    public static void checkToastErrorMessage(String messageError) {
        Allure.step("Отображение всплывающего сообщения об ошибке Неверные данные");
        onView(allOf(withContentDescription(messageError), isDisplayed()));
    }
    public void goToTabNews () {
        Allure.step("Переход во вкладку 'News'");
        news.allNewsHeadLine.perform(click());
    }

    public void randomTitleNews() {
        Allure.step("Нажатие на 'title'");
        news.createTitle.perform(click());
        Allure.step("Добавление в поле 'Title' текст");
        String categoryRandom = Utils.randomCategory();
        news.createTitle.perform(replaceText(categoryRandom));
    }

    public void randomCategoryNews() {
        Allure.step("Нажатие на 'category'");
        news.createCategory.perform(click());
        Allure.step("Добавление в поле 'Category' текст");
        String categoryRandom = Utils.randomCategory();
        news.createCategory.perform(replaceText(categoryRandom));
    }

    public void publicationDate() {
        Allure.step("Указание текущую дату");
        news.choseDate.perform(click());
        news.buttonOk.perform(click());
    }

    public void publicationTime() {
        Allure.step("Указание текущее время");
        news.choseTime.perform(click());
        news.buttonOk.perform(click());
    }
    public void saveNews() {
        Allure.step("Сохранение новости");
        news.saveButton.perform(click());
    }

    public void cancelNews() {
        Allure.step("Отмена новости");
        news.canselButton.perform(click());
        news.buttonOk.perform(click());
    }

    public void checkingCreateNewsPage() {
        Allure.step("Проверка отображения oкна Создания новости");
        news.createCategory.check(matches(isDisplayed()));
    }

    public void openNews() {
        Allure.step("Открытие последней новости");
        news.openNews.perform(click());
    }

    public void sortNews() {
        Allure.step("Нажатие кнопки Сортировка");
        news.sort.perform(click());
    }
    public void checkNewsPage() {
        Allure.step("Проверка отображения oкна новостей");
        news.newsPage.check(matches(isDisplayed()));
    }
}