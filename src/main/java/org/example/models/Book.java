package org.example.models;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Book {

    private int book_id;

    private int person_id;

    @Size(min = 2, max = 30, message = "Название должно быть не менее 2 и не более 30 символов.")
    private String book_title;

    @Pattern(regexp = "[A-ZА-Я]\\D+ [A-ZА-Я]\\D+",
            message = "Введите автора книги в правильном формате (Иванов Иван)")
    private String book_author;

    @Range(min = 1900, max = 2022, message = "Год издания книги должен быть в правильном формате (2022")
    private int book_year_published;

    public Book() {
    }

    public Book(int book_id, int person_id, String book_title, String book_author, int book_year_published) {
        this.book_id = book_id;
        this.person_id = person_id;
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_year_published = book_year_published;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public int getBook_year_published() {
        return book_year_published;
    }

    public void setBook_year_published(int book_year_published) {
        this.book_year_published = book_year_published;
    }
}
