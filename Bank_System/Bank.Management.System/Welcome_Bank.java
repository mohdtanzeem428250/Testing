import javax.swing.*;
import java.awt.*;
public class Welcome_Bank 
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(519,700);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocation(400,0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1=new JLabel();
        label1.setBounds(0,0,500,500);
        frame.add(label1);
        JLabel label2=new JLabel("WELCOME TO BANK MANAGEMANT SYSTEM");
        label2.setBounds(10,530,500,30);
        label2.setFont(new Font("Arial",Font.BOLD,22));
        label2.setForeground(new Color(255,0,0));
        frame.add(label2);
        JLabel label3=new JLabel("Wait For Only 5 Seconds");
        label3.setBounds(120,580,300,30);
        label3.setFont(new Font("Arial",Font.BOLD,22));
        label3.setForeground(new Color(0,0,255));
        frame.add(label3);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/java-Logo.png");
        label1.setIcon(imageicon1);
        try
        {
            Thread.sleep(5000);
            frame.setVisible(false);
            Login_page loginpage=new Login_page();
            loginpage.show();
        }
        catch(Exception w)
        {
            w.printStackTrace();
        }
    }
}