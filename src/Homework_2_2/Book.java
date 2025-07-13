package Homework_2_2;

import java.time.LocalDate;

public class Book{
    
    public Book(String Title,LocalDate DateOfPublication,int PagesCount) {
        this.Title=Title;
        this.DateOfPublication=DateOfPublication;
        this.PagesCount=PagesCount;
    }
    private int PagesCount;
    private LocalDate DateOfPublication;
    private String Title;

    public int getPagesCount() {
        return PagesCount;
    }

    public void setPagesCount(int pagesCount) {
        PagesCount = pagesCount;
    }

    public LocalDate getDateOfPublication() {
        return DateOfPublication;
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        DateOfPublication = dateOfPublication;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
