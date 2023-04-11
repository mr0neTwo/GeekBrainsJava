package HomeWorks.HomeWork05;

import HomeWorks.HomeWork05.PhoneBook;

public class Task5_01 {

    PhoneBook phoneBook = new PhoneBook();

    public void start(){
        phoneBook.addPerson("Михаил", "+79991112233");
        phoneBook.addPerson("Иван Петрович", "+79992223344", "+799977788899");
        phoneBook.addPerson("Димончик", "+79995556677", "+79991112233", "+79991112233", "+79991112233");
        phoneBook.addPerson("Бейба", "+79993334455");
        phoneBook.showAll();
        System.out.println();
        phoneBook.addPhones("Бейба", "+78883334455", "+78883334455");
        phoneBook.showPerson("Бейба");
        System.out.println();
        phoneBook.removePerson("Иван Петрович");
        phoneBook.showPerson("Иван Петрович");
        System.out.println();
        phoneBook.removePhone("Димончик", "+79991112233");
        phoneBook.showPerson("Димончик");
        System.out.println();
        phoneBook.removePerson("max");
        System.out.println();
        phoneBook.removePhone("Димончик", "+00");
    }
}
