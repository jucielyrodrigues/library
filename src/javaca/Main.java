/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaca;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juciely
 */
public class Main {

    /**
     * @param args the command line arguments
     */
         
        
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Data data = new Data();
       Sorting sort= new Sorting();
       Seaching seach= new Seaching();
      
       ArrayList<Books> myBooks = data.loadBooks();
       ArrayList<Reader> myReaders = data.loadReaders();
       Scanner sc = new Scanner(System.in);
       Boolean loop = true;
       do{
         
           System.out.println("Hello, Welcome to Juci's Library"+"\n");
           
           System.out.println("Please, SELECT one option"+"\n");
           
           System.out.println("1- Search for a book by Author ");
           System.out.println("2- Search for a book by Title");
           System.out.println("3- List all books by Author ");
           System.out.println("4- List all books by Title ");
           System.out.println("5- Search users by Name");
           System.out.println("6- Search users by Id");
           System.out.println("7- List user by Id");
           System.out.println("8- List user by Name ");
           System.out.println("9- Register a borrow");
           System.out.println("10- Return a book");
           System.out.println("11- List borrow by user ID");
           System.out.println("0- Exit");
          
           try{
               int input = Integer.parseInt(sc.nextLine());
               switch(input){
                   case 1:
                       System.out.println("Please type the author name:");
                       String author = sc.nextLine();                      
                       seach.searchByAuthor(myBooks, author);
                       
                        System.out.println("Press 0 to go back to main menu");
                        input =  Integer.parseInt(sc.nextLine());
                        
                       break;
                   case 2:
                       System.out.println("Please type the book title:");
                       String title = sc.nextLine();                      
                       seach.searchBookByTitle(myBooks, title);
                       
                       System.out.println("Press 0 to go back to main menu");
                        input =  Integer.parseInt(sc.nextLine());
                       break;
                   case 3:
                       System.out.println("Sorting all books by author:");
                       System.out.println(sort.sortBooksByAuthor(myBooks));
                       
                       System.out.println("Press 0 to go back to main menu");
                       input =  Integer.parseInt(sc.nextLine());
                       break;
                   case 4:
                       System.out.println("Sorting all books by title:");
                       System.out.println(sort.sortBooksByTitle(myBooks));
                       
                       System.out.println("Press 0 to go back to main menu");
                        input =  Integer.parseInt(sc.nextLine());
                        
                       break;
                   case 5: 
                       System.out.println("Type the user name:");
                       String readerName = sc.nextLine();                      
                       seach.searchUsersByName(myReaders, readerName);
                       break;
                   case 6:
                       System.out.println("Type the ID user:");
                       String readerId= sc.nextLine();
                       seach.searchUsersById(myReaders, Integer.parseInt(readerId));
                       System.out.println("Press 0 to go back to main menu");
                       input =  Integer.parseInt(sc.nextLine());
                        
                       break;
                   case 7:
                       System.out.println("List users by ID:");
                       System.out.println(sort.sortUsersById(myReaders));
                         
                        System.out.println("Press 0 to go back to main menu");
                        input =  Integer.parseInt(sc.nextLine());
                       break;
                   case 8:
                       System.out.println("List users by Name:");
                       System.out.println(sort.sortUsersByName(myReaders));
                       
                       System.out.println("Press 0 to go back to main menu");
                       input =  Integer.parseInt(sc.nextLine());
                       break;
                   case 9:
                       System.out.println("Type the ID user:");
                       String id=sc.nextLine();
                       System.out.println("Type the name of the book:");
                       String book= sc.nextLine();
                            
                       DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss");
                       LocalDateTime now= LocalDateTime.now();
                       String strDate= dt.format(now);
                           
                       String[] array = {id, book, strDate};
                       data.registerBorrow(array);
                       
                       System.out.println("Press 0 to go back to main menu");
                        input =  Integer.parseInt(sc.nextLine());
                       break;
                  case 10:
                       System.out.println("Type the ID user:");
                       String idReader=sc.nextLine();
                       System.out.println("Type the name of the book:");
                       String bookName= sc.nextLine();
                            
                       DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss");
                       LocalDateTime dateNow= LocalDateTime.now();
                       String dateF= date.format(dateNow);
                           
                       String[] returnArray = {idReader, bookName, dateF};
                       data.registerReturn(returnArray);
                       
                       System.out.println("Press 0 to go back to main menu");
                       input =  Integer.parseInt(sc.nextLine());
                       break;
                 case 11:
                       System.out.println("Type the ID user:");
                       String readIdBorrow=sc.nextLine();
                       System.out.println(data.listBorrows(Integer.parseInt(readIdBorrow)));
                       
                       System.out.println("Press 0 to go back to main menu");
                        input =  Integer.parseInt(sc.nextLine());
                       break;
                 case 0:
                       loop= false;
                       break;                   
               }
           }catch(NumberFormatException e){
               System.out.println(e);
           }
       }while(loop);
    }  
 
}   