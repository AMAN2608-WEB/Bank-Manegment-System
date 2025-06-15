package bank.manegment.sytem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,M1,M2,M3;
    JButton next;

    JTextField textName, textFname, textEmail, textadd, textcity, textpincode, textsState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");


        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD, 28));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 28));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father Name: ");
        labelfName.setFont(new Font("Raleway",Font.BOLD, 28));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 28));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway",Font.BOLD, 28));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("GENDER");
        labelG.setFont(new Font("Raleway",Font.BOLD,28));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Rakeway",Font.BOLD,20));
        r1.setBounds(300,298,60,30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("Rakeway",Font.BOLD,20));
        r2.setBounds(450,298,90,30);
        add(r2);

        r3 = new JRadioButton("OTHER");
        r3.setFont(new Font("Rakeway",Font.BOLD,20));
        r3.setBounds(600,298,120,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email address");
        labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 28));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status");
        labelMs.setFont(new Font("Raleway", Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        M1 = new JRadioButton("Married");
        M1.setFont(new Font("Rakeway",Font.BOLD,20));
        M1.setBounds(300,440,100,30);
        add(M1);

        M2 = new JRadioButton("UnMarried");
        M2.setFont(new Font("Rakeway",Font.BOLD,20));
        M2.setBounds(450,440,100,30);
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setFont(new Font("Rakeway",Font.BOLD,20));
        M3.setBounds(635,440,100,30);
        add(M3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(M1);
        buttonGroup1.add(M2);
        buttonGroup1.add(M3);


        JLabel labeladd = new JLabel("Address");
        labeladd.setFont(new Font("Raleway", Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD, 28));
        textadd.setBounds(300, 490,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City");
        labelcity.setFont(new Font("Raleway", Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD, 28));
        textcity.setBounds(300, 540,400,30);
        add(textcity);

        JLabel labelpincode = new JLabel("PIN CODE");
        labelpincode.setFont(new Font("Raleway", Font.BOLD,20));
        labelpincode.setBounds(100,590,200,30);
        add(labelpincode);

        textpincode = new JTextField();
        textpincode.setFont(new Font("Raleway",Font.BOLD, 28));
        textpincode.setBounds(300, 590,400,30);
        add(textpincode);


        JLabel labelState = new JLabel("STATE");
        labelState.setFont(new Font("Raleway", Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textsState = new JTextField();
        textsState.setFont(new Font("Raleway",Font.BOLD, 28));
        textsState.setBounds(300, 640,400,30);
        add(textsState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        // getContentPane().setBackground(new Color(Color.white.getColorSpace(), ));
        setLayout(null);
        setSize(1000,780);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "outher";
        }
        String email = textEmail.getText();
        String marital =null;
        if (M1.isSelected()){
            marital = "Married";
        } else if (M2.isSelected()) {
            marital = "Unmarrid";
        } else if (M3.isSelected()) {
            marital = "Other";
        }

        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpincode.getText();
        String state = textsState.getText();

        try{
            if (textName.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                con con1 = new con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();
    }
}



