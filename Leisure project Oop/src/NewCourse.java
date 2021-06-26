
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewCourse {

	public int add(String id2, String lesson, String coach, String time, String date) {
		try (FileWriter fw = new FileWriter(id2 + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print("\n" + lesson + "\t   " + coach + "        " + time + "       " + date);
			return 1;
		} catch (IOException e) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "CANT Register More SORRY");
			return 0;
		}

	}
}
