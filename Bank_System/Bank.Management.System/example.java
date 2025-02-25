import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class example extends JFrame
{
    JTextField t1;
    JButton b1;
    JRadioButton r1,r2;
    example()
    {

    }
    example(String name)
    {
        super(name);
    }
    public void setComponents()
    {
        setLayout(null);
        t1=new JTextField();
        t1.setBounds(100,100,300,30);
        add(t1);
        b1=new JButton("Click");
        b1.setBounds(100,300,300,30);
        add(b1);
        r1=new JRadioButton("Male");
        r1.setBounds(100,200,150,30);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setBounds(250,200,150,30);
        add(r2);
        ButtonGroup buttongroup1=new ButtonGroup();
        buttongroup1.add(r1);
        buttongroup1.add(r2);
        b1.addActionListener(new h1());
    }
    class h1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1=t1.getText();
            String s2=null;
            Connection connection=null;
            Statement statement=null;
            if(r1.isSelected())
            {
                s2="Male";
            }
            else if(r2.isSelected())
            {
                s2="Female";
            }
            try
            {
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/local","root","tanzeem");
                statement=connection.createStatement();
                String insert_url="insert into new values('"+s1+"','"+s2+"')";
                int i=statement.executeUpdate(insert_url);
                if(i==1)
                {
                    System.out.println("Record insert successful");
                }
                else
                {
                    System.out.println("Failed");
                }
            }
            catch(Exception w)
            {
                System.out.println(w);
            }
        }
    }
    public static void main(String[] args)
    {
        example obj=new example("Hello");
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setComponents();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
