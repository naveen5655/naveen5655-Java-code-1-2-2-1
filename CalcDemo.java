package JDBCDemoProject;
import java.awt.event.*;
import javax.swing.*;
public class CalcDemo implements ActionListener {
JFrame f;
JLabel n1,n2,rt;
JButton ad,sb,mp,ds,cl,et;
JTextField t1,t2,t3;
CalcDemo(){
f=new JFrame("Calculator");
f.setLayout(null);
n1=new JLabel("Enter n1:");
n1.setSize(300,100);
n1.setLocation(250,90);
f.add(n1);
t1=new JTextField();
t1.setSize(200,40);
t1.setLocation(320,120);
f.add(t1);
n2=new JLabel("Enter n2:");
n2.setSize(300,100);
n2.setLocation(250,160);
f.add(n2);
t2=new JTextField();
t2.setSize(200,40);
t2.setLocation(320,200);
f.add(t2);
ad=new JButton("ADD");
ad.setSize(100,40);
ad.setLocation(250,290);
ad.addActionListener(this);
f.add(ad);
sb=new JButton("SUB");
sb.setSize(100,40);
sb.setLocation(400,290);
sb.addActionListener(this);
f.add(sb);
mp=new JButton("MUL");
mp.setSize(100,40);
mp.setLocation(550,290);
mp.addActionListener(this);
f.add(mp);
ds=new JButton("DIV");
ds.setSize(100,40);
ds.setLocation(700,290);
ds.addActionListener(this);
f.add(ds);
cl=new JButton("Clear");
cl.setSize(100,40);
cl.setLocation(850,290);
cl.addActionListener(this);
f.add(cl);
et=new JButton("Exit");
et.setSize(100,40);
et.setLocation(1000,290);
et.addActionListener(this);
f.add(et);
rt=new JLabel("Result:");
rt.setSize(300,100);
rt.setLocation(250,360);
f.add(rt);
t3=new JTextField();
t3.setSize(200,40);
t3.setLocation(300,390);
f.add(t3);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
int n1,n2;
n1=Integer.parseInt(t1.getText());
n2=Integer.parseInt(t2.getText());
if(e.getSource()==ad)
t3.setText(String.valueOf(n1+n2));
else if(e.getSource()==sb)
t3.setText(String.valueOf(n1-n2));
else if(e.getSource()==mp)
t3.setText(String.valueOf(n1*n2));
else if(e.getSource()==ds)
t3.setText(String.valueOf(n1/n2));
else if(e.getSource()==cl)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
else
f.dispose();
}
public static void main(String[] args) {
new CalcDemo();

}

}

