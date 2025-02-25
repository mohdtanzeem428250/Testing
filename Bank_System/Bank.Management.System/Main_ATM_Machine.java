import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
public class Main_ATM_Machine extends JFrame
{
    JLabel Label1,Label2;
    JButton Button1,Button2,Button3,Button4,Button5,Button6,Button7;
    Main_ATM_Machine()
    {
        super("WELCOME ATM MACHINE");
        setLayout(null);
        setSize(1200,800);
        setResizable(false);
        setLocation(80,0);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label2=new JLabel("PLEASE YOUR SELECT TRANSACTION");
        Label2.setBounds(275,180,430,30);
        Label2.setFont(new Font("Arial",Font.BOLD,22));
        Label2.setForeground(Color.WHITE);
        add(Label2);

        Button1=new JButton("BALANCE ENQUIRY");
        Button1.setBounds(510,350,180,32);
        Button1.setFont(new Font("Arial",Font.PLAIN,14));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(new Color(128,80,61));
        add(Button1);

        Button2=new JButton("EXIT");
        Button2.setBounds(510,395,180,32);
        Button2.setFont(new Font("Arial",Font.PLAIN,14));
        Button2.setForeground(Color.WHITE);
        Button2.setBackground(new Color(128,80,61));
        add(Button2);

        Button3=new JButton("MINI STATEMENT");
        Button3.setBounds(510,305,180,32);
        Button3.setFont(new Font("Arial",Font.PLAIN,14));
        Button3.setForeground(Color.WHITE);
        Button3.setBackground(new Color(128,80,61));
        add(Button3);

        Button4=new JButton("CASH WITHDRAWL");
        Button4.setBounds(510,260,180,32);
        Button4.setFont(new Font("Arial",Font.PLAIN,14));
        Button4.setForeground(Color.WHITE);
        Button4.setBackground(new Color(128,80,61));
        add(Button4);

        Button5=new JButton("PIN CHANGE");
        Button5.setBounds(260,350,180,32);
        Button5.setFont(new Font("Arial",Font.PLAIN,14));
        Button5.setForeground(Color.WHITE);
        Button5.setBackground(new Color(128,80,61));
        add(Button5);

        Button6=new JButton("FAST CASH");
        Button6.setBounds(260,305,180,32);
        Button6.setFont(new Font("Arial",Font.PLAIN,14));
        Button6.setForeground(Color.WHITE);
        Button6.setBackground(new Color(128,80,61));
        add(Button6);

        Button7=new JButton("DEPOSIT");
        Button7.setBounds(260,260,180,32);
        Button7.setFont(new Font("Arial",Font.PLAIN,14));
        Button7.setForeground(Color.WHITE);
        Button7.setBackground(new Color(128,80,61));
        add(Button7);

        Label1=new JLabel();
        Label1.setBounds(0,0,1200,800);
        add(Label1);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/atm2.png"); 
        Label1.setIcon(imageicon1);

        Button7.addActionListener(new Deposit());
        Button4.addActionListener(new Withdrawal());
        Button2.addActionListener(new Exit());
        Button1.addActionListener(new B_E_D());
        Button6.addActionListener(new Fast_Cash());
        Button5.addActionListener(new Pin_Change());
        Button3.addActionListener(new MiniStatement());
    }
    class Deposit implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            ATM_Machine obj4=new ATM_Machine();
            setVisible(false);
            obj4.show();
        }
    }
    class Withdrawal implements ActionListener
    {
        public void actionPerformed(ActionEvent e4)
        {
            Cash_Withdrawal object=new Cash_Withdrawal();
            setVisible(false);
            object.show();
        }
    }
    class Exit implements ActionListener
    {
        public void actionPerformed(ActionEvent e5)
        {
            setVisible(false);
        }
    }
    class B_E_D implements ActionListener
    {
        public void actionPerformed(ActionEvent e6)
        {
            Balance_Enquiry__________ bed=new Balance_Enquiry__________();
            setVisible(false);
            bed.show();
        }
    }
    class Fast_Cash implements ActionListener
    {
        public void actionPerformed(ActionEvent e7)
        {
            Fast_Cash_Payment obj8=new Fast_Cash_Payment();
            setVisible(false);
            obj8.show();
        }
    }
    class Pin_Change implements ActionListener
    {
        public void actionPerformed(ActionEvent e8)
        {
                Pin_Changed__________ object1234=new Pin_Changed__________();
                setVisible(false);      
                object1234.show();
        }
    }
    class MiniStatement implements ActionListener
    {
        public void actionPerformed(ActionEvent e12)
        {
            MiniStatement MS=new MiniStatement();
            setVisible(false);
            show();
        }
    }
    public static void main(String[] args)
    {
        new Main_ATM_Machine();
    }    
}
