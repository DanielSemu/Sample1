/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activities;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalComboBoxButton;

/**
 *
 * @author Daniel
 */
public class Frame1 {
    Frame1(){
        
        Buttons();
        
        Frame();
    }
    JTextField txt1=new JTextField();
    JPasswordField txt2=new JPasswordField();
    JFrame fr=new JFrame();
    JLabel l1=new JLabel("Login Page");
    JLabel l2=new JLabel("Username");
    JLabel l3=new JLabel("password");
    JPanel p1=new JPanel();//(new GridLayout(2, 2, 2, 2))
    JPanel p2=new JPanel();//new GridLayout(1, 1, 2, 2)
   
    
    public void Frame(){
        l1.setSize(150, 90);
        l1.setBackground(Color.red);
        fr.setLayout(new GridLayout());
        fr.setSize(500, 500);
        fr.setLocation(600, 100);
        txt1.setBounds(750, 600, 95, 30);
        txt2.setBounds(750, 600, 95, 30);
        fr.add(txt1);
        fr.add(txt2);
        fr.add(p1);
        fr.add(p2);
        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        //fr.setLayout(null);
        fr.setVisible(true);
    }
    public void Buttons(){
        JButton btn1=new JButton("Login");
        btn1.setBounds(750, 600, 95, 30);
        JButton btn2=new JButton("Reset");
        btn2.setBounds(750, 700, 95, 30);
        p2.add(btn2);
        p2.add(btn1);
    }

    
    public static void main(String [] args){
        Frame1 a1=new Frame1();
    }
}
//JPanel content = new JPanel(new GridLayout(4, 0)); 
//fr.getContentPane().add(content);
//        // panel for the text field
//        JPanel textarea = new JPanel(new GridLayout(4, 0)); 
//        // panel for the buttons, 
//        // GridLayout(int rows, int cols, int horiz_gap, int vert_gap)
//        JPanel buttonarea = new JPanel(new GridLayout(4, 5, 2, 2)); 
//
//        //  the panel for the bigger bottom buttons
//        JPanel secondbuttonarea = new JPanel(new GridLayout(1, 1, 2, 2)); 
//        // the panel for the text on top
//        JPanel label = new JPanel(); 
//        content.add(label);
//        content.add(textarea);
//        content.add(buttonarea);
//        content.add(secondbuttonarea);
//
//        JLabel words = new JLabel("Polyashenko's Calculator", JLabel.CENTER);
//        label.add(words);
//
//        JTextField enterhere = new JTextField("0.", JTextField.CENTER);
//        // will set the curser of the text bar on right side
//        enterhere.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
//        textarea.add(enterhere);
//
//        // makes a button called b1 with text in it
//        JButton b1 = new JButton("BkSP"); 
//        // adds the backspace button to the buttonarea panel
//        buttonarea.add(b1); 
//        JButton b2 = new JButton("CE");
//        buttonarea.add(b2);
//        JButton b3 = new JButton("C");
//        buttonarea.add(b3);
//        JButton b4 = new JButton("/");
//        buttonarea.add(b4);
//        JButton b5 = new JButton("sqrt");
//        buttonarea.add(b5);
//        JButton b6 = new JButton("7");
//        buttonarea.add(b6);
//        JButton b7 = new JButton("8");
//        buttonarea.add(b7);
//        JButton b8 = new JButton("9");
//        buttonarea.add(b8);
//        JButton b9 = new JButton("*");
//        buttonarea.add(b9);
//        JButton b10 = new JButton("%");
//        buttonarea.add(b10);
//        JButton b11 = new JButton("4");
//        buttonarea.add(b11);
//        JButton b12 = new JButton("5");
//        buttonarea.add(b12);
//        JButton b13 = new JButton("6");
//        buttonarea.add(b13);
//        JButton b14 = new JButton("-");
//        buttonarea.add(b14);
//        JButton b15 = new JButton("1/x");
//        buttonarea.add(b15);
//        JButton b16 = new JButton("1");
//        buttonarea.add(b16);
//        JButton b17 = new JButton("2");
//        buttonarea.add(b17);
//        JButton b18 = new JButton("3");
//        buttonarea.add(b18);
//        JButton b19 = new JButton("+");
//        buttonarea.add(b19);
//        JButton b20 = new JButton("+/-");
//        buttonarea.add(b20);
//
//        JButton b21 = new JButton("0");
//        secondbuttonarea.add(b21);
//        JButton b22 = new JButton(".");
//        secondbuttonarea.add(b22);
//        JButton b23 = new JButton("=");
//        secondbuttonarea.add(b23);
