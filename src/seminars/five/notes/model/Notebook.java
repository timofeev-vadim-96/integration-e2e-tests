package seminars.five.notes.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Notebook {
    private final List<Contact> contacts = new ArrayList<>();

    public void add(Contact contact){
        //todo
    }

    public void remove(Contact contact){
        //todo
    }

    public void change(){
        //todo
    }

    public Contact findById(int id){
        //todo
        return new Contact();
    }

    public Contact findByName(String name){
        //todo
        return new Contact();
    }
}
