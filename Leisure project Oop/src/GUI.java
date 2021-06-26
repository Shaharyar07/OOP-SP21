
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@SuppressWarnings("serial")
public class GUI extends Frame implements ActionListener {
	public String id() {
		UUID uuid = UUID.randomUUID();
		String uid = uuid.toString();
		String[] splitString = uid.split("-");
		return splitString[3];
	}

	static int saved = 0;

	String idg;
	String nameg;
	String timeg;
	String courseg;
	String coachg;

	String contactg;
	String addressg;
	String schoolg;
	String passwordg;
	String Monthg;

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String lessong;
	JPanel panel1 = new JPanel();
	JPanel panely = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel book = new JPanel();
	JPanel book1 = new JPanel();

	JTextArea data = new JTextArea("\t     DASHBOARD\n\n" + " Instructor\t   Courses        Time              Date\n");
	JTextArea titleuser = new JTextArea();
	JTextArea dataa = new JTextArea();

	JTextArea title = new JTextArea(" WELCOME TO CUI LEISURE CLUB ");
	JTextArea title1 = new JTextArea("   SIGN IN WITH CREDENTIALS ");
	JTextArea title2 = new JTextArea("     FILL ALL THE FIELDS CAREFULLY \n\t*** SIGN UP ***  ");
	JTextArea title3 = new JTextArea(" WELCOME TO HATFEILD LEISURE CLUB ");
	JTextArea enterid = new JTextArea("           ID:  ");
	JTextArea enterpassword = new JTextArea(" PASSWORD:  ");
	JTextArea uniqueid = new JTextArea();

	JTextArea ecoach = new JTextArea("   COACHES:  ");
	JTextArea etime = new JTextArea("    TIME:  ");
	JTextArea emo = new JTextArea("    DATE:  ");
	JTextArea ecourses = new JTextArea("    COURSES:  ");

	JTextArea ename = new JTextArea("   NAME:  ");
	JTextArea eaddress = new JTextArea(" ADDRESS:  ");
	JTextArea econtact = new JTextArea(" CONTACT NO:  ");
	JTextArea eschool = new JTextArea("  SCHOOL :  ");
	JTextArea epassword = new JTextArea("SET PASSWORD:  ");
	JTextArea ename1 = new JTextArea();
	JTextArea econtact1 = new JTextArea();
	JTextArea eaddress1 = new JTextArea();
	JTextArea eschool1 = new JTextArea();
	JTextArea epassword1 = new JTextArea();

	String[] month = { "1 June 2021", "2 June 2021", "3 June 2021", "4 June 2021", "5 June 2021", "6 June 2021",
			"7 June 2021", "8 June 2021", "9 June 2021", "10 June 2021", "11 June 2021", "12 June 2021", "13 June 2021",
			"14 June 2021", "15 June 2021", "16 June 2021", "17 June 2021", "18 June 2021", "19 June 2021",
			"20 June 2021", "21 June 2021", "22 June 2021", "23 June 2021", "24 June 2021", "25 June 2021",
			"26 June 2021", "27 June 2021", "28 June 2021", "29 June 2021", "30 June 2021", "31 June 2021", };

	String[] NameOfCoaches = { "Ali ", "Tahir", "Huzaifa", "Sherry", "Milania Trump" };
	String[] Timing = { "5PM-6PM", "6:30PM-7:30PM", "8PM-9PM", "9PM-10PM", "10PM-11:30PM" };
	String[] coursesNames = { "Cricket", "FootBall", "VollyBall", "Table Tennis", "Hockey" };

	JComboBox list = new JComboBox(NameOfCoaches);
	JComboBox listT = new JComboBox(Timing);
	JComboBox listC = new JComboBox(coursesNames);
	JComboBox listM = new JComboBox(month);

	JTextArea id = new JTextArea();
	JTextArea pass = new JTextArea();
	String ac, at, ad;
	Font font0 = new Font("Arial", Font.BOLD, 15);
	Font font = new Font("Comic Sans MS", Font.BOLD, 21);
	Font font2 = new Font("Calibiri", Font.BOLD, 18);
	Font font3 = new Font("Calibiri", Font.BOLD, 12);

	JButton conf1 = new JButton("CONFIRM");

	JButton conf = new JButton("CONFIRM");
	JButton done = new JButton("DONE");
	JButton verify = new JButton("VERIFY");
	JButton newC = new JButton("Register More");
	JButton procceed = new JButton("PROCCEED");
	JButton signin = new JButton("SIGN IN");
	JButton signup = new JButton("SIGN UP");
	JButton so = new JButton("SIGN OUT");
	JButton appointment = new JButton("APPOINTMENT");
	String x1, v;

	Border border = BorderFactory.createLineBorder(Color.GREEN, 2);

	public GUI() {
		frame.setSize(850, 650);
		panel.setSize(850, 650);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);

		panely.setBackground(Color.BLACK);
		panely.setSize(850, 650);
		panely.setLayout(null);

		panel2.setBackground(Color.BLACK);
		panel2.setSize(850, 650);
		panel2.setLayout(null);

		panel2.setBackground(Color.BLACK);
		panel2.setSize(850, 650);
		panel2.setLayout(null);
		panel1.setBackground(Color.BLACK);
		panel1.setSize(850, 650);
		panel1.setLayout(null);

		panel3.setBackground(Color.BLACK);
		panel3.setSize(850, 650);
		panel3.setLayout(null);

		panel4.setBackground(Color.BLACK);
		panel4.setSize(850, 650);
		panel4.setLayout(null);

		book.setBackground(Color.WHITE);
		book.setSize(850, 650);
		book.setLayout(null);

		book1.setBackground(Color.WHITE);
		book1.setSize(850, 650);
		book1.setLayout(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("The Cui Leisure Centre (HLC)");
		frame.setResizable(false);
		frame.add(panel);
		frame.setVisible(true);
		panel.setBackground(Color.BLACK);
		panely.setBackground(Color.BLACK);
		title.setFont(font);
		title.setBounds(200, 15, 470, 35);
		title.setEditable(false);
		title.setBorder(border);
		title.setBackground(Color.YELLOW);
		title.setForeground(Color.RED);

		titleuser.setFont(font);
		titleuser.setBounds(200, 15, 470, 35);
		titleuser.setEditable(false);
		titleuser.setBorder(border);
		titleuser.setBackground(Color.YELLOW);
		titleuser.setForeground(Color.RED);

		data.setFont(font0);
		data.setBounds(10, 120, 400, 399);
		data.setEditable(false);
		data.setBorder(border);
		data.setBackground(Color.YELLOW);
		data.setForeground(Color.RED);

		dataa.setFont(font0);
		dataa.setBounds(190, 95, 400, 399);
		dataa.setEditable(false);
		dataa.setBorder(border);
		dataa.setBackground(Color.YELLOW);
		dataa.setForeground(Color.RED);

		id.setFont(font3);
		id.setBounds(350, 230, 280, 20);
		id.setEditable(true);
		id.setBackground(Color.white);
		id.setForeground(Color.black);

		pass.setFont(font3);
		pass.setBounds(350, 285, 280, 20);
		pass.setEditable(true);
		pass.setBackground(Color.white);
		pass.setForeground(Color.black);

		list.setBounds(350, 235, 100, 20);
		listT.setBounds(350, 285, 100, 20);
		listC.setBounds(350, 180, 100, 20);
		listM.setBounds(350, 335, 100, 20);

		ename1.setFont(font3);
		ename1.setBounds(350, 235, 280, 20);
		ename1.setEditable(true);
		ename1.setBackground(Color.white);
		ename1.setForeground(Color.black);

		eaddress1.setFont(font3);
		eaddress1.setBounds(350, 285, 280, 20);
		eaddress1.setEditable(true);
		eaddress1.setBackground(Color.white);
		eaddress1.setForeground(Color.black);

		econtact1.setFont(font3);
		econtact1.setBounds(350, 335, 280, 20);
		econtact1.setEditable(true);
		econtact1.setBackground(Color.white);
		econtact1.setForeground(Color.black);

		eschool1.setFont(font3);
		eschool1.setBounds(350, 385, 280, 20);
		eschool1.setEditable(true);
		eschool1.setBackground(Color.white);
		eschool1.setForeground(Color.black);

		epassword1.setFont(font3);
		epassword1.setBounds(365, 430, 280, 20);
		epassword1.setEditable(true);
		epassword1.setBackground(Color.white);
		epassword1.setForeground(Color.black);

		title1.setFont(font2);
		title1.setBounds(270, 45, 280, 35);
		title1.setEditable(false);
		title1.setBorder(border);
		title1.setBackground(Color.white);
		title1.setForeground(Color.black);

		uniqueid.setFont(font2);
		uniqueid.setBounds(260, 190, 325, 25);

		uniqueid.setBackground(Color.white);
		uniqueid.setForeground(Color.black);

		enterid.setFont(font3);
		enterid.setBounds(260, 230, 85, 20);
		enterid.setEditable(false);

		enterid.setBackground(Color.ORANGE);
		enterid.setForeground(Color.BLACK);

		enterpassword.setFont(font3);
		enterpassword.setBounds(260, 285, 85, 20);
		enterpassword.setEditable(false);
		enterpassword.setBackground(Color.ORANGE);
		enterpassword.setForeground(Color.black);

		ename.setFont(font3);
		ename.setBounds(260, 235, 85, 20);
		ename.setEditable(false);
		ename.setBackground(Color.ORANGE);
		ename.setForeground(Color.black);

		ecourses.setFont(font3);
		ecourses.setBounds(260, 180, 85, 20);
		ecourses.setEditable(false);
		ecourses.setBackground(Color.ORANGE);
		ecourses.setForeground(Color.black);

		ecoach.setFont(font3);
		ecoach.setBounds(260, 235, 85, 20);
		ecoach.setEditable(false);
		ecoach.setBackground(Color.ORANGE);
		ecoach.setForeground(Color.black);

		etime.setFont(font3);
		etime.setBounds(260, 285, 85, 20);
		etime.setEditable(false);
		etime.setBackground(Color.ORANGE);
		etime.setForeground(Color.black);

		emo.setFont(font3);
		emo.setBounds(260, 335, 85, 20);
		emo.setEditable(false);
		emo.setBackground(Color.ORANGE);
		emo.setForeground(Color.black);

		eaddress.setFont(font3);
		eaddress.setBounds(260, 285, 85, 20);
		eaddress.setEditable(false);
		eaddress.setBackground(Color.ORANGE);
		eaddress.setForeground(Color.black);

		econtact.setFont(font3);
		econtact.setBounds(260, 335, 85, 20);
		econtact.setEditable(false);
		econtact.setBackground(Color.ORANGE);
		econtact.setForeground(Color.black);

		eschool.setFont(font3);
		eschool.setBounds(260, 385, 85, 20);
		eschool.setEditable(false);
		eschool.setBackground(Color.ORANGE);
		eschool.setForeground(Color.black);

		epassword.setFont(font3);
		epassword.setBounds(260, 430, 100, 20);
		epassword.setEditable(false);
		epassword.setBackground(Color.ORANGE);
		epassword.setForeground(Color.black);

		title2.setFont(font2);
		title2.setBounds(220, 35, 420, 50);
		title2.setEditable(false);
		title2.setBorder(border);
		title2.setBackground(Color.white);
		title2.setForeground(Color.black);

		title3.setFont(font);
		title3.setBounds(200, 15, 470, 35);
		title3.setEditable(false);
		title3.setBorder(border);
		title3.setBackground(Color.YELLOW);
		title3.setForeground(Color.RED);

		panel.add(title);
		signin.setFont(font2);
		signup.setFont(font2);
		verify.setFont(font2);
		signin.setBackground(Color.BLUE);
		signin.setForeground(Color.YELLOW);
		signin.setBounds(340, 170, 150, 30);
		panel.add(signin);
		signup.setBackground(Color.BLUE);
		signup.setForeground(Color.YELLOW);
		signup.setBounds(340, 230, 150, 30);
		panel.add(signup);
		signin.addActionListener((ActionListener) this);
		verify.setBackground(Color.BLUE);
		verify.setForeground(Color.YELLOW);
		verify.setBounds(360, 350, 120, 30);
		verify.addActionListener((ActionListener) this);

		appointment.setBackground(Color.YELLOW);
		appointment.setForeground(Color.BLUE);
		appointment.setBounds(340, 300, 150, 30);
		panel.add(appointment);

		newC.setBackground(Color.yellow);
		newC.setForeground(Color.BLACK);
		newC.setBounds(520, 150, 120, 50);
		newC.addActionListener((ActionListener) this);

		so.setBackground(Color.RED);
		so.setForeground(Color.white);
		so.setBounds(520, 250, 120, 50);
		so.addActionListener((ActionListener) this);

		conf.setBackground(Color.BLUE);
		conf.setForeground(Color.YELLOW);
		conf.setBounds(360, 400, 120, 30);
		conf.addActionListener((ActionListener) this);

		conf1.setBackground(Color.GREEN);
		conf1.setForeground(Color.YELLOW);
		conf1.setBounds(360, 400, 120, 30);
		conf1.addActionListener((ActionListener) this);

		procceed.setBackground(Color.BLUE);
		procceed.setForeground(Color.YELLOW);
		procceed.setBounds(360, 400, 120, 30);
		procceed.addActionListener((ActionListener) this);

		signup.addActionListener((ActionListener) this);
		done.setBackground(Color.RED);
		done.setForeground(Color.YELLOW);
		done.setBounds(450, 480, 100, 30);
		done.addActionListener((ActionListener) this);

		conf1.addActionListener((ActionListener) this);
		appointment.addActionListener((ActionListener) this);

	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		Object o = e.getSource();
		if (o == signin) {
			panel.setVisible(false);
			frame.add(panel1);
			panel1.setVisible(true);
			panel1.add(title1);
			panel1.add(enterid);
			panel1.add(enterpassword);
			panel1.add(id);
			panel1.add(pass);
			panel1.add(verify);
		}

		if (o == verify) {

			SignIn si = new SignIn();
			v = id.getText();
			data.selectAll();
			data.replaceSelection("");
			data.setText("\t     DASHBOARD\n\n" + " Instructor\t   Courses        Time              Date\n");

			boolean c = si.verify(id.getText(), pass.getText());
			if (c == true) {
				panel1.setVisible(false);
				panely.setVisible(true);
				int size1 = si.lines(id.getText());
				si.fetch(id.getText());
				String[] data1 = si.fetch(id.getText());
				frame.add(panely);
				titleuser.setText("            WELCOME    " + data1[1]);
				panely.add(titleuser);
				panely.add(data);
				int x = 6;
				while (x < data1.length) {
					data.append("\n" + data1[x]);
					x++;
				}
				panely.add(newC);
				panely.add(so);
			} else {
				panel1.setVisible(true);
			}
		}
		if (o == newC) {
			panely.setVisible(false);
			panel3.setVisible(false);
			panel2.setVisible(false);
			panel4.setVisible(true);
			frame.add(panel4);
			panel4.add(ecoach);
			panel4.add(etime);
			panel4.add(ecourses);
			panel4.add(list);
			panel4.add(listT);
			panel4.add(listC);
			panel4.add(listM);
			panel4.add(emo);
			panel4.add(conf);
		}
		if (o == conf) {
			timeg = listT.getSelectedItem().toString();
			coachg = listC.getSelectedItem().toString();
			lessong = list.getSelectedItem().toString();
			Monthg = listM.getSelectedItem().toString();
			NewCourse n = new NewCourse();

			n.add(v, lessong, coachg, timeg, Monthg);

			JOptionPane.showMessageDialog(frame, "SIGN UP FOR COURSE SUCESSFULL");
			panel4.setVisible(false);
			panel.setVisible(true);
		} else if (o == appointment)

		{
			panel.setVisible(false);
			frame.add(book);
			book.add(ecoach);
			book.add(etime);

			book.add(list);
			book.add(listT);

			book.add(listM);
			book.add(emo);
			book.add(conf1);
			at = listT.getSelectedItem().toString();
			ac = list.getSelectedItem().toString();

			ad = listM.getSelectedItem().toString();

		} else if (o == conf1) {
			book1.add(dataa);
			book.setVisible(false);
			frame.add(book1);

			dataa.setText(
					"\t APPOINTMENT BOOKED \n" + " \n INSTRUCTOR: " + ac + "\n\n TIME: " + at + "\n\n DATE: " + ad);

		} else if (o == signup) {
			panel.setVisible(false);
			panel2.setVisible(true);
			panel2.add(title2);
			x1 = id();
			uniqueid.setText(" YOUR UNIQUE ID WILL BE: " + x1);
			uniqueid.setEditable(false);
			panel2.add(uniqueid);
			panel2.add(ename);
			panel2.add(econtact);
			panel2.add(eaddress);
			panel2.add(eschool);
			panel2.add(epassword);
			panel2.add(ename1);
			panel2.add(eaddress1);
			panel2.add(econtact1);
			panel2.add(eschool1);
			panel2.add(epassword1);
			panel2.add(done);
			frame.add(panel2);
		} else if (o == so) {

			panel.setVisible(true);
			panel4.setVisible(false);
			panely.setVisible(false);
		} else if (o == done) {
			int x = 1;

			if (ename1.getText().trim().length() == 0 || eaddress1.getText().trim().length() == 0
					|| epassword1.getText().trim().length() == 0 || eschool1.getText().trim().length() == 0
					|| econtact1.getText().trim().length() == 0) {
				JOptionPane.showMessageDialog(frame, "PLEASE FILL ALL FIELDS");
				x = 0;
			}

			if (x == 1) {
				idg = x1;
				nameg = ename1.getText();
				contactg = econtact1.getText();
				addressg = eaddress1.getText();
				schoolg = eschool1.getText();
				passwordg = epassword1.getText();
				panel2.setVisible(false);
				panel3.setVisible(true);
				frame.add(panel3);
				panel3.add(ecoach);
				panel3.add(etime);
				panel3.add(ecourses);
				panel3.add(list);
				panel3.add(listT);
				panel3.add(listC);
				panel3.add(listM);
				panel3.add(emo);
				panel3.add(procceed);

				timeg = listT.getSelectedItem().toString();
				coachg = listC.getSelectedItem().toString();
				lessong = list.getSelectedItem().toString();
				Monthg = listM.getSelectedItem().toString();
			}

		} else if (o == procceed) {
			SignUp s = new SignUp(Monthg, idg, nameg, contactg, addressg, passwordg, schoolg, timeg, coachg, lessong);
			if (saved == 1) {
				JOptionPane.showMessageDialog(frame, "SIGN UP FOR COURSE SUCESSFULL");
				panel3.setVisible(false);
				panel.setVisible(true);
			}
		}

	}

	public static void main(String[] args) {
		GUI g = new GUI();
		;
	}

}
