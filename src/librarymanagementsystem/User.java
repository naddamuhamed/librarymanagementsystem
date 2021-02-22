/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;


import java.util.*;
import java.io.*;
import javax.swing.*;
import java.io.Serializable;
import static java.lang.System.exit;

import com.placeholder.PlaceHolder;


import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static librarymanagementsystem.Librarymanagementsystem.booksarr;
import static librarymanagementsystem.Librarymanagementsystem.updatebook;
import static librarymanagementsystem.Librarymanagementsystem.updateuser;
import static librarymanagementsystem.Librarymanagementsystem.usersarr;



 class UserGUI 
    extends JFrame 
    implements ActionListener { 
    PlaceHolder p1, p2 ,p3 ,p4, p5, p6;
    // Components of the Form 
    private Container c; 
    private JLabel title; 
    
    private JLabel lbook; 
    private JTextField bookID; 
    private JButton Search;   
    
    private JLabel luser; 
    private JTextField userID; 
    private JButton SearchUSER;
    
    private JLabel rent; 
    private JTextField rentID;
    private JTextField rentUSERID;
    private JButton rentBTN; 
    
    private JLabel Buylabel; 
    private JTextField BuyID;
    private JTextField BuyUSERID;
    private JButton BuyBTN;
    
    private JLabel Returnlabel; 
    private JTextField ReturnID;
    private JTextField ReturnUSERID;
    private JButton ReturnBTN;       

    private JButton exit;   
    private JLabel bg;
 
    public UserGUI() 
    { 

        setTitle("User Panel"); 
        setBounds(300, 90, 600, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); 
        
        
   
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("User Panel"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(220, 30); 
        c.add(title); 
  
        lbook = new JLabel("Search Book:"); 
        lbook.setFont(new Font("Arial", Font.PLAIN, 20)); 
        lbook.setSize(140, 20); 
        lbook.setLocation(100, 100); 
        c.add(lbook); 
  
        bookID = new JTextField(); 
        bookID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        bookID.setSize(140, 20); 
        bookID.setLocation(220, 100); 
        p1=new PlaceHolder(bookID,"Enter Book ID");
        c.add(bookID); 
        
                
        Search = new JButton("Search"); 
        Search.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Search.setSize(100, 20); 
        Search.setLocation(370, 100); 
        Search.addActionListener(this); 
        c.add(Search); 
        
        luser = new JLabel("Search User:"); 
        luser.setFont(new Font("Arial", Font.PLAIN, 20)); 
        luser.setSize(140, 20); 
        luser.setLocation(100, 150); 
        c.add(luser); 
  
        userID = new JTextField(); 
        userID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        userID.setSize(140, 20); 
        userID.setLocation(220, 150);
        p2=new PlaceHolder(userID,"Enter User ID");        
        c.add(userID); 
        
        SearchUSER = new JButton("Search"); 
        SearchUSER.setFont(new Font("Arial", Font.PLAIN, 15)); 
        SearchUSER.setSize(100, 20); 
        SearchUSER.setLocation(370, 150); 
        SearchUSER.addActionListener(this); 
        c.add(SearchUSER); 
  
        rent = new JLabel("Rent book:"); 
        rent.setFont(new Font("Arial", Font.PLAIN, 20)); 
        rent.setSize(140, 20); 
        rent.setLocation(100, 200); 
        c.add(rent); 
  
        rentID = new JTextField(); 
        rentID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        rentID.setSize(100, 20); 
        rentID.setLocation(220, 200); 
        p3=new PlaceHolder(rentID,"Enter Book ID");
        c.add(rentID); 
        
        rentUSERID = new JTextField(); 
        rentUSERID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        rentUSERID.setSize(100, 20); 
        rentUSERID.setLocation(325, 200); 
        p4=new PlaceHolder(rentUSERID,"Enter User ID");
        c.add(rentUSERID); 
        
        rentBTN = new JButton("Rent"); 
        rentBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        rentBTN.setSize(100, 20); 
        rentBTN.setLocation(430, 200); 
        rentBTN.addActionListener(this); 
        c.add(rentBTN);
        
        lbook = new JLabel("Buy Book:"); 
        lbook.setFont(new Font("Arial", Font.PLAIN, 20)); 
        lbook.setSize(140, 20); 
        lbook.setLocation(100, 250); 
        c.add(lbook); 
  
        BuyID = new JTextField(); 
        BuyID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        BuyID.setSize(100, 20); 
        BuyID.setLocation(220, 250); 
        p5=new PlaceHolder(BuyID,"Enter Book ID");
        c.add(BuyID);
        
        BuyUSERID = new JTextField(); 
        BuyUSERID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        BuyUSERID.setSize(100, 20); 
        BuyUSERID.setLocation(325, 250); 
        p5=new PlaceHolder(BuyUSERID,"Enter User ID");
        c.add(BuyUSERID);   
        
        BuyBTN = new JButton("Buy"); 
        BuyBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        BuyBTN.setSize(100, 20); 
        BuyBTN.setLocation(430, 250); 
        BuyBTN.addActionListener(this); 
        c.add(BuyBTN);
        
        Returnlabel = new JLabel("Return Book:"); 
        Returnlabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Returnlabel.setSize(140, 20); 
        Returnlabel.setLocation(100, 300); 
        c.add(Returnlabel); 
  
        ReturnID = new JTextField(); 
        ReturnID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ReturnID.setSize(100, 20); 
        ReturnID.setLocation(220, 300); 
        p5=new PlaceHolder(ReturnID,"Enter Book ID");
        c.add(ReturnID);
        
        ReturnUSERID = new JTextField(); 
        ReturnUSERID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ReturnUSERID.setSize(100, 20); 
        ReturnUSERID.setLocation(325, 300); 
        p5=new PlaceHolder(ReturnUSERID,"Enter User ID");
        c.add(ReturnUSERID);   
        
        ReturnBTN = new JButton("Return"); 
        ReturnBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ReturnBTN.setSize(100, 20); 
        ReturnBTN.setLocation(430, 300); 
        ReturnBTN.addActionListener(this); 
        c.add(ReturnBTN);

        exit = new JButton("Exit"); 
        exit.setFont(new Font("Arial", Font.PLAIN, 15)); 
        exit.setSize(100, 20); 
        exit.setLocation(220, 330); 
        exit.addActionListener(this); 
        c.add(exit);          
        
        
        

  
        setVisible(true); 
        requestFocusInWindow();
          
        
    } 

    public void actionPerformed(ActionEvent e) 
    { User u=new User();
        if (e.getSource() == Search) { 
            
             u.searchbook(bookID.getText(), booksarr);
               String def = ""; 
            bookID.setText(def); 
        }
        else if (e.getSource() == SearchUSER){

            
        u.searchuser(userID.getText(), usersarr);
                 String def = ""; 
            userID.setText(def);
            
        }
        
        else if (e.getSource() == rentBTN){
            
            booksarr=u.rent(rentID.getText(), rentUSERID.getText(), usersarr, booksarr);
            String def = ""; 
            rentID.setText(def); 
            rentUSERID.setText(def);
            
        }
        else if (e.getSource() == BuyBTN){
            
            booksarr=u.buy(BuyID.getText(), BuyUSERID.getText(), usersarr, booksarr);
                      
            Librarian l=new Librarian();
            Librarian.setBooksarr(booksarr);
            Librarian.setUsersarr(usersarr);
            // booksarr= l.removeBook(BuyID.getText());
            String def = ""; 
            BuyID.setText(def); 
            BuyUSERID.setText(def); 
        }
        else if (e.getSource() == ReturnBTN){
            booksarr=u.returnbook(ReturnID.getText(), ReturnUSERID.getText(), usersarr, booksarr);
            String def = "";  
            ReturnID.setText(def); 
            ReturnUSERID.setText(def); 
        }
                else if (e.getSource() == exit){
        try {
            updatebook(booksarr);
        } catch (IOException ex) {
            Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            updateuser(usersarr);
        } catch (IOException ex) {
            Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
                    exit(0);
        }
    } 
} 

// END OF GUI
public class User implements Serializable{
    
      private String firstName;
    private String lastName;
    protected String address;
    protected String cellPhone;
    protected String email;
   private boolean blocked;
  private  String ID;
    private String password;
    private boolean isadmin;
     
    public User(){
        ID=null;
        password=null;
        firstName=null;
        lastName=null;
        address=null;
        cellPhone=null;
        email=null;
        blocked=false;
        isadmin=false;

    }

    public User(String firstName, String lastName, String address, String cellPhone, String email, boolean blocked, String ID, String password,boolean admin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.blocked = blocked;
        this.ID = ID;
        this.password = password;
        this.isadmin=admin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }
  
    public  void verifyLogin(String id, String Pass ,ArrayList<User> arr){
        boolean found=false;
         for(int i=0;i<arr.size();i++){
             if(arr.get(i).getID().equals(id)&&arr.get(i).getPassword().equals(Pass)){  
                 System.out.println("logged in!");
                 found=true;
                 break;
             }
                 
         } 
         if (!found)
             System.out.println("can't login!,wrong password or ID");
    
        
        
       
    }      
          
        
  public void searchbook(String ISBN,ArrayList<Books> booksarr){

      
       boolean found=false;
         for(int i=0;i<booksarr.size();i++){
             if(booksarr.get(i).getISBN().equals(ISBN)){
                 
                 found=true;
                 JOptionPane.showMessageDialog(null,"ISBN: "+booksarr.get(i).getISBN()+"\nTitle: "+booksarr.get(i).getTitle()+"\nAuthor: "+booksarr.get(i).getAuthor()+"\nLocation: "+booksarr.get(i).getLocation()+"\nGenre: "+booksarr.get(i).getGenre()+"\nPrice: "+booksarr.get(i).getPrice()+"$");
                 break;
             }
                 
         } 
         if (!found)
             JOptionPane.showMessageDialog(null,"Book not found!");
      
  }
  public void searchuser(String id,ArrayList<User> arr){
       boolean found=false;
         for(int i=0;i<arr.size();i++){
             if(arr.get(i).getID().equals(id)){
                 JOptionPane.showMessageDialog(null,"First name: "+arr.get(i).getFirstName()+"\nLast name: "+arr.get(i).getLastName()+"\nID: "+arr.get(i).getID());

                 found=true;
                 break;
             }
                 
         } 
         if (!found)
                          JOptionPane.showMessageDialog(null,"User not found!");
           //  System.out.println("User not found!");
  }
  public ArrayList<Books> rent(String isbn, String id,ArrayList<User> arr,ArrayList<Books> booksarr){
       boolean found=false;
       Request r=new Request();
       String idd=null;
       String is=null;
   
         for(int i=0;i<arr.size();i++){
             if(arr.get(i).getID().equals(id)){  
//                 System.out.println("logged in!");

            if(arr.get(i).isBlocked()==true){
              JOptionPane.showMessageDialog(null,"you're blocked, you can't rent books!");
              //System.out.println("you're blocked, you can't rent books");
              return booksarr;
            }
idd=arr.get(i).getID();
//r.setID(arr.get(i).getID());
                 found=true;
                 break;
             }
                 
         } 
         if (!found){
             JOptionPane.showMessageDialog(null,"Wrong ID!");
             //System.out.println("wrong ID");
             return booksarr;
         }
         found=false;
          for(int i=0;i<booksarr.size();i++){
             if(booksarr.get(i).getISBN().equals(isbn)){  
                if(booksarr.get(i).isRent()==true){
                    JOptionPane.showMessageDialog(null,"book already rented,cant't rent the book");
              //      System.out.println("book already rented,cant't rent the book");
                   break;
                
                }
                else{
                    booksarr.get(i).setRent(true);
                    is=booksarr.get(i).getISBN();
//                    r.setISBN(booksarr.get(i).getISBN());
                }
                    
//                 System.out.println("logged in!");
                 found=true;
                 break;
             }     
         }
          
           if (!found){
               JOptionPane.showMessageDialog(null,"wrong ISBN!");
             //System.out.println("wrong ISBN");

           }
           else{
               r.addrenter(idd,is);
               Borrow b=new Borrow();
           }
           
             return booksarr;
         
//search(ISBN);
//search(ID);
//setID and setISBN fl request
//numofcopies--
//add to    rent file with duedate and request date

                      
  }
  public void addBookOrderList(String ISBN, String ID){
      //add to file bany2adm da 3ayz elktab da awl m yigy
  }


     public ArrayList<Books> buy(String isbn,String id,ArrayList<User> arr,ArrayList<Books> booksarr){
            boolean found=false;    
            double p = 0;
         for(int i=0;i<arr.size();i++){
             if(arr.get(i).getID().equals(id)){  
//                 System.out.println("logged in!");

                 found=true;
                 break;
             }
                 
         } 
         if (!found){
             JOptionPane.showMessageDialog(null,"Wrong ID!.");
             //System.out.println("wrong ID");
             return booksarr;
         }
       
         found=false;
          for(int i=0;i<booksarr.size();i++){
             if(booksarr.get(i).getISBN().equals(isbn)){  
                  if(booksarr.get(i).isRent()==true){
                      JOptionPane.showMessageDialog(null,"book already rented,cant't buy the book");
                    //System.out.println("book already rented,cant't buy the book");
                    break;
                }
                  else{      
              p=  booksarr.get(i).getPrice();
              booksarr.remove(i);
                  }
            
                 found=true;
                 break;
             }  
         }
          if (!found){
             JOptionPane.showMessageDialog(null,"Wrong ID!.");
             return booksarr;
          }
              else{
//              Request r=new Request();
//              r.setPrice(p);
              Buy b=new Buy(p);
          } 
          
          return booksarr;

//super.search(ISBN);
//super.search(ID);
//setID and setISBN and setPrice fl request
//number of copies--
   }
    
    public ArrayList<Books> returnbook(String isbn,String id,ArrayList<User> arr,ArrayList<Books> booksarr){
      boolean found=false;
   String s = null;
//   Request r=new Request();
         for(int i=0;i<arr.size();i++){
             if(arr.get(i).getID().equals(id)){  
                 s=arr.get(i).getID();
                 found=true;
                 break;
             }
                 
         } 
         if (!found){
             JOptionPane.showMessageDialog(null,"Wrong ID!.");
             return booksarr;
         }
         found=false;
          for(int i=0;i<booksarr.size();i++){
             if(booksarr.get(i).getISBN().equals(isbn)){  
               
                    booksarr.get(i).setRent(false);
                 JOptionPane.showMessageDialog(null,"book returned successfully!");   
                 //System.out.println("book returned successfully!");
                 found=true;
                 break;
             }     
         }
          
           if (!found){
             JOptionPane.showMessageDialog(null,"wrong ISBN!"); 
             //System.out.println("wrong ISBN");
             return booksarr;
           }
//           else{
//               r.removerenter(s);
//           }

             return booksarr;
    }    
}