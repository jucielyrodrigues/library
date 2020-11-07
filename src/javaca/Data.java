/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author juciely
 */
public class Data { 
    
    public ArrayList<Books> loadBooks() throws FileNotFoundException {
        
        FileInputStream file = new FileInputStream("books.txt");
	String strline = "";
        ArrayList<Books> books = new ArrayList<Books>();
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
			strline = br.readLine();
			while (strline != null) {
				String[] parts = strline.split(",");
				books.add(new Books(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3])));
				
				strline = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
                }
        return books;
        }
    
    public ArrayList<Reader> loadReaders() throws FileNotFoundException{
         
        FileInputStream file = new FileInputStream("readers.txt");
	String strline = "";
        ArrayList<Reader> readers = new ArrayList<Reader>();
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
			strline = br.readLine();
			while (strline != null) {
				String[] parts = strline.split(",");
				readers.add(new Reader(Integer.parseInt(parts[0]), parts[1], parts[2]));
				
				strline = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
                }
        return readers;
        
    }
      public ArrayList<Borrows> listBorrows(int id) throws FileNotFoundException{
         
        FileInputStream file = new FileInputStream("borrows.txt");
	String strline = "";
        ArrayList<Borrows> borrows = new ArrayList<Borrows>();
        ArrayList<Borrows> newList = new ArrayList<Borrows>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
			strline = br.readLine();
			while (strline != null) {
				String[] parts = strline.split(",");
				borrows.add(new Borrows(Integer.parseInt(parts[0]), parts[1], parts[2]));
				
				strline = br.readLine();
			}
                        for (int i=0; i< borrows.size();i++){
                        if (id== borrows.get(i).readerId){
                            newList.add(borrows.get(i));
                        }
                            }
		} catch (IOException e) {
			e.printStackTrace();
                }
        return newList;
        
    }
    

    public String registerBorrow(String[] borrows) throws IOException{
        
        try{
       BufferedWriter writeBorrow = new BufferedWriter(new FileWriter("borrows.txt", true));
        writeBorrow.write(borrows[0] + "," + borrows[1]+","+ borrows[2]+"\n");
        writeBorrow.close();
        }catch(IOException e){
            System.out.println("An error has ocurred");
            e.printStackTrace();
        }
        
        return "Borrow Registered";
    }    
              
public String registerReturn(String[] returnArray) throws IOException{
        
        try{
       BufferedWriter writeBorrow = new BufferedWriter(new FileWriter("return.txt", true));
        writeBorrow.write(returnArray[0] + "," + returnArray[1]+","+ returnArray[2]+"\n");
        writeBorrow.close();
        }catch(IOException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
        
        return "Borrow Returned";
    }    
}
