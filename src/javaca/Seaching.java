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

//Linear Search 

public class Seaching {
    
    // search books by title
     public void searchBookByTitle(ArrayList <Books> book, String info){
        boolean found = false;
        for(Books b: book){
           if(b.getTitle().equalsIgnoreCase(info)){
               System.out.println(b);
              found = true;
           }  
        }
        if(found== false){
            System.out.println("Book not found");
        }
       
    }
     
     //search book by author
    public void searchByAuthor(ArrayList <Books> book, String info){
        boolean found = false;
        for(Books b: book){
           if(b.getAuthor().equalsIgnoreCase(info)){
               System.out.println(b);
              found = true;
           }  
        }
        if(found== false){
            System.out.println("Author not found");
        }       
    }
    //search user by name
    public void searchUsersByName(ArrayList<Reader> reader, String name) {
        boolean found = false;
        for (Reader r : reader) {
            if (r.getName().equalsIgnoreCase(name)) {
                System.out.println(r);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Reader not found");
            
        }
        
    }
//search users using ID
    public void searchUsersById(ArrayList<Reader> reader, int id) {
        boolean found = false;
        for (Reader r : reader) {
            if (r.getId() == id) {
                System.out.println(r);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Reader not found");
            
        }
        
    }
    
}
