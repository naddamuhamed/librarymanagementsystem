/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import com.placeholder.PlaceHolder;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.io.Serializable;
import static java.lang.System.exit;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static librarymanagementsystem.Librarymanagementsystem.booksarr;
import static librarymanagementsystem.Librarymanagementsystem.updatebook;
import static librarymanagementsystem.Librarymanagementsystem.updateuser;
import static librarymanagementsystem.Librarymanagementsystem.usersarr;




 class AdminGUI 
    extends JFrame 
    implements ActionListener { 
    PlaceHolder p1, p2 ,p3 ,p4, p5, p6;
    // Components of the Form 
    private Container c; 
    private JLabel title; 
    
    private JLabel addbooklabel; 
    private JButton addBookBTN;   
    
    private JLabel removeBooklabel; 
    private JButton removeBookBTN;
    
    private JLabel addUserLabel; 
    private JButton addUserBTN; 
    
    private JLabel BlockUserLabel; 
    private JButton BlockUserBTN;
    
    private JLabel SearchBookJL; 
    private JButton SearchBookJBTN;
    
    private JLabel SearchUserJL; 
    private JButton SearchUserJBTN;  

    private JLabel RentBookJL; 
    private JButton RentBookJBTN; 
    
    private JLabel BuyBookJL; 
    private JButton BuyBookJBTN;   
    
    private JLabel ReturnBookJL; 
    private JButton ReturnBookJBTN;     
    
    private JLabel RemoveUserJL; 
    private JButton RemoveUserJBTN;   

    private JButton exit;       
 

    public AdminGUI() 
    { 

        setTitle("Menu admin"); 
        setSize(450, 470);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setResizable(false); 
        
   
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("You entered as admin"); 
        title.setFont(new Font("TimesRoman",Font.PLAIN,25)); 
        title.setSize(250,30);
        title.setLocation(90,5);
        c.add(title); 
  
        addbooklabel = new JLabel("To add book press :"); 
        addbooklabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addbooklabel.setSize(200, 20); 
        addbooklabel.setLocation(30, 50); 
        c.add(addbooklabel); 
                       
        addBookBTN = new JButton("Add"); 
        addBookBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        addBookBTN.setSize(100, 20); 
        addBookBTN.setLocation(250, 50); 
        addBookBTN.addActionListener(this); 
        c.add(addBookBTN); 
        
        removeBooklabel = new JLabel("To remove book press :"); 
        removeBooklabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        removeBooklabel.setSize(220, 20); 
        removeBooklabel.setLocation(30,80);
        c.add(removeBooklabel); 
        
        SearchBookJL = new JLabel("To search book press :"); 
        SearchBookJL.setFont(new Font("Arial", Font.PLAIN, 20)); 
        SearchBookJL.setSize(220, 20); 
        SearchBookJL.setLocation(30, 110); 
        c.add(SearchBookJL); 
        
        SearchBookJBTN = new JButton("Search"); 
        SearchBookJBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        SearchBookJBTN.setSize(100, 20); 
        SearchBookJBTN.setLocation(250, 110); 
        SearchBookJBTN.addActionListener(this); 
        c.add(SearchBookJBTN);
  
        removeBookBTN = new JButton("Remove"); 
        removeBookBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        removeBookBTN.setSize(100, 20); 
        removeBookBTN.setLocation(250, 80); 
        removeBookBTN.addActionListener(this); 
        c.add(removeBookBTN); 
  
        addUserLabel = new JLabel("To add user press :"); 
        addUserLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addUserLabel.setSize(220, 20); 
        addUserLabel.setLocation(30, 170); 
        c.add(addUserLabel); 
        
        addUserBTN = new JButton("Add"); 
        addUserBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        addUserBTN.setSize(100, 20); 
        addUserBTN.setLocation(250, 170); 
        addUserBTN.addActionListener(this); 
        c.add(addUserBTN);
        
        BlockUserLabel = new JLabel("To block user press :"); 
        BlockUserLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        BlockUserLabel.setSize(220, 20); 
        BlockUserLabel.setLocation(30, 140); 
        c.add(BlockUserLabel); 
         
        BlockUserBTN = new JButton("Block"); 
        BlockUserBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        BlockUserBTN.setSize(100, 20); 
        BlockUserBTN.setLocation(250, 140); 
        BlockUserBTN.addActionListener(this); 
        c.add(BlockUserBTN);
                
        SearchUserJL = new JLabel("To search user press :"); 
        SearchUserJL.setFont(new Font("Arial", Font.PLAIN, 20)); 
        SearchUserJL.setSize(220, 20); 
        SearchUserJL.setLocation(30, 200); 
        c.add(SearchUserJL); 
        
        SearchUserJBTN = new JButton("Search"); 
        SearchUserJBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        SearchUserJBTN.setSize(100, 20); 
        SearchUserJBTN.setLocation(250, 200); 
        SearchUserJBTN.addActionListener(this); 
        c.add(SearchUserJBTN);
 
        RentBookJL = new JLabel("To rent book press :"); 
        RentBookJL.setFont(new Font("Arial", Font.PLAIN, 20)); 
        RentBookJL.setSize(220, 20); 
        RentBookJL.setLocation(30, 230); 
        c.add(RentBookJL); 
    
        
        RentBookJBTN = new JButton("Rent"); 
        RentBookJBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        RentBookJBTN.setSize(100, 20); 
        RentBookJBTN.setLocation(250, 230); 
        RentBookJBTN.addActionListener(this); 
        c.add(RentBookJBTN);

        BuyBookJL = new JLabel("To Buy book for user :"); 
        BuyBookJL.setFont(new Font("Arial", Font.PLAIN, 20)); 
        BuyBookJL.setSize(220, 20); 
        BuyBookJL.setLocation(30, 260); 
        c.add(BuyBookJL); 
        
        BuyBookJBTN = new JButton("Buy"); 
        BuyBookJBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        BuyBookJBTN.setSize(100, 20); 
        BuyBookJBTN.setLocation(250, 260); 
        BuyBookJBTN.addActionListener(this); 
        c.add(BuyBookJBTN);
        
        RemoveUserJL = new JLabel("To remove user press :"); 
        RemoveUserJL.setFont(new Font("Arial", Font.PLAIN, 20)); 
        RemoveUserJL.setSize(220, 20); 
        RemoveUserJL.setLocation(30, 290); 
        c.add(RemoveUserJL); 
        
        RemoveUserJBTN = new JButton("Remove"); 
        RemoveUserJBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        RemoveUserJBTN.setSize(100, 20); 
        RemoveUserJBTN.setLocation(250, 290); 
        RemoveUserJBTN.addActionListener(this); 
        c.add(RemoveUserJBTN);

        ReturnBookJL = new JLabel("To return book press :"); 
        ReturnBookJL.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ReturnBookJL.setSize(220, 20); 
        ReturnBookJL.setLocation(30, 320); 
        c.add(ReturnBookJL); 
        
        ReturnBookJBTN = new JButton("Return"); 
        ReturnBookJBTN.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ReturnBookJBTN.setSize(100, 20); 
        ReturnBookJBTN.setLocation(250, 320); 
        ReturnBookJBTN.addActionListener(this); 
        c.add(ReturnBookJBTN);
        
        exit = new JButton("Exit"); 
        exit.setFont(new Font("Arial", Font.PLAIN, 25)); 
        exit.setSize(100, 30); 
        exit.setLocation(150, 370); 
        exit.addActionListener(this); 
        c.add(exit);          
        
        
        setVisible(true); 
        requestFocusInWindow();
    } 



    public void actionPerformed(ActionEvent e) 
    { User u=new User();
    Librarian l=new Librarian();
        if (e.getSource() == addBookBTN) { 

                     String ISBN;
        ISBN=JOptionPane.showInputDialog("enter the ISBN of the book ");
         String title;
        title=JOptionPane.showInputDialog("enter the title of the book ");
        String author;
        author=JOptionPane.showInputDialog("enter the author of the book");
         String location;
        location=JOptionPane.showInputDialog("enter the location of the book");
         String genre;
        genre=JOptionPane.showInputDialog("enter the genre of the book");
         String price ;
        price=JOptionPane.showInputDialog("enter the price of the book");
        double xprice= Double.parseDouble(price);
        l.addBook(ISBN, title, author, location, genre, xprice, false);
            

        }
        else if (e.getSource() == removeBookBTN){
                     String ISBN;
        ISBN=JOptionPane.showInputDialog("enter the ISBN of the book ");
        try {
            l.removeBook(ISBN);
        } catch (IOException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        } 
         else if (e.getSource() == SearchBookJBTN){
         String ID;
        ID=JOptionPane.showInputDialog("enter book ISBN ");

        u.searchbook(ID, booksarr);

        } 
         else if (e.getSource() == BlockUserBTN){
         String ID;
        ID=JOptionPane.showInputDialog("enter user ID ");

        l.toggleblock(ID);

        }
        else if (e.getSource() == addUserBTN){
         String fname;
        fname=JOptionPane.showInputDialog("enter first name ");
         String lname;
        lname=JOptionPane.showInputDialog("enter last name ");
        String address;
        address=JOptionPane.showInputDialog("enter address");
         String cellphone;
        cellphone=JOptionPane.showInputDialog("enter cellphone");
         String mail;
        mail=JOptionPane.showInputDialog("enter E-mail");
         String ID;
        ID=JOptionPane.showInputDialog("enter ID ");
          String password;
        password=JOptionPane.showInputDialog("enter password ");
        l.addUser(fname, lname, address, cellphone, mail, false, ID, password,false);

        } 
         else if (e.getSource() == SearchUserJBTN){
         String ID;
        ID=JOptionPane.showInputDialog("enter user ID ");

        u.searchuser(ID, usersarr);

        }
        else if (e.getSource() == RentBookJBTN){
        String ID;
        ID=JOptionPane.showInputDialog("enter ID of user ");
         String ISBN;
        ISBN=JOptionPane.showInputDialog("enter ISBN of the book ");
                    booksarr=u.rent(ISBN, ID, usersarr, booksarr);

        }
         else if (e.getSource() == BuyBookJBTN){
        String ID;
        ID=JOptionPane.showInputDialog("enter ID of user ");
        String ISBN;
        ISBN=JOptionPane.showInputDialog("enter ISBN of the book ");
        u.buy(ISBN, ID, usersarr, booksarr);
        
        
        }
         else if (e.getSource() == RemoveUserJBTN){
        String ID;
        ID=JOptionPane.showInputDialog("enter ID of user ");
        usersarr=l.removeUser(ID);
        
        
        }
         else if (e.getSource() == ReturnBookJBTN){
        String ID;
        ID=JOptionPane.showInputDialog("enter ID of user ");
        String ISBN;
        ISBN=JOptionPane.showInputDialog("enter ISBN ");
        u.returnbook(ISBN, ID, usersarr, booksarr);
        
        
        }         
                else if (e.getSource() == exit){
        try {
            updatebook(booksarr);
        } catch (IOException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            updateuser(usersarr);
        } catch (IOException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
                    exit(0);
        }
    } 
} 

// END OF GUI

public class Librarian extends User implements Serializable{
    private static ArrayList<Books> booksarr=new ArrayList();
    private static ArrayList<User> usersarr=new ArrayList();
    public Librarian(){
    super();
}
    public Librarian(String firstName, String lastName, String address, String cellPhone, String email, boolean blocked, String ID, String password,boolean admin) {
        super(firstName,lastName,address,cellPhone,email,blocked,ID,password,admin);
    }
    public ArrayList<Books> addBook(String ISBN, String Title, String Author, String Location, String Genre, double Price, boolean rent) {
         Books b=new Books(ISBN,Title,Author,Location,Genre,Price,rent);
         JOptionPane.showMessageDialog(null,"Book added!");
         booksarr.add(b);
         return booksarr;
  
        
    }
    public ArrayList<Books> removeBook(String ISBN) throws IOException{

      boolean found=false;
         for(int i=0;i<booksarr.size();i++){
             if(booksarr.get(i).getISBN().equals(ISBN)){
                 booksarr.remove(i);
                 found=true;
                 JOptionPane.showMessageDialog(null,"Book found and removed!");
                 break;
             }
         } 
         if (!found)
             JOptionPane.showMessageDialog(null,"Book not found to be removed!");
         return booksarr;
    }
    public ArrayList<User> addUser(String firstName, String lastName, String address, String cellPhone, String email, boolean blocked, String ID, String password,boolean admin){
        User u=new User(firstName,  lastName,  address,  cellPhone,  email,  blocked,  ID,  password,admin);
       usersarr.add(u);
       return usersarr;
       
    }       
    public ArrayList<User> removeUser(String ID){
         boolean found=false;
         for(int i=0;i<usersarr.size();i++){
             if(usersarr.get(i).getID().equals(ID)){
                 usersarr.remove(i);
                 found=true;
                JOptionPane.showMessageDialog(null,"user removed!");       
                 break;
             }
                 
         } 
         if (!found)
             JOptionPane.showMessageDialog(null,"user not found to be removed!");
         return usersarr;
    }
    public void removeBookOrderList(String ISBN,long ID){
    }
    public ArrayList<User> toggleblock(String ID){
         boolean found=false;
         for(int i=0;i<usersarr.size();i++){
             if(usersarr.get(i).getID().equals(ID)){
                 if(usersarr.get(i).isBlocked()==true){
                     usersarr.get(i).setBlocked(false);
                              JOptionPane.showMessageDialog(null,"User Unblocked!");}
                 else{                              
                     JOptionPane.showMessageDialog(null,"User blocked!");
                     usersarr.get(i).setBlocked(true);}
                 found=true;
                 break;
             }
                 
         } 
         if (!found)
             JOptionPane.showMessageDialog(null,"User not found to be blocked!");
         return usersarr;
    }

    public static ArrayList<Books> getBooksarr() {
        return booksarr;
    }

    public static void setBooksarr(ArrayList<Books> booksarr) {
        Librarian.booksarr = booksarr;
    }

    public static ArrayList<User> getUsersarr() {
        return usersarr;
    }

    public static void setUsersarr(ArrayList<User> usersarr) {
        Librarian.usersarr = usersarr;
    }

    ArrayList<Books> removeBook(JTextField BuyID, Object ISBN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    

    

   
    
}
