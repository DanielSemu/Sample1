/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_work1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Daniel
 */
public class Lab_Work1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     JFrame f=new JFrame("Password Field Example");    
     //Creating PasswordField and label  
     JPasswordField value = new JPasswordField();   
     value.setBounds(100,100,100,30);    
     value.setToolTipText("Enter your Password");  
     JLabel l1=new JLabel("Password:");    
     l1.setBounds(20,100, 80,30);    
     //Adding components to frame  
     f.add(value); 
     f.add(l1);  
     f.setSize(300,300);    
     f.setLayout(null);    
     f.setVisible(true);      
    }
    
}
