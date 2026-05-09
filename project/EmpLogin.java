
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmpLogin extends JFrame implements ActionListener
{
    ImageIcon icon, img;
    JLabel id, password, bgpic, headTitle;
    JTextField tf1;
    JButton login, clear, back;
    JPasswordField pf;
    int i;
    Font f1,f2;
    Container c;
    Cursor cur;

    public EmpLogin()
    {
        super("Employee Login"); // Frame Title
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

        // this part creates username JLabel
        headTitle = new JLabel();
        headTitle.setText("Employee Login");
        headTitle.setBounds(310, 160, 500, 50);
        headTitle.setFont(f1);
        headTitle.setForeground(Color.WHITE);
        headTitle.setToolTipText("enter your ID");
        c.add(headTitle);

        // this part creates username JLabel
        id = new JLabel();
        id.setText("Enter ID");
        id.setBounds(310, 230, 150, 30);
        id.setFont(f2);
        id.setForeground(Color.WHITE);
        id.setToolTipText("enter your ID");
        c.add(id);

        // text field
        tf1 = new JTextField();
        tf1.setBounds(475, 230, 200, 30);
        tf1.setFont(f2);
        c.add(tf1);

        // this part creates password JLabel

        password = new JLabel("Enter Password");
        password.setBounds(310, 280, 150, 30);
        password.setFont(f2);
        password.setForeground(Color.WHITE);

        password.setToolTipText("Please enter your password carefully");
        c.add(password);

        // password field
        pf = new JPasswordField();
        pf.setBounds(475, 280, 200, 30);
        pf.setFont(f2);
        pf.setEchoChar('*');
        c.add(pf);

        // cursor for button
        cur = new Cursor(Cursor.HAND_CURSOR);

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

        // add background picture...JLabel er maddhome ekta pic add korbo then seta
        // frame er size onujai dibo
        img = new ImageIcon("a5.jpg");// pic->ImageIcon->JLabel
        bgpic = new JLabel("", img, JLabel.CENTER);
        bgpic.setBounds(0, 0, 1000, 700);

        c.add(bgpic);
    }
    public void actionPerformed(ActionEvent e)    {
        if(e.getSource().equals(login))
        {
            String id=tf1.getText();
            String password = pf.getText();
            if(id.equals("1")&&password.equals("1"))
            {
                dispose();
                Employee1 frame=new Employee1();
                frame.setVisible(true);
            }
            else if(id.equals("2")&&password.equals("2"))
            {
                dispose();
                Employee2 frame=new Employee2();
                frame.setVisible(true);
            }
			else if(id.equals("3")&&password.equals("3"))
            {
                dispose();
                Employee3 ob = new Employee3();
		        ob.setVisible(true);
            }
			else if(id.equals("4")&&password.equals("4"))
            {
                dispose();
                Employee4 frame=new Employee4();
                frame.setVisible(true);
            }else if(id.equals("5")&&password.equals("5"))
            {
                dispose();
                Employee5 frame=new Employee5();
                frame.setVisible(true);
            }
			else if(id.equals("6")&&password.equals("6"))
            {
                dispose();
                Employee6 frame=new Employee6();
                frame.setVisible(true);
            }
			
			
			
			
			
			
			
            else {JOptionPane.showMessageDialog(null, "Please Put a Correct Information");}
        }
        else if(e.getSource().equals(clear))
        {
            tf1.setText("");
            pf.setText("");
        }
        else
        {
            this.dispose();
            this.setVisible(false);
            new Homepage().setVisible(true);
        }
    }

}
