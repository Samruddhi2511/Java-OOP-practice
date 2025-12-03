import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame implements ActionListener
{
    private JButton btn_login=null;
    private JTextField lbl_text=null;
    private JTextField lbl_text1=null;

    MyFrame()
    {
        //MyFrame myframe=new MyFrame();

        JFrame myframe=new JFrame("Login Frame");
        myframe.setVisible(true);     //for visiblity of that frame by default it is invisible
        myframe.setSize(500,300);     //for icreasing size 
        //myframe.setTitle("Login Frame");   //for title frame or can be set from object
        myframe.getContentPane().setBackground(Color.CYAN);  //getContentPane used get color for one layer
        myframe.setLocation(700,200);
        myframe.setLayout(null);


        lbl_text.addKeyListener(new KeyAdapter()
        {
         public void keyReleased(KeyEvent ke)
         {
            String userstr=lbl_text.getText();
           // String userstr1=lbl_password.setText();

           if(ke.getKeyText(ke.getKeyCode())==("enter"))
           {
              System.out.println("entered");
           }
            
         }
        });

        JLabel lbl_username=new JLabel("Username  :");
        myframe.add(lbl_username);
        lbl_username.setBounds(60,40,90,50);

        JLabel lbl_pass=new JLabel("Password  :");
        myframe.add(lbl_pass);
        lbl_pass.setBounds(60,60,90,50);

        btn_login=new JButton("Login  ");
        myframe.add(btn_login);
        btn_login.setBounds(60,140,90,30);
       



        JButton btn_cancel=new JButton("Cancel  ");
        myframe.add(btn_cancel);
        btn_cancel.setBounds(200,140,90,30);

        lbl_text=new JTextField();
        myframe.add(lbl_text);
        lbl_text.setBounds(150,60,100,15);


        lbl_text1=new JTextField();
        myframe.add(lbl_text1);
        lbl_text1.setBounds(150,80,100,15);


        Font lbl_font=new Font("Dubai medium",Font.ITALIC,17);
        lbl_username.setFont(lbl_font);
        lbl_pass.setFont(lbl_font);
        

        
        
        btn_login.addActionListener(this);
        btn_cancel.addActionListener(this);



    }
    public static void main(String[] args) 
    {

        
        MyFrame myframe=new MyFrame();


    }
  
    
    public void actionPerformed(ActionEvent ae)
    {
        //System.out.println("Login button clicked");
         if(ae.getSource()==btn_login)   
        {
            System.out.println("Login button clicked");
            String user=lbl_text.getText();  
            String pass=lbl_text1.getText();
            if(user.equalsIgnoreCase("Samruddhi") && pass.equals("7559305365"))
            {
                //System.out.println("Login success");
                JOptionPane.showMessageDialog(null,"login success");
                Personalinfo1.main(null);
              
            }
            else          
            {
                JOptionPane.showMessageDialog(null,"login failed");
                //System.out.println("Login failed");
               // txt_pass.setText("");
            }

        }

        
        else
        {
            System.out.println("Cancel button clicked");
        }
        
       

        
    }
    
}

 
