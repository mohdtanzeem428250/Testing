import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
 class Sign_up1 extends JFrame implements KeyListener
{
    JLabel Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13,Label14;
    JTextField TextField1,TextField2,TextField3,TextField4,TextField5,TextField6;
    JRadioButton RadioButton1,RadioButton2,RadioButton3,RadioButton4,RadioButton5;
    JButton Button1;
    JComboBox ComboBox1,ComboBox2,ComboBox3,ComboBox4;
    Random object=new Random();
    long random=(object.nextLong()%9000L)+1000L;
    String first=""+Math.abs(random);
    Sign_up1()
    {
        //---------------Basic Structure------------
        super("SIGN IN FORM 1");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850,800);
        setLocation(300,5);
        setUndecorated(true);
        //setVisible(true);
        setResizable(false);
        //-----------------ImageIcon-----------------
        Label1=new JLabel();
        Label1.setBounds(10,10,100,100);
        //Label1.getContentPane().setBackground(new Color(3,252,236));
        add(Label1);
        ImageIcon imageicon1=new ImageIcon("C:/Users/abdul/Pictures/bank.png");
        Label1.setIcon(imageicon1);
        //----------------Top Heading----------
        Label2=new JLabel("APPLICATION FORM NO:-"+first);
        Label2.setBounds(150,20,600,40);
        Label2.setFont(new Font("Ralway",Font.BOLD,38));
        add(Label2);
        //-----------------Page is first----------
        Label3=new JLabel("Page 1");
        Label3.setBounds(370,70,100,30);
        Label3.setFont(new Font("Arial",Font.BOLD,24));
        add(Label3);
        //-----------------Personal Details------------
        Label4=new JLabel("Personal Details");
        Label4.setBounds(314,100,300,30);
        Label4.setFont(new Font("Arial",Font.BOLD,24));
        add(Label4);
        //------------------All Labels Fields-----------------
        Label5=new JLabel("Name:-");
        Label5.setBounds(130,150,100,30);
        Label5.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label5);

        Label6=new JLabel("Father's Name:-");
        Label6.setBounds(130,200,160,30);
        Label6.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label6);

        Label7=new JLabel("Gender:-");
        Label7.setBounds(130,250,100,30);
        Label7.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label7);

        Label8=new JLabel("Date Of Birth:-");
        Label8.setBounds(130,300,150,30);
        Label8.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label8);

        Label9=new JLabel("Email Address:-");
        Label9.setBounds(130,350,180,30);
        Label9.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label9);

        Label10=new JLabel("Marital Status:-");
        Label10.setBounds(130,400,160,30);
        Label10.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label10);

        Label11=new JLabel("Address:-");
        Label11.setBounds(130,450,100,30);
        Label11.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label11);

        Label12=new JLabel("City:-");
        Label12.setBounds(130,500,100,30);
        Label12.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label12);

        Label13=new JLabel("Pin Code:-");
        Label13.setBounds(130,550,120,30);
        Label13.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label13);

        Label14=new JLabel("State:-");
        Label14.setBounds(130,600,100,30);
        Label14.setFont(new Font("Arial",Font.PLAIN,22));
        add(Label14);
        //----------------------TextFields--------------------------
        TextField1=new JTextField();
        TextField1.setBounds(330,150,400,30);
        TextField1.setFont(new Font("Arial",Font.PLAIN,20));
        add(TextField1);

        TextField2=new JTextField();
        TextField2.setBounds(330,200,400,30);
        TextField2.setFont(new Font("Arial",Font.PLAIN,20));
        add(TextField2);

        String dates[]={" DD ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        ComboBox1=new JComboBox(dates);
        ComboBox1.setBounds(330,300,70,30);
        ComboBox1.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox1.setBackground(new Color(3,252,236));
        add(ComboBox1);

        String months[]={" MM ","January","February","March","April","May","June","July","August","September","October","November","December"};
        ComboBox2=new JComboBox(months);
        ComboBox2.setBounds(440,300,150,30);
        ComboBox2.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox2.setBackground(new Color(3,252,236));
        add(ComboBox2);

        String years[]={" YYYY ","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
        ComboBox3=new JComboBox(years);
        ComboBox3.setBounds(630,300,100,30);
        ComboBox3.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox3.setBackground(new Color(3,252,236));
        add(ComboBox3);

        TextField3=new JTextField();
        TextField3.setBounds(330,350,400,30);
        TextField3.setFont(new Font("Arial",Font.PLAIN,20));
        add(TextField3);

        TextField4=new JTextField();
        TextField4.setBounds(330,450,400,30);
        TextField4.setFont(new Font("Arial",Font.PLAIN,20));
        add(TextField4);

        TextField5=new JTextField();
        TextField5.setBounds(330,500,400,30);
        TextField5.setFont(new Font("Arial",Font.PLAIN,20));
        add(TextField5);

        TextField6=new JTextField();
        TextField6.setBounds(330,550,400,30);
        TextField6.setFont(new Font("Arial",Font.PLAIN,20));
        add(TextField6);

        String states[]={"Select Your State...","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Uttarkhand","Uttar Pradesh","Tripura","West Bengal"};
        ComboBox4=new JComboBox(states);
        ComboBox4.setBounds(330,600,400,30);
        ComboBox4.setFont(new Font("Arial",Font.PLAIN,22));
        ComboBox4.setBackground(new Color(3,252,236));
        add(ComboBox4);

        //------------Radio Button-------------
        RadioButton1=new JRadioButton("Male");
        RadioButton1.setBounds(330,250,70,30);
        RadioButton1.setFont(new Font("Arial",Font.PLAIN,20));
        RadioButton1.setBackground(new Color(3,252,236));
        add(RadioButton1);

        RadioButton2=new JRadioButton("Female");
        RadioButton2.setBounds(475,250,105,30);
        RadioButton2.setFont(new Font("Arial",Font.PLAIN,20));
        RadioButton2.setBackground(new Color(3,252,236));
        add(RadioButton2);
        //-----------Group-------------
        ButtonGroup buttongroup1=new ButtonGroup();
        buttongroup1.add(RadioButton1);
        buttongroup1.add(RadioButton2);
        //--------Radio Button-----------
        RadioButton3=new JRadioButton("Married");
        RadioButton3.setBounds(330,400,90,30);
        RadioButton3.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton3.setBackground(new Color(3,252,236));
        add(RadioButton3);

        RadioButton4=new JRadioButton("Unmarried");
        RadioButton4.setBounds(475,400,115,30);
        RadioButton4.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton4.setBackground(new Color(3,252,236));
        add(RadioButton4);

        RadioButton5=new JRadioButton("Other");
        RadioButton5.setBounds(650,400,80,30);
        RadioButton5.setFont(new Font("Arial",Font.PLAIN,18));
        RadioButton5.setBackground(new Color(3,252,236));
        add(RadioButton5);
        //---------------Group--------
        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(RadioButton3);
        buttonGroup2.add(RadioButton4);
        buttonGroup2.add(RadioButton5);
        //-------------------Next Button---------------
        Button1=new JButton("Next >>");
        Button1.setBounds(582,650,150,30);
        Button1.setFont(new Font("Arial",Font.PLAIN,22));
        Button1.setBackground(Color.MAGENTA);
        Button1.setForeground(Color.WHITE);
        add(Button1);
        //-------------------Next Button called-----------
        Button1.addActionListener(new Next());
        TextField6.addKeyListener(this);
        TextField1.addMouseListener(new Mouse());
        TextField2.addMouseListener(new Mouse1());
        TextField3.addMouseListener(new Mouse2());
        TextField4.addMouseListener(new Mouse3());
        TextField5.addMouseListener(new Mouse4());
        TextField6.addMouseListener(new Mouse5());
        getContentPane().setBackground(new Color(3,252,236));
    }
    public void keyTyped(KeyEvent arg0)
    {
        char c=arg0.getKeyChar();
        if(Character.isLetter(c)&&!arg0.isAltDown())
        {
            arg0.consume();
        }
    }
    public void keyReleased(KeyEvent arg0)
    {
        
    }
    public void keyPressed(KeyEvent arg0)
    {
        
    }
    String Name,Father_Name,Gender,Email_Address,Marital_Status,Form_Number,Address,City,Pin_Code;
    class Mouse implements MouseListener
    {
        public void mouseEntered(MouseEvent e28)
        {
            
        }
        public void mouseExited(MouseEvent e29)
        {
            Name=TextField1.getText();
            if(Name.equals(""))
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
            Father_Name=TextField2.getText();
            if(Father_Name.equals(""))
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
    class Mouse2 implements MouseListener
    {
        public void mouseEntered(MouseEvent e28)
        {
            
        }
        public void mouseExited(MouseEvent e29)
        {
            Email_Address=TextField3.getText();
            if(Email_Address.equals(""))
            {
                TextField3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            else
            {
                TextField3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }    
        }
        public void mouseClicked(MouseEvent e30)
        {
            TextField3.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        public void mousePressed(MouseEvent e31)
        {

        }
        public void mouseReleased(MouseEvent e32)
        {
            
        }
    }
    class Mouse3 implements MouseListener
    {
        public void mouseEntered(MouseEvent e28)
        {
            
        }
        public void mouseExited(MouseEvent e29)
        {
            Address=TextField4.getText();
            if(Address.equals(""))
            {
                TextField4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            else
            {
                TextField4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }    
        }
        public void mouseClicked(MouseEvent e30)
        {
            TextField4.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        public void mousePressed(MouseEvent e31)
        {

        }
        public void mouseReleased(MouseEvent e32)
        {
            
        }
    }
    class Mouse4 implements MouseListener
    {
        public void mouseEntered(MouseEvent e28)
        {
            
        }
        public void mouseExited(MouseEvent e29)
        {
            City=TextField5.getText();
            if(City.equals(""))
            {
                TextField5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            else
            {
                TextField5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }    
        }
        public void mouseClicked(MouseEvent e30)
        {
            TextField5.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        public void mousePressed(MouseEvent e31)
        {

        }
        public void mouseReleased(MouseEvent e32)
        {
            
        }
    }
    class Mouse5 implements MouseListener
    {
        public void mouseEntered(MouseEvent e28)
        {
            
        }
        public void mouseExited(MouseEvent e29)
        {
            Pin_Code=TextField6.getText();
            if(Pin_Code.equals(""))
            {
                TextField6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            else
            {
                TextField6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }    
        }
        public void mouseClicked(MouseEvent e30)
        {
            TextField6.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        public void mousePressed(MouseEvent e31)
        {

        }
        public void mouseReleased(MouseEvent e32)
        {
            
        }
    }
    class Next implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Form_Number=first;
            Name=TextField1.getText();
            Father_Name=TextField2.getText();
            Email_Address=TextField3.getText();
            Address=TextField4.getText();
            City=TextField5.getText();
            Pin_Code=TextField6.getText();
            Gender=null;
            if(RadioButton1.isSelected())
            {
                Gender="Male";
            }
            else if(RadioButton2.isSelected())
            {
                Gender="Female";
            }
            Marital_Status=null;
            if(RadioButton3.isSelected())
            {
                Marital_Status="Married";
            }
            else if(RadioButton4.isSelected())
            {
                Marital_Status="Unmarried";
            }
            else if(RadioButton5.isSelected())
            {
                Marital_Status="Other";
            }
            try
            {
                if(Pin_Code.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please Enter Pin Code");
                }
                else if(Pin_Code.length()!=6)
                {   
                    JOptionPane.showMessageDialog(null,"Invalid Pin Code");
                }
                else
                {
                    //Connectivity_Database connectivity_database=new Connectivity_Database();
                    //String insert_url="insert into signup1 values('"+Form_Number+"','"+Name+"','"+Father_Name+"','"+Gender+"','"+"date"+"','"+Email_Address+"','"+Marital_Status+"','"+Address+"','"+City+"','"+Pin_Code+"','"+"State"+"')";
                    //connectivity_database.statement.executeUpdate(insert_url);
                    Sign_up2 obj1=new Sign_up2();
                    setVisible(false);
                    obj1.show();
                }
            }
            catch(Exception obj)
            {
                obj.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        //Sign_up1 obj=new Sign_up1();
        new Sign_up1();
    }   
}