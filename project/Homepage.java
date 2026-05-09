import java.lang.*;
import javax.swing.*;
import java.awt.*; // color and graphics belongs
import java.awt.event.*;


public class Homepage extends JFrame implements ActionListener
{
   ImageIcon icon, img;
    JLabel hotel_name, tag_line, bgpic, choose;
    Font f1,f2;
    Container c;
    Cursor cur;
    JButton  receptionist, customer,  employee;
    JScrollBar scroll;
   public Homepage()
   {
       super("DIAMOND HOTEL"); // Frame Title
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

       //Hotel Name: DIAMOND HOTEL
       hotel_name=new JLabel();
       hotel_name.setText("Diamond Hotel"); //input the name of the hotel
       hotel_name.setBounds(50,2,200,100); //set the location of hotel name
       hotel_name.setFont(f1);//set font size
       hotel_name.setForeground(Color.RED);//set font color
       hotel_name.setToolTipText("Top 5 Star Hotel in Bangladesh");
       c.add(hotel_name);

       //Tag Line: Come Once, will come again and again
       tag_line=new JLabel();
       tag_line.setText("Come Onece, will come again and again...");//set the name of tag_line
       tag_line.setBounds(50,40,550,50);//set location of tag_line
       tag_line.setFont(f2);//set font
       tag_line.setForeground(Color.BLUE);//set font color
       c.add(tag_line);

       //Option Massage...
       choose=new JLabel("Choose Your Options");
       choose.setBounds(850,160,500,30);
       choose.setFont(f1);
       choose.setForeground(Color.WHITE);
       c.add(choose);

       //Receptionist Button
       receptionist=new JButton("For Receptionist");
       receptionist.setBounds(700,200,500,50);
       receptionist.setFont(f1);
       receptionist.setCursor(cur);
       receptionist.addActionListener(this);
       c.add(receptionist);

       //Customer Button
       customer=new JButton("For Customer");
       customer.setBounds(700,260,500,50);
       customer.setFont(f1);
       customer.setCursor(cur);
       customer.addActionListener(this);
       c.add(customer);

       //Employee Button
       employee=new JButton("For Admin");
       employee.setBounds(700,320,500,50);
       employee.setFont(f1);
       employee.setCursor(cur);
       employee.addActionListener(this);
       c.add(employee);

       //Backgroud Image
       img =new ImageIcon(ClassLoader.getSystemResource("IMAGE/Hotel_BG.jpg"));
       bgpic=new JLabel(img);
       bgpic.setBounds(0,0,1920,1080);
       c.add(bgpic);





   }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(receptionist))
        {
            dispose();
            RecpLogin r1=new RecpLogin();
            r1.setVisible(true);
        }
        else if(e.getSource().equals(customer))
        {
            dispose();
            CusLogin c1 = new CusLogin();
            c1.setVisible(true);
        }
        else if(e.getSource().equals(employee))
        {
            dispose();
            EmpLogin e1= new EmpLogin();
            e1.setVisible(true);
        }
        else{}

    }
}
