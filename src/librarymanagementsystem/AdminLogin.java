/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static librarymanagementsystem.Librarymanagementsystem.usersarr;


public class AdminLogin  {
                JFrame frame_A = new JFrame("Sign in as Admin");
                JPanel panel_A = new JPanel();
                JButton Button_A = new JButton("Sign in");
                JLabel passlabel_A = new JLabel("Password ");
                JLabel ID_A = new JLabel("Admin's ID ");
                JTextField id = new JTextField();
                JPasswordField password = new JPasswordField("");



    public AdminLogin() {
                frame_A.setSize(500,500);
                frame_A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame_A.setLayout(null);
                frame_A.setLocationRelativeTo(null);
                frame_A.add(panel_A);
                frame_A.setVisible(true);
                passlabel_A.setBounds(120,205, 90, 30);
                Button_A.setBounds(180, 250, 110, 23);
                id.setBounds(180,180,110,23);
                password.setBounds(180,210,110,23);
                ID_A.setBounds(118,180,110,23);
                frame_A.add(Button_A);
                frame_A.add(id);
                frame_A.add(password);
                frame_A.add(passlabel_A);
                frame_A.add(ID_A);
            Button_A.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String ID=id.getText();   
             String Pass =password.getText();
            boolean found=false;
         for(int i=0;i<usersarr.size();i++){
             if(usersarr.get(i).getID().equals(ID)&&usersarr.get(i).getPassword().equals(Pass)&&usersarr.get(i).isIsadmin()==true){  
            JOptionPane.showMessageDialog(null,"Login successfully");
                             frame_A.setVisible(false);
                             AdminGUI a = new AdminGUI();
             found=true;
             break;
             }
                 
         } 
         if (!found)
                JOptionPane.showMessageDialog(null,"Try again","",JOptionPane.WARNING_MESSAGE);
                        

            }
        });
                frame_A.setVisible(true);
            
    }
   
}
 class UserLogin {
    JFrame frame_A = new JFrame("Sign in as User");
                JPanel panel_A = new JPanel();
                JButton Button_A = new JButton("Sign in");
                JLabel passlabel_A = new JLabel("Password ");
                JLabel ID_A = new JLabel("User's ID ");
                JTextField id = new JTextField();
                JPasswordField password = new JPasswordField("");



    public UserLogin() {
                frame_A.setSize(500,500);
                frame_A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame_A.setLayout(null);
                frame_A.setLocationRelativeTo(null);
                frame_A.add(panel_A);
                frame_A.setVisible(true);
                passlabel_A.setBounds(120,205, 90, 30);
                Button_A.setBounds(180, 250, 110, 23);
                id.setBounds(180,180,110,23);
                password.setBounds(180,210,110,23);
                ID_A.setBounds(118,180,110,23);
                frame_A.add(Button_A);
                frame_A.add(id);
                frame_A.add(password);
                frame_A.add(passlabel_A);
                frame_A.add(ID_A);
            Button_A.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String ID=id.getText();   
             String Pass =password.getText();
                       boolean found=false;
         for(int i=0;i<usersarr.size();i++){
             if(usersarr.get(i).getID().equals(ID)&&usersarr.get(i).getPassword().equals(Pass)&&usersarr.get(i).isIsadmin()==false){  
            JOptionPane.showMessageDialog(null,"Login successfully");
                             frame_A.setVisible(false);
                             UserGUI ug = new UserGUI();
                             
             found=true;
             break;
             }
                 
         } 
         if (!found)
                JOptionPane.showMessageDialog(null,"Try again","",JOptionPane.WARNING_MESSAGE);
                        

            }
        });
                frame_A.setVisible(true);    
    }

}

