package seminars.five.notes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PresenterTest {
    Presenter presenter;
    @BeforeEach
    void setUp(){
        presenter = new Presenter();
    }


    @Test
    void showContactList() {
        //todo получаем список из Notebook и проверяем, что передаем в UI - интеграционный тест
    }

    @Test
    void changeContact() {
        //todo ищем контакт по имени и меняем его + проверяем изменения - интеграционный тест
    }

    @Test
    void createContact() {
        //todo интеграционный тест взаимодействия с Notebook по добавлению контакта, а именно
        // getContact() и createContact()
    }
}