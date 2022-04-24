package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Ми беремо книгу з UniLibrary ");
        System.out.println("----------------------------------");
    }
    public void returnBook(){
        System.out.println("Ми повертаємо книгу в UniLibrary");
        System.out.println("----------------------------------");
    }
    public void getMagazine(){
        System.out.println("Ми беремо журнал з UniLibrary");
        System.out.println("----------------------------------");
    }
    public void returnMagazine(){
        System.out.println("Ми повертаємо журнал в UniLibrary");
        System.out.println("----------------------------------");
    }
    public void addBook(String person_name, Book book){
        System.out.println("Ми добавляємо книгу в UniLibrary ");
        System.out.println("----------------------------------");
    }
    public void addMagazine(){
        System.out.println("Ми добавляємо журнал в UniLibrary ");
        System.out.println("----------------------------------");
    }
}
