import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;
	private JTextField inputField1;
	private JTextField inputField2;
	private JTextField resultField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		inputField1 = new JTextField();
		inputField1.setBounds(127, 25, 116, 22);
		frame.getContentPane().add(inputField1);
		inputField1.setColumns(10);
		
		inputField2 = new JTextField();
		inputField2.setColumns(10);
		inputField2.setBounds(127, 61, 116, 22);
		frame.getContentPane().add(inputField2);
		
		JLabel lblFirstNumber = new JLabel("First Number:");
		lblFirstNumber.setBounds(27, 28, 88, 16);
		frame.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second number:");
		lblSecondNumber.setBounds(27, 64, 102, 16);
		frame.getContentPane().add(lblSecondNumber);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(58, 117, 40, 16);
		frame.getContentPane().add(lblResult);
		
		
		JButton plusButton = new JButton("+");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator calc = new Calculator();
				resultField.setText(calc.add(inputField1.getText(), inputField2.getText()));
			}
		});
		
		
		plusButton.setBounds(38, 185, 77, 41);
		frame.getContentPane().add(plusButton);
		
		JButton minusButton = new JButton("-");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calculator calc = new Calculator();
				resultField.setText(calc.sub(inputField1.getText(), inputField2.getText()));
			}
		});
		minusButton.setBounds(127, 185, 77, 41);
		frame.getContentPane().add(minusButton);
		
		JButton multiButton = new JButton("*");
		multiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator calc = new Calculator();
				resultField.setText(calc.mult(inputField1.getText(), inputField2.getText()));
			}
		});
		multiButton.setBounds(216, 185, 77, 41);
		frame.getContentPane().add(multiButton);
		
		JButton diviButton = new JButton("/");
		diviButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator calc = new Calculator();
				resultField.setText(calc.divi(inputField1.getText(), inputField2.getText()));
			}
		});
		diviButton.setBounds(305, 185, 77, 41);
		frame.getContentPane().add(diviButton);
		
		resultField = new JTextField();
		resultField.setBounds(108, 114, 312, 22);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);
	}
}
