
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class BookList {
    ArrayList<Book> t = new ArrayList<>();
    
    public void addBook(String code, String title, int qua, double price) {
        for (Book b : t) {
            if (b.code.equals(code)) {
                System.out.println("Already exists.");
                return;
            }
        }
        t.add(new Book(code, title, qua, price));
    }
    
    public void displayAllBooks() {
        for (Book b : t) {
            System.out.println(b.code + ", " + b.title + ", " + b.qua + ", " + b.price);
        }
    }

    public void searchBook(String code) {
        for (Book b : t) {
            if (b.code.equals(code)) {
                System.out.println(b.code + ", " + b.title + ", " + b.qua + ", " + b.price);
                return;
            }
        }
        System.out.println("Not found.");
    }

    public void updateBookPrice(String code, double price) {
        for (Book b : t) {
            if (b.code.equals(code)) {
                b.price = price;
                return;
            }
        }
        System.out.println("Not found.");
    }

    public int findMaxPrice() {
        if (t.isEmpty()) {
            return -1;
        }
        double maxPrice = t.get(0).price;
        int maxIndex = 0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).price > maxPrice) {
                maxPrice = t.get(i).price;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public void sortAscendingByCode() {
        
    }

    public void removeBook(String code) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).code.equals(code)) {
                t.remove(i);
                return;
            }
        }
        System.out.println("Not found.");
    }
    
    public void loadDataFromFile() {
        
    }
    
}