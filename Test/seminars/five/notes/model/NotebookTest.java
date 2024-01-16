package seminars.five.notes.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {
    private Notebook notebook;
    @BeforeEach
    public void setUp(){
        notebook = new Notebook();
    }

    @Test
    void add() {
        //todo проверка факта добавления нового контакта
    }

    @Test
    void remove() {
        //todo проверка удаления контакта из списка
    }

    @Test
    void change() {
        //todo проверка факта внесения изменений для конеркетного контакта
    }

    @Test
    void findById() {
        //todo проверка соответствия найденного пользователя и его id.
    }

    @Test
    void findByName() {
        //todo проверка соответствия имени найденного пользователя запросу
    }
}