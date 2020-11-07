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
public class Reader {
    private int id;
    private String name;
    private String address;
    
    public Reader(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    // return ID
    public int getId() {
        return id;
    }

    //set ID
    public void setId(int id) {
        this.id = id;
    }

    // return name
    public String getName() {
        return name;
    }

    // set name
    public void setName(String name) {
        this.name = name;
    }

    //return adress
    public String getAddress() {
        return address;
    }

    // set adress
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString (){
        return "Id: "+ id+ "\n"+
                "Name: "+name+ "\n"+
                "Address: "+address+ "\n";
    }
    
}
