/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaca;

/**
 *
 * @author juciely
 */

public class Books {
    private int id = 0;
    private String title;
    private String author;
    private int year;
    
    public Books(int id, String title, String author, int year){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }   
    
    @Override
    public String toString(){
        return "\n"+
                "Id: "+getId()+"\n"+
               "*Book title: "+getTitle()+
               " *Name of author: "+getAuthor()+"\n"+
               "year: "+getYear()+"\n";
    }

    //return ID
    public int getId() {
        return id;
    }

    // set ID 
    public void setId(int id) {
        this.id = id;
    }

    // return the title
    public String getTitle() {
        return title;
    }

    // set title
    public void setTitle(String title) {
        this.title = title;
    }

    // return author
    public String getAuthor() {
        return author;
    }

    //set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // return the year
    public int getYear() {
        return year;
    }

    // set year
    public void setYear(int year) {
        this.year = year;
    }   
}
