/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.io.Serializable;


public class Reader extends User implements Serializable{
   
public Reader(){
    super();
   
    
}
    public Reader(String firstName, String lastName, String address, String cellPhone, String email, boolean blocked, String ID, String password,boolean admin) {
        super(firstName,lastName,address,cellPhone,email,blocked,ID,password,admin);
        
    }
}