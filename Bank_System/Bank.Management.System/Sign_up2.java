import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Sign_up2 extends JFrame
{
    JLabel Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13;
    JComboBox ComboBox1,ComboBox2,ComboBox3,ComboBox4,ComboBox5;
    JTextField TextField1,TextField2;
    JRadioButton RadioButton1,RadioButton2,RadioButton3,RadioButton4;
    JButton Button1;
    String first;
    Sign_up2()//String first
    {
        super("SIGN IN FORM 2");
        //this.first=first;
        setSize(850,800);
        setLocation(300,5);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label1=new JLabel();
        Label1.setBounds(10,10,100,100);
        add(Label1);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/bank.png");
        Label1.setBackground(new Color(3,252,236));
        Label1.setOpaque(true);
        Label1.setIcon(imageicon1);

        Label2=new JLabel("APPLICATION FORM NO:-");//+first
        Label2.setBounds(150,20,600,40);
        Label2.setFont(new Font("Ralway",Font.BOLD,38));
        add(Label2);

        Label3=new JLabel("Page 2");
        Label3.setBounds(370,70,100,30);
        Label3.setFont(new Font("Arial",Font.BOLD,24));
        add(Label3);

        Label4=new JLabel("Additional Details");
        Label4.setBounds(314,100,300,30);
        Label4.setFont(new Font("Arial",Font.BOLD,24));
        add(Label4);

        Label5=new JLabel("Religion:-");
        Label5.setBounds(130,150,100,30);
        Label5.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label5);

        Label6=new JLabel("Category:-");
        Label6.setBounds(130,200,130,30);
        Label6.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label6);

        Label7=new JLabel("Income:-");
        Label7.setBounds(130,250,100,30);
        Label7.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label7);

        Label8=new JLabel("Educational:-");
        Label8.setBounds(130,300,130,30);
        Label8.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label8);

        Label9=new JLabel("Occupation:-");
        Label9.setBounds(130,350,140,30);
        Label9.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label9);

        Label10=new JLabel("PAN Number:-");
        Label10.setBounds(130,400,160,30);
        Label10.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label10);

        Label11=new JLabel("Aadhar Number:-");
        Label11.setBounds(130,450,180,30);
        Label11.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label11);

        Label12=new JLabel("Senior Citizen:-");
        Label12.setBounds(130,500,150,30);
        Label12.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label12);

        Label13=new JLabel("Existing Account:-");
        Label13.setBounds(130,550,190,30);
        Label13.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label13);

        String Religion[]={"Select Your Religion...","Hindu","Muslim","Sikh","Christian","Others"};
        ComboBox1=new JComboBox(Religion);
        ComboBox1.setBounds(330,150,400,30);
        ComboBox1.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox1.setBackground(new Color(3,252,236));
        add(ComboBox1);

        String Category[]={"Select Your Category...","General","OBC","SC","ST","Others"};
        ComboBox2=new JComboBox(Category);
        ComboBox2.setBounds(330,200,400,30);
        ComboBox2.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox2.setBackground(new Color(3,252,236));
        add(ComboBox2);

        String Income[]={"Select Your Income...","Null","50,000","100,000","150,000","200,000","250,000","500,000"};
        ComboBox3=new JComboBox(Income);
        ComboBox3.setBounds(330,250,400,30);
        ComboBox3.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox3.setBackground(new Color(3,252,236));
        add(ComboBox3);

        String Educational[]={"Select Your Education...","Non Graduate","Under Graduate","Post Graduate","Doctrate","Others"};
        ComboBox4=new JComboBox(Educational);
        ComboBox4.setBounds(330,300,400,30);
        ComboBox4.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox4.setBackground(new Color(3,252,236));
        add(ComboBox4);

        String Occupation[]={"Select Your Occupation...","Salaried","Self-Employed","Business","Student","Retired","Others"};
        ComboBox5=new JComboBox(Occupation);
        ComboBox5.setBounds(330,350,400,30);
        ComboBox5.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox5.setBackground(new Color(3,252,236));
        add(ComboBox5);

        TextField1=new JTextField();
        TextField1.setBounds(330,400,400,30);
        TextField1.setFont(new Font("Arial",Font.PLAIN,22));
        add(TextField1);

        TextField2=new JTextField();
        TextField2.setBounds(330,450,400,30);
        TextField2.setFont(new Font("Arial",Font.PLAIN,22));
        TextField2.setText("Format is :- XXXX-XXXX-XXXX");
        add(TextField2);

        RadioButton1=new JRadioButton("NO");
        RadioButton1.setBounds(330,500,80,30);
        RadioButton1.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton1.setBackground(new Color(3,252,236));
        add(RadioButton1);

        RadioButton2=new JRadioButton("YES");
        RadioButton2.setBounds(500,500,80,30);
        RadioButton2.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton2.setBackground(new Color(3,252,236));
        add(RadioButton2);

        ButtonGroup buttongroup1=new ButtonGroup();
        buttongroup1.add(RadioButton1);
        buttongroup1.add(RadioButton2);

        RadioButton3=new JRadioButton("NO");
        RadioButton3.setBounds(330,550,80,30);
        RadioButton3.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton3.setBackground(new Color(3,252,236));
        add(RadioButton3);

        RadioButton4=new JRadioButton("YES");
        RadioButton4.setBounds(500,550,80,30);
        RadioButton4.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton4.setBackground(new Color(3,252,236));
        add(RadioButton4);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(RadioButton3);
        buttonGroup2.add(RadioButton4);

        Button1=new JButton("Next >>");
        Button1.setBounds(582,650,150,30);
        Button1.setFont(new Font("Arial",Font.PLAIN,22));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(Color.MAGENTA);
        add(Button1);
        Button1.addActionListener(new Next1());
        TextField2.addFocusListener(new focus());
        TextField1.addMouseListener(new Mouse());
        TextField2.addMouseListener(new Mouse1());
        getContentPane().setBackground(new Color(3,252,236));
    }
    String Pan_number,Aadhar_number;
    class focus implements FocusListener
    {
        public void focusGained(FocusEvent f1)
        {
            if(TextField2.getText().equals("Format is :- XXXX-XXXX-XXXX"))
            {
                TextField2.setText("");
            }
        }
        public void focusLost(FocusEvent k2)
        {
            if(TextField2.getText().equals(""))
            {
                TextField2.setText("Format is :- XXXX-XXXX-XXXX");
            }
        }
    }

    class Mouse implements MouseListener
    {
        public void mouseEntered(MouseEvent e28)
        {
            
        }
        public void mouseExited(MouseEvent e29)
        {
            Pan_number=TextField1.getText();
            if( Pan_number.equals(""))
            {
                TextField1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            else
            {
                TextField1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }    
        }
        public void mouseClicked(MouseEvent e30)
        {
            TextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        public void mousePressed(MouseEvent e31)
        {

        }
        public void mouseReleased(MouseEvent e32)
        {
            
        } 
    }
    class Mouse1 implements MouseListener
    {
        public void mouseEntered(MouseEvent e28)
        {
            
        }
        public void mouseExited(MouseEvent e29)
        {
            Aadhar_number=TextField2.getText();
            if( Aadhar_number.equals(""))
            {
                TextField2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            else
            {
                TextField2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }    
        }
        public void mouseClicked(MouseEvent e30)
        {
            TextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        public void mousePressed(MouseEvent e31)
        {

        }
        public void mouseReleased(MouseEvent e32)
        {
            
        } 
    }
    class Next1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            if(Pan_number.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Enter PAN Number");
            }
            else if(Aadhar_number.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Enter Aadhar Number");
            }
            else if(Aadhar_number.length()!=14)
            {
                JOptionPane.showMessageDialog(null,"Invalid Aadhar Number");
            }
            else 
            {
                Sign_up3 obj2=new Sign_up3(first);
                setVisible(false);
                obj2.show();
            }
        }
    }

    public static void main(String[] args)
    {
        //Sign_up2 obj=new Sign_up2();
        new Sign_up2();//""
    }
}
