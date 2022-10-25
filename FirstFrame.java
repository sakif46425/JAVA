import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstFrame extends JFrame implements ActionListener{

private JLabel nameLabel, passLabel;
private JTextField nameTF;
private JPasswordField passPF;
private JButton nextBtn, exitBtn;
private JRadioButton r1, r2;
private ButtonGroup bg;
private JCheckBox c1, c2;
private JComboBox combo;
private JPanel panel;
private Color customColor;
private Font customFont;

public FirstFrame( )
{
  super(“First Frame Demo”); 
this.setSize(800, 450); 
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
panel = new JPanel( );
panel.setLayout(null);
customColor = new Color(180, 200, 150);
customFont = new Font(“Consolas”, Font.BOLD, 16);
nameLabel = new JLabel(“User Name: ”);
nameLabel.setBounds(50, 50, 100, 30);
panel.add(nameLabel);
passLabel = new JLabel(“Password: ”);
passLabel.setBounds(50, 100, 100, 30);
panel.add(passLabel);
nameTF = new JTextField( );
nameTF.setBounds(170, 50, 100, 30);
panel.add(nameTF);
passPF = new JPasswordField( );
passPF.setBounds(170, 100, 100, 30);
panel.add(passPF);
nextBtn = new JButton(“Next”);
nextBtn.setBounds(90, 170, 80, 30);
panel.add(nextBtn);
exitBtn = new JButton(“Exit”);
exitBtn.setBounds(180, 170, 80, 30);
panel.add(exitBtn);
r1 = new JRadioButton(“True”);
r1.setBounds(250, 250, 80, 30);
panel.add(r1);
r2 = new JRadioButton(“False”);
r2.setBounds(350, 250, 80, 30);
panel.add(r2);
c1 = new JCheckBox(“Burger”);
c1.setBounds(250, 300, 80, 30);
panel.add(c1);
c2 = new JCheckBox(“Pizza”);
c2.setBounds(350, 300, 80, 30);
panel.add(c2);
String items[ ] = new String [ ]{“C”, “C++”, “Java”, “Python”};
combo = new JComboBox(items);
combo.setBounds(250, 350, 100, 30);
panel.add(combo);
bg = new ButtonGroup( );
bg.add(r1);
bg.add(r2);
nextBtn.setBackground(Color.GREEN);
exitBtn.setBackground(Color.RED);
nextBtn.setForeground(Color.WHITE);
exitBtn.setForeground(Color.WHITE);
panel.setBackground(customColor);
nameLabel.setFont(customFont);
passLabel.setFont(customFont);
nextBtn.addActionListener(this);
exitBtn.addActionListener(this);
this.add(panel);
}
public void actionPerformed(ActionEvent ae)
{
String command = ae.getActionCommand( );
if(command.equals(nextBtn.getText( )))
{
//to display a notification/message box
JOptionPane.showMessageDialog(this. “This is a Message Box”);
}
else if(command.equals(exitBtn.getText( )))
{
//to close the application
System.exit(0);
}
else
{
//Write necessary codes
}
}
}

