import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame6 implements ActionListener {

    private JButton btn_login;
    private JButton btn_cancel;
    private JTextField txt_password;
    private JTextField txt_username;
    private JFrame myframe;
    private JComboBox<String> cb;
    private JRadioButton lbl_male;
    private JRadioButton lbl_female;

    MyFrame6() {
        myframe = new JFrame("Login Frame");
        myframe.setVisible(true);
        myframe.setSize(500, 400);
        myframe.getContentPane().setBackground(Color.CYAN);
        myframe.setLocation(800, 600);
        myframe.setLayout(null);

        JLabel lbl_useranme = new JLabel("Username :");
        lbl_useranme.setBounds(60, 40, 90, 50);
        myframe.add(lbl_useranme);

        txt_username = new JTextField();
        txt_username.setBounds(150, 60, 100, 15);
        myframe.add(txt_username);

        JLabel lbl_password = new JLabel("Password  :");
        lbl_password.setBounds(60, 60, 90, 50);
        myframe.add(lbl_password);

        txt_password = new JTextField();
        txt_password.setBounds(150, 80, 100, 15);
        myframe.add(txt_password);

        lbl_male = new JRadioButton("Male");
        lbl_male.setBounds(60, 120, 90, 15);
        myframe.add(lbl_male);

        lbl_female = new JRadioButton("Female");
        lbl_female.setBounds(160, 120, 90, 15);
        myframe.add(lbl_female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(lbl_male);
        bg.add(lbl_female);

        JLabel lbl_year = new JLabel("Year :");
        lbl_year.setBounds(60, 160, 90, 50);
        myframe.add(lbl_year);

        cb = new JComboBox<>();
        cb.setBounds(150, 180, 100, 15);
        cb.addItem("FE");
        cb.addItem("SE");
        cb.addItem("TE");
        cb.addItem("BE");
        myframe.add(cb);
        cb.addActionListener(this);

        btn_login = new JButton("Login");
        btn_login.setBounds(60, 220, 90, 30);
        btn_login.addActionListener(this);
        myframe.add(btn_login);

        btn_cancel = new JButton("Cancel");
        btn_cancel.setBounds(200, 220, 90, 30);
        btn_cancel.addActionListener(this);
        myframe.add(btn_cancel);

        txt_username.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    txt_password.requestFocus();
                }
            }
        });

        txt_password.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    login();
                }
            }
        });

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void login() {
        String user = txt_username.getText();
        String pass = txt_password.getText();

        if ("sam2005".equalsIgnoreCase(user) && "7559305365".equals(pass)) {
            JOptionPane.showMessageDialog(null, "Login Success");
            myframe.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Login Failed");
            txt_username.setText("");
            txt_password.setText("");
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn_login) {
            login();
        } else if (ae.getSource() == btn_cancel) {
            System.out.println("Cancel Button Clicked");
        } else if (ae.getSource() == cb) {
            String selectedYear = (String) cb.getSelectedItem();
            System.out.println(selectedYear + " selected");
        } else if (ae.getSource() == lbl_male) {
            System.out.println("Male selected");
        } else if (ae.getSource() == lbl_female) {
            System.out.println("Female selected");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame3();
        });
    }
}
