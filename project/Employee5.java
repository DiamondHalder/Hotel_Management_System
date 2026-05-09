
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employee5 extends JFrame implements ActionListener
{
    ImageIcon icon, img, image;
    Container c;
    JTable table;
    String path;
    Cursor cur;
    Font f1,f2;

   // DefaultTableModel model;

    JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gndLabel, nidLabel,
            daysPerWeekLabel, positionLabel, incomeLabel, bgpic;

    JButton backButton;
    JTextField titleTf, fnTf, lnTf, phoneTf, gndTf, nidTf,
            daysPerWeekTf, positionTf, incomeTf;

    Employee5()
    {
        super("Employee Panle"); // Frame Title
        this.setSize(1000,700);// Frame Size
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

        titleLabel = new JLabel("Employee Profile Panel");
        titleLabel.setFont(f1);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(80, 10, 250, 50);
        c.add(titleLabel);

        // JLabels Start
        fnLabel = new JLabel("First Name");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(f1);
        fnLabel.setForeground(Color.WHITE);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(135, 80, 200, 30);
        fnTf.setText("MAHFUZ ");
        fnTf.setEditable(false);
        fnTf.setFont(f1);
        c.add(fnTf);

        lnLabel = new JLabel("Last Name ");
        lnLabel.setBounds(10, 130, 140, 30);
        lnLabel.setFont(f1);
        lnLabel.setForeground(Color.WHITE);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(135, 130, 200, 30);
        lnTf.setText("AHMED");
        lnTf.setEditable(false);
        lnTf.setFont(f1);
        c.add(lnTf);

        // Phone
        phoneLabel = new JLabel("Phone ");
        phoneLabel.setBounds(10, 180, 140, 30);
        phoneLabel.setFont(f1);
        phoneLabel.setForeground(Color.WHITE);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(135, 180, 200, 30);
        phoneTf.setText("01347843677");
        phoneTf.setEditable(false);
        phoneTf.setFont(f1);
        c.add(phoneTf);

        // Gender
        gndLabel = new JLabel("Gender");
        gndLabel.setBounds(10, 230, 140, 30);
        gndLabel.setFont(f1);
        gndLabel.setForeground(Color.WHITE);
        c.add(gndLabel);

        gndTf = new JTextField();
        gndTf.setBounds(135, 230, 200, 30);
        gndTf.setText("Male");
        gndTf.setEditable(false);
        gndTf.setFont(f1);
        c.add(gndTf);

        // Nid Number
        nidLabel = new JLabel("Nid Number");
        nidLabel.setBounds(10, 280, 140, 30);
        nidLabel.setFont(f1);
        nidLabel.setForeground(Color.WHITE);
        c.add(nidLabel);

        nidTf = new JTextField();
        nidTf.setBounds(135, 280, 200, 30);
        nidTf.setText("61478678489");
        nidTf.setEditable(false);
        nidTf.setFont(f1);
        c.add(nidTf);

        daysPerWeekLabel = new JLabel("Working Days");
        daysPerWeekLabel.setBounds(10, 330, 160, 30);
        daysPerWeekLabel.setFont(f1);
        daysPerWeekLabel.setForeground(Color.WHITE);
        c.add(daysPerWeekLabel);

        daysPerWeekTf = new JTextField("Sat,Mon,Tue");
        daysPerWeekTf.setBounds(145, 330, 160, 30);
        daysPerWeekTf.setEditable(false);
        daysPerWeekTf.setFont(f1);

        c.add(daysPerWeekTf);

        positionLabel = new JLabel("Position");
        positionLabel.setBounds(10, 380, 140, 30);
        positionLabel.setFont(f1);
        positionLabel.setForeground(Color.WHITE);
        c.add(positionLabel);

        positionTf = new JTextField("Manager");
        positionTf.setBounds(135, 380, 140, 30);
        positionTf.setFont(f1);
        positionTf.setEditable(false);

        c.add(positionTf);

        incomeLabel = new JLabel("Salary");
        incomeLabel.setBounds(10, 430, 140, 30);
        incomeLabel.setFont(f1);
        incomeLabel.setForeground(Color.WHITE);
        c.add(incomeLabel);

        incomeTf = new JTextField("95000tk");
        incomeTf.setBounds(135, 430, 140, 30);
        incomeTf.setFont(f1);
        incomeTf.setEditable(false);

        c.add(incomeTf);


        backButton = new JButton("Back");
        backButton.setBounds(850, 180, 120, 30);
        backButton.setBackground(new Color(122, 136, 164));
        backButton.setForeground(Color.WHITE);
        backButton.setFont(f1);
        c.add(backButton);
        backButton.addActionListener(this);

        //Backgroud Image
       img =new ImageIcon(ClassLoader.getSystemResource("IMAGE/images.jpeg"));
        bgpic=new JLabel(img);
        bgpic.setBounds(0,0,1366,768);
        c.add(bgpic);
    }
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource().equals(backButton)) {
            this.dispose();
			new EmpLogin().setVisible(true);
            
        }
    }



}