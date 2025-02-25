import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Login_page extends JFrame
{
    JLabel Label1,Label2,Label3,Label4,Label5,Label6;
    JTextField TextField1;
    JPasswordField PasswordField1;
    JButton Button1,Button2,Button3;
    Login_page()
    {
        super("Login Page");
        setLayout(null);
        setSize(850,580);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(300,100);


        Label1=new JLabel();
        Label1.setBounds(380,10,100,100);
        add(Label1);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/bank.png");
        Label1.setIcon(imageicon1);

        Label2=new JLabel();
        Label2.setBounds(700,440,100,100);
        add(Label2);
        ImageIcon imageicon2=new ImageIcon("C:/Users/abdul/Pictures/card.png");
        Label2.setIcon(imageicon2);

        Label4=new JLabel("WELCOME TO ATM");
        Label4.setBounds(300,120,280,40);
        add(Label4);
        Label4.setForeground(Color.WHITE);
        Label4.setFont(new Font("Arial",Font.BOLD,28));

        Label5=new JLabel("Card No:-");
        Label5.setBounds(230,190,120,30);
        add(Label5);
        Label5.setForeground(Color.WHITE);
        Label5.setFont(new Font("Arial",Font.BOLD,24));

        Label6=new JLabel("PIN No:-");
        Label6.setBounds(230,280,120,30);
        add(Label6);
        Label6.setForeground(Color.WHITE);
        Label6.setFont(new Font("Arial",Font.BOLD,24));

        TextField1=new JTextField();
        TextField1.setBounds(400,190,240,30);
        add(TextField1);
        TextField1.setForeground(Color.BLACK);
        TextField1.setFont(new Font("Arial",Font.BOLD,24));

        PasswordField1=new JPasswordField();
        PasswordField1.setBounds(400,280,240,30);
        add(PasswordField1);
        PasswordField1.setForeground(Color.BLACK);
        
        Button1=new JButton("SIGN UP");
        Button1.setBounds(230,360,200,30);
        add(Button1);
        Button1.setFont(new Font("Arial",Font.PLAIN,20));

        Button2=new JButton("CLEAR");
        Button2.setBounds(440,360,200,30);
        add(Button2);
        Button2.setFont(new Font("Arial",Font.PLAIN,20));

        Button3=new JButton("SIGN IN");
        Button3.setBounds(230,420,410,30);
        add(Button3);
        Button3.setFont(new Font("Arial",Font.PLAIN,20));

        Label3=new JLabel();
        Label3.setBounds(0,0,850,580); 
        add(Label3);
        ImageIcon imageicon3=new ImageIcon("C:/Users/abdul/Pictures/backbg.png");
        Label3.setIcon(imageicon3);

        Button2.addActionListener(new Clear());
        Button1.addActionListener(new Signup1());
        TextField1.addKeyListener(new Pin_Card());
        PasswordField1.addKeyListener(new Pin_Card());
    }
    class Pin_Card implements KeyListener
    {
        public void keyPressed(KeyEvent k1)
        {

        }
        public void keyReleased(KeyEvent k2)
        {

        }
        public void keyTyped(KeyEvent k3)
        {
            char c=k3.getKeyChar();
        if(Character.isLetter(c)&&!k3.isAltDown())
        {
            k3.consume();
        }
        }
    }
    class Clear implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            try
            {
                if(e1.getSource()==Button2)
                {
                    TextField1.setText("");
                    PasswordField1.setText("");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    class Signup1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            Sign_up1 obj=new Sign_up1();
            setVisible(false);
            obj.show(); 
        }
    }
    public static void main(String[] args) 
    {
        //Login_page lo=
        new Login_page();
    }
}
