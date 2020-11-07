/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaca;

import java.util.ArrayList;

/**
 *
 * @author juciely
 */

// Methods bubble sort 


public class Sorting {
    
    //sort all books by title
        public ArrayList<Books> sortBooksByTitle(ArrayList<Books> books) {

        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() - 1; j++) {
                if (books.get(j).getTitle().compareTo(books.get(j +1).getTitle()) > 0) {
                    Books temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }
// sort the users by ID
    public ArrayList<Reader> sortUsersById(ArrayList<Reader> reader) {
        for (int i = 0; i < reader.size(); i++) {
            for (int j = 0; j < reader.size() - 1; j++) {
                if (reader.get(j).getId() > reader.get(j + 1).getId()) {
                    Reader temp = reader.get(j);
                    reader.set(j, reader.get(j + 1));
                    reader.set(j + 1, temp);
                }
            }
        }
        return reader;
    }
    // sort books by author name
         public ArrayList<Books> sortBooksByAuthor(ArrayList<Books> books) {

        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() - 1; j++) {
                if (books.get(j).getAuthor().compareTo(books.get(j +1).getAuthor()) > 0) {
                    Books temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
         }
         //sort use by name
        public ArrayList<Reader> sortUsersByName(ArrayList<Reader> reader) {

        for (int i = 0; i < reader.size(); i++) {
            for (int j = 0; j <reader.size() - 1; j++) {
                if (reader.get(j).getName().compareTo(reader.get(j +1).getName()) > 0) {
                   Reader temp = reader.get(j);
                    reader.set(j, reader.get(j + 1));
                    reader.set(j + 1, temp);
                }
            }
        }
        return reader;
    }
}
