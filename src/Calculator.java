import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					
					window.frmCalculator.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(100, 100, 293, 230);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		JLabel operator = new JLabel("");
		operator.setFont(new Font("Tahoma", Font.BOLD, 13));
		operator.setHorizontalAlignment(SwingConstants.CENTER);
		operator.setBounds(126, 22, 36, 23);
		frmCalculator.getContentPane().add(operator);

		JLabel answer = new JLabel("");
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setBounds(48, 161, 187, 23);
		frmCalculator.getContentPane().add(answer);
		
		JTextField dtrpnNumber = new JTextField();
		dtrpnNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dtrpnNumber.setBounds(10, 22, 106, 23);
		//Border b = null;
		//b.paintBorder(dtrpnNumber, null, 0, 0, 1, 1);
		//dtrpnNumber.setBorder(1);
		frmCalculator.getContentPane().add(dtrpnNumber);

		JTextField dtrpnNumber_1 = new JTextField();
		dtrpnNumber_1.setBounds(170, 22, 106, 23);
		frmCalculator.getContentPane().add(dtrpnNumber_1);

		

		JButton plus = new JButton("+");
		plus.setBackground(Color.LIGHT_GRAY);
		plus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		plus.setIcon(null);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operator.setText("+");
			}
		});
		plus.setBounds(10, 56, 106, 23);
		frmCalculator.getContentPane().add(plus);

		JButton minus = new JButton("-");
		minus.setBackground(Color.LIGHT_GRAY);
		minus.setFont(new Font("Tahoma", Font.PLAIN, 28));
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operator.setText("-");
			}
		});
		minus.setBounds(10, 93, 106, 23);
		frmCalculator.getContentPane().add(minus);

		JButton multiply = new JButton("x");
		multiply.setBackground(Color.LIGHT_GRAY);
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 18));
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operator.setText("X");
			}
		});
		multiply.setBounds(170, 56, 106, 23);
		frmCalculator.getContentPane().add(multiply);

		JButton division = new JButton("/");
		division.setBackground(Color.LIGHT_GRAY);
		division.setFont(new Font("Tahoma", Font.PLAIN, 18));
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operator.setText("/");
			}
		});
		division.setBounds(170, 93, 106, 23);
		frmCalculator.getContentPane().add(division);

		JButton equal = new JButton("=");
		equal.setBackground(new Color(192, 192, 192));
		equal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dtrpnNumber.getText().isEmpty())
				{
					dtrpnNumber.setText("0");
				}
				if(dtrpnNumber_1.getText().isEmpty())
				{
					dtrpnNumber_1.setText("0");
				}
				Float ans = new Float(0);
				if(operator.getText() == "+")
				{
					ans= Float.valueOf(dtrpnNumber.getText())+Float.valueOf(dtrpnNumber_1.getText());
					answer.setText("Answer = "+ans.toString());
				}
				else
					if(operator.getText() == "-")
					{
						ans= Float.valueOf(dtrpnNumber.getText())-Float.valueOf(dtrpnNumber_1.getText());
						answer.setText("Answer = "+ans.toString());
					}
					else
						if(operator.getText() == "X")
						{
							ans= Float.valueOf(dtrpnNumber.getText())*Float.valueOf(dtrpnNumber_1.getText());
							answer.setText("Answer = "+ans.toString());
						}
						else
							if(operator.getText() == "/")
							{
								ans= Float.valueOf(dtrpnNumber.getText())/Float.valueOf(dtrpnNumber_1.getText());
								answer.setText("Answer = "+ans.toString());
							}
							else
								answer.setText("No Operator is Selected!!!");

			}
		});
		equal.setBounds(114, 127, 61, 23);
		frmCalculator.getContentPane().add(equal);


	}
}
