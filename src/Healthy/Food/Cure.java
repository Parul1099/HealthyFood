package Healthy.Food;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cure extends JFrame implements ActionListener {

    Cure() {
        super("Recommended Diet");

        setSize(1920, 1030);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Healthy/Food/icons/diet.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);

        add(l1);

        JMenuBar mb = new JMenuBar();
        JMenu Disease = new JMenu("Disease");
        JMenuItem m1 = new JMenuItem("Diabetes");
        JMenuItem m2 = new JMenuItem("Cancer");
        Disease.setForeground(Color.BLUE);

        m1.setFont(new Font("monospaced", Font.BOLD, 16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("Healthy/Food/icons/diabetes.jpg"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);

        m2.setFont(new Font("monospaced", Font.BOLD, 16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("Healthy/Food/icons/cancer.jpg"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);

        m1.addActionListener(this);
        m2.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);


        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("Healthy/Food/icons/exit.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);


        Disease.add(m1);
        Disease.add(m2);
        exit.add(ex);

        mb.add(Disease);
        mb.add(exit);

        setJMenuBar(mb);

        setFont(new Font("Senserif", Font.BOLD, 16));
        setLayout(new FlowLayout());
        setVisible(false);

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
        new Cure().setVisible(true);
    }
}