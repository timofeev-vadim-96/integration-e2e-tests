package seminars.five.notes.front;

import seminars.five.notes.Presenter;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame implements UserInterface{
    private Presenter presenter;
    public UI(Presenter presenter) throws HeadlessException {
        //todo реализация конструктора и всех блоков окна
        this.presenter = presenter;
    }

    public Component createCentralComponent(){
        //todo поля для создания пользователя
        String name = "name";
        String phone = "phone";
        presenter.createContact(name, phone);
        //todo
        return new JPanel();
    }

    public Component createSouthComponent(){
        //todo логика работы текстового поля для ввода
        String name = "текст, полученный от пользователя";
        presenter.findByName(name);
        //todo отображения результатов поиска
        return new JPanel();
    }
}
