import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Fast_Cash_Payment extends JFrame
{
    JLabel Label1,Label2;
    JButton Button1,Button2,Button3,Button4,Button5,Button6,Button7;
    Fast_Cash_Payment()
    {
        setSize(1200,800);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);
        setLayout(null);
        setLocation(80,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label2=new JLabel("SELECT WITHDRAWL AMOUNT");
        Label2.setBounds(305,180,400,30);
        Label2.setFont(new Font("Arial",Font.BOLD,22));
        Label2.setForeground(Color.WHITE);
        add(Label2);

        Button1=new JButton("BACK");
        Button1.setBounds(510,395,180,32);
        Button1.setFont(new Font("Arial",Font.PLAIN,16));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(new Color(128,80,61));
        add(Button1);

        Button2=new JButton("Rs/- 100");
        Button2.setBounds(260,260,180,32);
        Button2.setFont(new Font("Arial",Font.PLAIN,16));
        Button2.setForeground(Color.WHITE);
        Button2.setBackground(new Color(128,80,61));
        add(Button2);

        Button3=new JButton("Rs/- 1,000");
        Button3.setBounds(260,305,180,32);
        Button3.setFont(new Font("Arial",Font.PLAIN,16));
        Button3.setForeground(Color.WHITE);
        Button3.setBackground(new Color(128,80,61));
        add(Button3);

        Button4=new JButton("Rs/- 5,000");
        Button4.setBounds(260,350,180,32);
        Button4.setFont(new Font("Arial",Font.PLAIN,16));
        Button4.setForeground(Color.WHITE);
        Button4.setBackground(new Color(128,80,61));
        add(Button4);

        Button5=new JButton("Rs/- 500");
        Button5.setBounds(510,260,180,32);
        Button5.setFont(new Font("Arial",Font.PLAIN,16));
        Button5.setForeground(Color.WHITE);
        Button5.setBackground(new Color(128,80,61));
        add(Button5);

        Button6=new JButton("Rs/- 2,000");
        Button6.setBounds(510,305,180,32);
        Button6.setFont(new Font("Arial",Font.PLAIN,16));
        Button6.setForeground(Color.WHITE);
        Button6.setBackground(new Color(128,80,61));
        add(Button6);

        Button7=new JButton("Rs/- 10,000");
        Button7.setBounds(510,350,180,32);
        Button7.setFont(new Font("Arial",Font.PLAIN,16));
        Button7.setForeground(Color.WHITE);
        Button7.setBackground(new Color(128,80,61));
        add(Button7);

        Label1=new JLabel();
        Label1.setBounds(0,0,1200,800);
        add(Label1);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/atm2.png");
        Label1.setIcon(imageicon1);

        Button1.addActionListener(new Back());
    }
    class Back implements ActionListener
    {
        public void actionPerformed(ActionEvent e9)
        {
            Main_ATM_Machine obj9=new Main_ATM_Machine();
            setVisible(false);
            obj9.show();
        }
    }
    public static void main(String[] args)
    {
        //sFast_Cash obj=
        new Fast_Cash_Payment();
    }
}
