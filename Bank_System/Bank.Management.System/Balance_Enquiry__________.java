import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Balance_Enquiry__________ extends JFrame
{
    JLabel Label1,Label2,Label3;
    JButton Button1;
    Balance_Enquiry__________()
    {
        setSize(1200,800);
        setResizable(false);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
        setLocation(80,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label2=new JLabel("YOUR CURRENT BALANCE IS Rs:-");
        Label2.setBounds(285,180,400,30);
        Label2.setFont(new Font("Arial",Font.BOLD,22));
        Label2.setForeground(Color.WHITE);
        add(Label2);

        Label3=new JLabel("TANZEEM");
        Label3.setBounds(285,220,150,30);
        Label3.setFont(new Font("Arial",Font.PLAIN,22));
        Label3.setForeground(Color.WHITE);
        add(Label3);

        Button1=new JButton("BACK");
        Button1.setBounds(510,395,180,32);
        Button1.setFont(new Font("Arial",Font.PLAIN,16));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(new Color(128,80,61));
        add(Button1);

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
            Main_ATM_Machine object1=new Main_ATM_Machine();
            setVisible(false);
            object1.show();
        }
    }
    public static void main(String[] args)
    {
        //Balance_Enquiry obj8=
        new Balance_Enquiry__________();
    }
}