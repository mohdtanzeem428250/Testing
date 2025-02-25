import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ATM_Machine extends JFrame
{
    JLabel Label1,Label2;
    JButton Button1,Button2;
    JTextField TextField1;
    ATM_Machine()
    {
        super("DEPOSIT");
        setSize(1200,800);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);
        setLocation(80,0);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label2=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        Label2.setBounds(275,160,410,30);
        Label2.setFont(new Font("Arial",Font.BOLD,20));
        Label2.setForeground(Color.WHITE);
        add(Label2);

        TextField1=new JTextField();
        TextField1.setBounds(275,200,405,30);
        TextField1.setFont(new Font("Arial",Font.PLAIN,22));
        TextField1.setForeground(Color.WHITE);
        TextField1.setBackground(new Color(128,80,61));
        add(TextField1);

        Button1=new JButton("DEPOSIT");
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
        public void actionPerformed(ActionEvent e3)
        {
            Main_ATM_Machine obj4=new Main_ATM_Machine();
            setVisible(false);
            obj4.show();
        }
    }
    public static void main(String[] args) 
    {
       // ATM_Machine obj=
        new ATM_Machine();
    }
}   
