import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Sign_up1 extends JFrame
{
    JLabel Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13,Label14;
    JTextField TextField1,TextField2,TextField3,TextField4,TextField5,TextField6,TextField7;
    JRadioButton RadioButton1,RadioButton2,RadioButton3,RadioButton4,RadioButton5;
    JButton Button1;
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

        //TextField8=new JTextField();
        //TextField8.setBounds(330,300,400,30);
        //TextField8.setFont(new Font("Arial",Font.PLAIN,20));
        //add(TextField8);

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

        TextField7=new JTextField();
        TextField7.setBounds(330,600,400,30);
        TextField7.setFont(new Font("Arial",Font.PLAIN,20));
        add(TextField7);
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
        Button1=new JButton("Next");
        Button1.setBounds(582,650,150,30);
        Button1.setFont(new Font("Arial",Font.PLAIN,22));
        Button1.setBackground(Color.MAGENTA);
        Button1.setForeground(Color.WHITE);
        add(Button1);
        //-------------------Next Button called-----------
        //Button1.addActionListener(new Next());
        getContentPane().setBackground(new Color(3,252,236));

    }
    // String Name,Father_Name,Gender,Email_Address,Marital_Status,Form_Number,Date_Of_Birth,Address,City,Pin_Code,State;
    // class Next implements ActionListener
    // {
    //     public void actionPerformed(ActionEvent e)
    //     {
    //         //String Form_number=first;
    //         Name=TextField1.getText();
    //         Father_Name=TextField2.getText();
    //         //Gender=null;
    //         //Date_Of_Birth=TextField8.getText();
    //         /*if(RadioButton1.isSelected())
    //         {
    //             Gender="Male";
    //         }
    //         else if(RadioButton2.isSelected())
    //         {
    //             Gender="Female";
    //         }*/
    //         Email_Address=TextField3.getText();
    //         Address=TextField4.getText();
    //         /*Marital_Status=null;
    //         if(RadioButton3.isSelected())
    //         {
    //             Marital_Status="Married";
    //         }
    //         else if(RadioButton4.isSelected())
    //         {
    //             Marital_Status="Unmarried";
    //         }
    //         else if(RadioButton5.isSelected())
    //         {
    //             Marital_Status="Other";
    //         }*/
    //         City=TextField5.getText();
    //         State=TextField7.getText();
    //         if(Name.equals(""))
    //         {
    //             JOptionPane.showConfirmDialog(null,"Please Enter Name","Name",JOptionPane.YES_NO_CANCEL_OPTION);
    //         }
    //         else if(Father_Name.equals(""))
    //         {
    //             JOptionPane.showConfirmDialog(null,"Please Enter Father Name","Father Name",JOptionPane.YES_NO_CANCEL_OPTION);
    //         }
    //         else if (Date_Of_Birth.equals(""))
    //         {
    //             JOptionPane.showConfirmDialog(null,"Please Enter Date Of Birth","DOB",JOptionPane.YES_NO_CANCEL_OPTION);
    //         }
    //         else if (Email_Address.equals(""))
    //         {
    //             JOptionPane.showConfirmDialog(null,"Please Enter Email Address","Address",JOptionPane.YES_NO_CANCEL_OPTION);
    //         }
    //         else if(Address.equals(""))
    //         {
    //             JOptionPane.showConfirmDialog(null,"Please Enter Address","Address",JOptionPane.YES_NO_CANCEL_OPTION);
    //         }
    //         else if(City.equals(""))
    //         {
    //             JOptionPane.showConfirmDialog(null,"Please Enter City","City",JOptionPane.YES_NO_CANCEL_OPTION);
    //         }
    //         else if(State.equals(""))
    //         {
    //             JOptionPane.showConfirmDialog(null,"Please Enter state","State",JOptionPane.YES_NO_CANCEL_OPTION);
    //         }
    //         else
    //         {
                //try
                //{
                  //  Connectivity_Database object1=new Connectivity_Database();
                    //String query="insert into signup1 values('"+Form_Number+"','"+Name+"','"+Father_Name+"','"+Gender+"','"+Date_Of_Birth+"','"+Email_Address+"','"+Marital_Status+"','"+Address+"','"+City+"','"+Pin_Code+"','"+State+"')";
                    //object1.statement.executeUpdate(query);
                    // Sign_up2 obj1=new Sign_up2(first);
                    // setVisible(false);
                    // obj1.show();
                //}
                //catch(Exception a)
                //{
                  //  a.printStackTrace();
                //}
            //}
        //}
    //}
    public static void main(String[] args)
    {
        Sign_up1 obj=new Sign_up1();
        //new Sign_up1();
    }   
}
