package Healthy.Food;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Information extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;

    Information(){
        super("Information");

        setBackground(Color.white);
        setLayout(null);

        l1 = new JLabel("Name");
        l1.setBounds(40,20,100,30);
        add(l1);

        l2 = new JLabel("Mobile");
        l2.setBounds(40,70,100,30);
        add(l2);

        l3 = new JLabel("Address");
        l3.setBounds(40,120,100,30);
        add(l3);

        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JTextField();
        t2.setBounds(150,70,150,30);
        add(t2);

        t3=new JTextField();
        t3.setBounds(150,120,150,30);
        add(t3);

        b1 = new JButton("Next");
        b1.setBounds(40,170,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,170,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);
    }

    public void actionPerformed(ActionEvent ae){

        try{
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            String w = t3.getText();

            String q = "select * from info where Name='"+u+"' and Mobile='"+v+"' and Address='"+w+"'";

            ResultSet rs = c1.s.executeQuery(q);
            if(rs.next()){https://github.com/vinay-kg/Knowledge_Gate.git
            new Disease().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid credentials");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        Information I = new Information();
    }
}

