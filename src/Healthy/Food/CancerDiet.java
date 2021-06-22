package Healthy.Food;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


class CancerDiet extends JFrame implements ActionListener{

    CancerDiet() {
        super("Cancer Diet");
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Healthy/Food/icons/cd.jpg"));
        Image i3 = ic.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);

        add(l1);

        setBounds(50,50,1000,600);


    }
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Diabetes")) {
            new DiabeticDiet().setVisible(true);

        } else if (msg.equals("Cancer")) {
            new CancerDiet().setVisible(true);

        }
        else if(msg.equals("Exit")){
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        new CancerDiet().setVisible(true);
    }

}

