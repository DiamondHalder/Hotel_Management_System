
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class RecpLogin extends JFrame implements ActionListener
{
    ImageIcon icon, img;
    Container c;
    JLabel username, password, bgpic, headTitle;
    JTextField tf1;
    JButton login, clear, back;
    JPasswordField pf;
    Font f1,f2;
    Cursor cur;

    public RecpLogin()
    {
        super("Reception LogIn");
        this.setBounds(0,0,1920,1080);// Frame Size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Backgroud Operation close

        //this part changes the icon
        icon=new ImageIcon(getClass().getClassLoader().getResource("IMAGE/hotel_icon.png")); //Interface Icon Location
        this.setIconImage(icon.getImage());// Interface Icon Set

        c=this.getContentPane();// retrive the content pane that can add object
        c.setLayout(null);
        c.setBackground(Color.WHITE);// set Background Color
        f1=new Font("Arial", Font.BOLD,22);//set Hotel_name font details
        f2=new Font("Airal", Font.ITALIC, 14);//set tag_line font details
        cur =new Cursor(Cursor.HAND_CURSOR); //Cursor for button

        //Enter Username
        username = new JLabel();
        username.setText("Enter Username");
        username.setBounds(310, 230, 150, 30);
        username.setFont(f2);
        username.setForeground(Color.BLACK);
        username.setToolTipText("enter your ID");
        c.add(username);

        // Username text field
        tf1 = new JTextField();
        tf1.setBounds(475, 230, 200, 30);
        tf1.setFont(f2);
        c.add(tf1);

        //Enter Password
        password = new JLabel("Enter Password");
        password.setBounds(310, 280, 150, 30);
        password.setFont(f2);
        password.setForeground(Color.BLACK);
        password.setToolTipText("Please enter your password carefully");
        c.add(password);

        // password field
        pf = new JPasswordField();
        pf.setBounds(475, 280, 200, 30);
        pf.setFont(f2);
        pf.setEchoChar('*');
        c.add(pf);

        // Login button
        login = new JButton("Login");
        login.setBounds(380, 340, 100, 30);
        login.setFont(f2);
        login.setCursor(cur);
        c.add(login);
        login.addActionListener(this);

        // clear button
        clear = new JButton("Clear");
        clear.setBounds(505, 340, 100, 30);
        clear.setFont(f2);
        clear.setCursor(cur);
        c.add(clear);
        clear.addActionListener(this);

        // back button
        back = new JButton("Back");
        back.setBounds(442, 380, 100, 30);
        back.setFont(f2);
        clear.setCursor(cur);
        c.add(back);
        back.addActionListener(this);

        img =new ImageIcon(ClassLoader.getSystemResource("IMAGE/Hotel_img.jpg"));
        bgpic=new JLabel(img);
        bgpic.setBounds(0,0,1920,1080);
        c.add(bgpic);
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource().equals(login)) {
        String user=tf1.getText();
        String pass=pf.getText();

            if (user.equals("1") && pass.equals("1")) {
                dispose();
                String Data2 = "DATA/Data2.txt";
                String absbill = "DATA/absbill.txt";
                String dmc = "DATA/dmc.txt";
                String immc = "DATA/immc.txt";
                String indiuti = "DATA/indiuti.txt";
                String mmc = "DATA/mmc.txt";
                String utility = "DATA/utility.txt";
                RecpPanel frame = new RecpPanel(Data2, absbill, dmc, immc, indiuti, mmc, utility);
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        } else if (e.getSource().equals(clear)) {
            tf1.setText("");
            pf.setText("");

            // back button
        } else {
            this.dispose();
            this.setVisible(false);
            new Homepage().setVisible(true);
        }

    }


}
