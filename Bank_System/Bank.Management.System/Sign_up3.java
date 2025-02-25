import javax.swing.*;

//import Bank.Management.System.Login_page;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Sign_up3 extends JFrame
{
    JLabel Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13;
    JRadioButton RadioButton1,RadioButton2,RadioButton3,RadioButton4;
    JCheckBox CheckBox1,CheckBox2,CheckBox3,CheckBox4,CheckBox5,CheckBox6,CheckBox7;
    JButton Button1,Button2,Button3;
    Random object=new Random();
    long Card_number=(object.nextLong()%9000000000000000L)+1000000000000000L;
    String Card_number1=""+Math.abs(Card_number);
    long Pin=(object.nextLong()%9000L)+1000L;
    String Pin1=""+Math.abs(Pin);
    String first;
    Sign_up3(String first)//String first
    {
        super("SIGN IN FORM 3");
        this.first=first;
        setSize(850,900);
        setUndecorated(true);
        setVisible(true);
        setLocation(300,0);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label1=new JLabel();
        Label1.setBounds(10,10,100,100);
        add(Label1);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/bank.png");
        Label1.setIcon(imageicon1);

        Label2=new JLabel("APPLICATION FORM NO:-"+first);//first
        Label2.setBounds(150,20,660,40);
        Label2.setFont(new Font("Ralway",Font.BOLD,38));
        add(Label2);

        Label3=new JLabel("Page 3");
        Label3.setBounds(370,70,100,30);
        Label3.setFont(new Font("Arial",Font.BOLD,24));
        add(Label3);

        Label4=new JLabel("Account Details");
        Label4.setBounds(314,100,300,30);
        Label4.setFont(new Font("Aria1",Font.BOLD,24));
        add(Label4);

        Label5=new JLabel("Account Type:-");
        Label5.setBounds(130,150,150,30);
        Label5.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label5);

        RadioButton1=new JRadioButton("Saving Account");
        RadioButton1.setBounds(150,200,160,30);
        RadioButton1.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton1.setBackground(new Color(3,252,236));
        add(RadioButton1);

        RadioButton2=new JRadioButton("Fixed Deposit Account");
        RadioButton2.setBounds(420,200,220,30);
        RadioButton2.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton2.setBackground(new Color(3,252,236));
        add(RadioButton2);

        RadioButton3=new JRadioButton("Current Account");
        RadioButton3.setBounds(150,250,180,30);
        RadioButton3.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton3.setBackground(new Color(3,252,236));
        add(RadioButton3);

        RadioButton4=new JRadioButton("Recurring Deposit Account");
        RadioButton4.setBounds(420,250,280,30);
        RadioButton4.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton4.setBackground(new Color(3,252,236));
        add(RadioButton4);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(RadioButton1);
        buttonGroup1.add(RadioButton2);
        buttonGroup1.add(RadioButton3);
        buttonGroup1.add(RadioButton4);

        Label6=new JLabel("Card Number:-");
        Label6.setBounds(130,300,150,30);
        Label6.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label6);

        Label7=new JLabel("(Your 16-Digit Card Number)");
        Label7.setBounds(130,340,200,15);
        Label7.setFont(new Font("Arial",Font.PLAIN,15));
        add(Label7);

        Label8=new JLabel("XXXX-XXXX-XXXX-XXXX");
        Label8.setBounds(420,300,270,30);
        Label8.setFont(new Font("Arial",Font.BOLD,22));
        Label8.setForeground(Color.RED);
        add(Label8);

        Label9=new JLabel("(It would appear on ATM card/cheque Book and Statement)");
        Label9.setBounds(420,340,400,15);
        Label9.setFont(new Font("Arial",Font.PLAIN,15));
        add(Label9);

        Label10=new JLabel("PIN:-");
        Label10.setBounds(130,390,50,30);
        Label10.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label10);

        Label11=new JLabel("(4-Digit Password)");
        Label11.setBounds(130,430,150,15);
        Label11.setFont(new Font("Arial",Font.PLAIN,15));
        add(Label11);

        Label12=new JLabel("XXXX");
        Label12.setBounds(420,390,60,30);
        Label12.setFont(new Font("Arial",Font.BOLD,22));
        Label12.setForeground(new Color(255,0,0)); 
        add(Label12);

        Label13=new JLabel("Services Required:-");
        Label13.setBounds(130,480,200,30);
        Label13.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label13);

        CheckBox1=new JCheckBox("ATM Card");
        CheckBox1.setBounds(150,530,120,30);
        CheckBox1.setFont(new Font("Arial",Font.PLAIN,18));
        CheckBox1.setBackground(new Color(3,252,236));
        add(CheckBox1);

        CheckBox2=new JCheckBox("Internet Banking");
        CheckBox2.setBounds(420,530,180,30);
        CheckBox2.setFont(new Font("Arial",Font.PLAIN,18));
        CheckBox2.setBackground(new Color(3,252,236));
        add(CheckBox2);

        CheckBox3=new JCheckBox("Mobile Banking");
        CheckBox3.setBounds(150,570,150,30);
        CheckBox3.setFont(new Font("Arial",Font.PLAIN,18));
        CheckBox3.setBackground(new Color(3,252,236));
        add(CheckBox3);

        CheckBox4=new JCheckBox("Email Alert");
        CheckBox4.setBounds(420,570,150,30);
        CheckBox4.setFont(new Font("Arial",Font.PLAIN,18));
        CheckBox4.setBackground(new Color(3,252,236));
        add(CheckBox4);

        CheckBox5=new JCheckBox("Cheque Book");
        CheckBox5.setBounds(150,610,150,30);
        CheckBox5.setFont(new Font("Arial",Font.PLAIN,18));
        CheckBox5.setBackground(new Color(3,252,236));
        add(CheckBox5);

        CheckBox6=new JCheckBox("E-Statement");
        CheckBox6.setBounds(420,610,150,30);
        CheckBox6.setFont(new Font("Arial",Font.PLAIN,18));
        CheckBox6.setBackground(new Color(3,252,236));
        add(CheckBox6);

        CheckBox7=new JCheckBox("I here by decleares that the above entered details correct to the best of my knowledge",true);
        CheckBox7.setBounds(130,645,580,15);
        CheckBox7.setFont(new Font("Arial",Font.PLAIN,15));
        CheckBox7.setBackground(new Color(3,252,236));
        add(CheckBox7);

        Button1=new JButton("Submit");
        Button1.setBounds(338,665,150,30);
        Button1.setFont(new Font("Arial",Font.PLAIN,22));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(Color.MAGENTA);
        add(Button1);

        Button2=new JButton("Cancel");
        Button2.setBounds(550,665,150,30);
        Button2.setFont(new Font("Arial",Font.PLAIN,22));
        Button2.setForeground(Color.WHITE);
        Button2.setBackground(Color.MAGENTA);
        add(Button2);

        Button3=new JButton("Login");
        Button3.setBounds(130,665,150,30);
        Button3.setFont(new Font("Arial",Font.PLAIN,22));
        Button3.setForeground(Color.WHITE);
        Button3.setBackground(Color.MAGENTA);
        add(Button3);

        Button1.addActionListener(new Submit());
        Button2.addActionListener(new Cancel());
        Button3.addActionListener(new Login());
        getContentPane().setBackground(new Color(3,252,236));
    }
    class Submit implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            //if(e1.getSource()==Button1)
            //{
                JOptionPane.showMessageDialog(null,"Card Number:-"+Card_number+"\n"+"PIN Number:-"+Pin1);
            //}
        }
    }
    class Cancel implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            setVisible(false);
        }
    }
    class Login implements ActionListener
    {
        public void actionPerformed(ActionEvent e2)
        {
            Login_page obj3=new Login_page();
            setVisible(false);
            obj3.show();
        }
    }
    public static void main(String[] args)
    {
       // Sign_up3 obj=
        new Sign_up3("");//""
    }
}
