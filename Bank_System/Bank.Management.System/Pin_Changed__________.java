import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pin_Changed__________ extends JFrame
{
    JLabel Label1,Label2,Label3,Label4; 
    JPasswordField PasswordField1,PasswordField2;
    JButton Button1,Button2;
    Pin_Changed__________()
    {
        setSize(1200,800);
        setLocation(80,0);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label2=new JLabel("CHANGE YOUR PIN");
        Label2.setBounds(375,160,300,30);
        Label2.setFont(new Font("Arial",Font.BOLD,22));
        Label2.setForeground(Color.WHITE);
        add(Label2);

        Label3=new JLabel("New Pin:-");
        Label3.setBounds(280,200,100,30);
        Label3.setFont(new Font("Arial",Font.PLAIN,20));
        Label3.setForeground(Color.WHITE);
        add(Label3);

        Label4=new JLabel("Re-Enter New Pin:-");
        Label4.setBounds(280,240,200,30);
        Label4.setFont(new Font("Arial",Font.PLAIN,20));
        Label4.setForeground(Color.WHITE);
        add(Label4);

        PasswordField1=new JPasswordField();
        PasswordField1.setBounds(480,200,190,30);
        PasswordField1.setFont(new Font("Arial",Font.PLAIN,20));
        PasswordField1.setForeground(Color.WHITE);
        PasswordField1.setBackground(new Color(128,80,61));
        add(PasswordField1);

        PasswordField2=new JPasswordField();
        PasswordField2.setBounds(480,240,190,30);
        PasswordField2.setFont(new Font("Arial",Font.PLAIN,20));
        PasswordField2.setForeground(Color.WHITE);
        PasswordField2.setBackground(new Color(128,80,61));
        add(PasswordField2);

        Button1=new JButton("CHANGE");
        Button1.setBounds(510,350,180,32);
        Button1.setFont(new Font("Arial",Font.PLAIN,16));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(new Color(128,80,61));
        add(Button1);

        Button2=new JButton("BACK");
        Button2.setBounds(510,395,180,32);
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
        public void actionPerformed(ActionEvent e1)
        {
                Main_ATM_Machine obj11=new Main_ATM_Machine();
                setVisible(false);
                obj11.show();
        }
    }
    public static void main(String[] args) 
    {
        //New_Pin obj=
        new Pin_Changed__________();
    }   
}
