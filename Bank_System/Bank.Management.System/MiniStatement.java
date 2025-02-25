import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MiniStatement extends JFrame
{
    JLabel label1;
    JButton Button1;
    MiniStatement()
    {
        super("MINI STATEMENT");
        setLayout(null);
        setSize(500,700);
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1=new JLabel("MINI STATEMENT");
        label1.setBounds(165,20,200,30);
        label1.setFont(new Font("Arial",Font.PLAIN,18));
        label1.setForeground(Color.RED);
        add(label1);

        Button1=new JButton("Exit");
        Button1.setBounds(20,680,150,30);
        Button1.setFont(new Font("Arial",Font.PLAIN,20));
        Button1.setBackground(new Color(3,252,236));
        add(Button1);

        Button1.addActionListener(new Exited());

        getContentPane().setBackground(new Color(255,204,204));
    }
    class Exited implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        //Mini_Statement obj=
        new MiniStatement();
    }   
}
