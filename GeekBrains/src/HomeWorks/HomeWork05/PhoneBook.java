package HomeWorks.HomeWork05;

import java.util.*;

public class PhoneBook {

    private final Map<String, List<String>> phoneBook;

    public PhoneBook(){
        phoneBook = new HashMap<>();
    }

    public void addPerson(String personName, String ...phones){
        List<String> listPhones = new ArrayList<>();
        for (String phone: phones) {
            listPhones.add(phone);
        }
        phoneBook.put(personName, listPhones);
    }

    public void showAll(){
        for (var item: phoneBook.entrySet()) {
            System.out.print(item.getKey());
            System.out.print(": ");
            System.out.println(item.getValue());
        }
    }

    public void showPerson(String personName) {
        if(phoneBook.containsKey(personName)){
            System.out.print(personName);
            System.out.print(": ");
            System.out.println(phoneBook.get(personName));
        } else {
            System.out.println("Запись не найдена");
        }
    }

    public void addPhones(String personName, String ...phones){
        List<String> listPhones = phoneBook.get(personName);
        for (String phone: phones) {
            listPhones.add(phone);
        }
    }

    public void removePerson(String personName){
        if(phoneBook.containsKey(personName)){
            phoneBook.remove(personName);
        } else {
            System.out.println("Запись не найдена");
        }

    }

    public void removePhone(String personName, String phone){
        if(phoneBook.containsKey(personName)){
            List<String> listPhones = phoneBook.get(personName);
            if(listPhones.contains(phone)) {
                listPhones.remove(phone);
            } else {
                System.out.println("Телефон не найден");
            }
        } else {
            System.out.println("Запись не найдена");
        }
    }
}
