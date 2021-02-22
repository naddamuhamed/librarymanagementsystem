/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class Librarymanagementsystem {
static ArrayList<Books> booksarr=new ArrayList();
static ArrayList<User> usersarr=new ArrayList();

public static ArrayList<Books> readbook(ArrayList<Books> arr) throws IOException, ClassNotFoundException{
    File f=new File("Books.bin");
ObjectInputStream o = new 
ObjectInputStream( 
new FileInputStream(f));
arr=(ArrayList<Books>) o.readObject();
o.close();
return arr;
}
public static void updatebook(ArrayList<Books> arr) throws FileNotFoundException, IOException{
     FileOutputStream o=null;
      
            
            File file=new File("Books.bin");
            
            
            o = new FileOutputStream(file,false);
           
                ObjectOutputStream ob=new ObjectOutputStream(o);
                ob.writeObject(arr);
                ob.close();
                o.close();
                
}
public static ArrayList<User> readuser(ArrayList<User> arr) throws IOException, ClassNotFoundException{
    File f=new File("Users.bin");
ObjectInputStream o = new 
ObjectInputStream( 
new FileInputStream(f));
arr=(ArrayList<User>) o.readObject();
o.close();
return arr;
}
public static void updateuser(ArrayList<User> arr) throws FileNotFoundException, IOException{
    FileOutputStream o=null;
      
            
            File file=new File("Users.bin");
            
            
            o = new FileOutputStream(file,false);
           
                ObjectOutputStream ob=new ObjectOutputStream(o);
                ob.writeObject(arr);
                ob.close();
                o.close();
}



    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException, ClassNotFoundException {
JFrame frame = new JFrame("Library Management System");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton Button = new JButton("Sign as Admin");
        JButton Button1 = new JButton("Sign as User");
        Button.setBounds(190, 250, 120, 30);
        Button1.setBounds(190, 200, 120, 30);
        frame.add(Button);
        frame.add(Button1);
        frame.setVisible(true);
        Button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             Object buttonpressed=e.getSource();   
             if(buttonpressed==Button){
                 frame.setVisible(false);
             AdminLogin AL=new AdminLogin();    
             
             }   

             
             
            }
        });   
        Button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             Object buttonpressed=e.getSource();   
             if(buttonpressed==Button1){
                 frame.setVisible(false);
             UserLogin UL=new UserLogin();    
             
             }   

             
             
            }
        });            

Librarian l=new Librarian();



booksarr=readbook(booksarr);
usersarr=readuser(usersarr);
Librarian.setBooksarr(booksarr);
Librarian.setUsersarr(usersarr);


//booksarr=l.addBook("3435", "A Tale Of Two Cities", "Charles Dickens", "History section", "Historic", 45.4, false);
//booksarr=l.addBook("54543","The Lost World","Arhtur Conan Doyle","Sci-Fi section","Science Fiction",69.3,true);
//booksarr=l.addBook("38473","The Merchant of Venice","William Shakespeare","Comedy section","Comedy",49.3,false);
//booksarr=l.addBook("30974", "Macbeth", "William Shakespear", "Tragedy section", "Tragedy", 80.5, false);
//booksarr=l.addBook("46543", "The Woman in White", "Wilkie Collins", "Mystery section", "Mystery", 40.5, false);
//booksarr=l.addBook("3907432", "The Taming of The Shrew", "William Shakespeare", "Comedy section", "Comedy", 55.7, false);
//usersarr=l.addUser("Nada", "Muhamed", "maadi", "01113454334", "nada@gmail.com", false, "0345", "1234",true);
//usersarr=l.addUser("Adham", "Sherbiny", "obour", "01113434341", "adham@gmail.com", false, "0454", "1234",false);
//usersarr=l.addUser("Mustafa", "Abo Ela", "mdint nasr", "01112232112", "mustafa@hotmail.com", true, "0343", "1234",true);

/*
updatebook(booksarr);
booksarr=readbook(booksarr);
updateuser(usersarr);
usersarr=readuser(usersarr);
System.out.println(booksarr.get(1).getAuthor());
System.out.println(usersarr.get(1).getAddress());
booksarr= l.removeBook("54543");
usersarr=l.removeUser("0454");

updatebook(booksarr);
booksarr=readbook(booksarr);
updateuser(usersarr);
usersarr=readuser(usersarr);
System.out.println(booksarr.get(1).getAuthor());
System.out.println(usersarr.get(1).getAddress());
u.searchbook("3435", booksarr);
u.searchuser("0343", usersarr);
booksarr=u.buy("38473", "0345", usersarr, booksarr);
booksarr=u.rent("3435", "0454", usersarr, booksarr);
booksarr=u.rent("3907432", "0454", usersarr, booksarr);
//booksarr=u.rent(isbn, id, usersarr, booksarr);
u.searchbook("38473", booksarr);
//usersarr=r.blocklate(usersarr);
//r.updaterenter();
*/
       // usersarr=l.addUser("1", "1", "1", "1", "1", false, "1", "1");
        updatebook(booksarr);
        updateuser(usersarr);


    
        
         
        
        
    
}
}
