package JDBCDemoProject;
import java.awt.event.*;
import javax.swing.*;
public class StudentForm implements ActionListener {
JFrame f; //name,gender(radio),dept(combo),skill(check)
JLabel l1,l2,l3,l4;
JTextField t1;
JRadioButton rb1,rb2;
JComboBox cb;
JCheckBox c,cp,jv,py;
JButton b1,b2;
ButtonGroup bg;
String dp[]= {"select","CSE","ECE","EEE","MECH","CIVIL","BT"};
StudentForm(){
f=new JFrame("Student Application");
f.setLayout(null);
l1=new JLabel("NAME:");
l1.setSize(200,150);
l1.setLocation(250,30);
f.add(l1);
t1=new JTextField();
t1.setSize(250,30);
t1.setLocation(300,90);
f.add(t1);
l2=new JLabel("GENDER:");
l2.setSize(200,150);
l2.setLocation(250,80);
f.add(l2);
rb1=new JRadioButton("MALE");
rb1.setSize(100,100);
rb1.setLocation(350,120);
rb1.setSelected(true);
f.add(rb1);
rb2=new JRadioButton("FEMALE");
rb2.setSize(100,100);
rb2.setLocation(470,120);
rb2.setSelected(false);
f.add(rb2);
bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
l3=new JLabel("DEPT:");
l3.setSize(200,200);
l3.setLocation(250,150);
f.add(l3);
cb=new JComboBox(dp);
cb.setSize(150,30);
cb.setLocation(350,220);
f.add(cb);
l4=new JLabel("SKILLs:");
l4.setSize(200,200);
l4.setLocation(250,250);
f.add(l4);
c=new JCheckBox("C");
c.setSize(100,100);
c.setLocation(350,300);
f.add(c);
cp=new JCheckBox("CPP");
cp.setSize(100,100);
cp.setLocation(450,300);
f.add(cp);
jv=new JCheckBox("JAVA");
jv.setSize(100,100);
jv.setLocation(550,300);
f.add(jv);
py=new JCheckBox("PYTHON");
py.setSize(100,100);
py.setLocation(650,300);
f.add(py);
b1=new JButton("Submit");
b1.setSize(100,30);
b1.setLocation(250,450);
b1.addActionListener(this);
f.add(b1);
b2=new JButton("Cancel");
b2.setSize(100,30);
b2.setLocation(450,450);
b2.addActionListener(this);
f.add(b2);
f.setVisible(true);
f.pack();
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1) {
String name,gen,dept;
name=t1.getText();
if(rb1.isSelected())
gen=rb1.getText();
else
gen=rb2.getText();
dept=(String)cb.getSelectedItem();
System.out.println("Name="+name+" Gender="+gen+" dept="+dept);
if(c.isSelected())
System.out.println("Skill="+c.getText());
if(cp.isSelected())
System.out.println("Skill="+cp.getText());
if(jv.isSelected())
System.out.println("Skill="+jv.getText());
if(py.isSelected())
System.out.println("Skill="+py.getText());
f.dispose();
}
else
f.dispose();
}
public static void main(String[] args) {
         new StudentForm();
}

}
