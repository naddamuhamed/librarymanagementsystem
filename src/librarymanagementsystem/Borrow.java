/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import javax.swing.JOptionPane;


public class Borrow extends Request{
    public Borrow (){
        JOptionPane.showMessageDialog(null,"return book maximum at "+super.getDueDate()+" or you will be considered as a late user and you will be blocked from renting books again");
    }
    
}

