package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer {
    private int currentPage = 0;
    private Book book;

    public Printer(Book book) {
        this.book = book;
    }

    public String printAllPages() {
        StringBuilder allPages = new StringBuilder();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages.append(page.getKey()).append(" ").append(page.getValue());
        }
        return allPages.toString();
    }

    public String getCurrentPageContents() {
        return book.getPages().get(currentPage);
    }

    public void turnPage() {
        currentPage ++;
    }
    
    public void printCurrentPage() {
        System.out.println(book.getPages().get(currentPage));
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setCurrentPage(int number) {
        currentPage = number;
    }
}
