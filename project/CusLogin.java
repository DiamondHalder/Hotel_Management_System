




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class CusLogin extends JFrame implements  ActionListener
 {   
 String s1;
     JButton lbtn,bbtn,cbtn,rbtn;
     JPanel panel;
	 JTextField field;
	 JPasswordField field2;
	 ImageIcon img;
	 JLabel label,label2,bgpic;
	public CusLogin()
	{
		super("frame");
		this.setBounds(0,0,1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		
		//img =new ImageIcon(ClassLoader.getSystemResource("IMAGE/airways-hotel.jpg"));
        //bgpic=new JLabel(img);
        //bgpic.setBounds(0,0,1920,1080);
        //panel.add(bgpic);
		
		
		label = new JLabel();
		label.setText("USERNAME");
		label.setBounds(0,0,220,40);
		label.setToolTipText("enter");
		panel.add(label);
		
		 label2 = new JLabel();
		label2.setText("PASSWORD");
		label2.setBounds(0,37,220,40);
		panel.add(label2);
		
		field = new JTextField();
		field.setBounds(75,0,100,30);
		panel.add(field);
		
	    field2 = new JPasswordField();
		field2.setBounds(75,40,100,30);
		panel.add(field2);
		
		lbtn=new JButton("LOG IN");
		lbtn.setBounds(0,80,100,30);
		lbtn.addActionListener(this);
		panel.add(lbtn);
		
		bbtn=new JButton("BACK");
		bbtn.setBounds(120,80,100,30);
		bbtn.addActionListener(this);
		panel.add(bbtn);
			
		cbtn=new JButton("clean");
		cbtn.setBounds(250,80,100,30);
		cbtn.addActionListener(this);
		panel.add(cbtn);
		
		rbtn =new JButton("REGISTRATION");
		rbtn.setBounds(120,150,150,30);
		rbtn.addActionListener(this);
		panel.add(rbtn);
		
		this.add(panel);
	}	
		
		
		public void actionPerformed(ActionEvent ae)
	   {
			if(ae.getSource()==lbtn)
			{
				String username=field.getText();
				String pass=field2.getText();
				
				Account account=new Account();

				
			 if(account.getAccount(username,pass))
					
					{
						JOptionPane.showMessageDialog(null,"Sucessfull");
								
						CusPanel C = new CusPanel();
				        C.setVisible(true);
				        this.setVisible(false);
						
					}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Check Again");
			
				}
				
			}
			else if (ae.getSource()==rbtn)
			{
				registration r1=new registration();
				r1.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==cbtn)
			{
				field.setText("");
				field2.setText("");
			}
			else if(ae.getSource()==bbtn)
			{
				Homepage h2 = new Homepage();
				h2.setVisible(true);
				this.setVisible(false);
			}
		}
    
 }