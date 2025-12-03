import javax.swing.JFrame;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;

import javax.swing.JComboBox;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame3 implements ActionListener 
{

    private JButton btn_login;
    private JButton btn_cancel;
    private JTextField txt_password;
    private JTextField txt_username;
    private JFrame myframe;
    private JButton cb;

    private JRadioButton lbl_male;
    private JRadioButton lbl_female;



    MyFrame3() 
    {
        myframe = new JFrame("Login Frame");
        myframe.setVisible(true);
        myframe.setSize(500, 400);
        myframe.getContentPane().setBackground(Color.CYAN);
        myframe.setLocation(800, 600);
        myframe.setLayout(null);



      
        //username
        JLabel lbl_useranme = new JLabel("Username :");
        myframe.add(lbl_useranme);
        lbl_useranme.setBounds(60,40,90,50);

        txt_username = new JTextField(); // Initialize txt_username
        myframe.add(txt_username);
        txt_username.setBounds(150,60,100,15);

        // password
        JLabel lbl_password = new JLabel("Password  :");
        myframe.add(lbl_password);
        lbl_password.setBounds(60,60,90,50);

        txt_password = new JTextField(); // Initialize txt_password
        myframe.add(txt_password);
        txt_password.setBounds(150,80,100,15);

        //radiobutton

        JRadioButton lbl_male=new JRadioButton("male");
        JRadioButton lbl_female=new JRadioButton("female");
        JRadioButton lbl_rad=new JRadioButton("Radio Button:");
        myframe.add(lbl_rad);
        lbl_rad.setBounds(60,120,90,15);

        myframe.add(lbl_male);
        lbl_rad.setBounds(60,140,90,15);
        myframe.add(lbl_female);
        lbl_rad.setBounds(60,180,90,15);

      
       // bg.add(lbl_rad);
       
        lbl_female = new JRadioButton("Female");
        lbl_female.setBounds(160,180,90,15);
        myframe.add(lbl_female);

        lbl_male = new JRadioButton("male");
        lbl_male.setBounds(230,180,90,15);
        myframe.add(lbl_male);
        //bg.add(lbl_rad);
        //myframe.(bg);

        ButtonGroup bg=new ButtonGroup();
        bg.add(lbl_female);
        bg.add(lbl_male);

        lbl_male.setSelected(true);

        JComboBox cb=new JComboBox();
        myframe.add(cb);
        cb.setBounds(150,100,100,15);
        cb.addItem("FE");
        cb.addItem("SE");
        cb.addItem("TE");
        cb.addItem("BE");

        JLabel lbl_year = new JLabel("Year :");
        myframe.add(lbl_year);
        lbl_year.setBounds(60,80,90,50);
      

        
       //lbl_male.setSelectected(True);
       cb.addActionListener(this);
       lbl_female.addActionListener(this);
       lbl_male.addActionListener(this);

      // lbl_female.isSelected();
       //lbl_male.isSelected();

        //combobox
        //String[]cities={"Delhi","Pune"};
        //JComboBox cb1=new JComboBox(args[]);
       // cb.setBounds(150,100,100,15);
       // myframe.add(cb);

        // login button
        btn_login = new JButton("Login");
        myframe.add(btn_login);
        btn_login.setBounds(60,140,90,30);
        btn_login.addActionListener(this);

        // cancel button
        btn_cancel = new JButton("Cancel");
        myframe.add(btn_cancel);
        btn_cancel.setBounds(200,140,90,30);
        btn_cancel.addActionListener(this);

        

        txt_username.addKeyListener(new KeyAdapter() 
        {
            
            public void keyReleased(KeyEvent ke) 
            {
                if( ke.getKeyCode() == 10)  
                {
                    System.out.println("Enter clicked");
                    //login();                        //using this method for avoiding duplication of code from actionlistener
                    System.out.println(ke.getKeyCode());
                    txt_password.requestFocus();


                }
            }
        });

      

        txt_password.addKeyListener(new KeyAdapter()
         {
            
            public void keyReleased(KeyEvent ke) 
            {
                if( ke.getKeyCode() == 10) 
                {
                    System.out.println("Enter clicked");
                    login();
                }
            }
        });
    }

    private void login() 
    {
        String user = txt_username.getText();
        String pass = txt_password.getText();

        if (("sam2005".equalsIgnoreCase(user)) && ("7559305365".equals(pass)))
         {
            JOptionPane.showMessageDialog(null, "Login Success");
            myframe.setVisible(false);
           
        }
        //else if( )
        else
        {
            JOptionPane.showMessageDialog(null, "Login Failed");
            txt_username.setText("");
            txt_password.setText("");
        }
    }
    public static void main(String[] args)
    {
        MyFrame3 myframe = new MyFrame3(); 
  
    }

    
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == btn_login) 
        {
            JOptionPane.showMessageDialog(null, "Login button clicked");
            login();
            
        } 
        else if(ae.getSource()==cb)
        {
             
            JOptionPane.showMessageDialog(null, "combo box selected");
            JComboBox cref=(JComboBox)ae.getSource();
            String s=(String)cref.getSelectedItem();
            if(s=="FE")
            {
                JOptionPane.showMessageDialog(null, "FE Selected");
            }
            else if(s=="SE")
            {
                JOptionPane.showMessageDialog(null, "SE Selected"); 
            }
            else if(s=="TE")
            {
                JOptionPane.showMessageDialog(null, "TE Selected"); 
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "BE Selected");
            }
        }
        else if(ae.getSource()==lbl_male)
        {
            JOptionPane.showMessageDialog(null, "male selected");
        }
        else if(ae.getSource()==lbl_female)
        {
            JOptionPane.showMessageDialog(null, "female selected");
        }
        else if (ae.getSource() == btn_cancel) 
        {
            System.out.println("Cancel Button Clicked");

        }
    }
}


/*
class PersonalInfo2 implements ActionListener
{
    JButton btn_submit=null;
    JTextField txt_name=null;
    JTextField txt_address=null;
    JTextField txt_number=null;
    JFrame myframe2=null;cd
    PersonalInfo2()
    {
        myframe2=new JFrame("Personal Info");
        myframe2.setVisible(true);
        myframe2.setSize(500,400);
        myframe2.setLocation(800,600);
        myframe2.setLayout(null);

        // name 
       JLabel lbl_name=new JLabel("Name");
       myframe2.add(lbl_name);
       lbl_name.setBounds(200,80,80,80);
       txt_name=new JTextField();
       myframe2.add(txt_name);
       txt_name.setBounds(280,110,90,20);

       // address
       JLabel lbl_address=new JLabel("Address  :");
       myframe2.add(lbl_address);
       lbl_address.setBounds(200,150,80,80);
       txt_address=new JTextField();
       myframe2.add(txt_address);
       txt_address.setBounds(280,180,90,20);

       // Mobile Number

       JLabel lbl_number=new JLabel("number  :");
       myframe2.add(lbl_number);
       lbl_number.setBounds(200,220,80,80);
       txt_number=new JTextField();
       myframe2.add(txt_number);
       txt_number.setBounds(280,250,90,20);

       // button

       btn_submit=new JButton("submit");
       myframe2.add(btn_submit);
       btn_submit.setBounds(200,280,90,20);
       btn_submit.addActionListener(this);

    }
    public static void main(String[] args) 
    {
        PersonalInfo2 personal_info=new PersonalInfo2();
    }

    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==btn_submit)
        {
            String name=txt_name.getText();
            String add=txt_address.getText();
            String number=txt_number.getText();
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name cant be empty");
            }
            else if(add.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Address cant be empty");
            }
            else if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Number cant be empty");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Submited");
            }
        }
    }
}

*/
