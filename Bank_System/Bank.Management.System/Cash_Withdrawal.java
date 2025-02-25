import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cash_Withdrawal extends JFrame
{
    JLabel Label1,Label2,Label3;
    JTextField TextField1;
    JButton Button1,Button2;
    Cash_Withdrawal()
    {
        super("WITHDRAWAL");
        setLayout(null);
        setSize(1200,800);
        setResizable(false);
        setLocation(80,0);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label2=new JLabel("MAXIMUM WITHDRAWAL IS Rs/-10,000");
        Label2.setBounds(290,160,370,30);
        Label2.setFont(new Font("Arial",Font.BOLD,20));
        Label2.setForeground(Color.WHITE);
        add(Label2);

        Label3=new JLabel("PLEASE ENTER YOUR AMOUNT");
        Label3.setBounds(320,200,380,30);
        Label3.setFont(new Font("Arial",Font.BOLD,20));
        Label3.setForeground(Color.WHITE);
        add(Label3);

        TextField1=new JTextField();
        TextField1.setBounds(290,240,370,30);
        TextField1.setFont(new Font("Arial",Font.PLAIN,22));
        TextField1.setForeground(Color.WHITE);
        TextField1.setBackground(new Color(128,80,61));
        add(TextField1);

        Button1=new JButton("WITHDRAWAL");
        Button1.setBounds(535,350,150,32);
        Button1.setFont(new Font("Arial",Font.PLAIN,16));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(new Color(128,80,61));
        add(Button1);

        Button2=new JButton("BACK");
        Button2.setBounds(535,395,150,32);
        Button2.setFont(new Font("Arial",Font.PLAIN,16));
        Button2.setForeground(Color.WHITE);
        Button2.setBackground(new Color(128,80,61));
        add(Button2);

        Label1=new JLabel();
        Label1.setBounds(0,0,1200,800);
        add(Label1);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/atm2.png");
        Label1.setIcon(imageicon1);

        Button2.addActionListener(new Back());
    }
    class Back implements ActionListener
    {
        public void actionPerformed(ActionEvent e5)
        {
            Main_ATM_Machine obj6=new Main_ATM_Machine();
            setVisible(false);
            obj6.show();
        }
    }
    public static void main(String[] args) 
    {
       //Withdrawal obj=
       new Cash_Withdrawal();
    }   
}
