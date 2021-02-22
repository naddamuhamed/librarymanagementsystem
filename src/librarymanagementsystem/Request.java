/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.Serializable;


public class Request implements Serializable{
    private String ID;
    private String ISBN;
    private LocalDate requestDate= LocalDate.now();
    private LocalDate dueDate= requestDate.plusDays(2);
    private static ArrayList<Request> renters=new ArrayList();
 public Request(){
     ID=null;
     ISBN=null;
     
 }
    
    public Request(String ID, String ISBN) {
        this.ID = ID;
        this.ISBN = ISBN;
        
        
    }
    /**
     *
     * @param id
     * @param isbn
     */
    public void addrenter(String id, String isbn){
    Request r=new Request( id, isbn);
    r.setRequestDate(requestDate);
    r.setDueDate(dueDate);
    renters.add(r);
}
public void removerenter(String id){
     boolean found=false;
         for(int i=0;i<renters.size();i++){
             if(renters.get(i).getID().equals(ID)){
                 renters.remove(i);
                 found=true;
                 break;
             }
                 
         } 
         if (!found)
             System.out.println("user not found to be removed!");    
}
public ArrayList<User> blocklate(ArrayList<User> u){
      boolean found=false;
      Librarian l=new Librarian ();
        
         for(int i=0;i<renters.size();i++){
             if(renters.get(i).getDueDate().compareTo(requestDate)<0){
                 u=l.toggleblock(renters.get(i).getID());
                 found=true;
                
             }
                 
         } 
         if (!found)
             System.out.println("no late users!");
         else
             System.out.println("all late users have been blocked!");
         return u;
    
}
public void updaterenter() throws FileNotFoundException, IOException{
     FileOutputStream o=null;
      
            
            File file=new File("Renters.bin");
            
            
            o = new FileOutputStream(file,false);
           
                ObjectOutputStream ob=new ObjectOutputStream(o);
                ob.writeObject(renters);
                ob.close();
                o.close();
}
public void readrenter() throws FileNotFoundException, IOException, ClassNotFoundException{
    File f=new File("Renters.bin");
ObjectInputStream o = new 
ObjectInputStream( 
new FileInputStream(f));
renters=(ArrayList<Request>) o.readObject();
o.close();
}

    public static ArrayList<Request> getRenters() {
        return renters;
    }

    public static void setRenters(ArrayList<Request> renters) {
        Request.renters = renters;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
