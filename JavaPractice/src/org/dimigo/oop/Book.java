package org.dimigo.oop;

public class Book {
    // 필드
    private String title = "수학의 바이블";
    private String author = "김재영";
    private int page = 100;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        if(page > 0)
        this.page = page;
    }

    public String toString() {
        return "책제목: " + title + ", 저자명: " +author + ", 페이지수: " + page;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", page=" + page +
//                '}';
//    }
}
