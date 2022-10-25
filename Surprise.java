import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class Surprise extends JFrame implements ActionListener {
 
    
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
 
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = {"1991","1993","1994","1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020","2021"};
 
    
    public Surprise()
    {
        setTitle("Lets Gift");
        setBounds(400, 100, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Lets Gift");
        title.setFont(new Font("Arial black", Font.BOLD, 30));
        title.setSize(300, 30);
        title.setForeground(Color.blue);
        title.setLocation(300, 30);
        title.setLocation(300, 30);
        c.add(title);
 
        name = new JLabel("Name");
        name.setFont(new Font("Arial black", Font.BOLD, 20));
        name.setSize(100, 20);
        name.setForeground(Color.darkGray);
        name.setLocation(100, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial black", Font.BOLD, 15));
        tname.setSize(150, 20);
        tname.setForeground(Color.darkGray);
        tname.setLocation(200, 100);
        c.add(tname);
 
        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial black", Font.BOLD, 20));
        mno.setForeground(Color.darkGray);
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);
 
        tmno = new JTextField();
        tmno.setFont(new Font("Arial Black", Font.BOLD, 15));
        name.setForeground(Color.darkGray);
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

 
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial black", Font.BOLD, 20));
        gender.setSize(100, 20);
        gender.setForeground(Color.darkGray);
        gender.setLocation(100, 200);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial black", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setForeground(Color.darkGray);
        male.setLocation(200, 200);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial black", Font.BOLD, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setForeground(Color.darkGray);
        female.setLocation(275, 200);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial black", Font.BOLD, 20));
        dob.setSize(100, 20);
        dob.setForeground(Color.darkGray);
        dob.setLocation(100, 250);
        c.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial black", Font.BOLD, 15));
        date.setForeground(Color.darkGray);
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial black", Font.BOLD, 15));
        month.setSize(60, 20);
        month.setForeground(Color.darkGray);
        month.setLocation(250, 250);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial black", Font.BOLD, 15));
        year.setSize(60, 20);
        year.setForeground(Color.darkGray);
        year.setLocation(320, 250);
        c.add(year);
 
        add = new JLabel("Address");
        add.setFont(new Font("Arial black", Font.BOLD, 20));
        add.setSize(100, 20);
        add.setForeground(Color.darkGray);
        add.setLocation(100, 300);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial black", Font.BOLD, 15));
        tadd.setSize(200, 75);
        tadd.setForeground(Color.darkGray);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial black", Font.BOLD, 15));
        term.setSize(250, 20);
        term.setForeground(Color.darkGray);
        term.setLocation(150, 400);
        c.add(term);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial black", Font.BOLD, 15));
        sub.setSize(100, 20);
        sub.setForeground(Color.darkGray);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial black", Font.BOLD, 15));
        reset.setSize(100, 20);
        reset.setForeground(Color.darkGray);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial Black", Font.BOLD, 15));
        tout.setSize(300, 400);
        tout.setForeground(Color.darkGray);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial black", Font.BOLD, 20));
        res.setSize(500, 25);
        res.setForeground(Color.darkGray);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial black", Font.BOLD, 15));
        resadd.setSize(200, 75);
        resadd.setForeground(Color.darkGray);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
 
        setVisible(true);
    }
 
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n";
                    
                if (male.isSelected())
                    data1 = "Gender : Male"+ "\n";
                            
                else
                    data1 = "Gender : Female" + "\n";
                              
                String data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
 
                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}