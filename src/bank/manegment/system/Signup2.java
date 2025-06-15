package bank.manegment.sytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox1,comboBox2,comboBox3,comboBox4;
    JTextField textPen,textadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;

    Signup2(String formno){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300,6,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additonal details");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway", Font.BOLD,22));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Raleway", Font.BOLD,22));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox1 = new JComboBox(Category);
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,170,320,30);
        add(comboBox1);

        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Raleway", Font.BOLD,22));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        comboBox2 = new JComboBox(Income);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,220,320,30);
        add(comboBox2);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD,22));
        l6.setBounds(100,270,150,30);
        add(l6);

        String educational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        comboBox3 = new JComboBox(educational);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,270,320,30);
        add(comboBox3);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,22));
        l7.setBounds(100,340,150,30);
        add(l7);

//        String Occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
//        comboBox4 = new JComboBox(Occupation);
//        comboBox4.setBackground(new Color(252,208,76));
//        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
//        comboBox4.setBounds(350,340,320,30);
//        add(comboBox4);
//
//        JLabel l8 = new JLabel("Occupation : ");
//        l8.setFont(new Font("Raleway", Font.BOLD,22));
//        l8.setBounds(100,340,150,30);
//        add(l8);

        String Occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox4 = new JComboBox(Occupation);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,340,320,30);
        add(comboBox4);

        JLabel l9 = new JLabel("PAN Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,22));
        l9.setBounds(100,390,180,30);
        add(l9);

        textPen = new JTextField();
        textPen.setFont(new Font("Raleway",Font.BOLD,14));
        textPen.setBounds(350,390,320,30);
        add(textPen);

        JLabel l8 = new JLabel("Adhar Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD,22));
        l8.setBounds(100,440,180,30);
        add(l8);

        textadhar = new JTextField();
        textadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textadhar.setBounds(350,440,320,30);
        add(textadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,22));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(460,490,100,30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD,22));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBounds(460,540,100,30);
        add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,10));
        l12.setBounds(700,10,60,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,10));
        l13.setBounds(700,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,22));
        next.setBackground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(850,750);
        getContentPane().setBackground(new Color(76, 252, 202));
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox1.getSelectedItem();
        String inc = (String) comboBox2.getSelectedItem();
        String edu = (String) comboBox3.getSelectedItem();
        String occ = (String) comboBox4.getSelectedItem();

        String pan = textPen.getText();
        String addhar = textadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPen.getText().equals("") || textadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                con c = new con();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }


        } catch (Exception E){
        E.printStackTrace();
    }


}

public static void main(String[] args) {
        new Signup2(" ");

    }
}
