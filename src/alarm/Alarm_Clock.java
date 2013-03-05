package alarm;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Alarm_Clock {

	/**
	 * @param args
	 */
	private static final JFrame backFrame=new JFrame("Alarm Clock");
	protected static final JLabel time = new JLabel("00:00:00");
	protected static JButton set = new JButton("Set Alarm");
    private static JButton snooze = new JButton("Snooze");
	public static void main(String[] args) {
		backFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel backPane = new JPanel();
    	JPanel timeHold = new JPanel();
    	JPanel bottom = new JPanel();
    	JPanel vBottom = new JPanel();
    	backPane.setLayout(new BoxLayout(backPane, BoxLayout.Y_AXIS));
    	bottom.setLayout(new GridLayout(1,2,5,0));
    	vBottom.setLayout(new GridLayout(1,1,3,3));
    	JButton off = new JButton("Turn Off");
    	off.setMnemonic(KeyEvent.VK_O);
		set.setMnemonic(KeyEvent.VK_A);
		snooze.setMnemonic(KeyEvent.VK_S);
		time.setFont(new Font("DejaVu Sans", Font.BOLD, 36));

	}

}
