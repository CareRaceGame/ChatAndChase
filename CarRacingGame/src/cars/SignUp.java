package cars;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
// public interfacee MyListener{
//void onExecutionComplete();
//}
class MyFrame
extends JFrame
implements ActionListener {

  // Components of the Form
  // private MyListener listener;
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
  private JTextField temail;
  private JCheckBox term;
  private JButton sub;
  private JButton play;
  private JTextArea tout;
  private JLabel res;

  private String dates[] = {
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10",
    "11",
    "12",
    "13",
    "14",
    "15",
    "16",
    "17",
    "18",
    "19",
    "20",
    "21",
    "22",
    "23",
    "24",
    "25",
    "26",
    "27",
    "28",
    "29",
    "30",
    "Sup",
    "Oct",
    "Nov",
    "Dec"
  };
  private String years[] = {
    "1995",
    "1996",
    "1997",
    "1998",
    "1999",
    "2000",
    "2001",
    "2002",
    "2003",
    "2004",
    "2005",
    "2006",
    "2007",
    "2008",
    "2009",
    "2010",
    "2011",
    "2012",
    "2013",
    "2014",
    "2015",
    "2016",
    "2017",
    "2018",
    "2019"
  };
  private String months[] = {
    "Jan",
    "feb",
    "Mar",
    "Apr",
    "May",
    "Jun",
    "July",
    "Aug",
    "Sup",
    "Oct",
    "Nov",
    "Dec"
  };
  // constructor, to initialize the components
  // with default values.
  public MyFrame() {
    setContentPane(new JLabel(new ImageIcon("C:\\Users\\HP\\OneDrive - nitj.ac.in\\Desktop\\CarRacingGame\\src\\cars\\bg.jpeg")));
    setLayout(new FlowLayout());

    setTitle("Registration Form");
    setBounds(300, 90, 900, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    c = getContentPane();
    c.setLayout(null);

    title = new JLabel("Welcome to ASSETTO CORSA");
    title.setFont(new Font("Arial", Font.PLAIN, 30));
    title.setSize(500, 30);
    title.setLocation(200, 30);
    c.add(title);
    title.setForeground(Color.WHITE);

    name = new JLabel("Name");
    name.setFont(new Font("Arial", Font.PLAIN, 20));
    name.setSize(100, 20);
    name.setLocation(100, 100);
    c.add(name);
    name.setForeground(Color.WHITE);

    tname = new JTextField();
    tname.setFont(new Font("Arial", Font.PLAIN, 15));
    tname.setSize(190, 20);
    tname.setLocation(200, 100);
    c.add(tname);

    mno = new JLabel("Mobile");
    mno.setFont(new Font("Arial", Font.PLAIN, 20));
    mno.setSize(100, 20);
    mno.setLocation(100, 150);
    c.add(mno);
    mno.setForeground(Color.WHITE);

    tmno = new JTextField();
    tmno.setFont(new Font("Arial", Font.PLAIN, 15));
    tmno.setSize(150, 20);
    tmno.setLocation(200, 150);
    c.add(tmno);

    gender = new JLabel("Gender");
    gender.setFont(new Font("Arial", Font.PLAIN, 20));
    gender.setSize(100, 20);
    gender.setLocation(100, 200);
    c.add(gender);
    gender.setForeground(Color.WHITE);

    male = new JRadioButton("Male");
    male.setFont(new Font("Arial", Font.PLAIN, 15));
    male.setSelected(true);
    male.setSize(75, 20);
    male.setLocation(200, 200);
    c.add(male);

    female = new JRadioButton("Female");
    female.setFont(new Font("Arial", Font.PLAIN, 15));
    female.setSelected(false);
    female.setSize(80, 20);
    female.setLocation(275, 200);
    c.add(female);

    gengp = new ButtonGroup();
    gengp.add(male);
    gengp.add(female);

    dob = new JLabel("DOB");
    dob.setFont(new Font("Arial", Font.PLAIN, 20));
    dob.setSize(100, 20);
    dob.setLocation(100, 250);
    c.add(dob);
    dob.setForeground(Color.WHITE);

    date = new JComboBox(dates);
    date.setFont(new Font("Arial", Font.PLAIN, 15));
    date.setSize(50, 20);
    date.setLocation(200, 250);
    c.add(date);

    month = new JComboBox(months);
    month.setFont(new Font("Arial", Font.PLAIN, 15));
    month.setSize(60, 20);
    month.setLocation(250, 250);
    c.add(month);

    year = new JComboBox(years);
    year.setFont(new Font("Arial", Font.PLAIN, 15));
    year.setSize(60, 20);
    year.setLocation(320, 250);
    c.add(year);

    add = new JLabel("Email Id");
    add.setFont(new Font("Arial", Font.PLAIN, 20));
    add.setSize(100, 20);
    add.setLocation(100, 300);
    c.add(add);
    add.setForeground(Color.WHITE);

    temail = new JTextField();
    temail.setFont(new Font("Arial", Font.PLAIN, 15));
    temail.setSize(150, 20);
    temail.setLocation(200, 300);

    c.add(temail);

    term = new JCheckBox("Accept Terms And Conditions.");
    term.setFont(new Font("Arial", Font.PLAIN, 15));
    term.setSize(250, 20);
    term.setLocation(150, 400);
    c.add(term);

    sub = new JButton("Submit");
    sub.setFont(new Font("Arial", Font.PLAIN, 15));
    sub.setSize(100, 20);
    sub.setLocation(150, 450);
    sub.addActionListener(this);
    c.add(sub);

    play = new JButton("Let's Play");
    play.setFont(new Font("Arial", Font.PLAIN, 15));
    play.setSize(100, 20);
    play.setLocation(270, 450);
    play.addActionListener(this);
    c.add(play);

    tout = new JTextArea();
    tout.setFont(new Font("Arial", Font.PLAIN, 15));
    tout.setSize(300, 400);
    tout.setLocation(500, 100);
    tout.setLineWrap(true);
    tout.setEditable(false);
    c.add(tout);

    res = new JLabel("");
    res.setFont(new Font("Arial", Font.PLAIN, 20));
    res.setSize(500, 25);
    res.setLocation(100, 500);
    c.add(res);
    res.setForeground(Color.WHITE);
    setVisible(true);
  }

  // method actionPerformed()
  // to get the action performed
  // by the user and act accordingly
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == sub) {
      if (term.isSelected()) {
        String data1;
        String data
          = "Name : " +
          tname.getText() + "\n" +
          "Mobile : " +
          tmno.getText() + "\n";
        if (male.isSelected())
          data1 = "Gender : Male" +
          "\n";
        else
          data1 = "Gender : Female" +
          "\n";
        String data2
          = "DOB : " +
          (String) date.getSelectedItem() +
          "/" + (String) month.getSelectedItem() +
          "/" + (String) year.getSelectedItem() +
          "\n";

        String data3 = "Email : " + temail.getText();
        tout.setText(data + data1 + data2 + data3);
        tout.setEditable(false);
        res.setText("Let's play..");
      } else {
        tout.setText("");
        res.setText("Please accept the" +
          " terms & conditions..");
      }
    } else if (e.getSource() == play) {
      if (term.isSelected()) {
        JOptionPane.showMessageDialog(null, "LET'S PLAY!");
        setVisible(false);
        try {
          Cars.execute();
        } catch (IOException | InterruptedException ex) {
          Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      } else {
        tout.setText("");
        res.setText("Please accept the" +
          " terms & conditions..");
      }
    }
  }
}

// Driver Code
class Test {

  public static void caller() {
    MusicThread mt = new MusicThread();
    mt.start();
    MyFrame f = new MyFrame();
  }
  public static void main(String args[]) {
    Test.caller();
  }
}
