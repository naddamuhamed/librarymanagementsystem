/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;


import java.awt.GridLayout;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;


public class Buy extends Request{
    Scanner s=new Scanner(System.in);
    private JFrame frame;
    private JPanel pane;
    private JTextField msg;
    /**
     *
     * @param price
     */
    public Buy(double price) { 
          pane = new JPanel();
          pane.setLayout(new GridLayout(0, 1, 1, 1));
          pane.add(new JLabel("Press Yes to pay with Visa, No to use cash"));
          int option = JOptionPane.showConfirmDialog(frame, pane, "Please fill all the fields", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

     if (option == JOptionPane.YES_OPTION){
         
        boolean continueInput = true;

    do {
      try {
             String ans = JOptionPane.showInputDialog("book is for "+price+"$\nenter visa credentials");
             int visa =Integer.parseInt(ans);
   
        continueInput = false;
      } 
      catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(null,"Try again. (" + 
           "Incorrect input: an integer is required)");
      }
    } while (continueInput);

          continueInput = true;
          
    do {
      try {
                  String ans2 = JOptionPane.showInputDialog("enter password");
                  int pass =Integer.parseInt(ans2);
                  continueInput = false;
           } 
      catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(null,"Try again. (" + 
          "Incorrect input: an integer is required)");
      }
    } while (continueInput);

         JOptionPane.showMessageDialog(null,"purchase completed!");
     }
     else if (option == JOptionPane.NO_OPTION){
         
         
                     String ans = JOptionPane.showInputDialog("book is for "+price+"$\nenter cash");
             int amount =Integer.parseInt(ans);

      if(amount<price){
          JOptionPane.showMessageDialog(null,"purchase unsuccessful, amount receieved less than book price.");
      }
      else{
          JOptionPane.showMessageDialog(null,"purchase completed!\ncashback:"+(int)(amount-price)*100/100.0);
      }
 }
     else{
                   JOptionPane.showMessageDialog(null,"wrong choice");
        }
    
    }

}
