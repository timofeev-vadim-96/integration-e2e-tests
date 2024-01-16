package seminars.five.notes;

import seminars.five.notes.front.UI;
import seminars.five.notes.front.UserInterface;
import seminars.five.notes.model.Contact;
import seminars.five.notes.model.Notebook;

import java.util.List;

public class Presenter {
    private final Notebook notebook;
    private final UserInterface userInterface;

    public Presenter() {
        this.notebook = new Notebook();
        this.userInterface = new UI(this);
    }

    public void menu(){
        showContactList();
        getContact();
        //todo общая логика по вариантам
    }
    public Contact getContact(){
        //todo логика получения нового контакта после взаимодействия с пользователем
        return new Contact();
    }

    public void showContactList(){
        List<Contact> contactList = notebook.getContacts();
        //todo логика отображения
    }

    public void changeContact(int id){
        notebook.findById(id);
        //todo логика поиска и изменения контакта
    }

    public Contact findByName(String name){
        return notebook.findByName(name);
        //todo + логика отображения результата поиска
    }

    public void createContact(String name, String phone){
        notebook.add(new Contact(name, phone));
        //todo
    }
}
