/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_work1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

/**
 *
 * @author Daniel
 */
public class NewClass extends JFrame {

    NewClass() {
        setSize(400, 400);
        setBounds(10,10,370,600);
        setBackground(Color.yellow);
        JButton btn3 = new JButton("Exit");
        JButton btn1 = new JButton("Click");
        JButton btn2 = new JButton("Cancel");//named object is created
        JPanel pnl=new JPanel();
        //setLayout(manager);//anonymous object  object name is not known 
        btn1.setBounds(100, 100, 150, 50);
        btn1.setBackground(Color.white);
        btn1.setForeground(Color.BLUE);
        setLocationRelativeTo(null);
        JLabel l1 = new JLabel("Name");
        JLabel l2 = new JLabel("Password");
        JTextField f1 = new JTextField();
        f1.setBounds(200, 200, 150, 50);
        JPasswordField p1 = new JPasswordField();
        pnl.setBackground(Color.red);
        pnl.setLocation(333,333);
        l1.setLocation(27, 20);
        l2.setLocation(123, 20);
        l1.setSize(86, 14);
        l2.setSize(140, 14);
        f1.setSize(150, 50);
        pnl.add(l1);
        pnl.add(l2);
        add(pnl);
        add(f1);
        add(p1);
        add(btn1);
        add(btn2);
        add(btn3);
        //setLocation(550, 100);
        // setResizable(false);
        setVisible(true);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "log outed succesfully ");
                System.exit(0);
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
    }

    public static void main(String[] args) {
        NewClass a1=new NewClass();
        
    }
}
