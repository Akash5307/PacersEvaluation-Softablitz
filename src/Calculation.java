import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calculation {

	private JFrame frame;
	private JTextField textField;
	private JButton btnAddition;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation window = new Calculation();
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
	public Calculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 733);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pacers Evaluation");
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lblNewLabel.setBounds(128, 10, 244, 46);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBounds(10, 66, 466, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnExponent = new JButton("e^x");
		btnExponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnExponent.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnExponent.setBounds(105, 187, 85, 62);
		frame.getContentPane().add(btnExponent);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setBounds(200, 187, 85, 62);
		frame.getContentPane().add(btnSin);
		
		JButton btnR = new JButton("\u221A");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnR.setBounds(10, 187, 85, 62);
		frame.getContentPane().add(btnR);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnCos.setBounds(295, 187, 85, 62);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnTan.setBounds(390, 187, 85, 62);
		frame.getContentPane().add(btnTan);
		
		JButton btnCube = new JButton("X^3");
		btnCube.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setBounds(10, 403, 85, 62);
		frame.getContentPane().add(btnCube);
		
		JButton btnReciprocal = new JButton("1/x");
		btnReciprocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnReciprocal.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnReciprocal.setBounds(10, 259, 85, 62);
		frame.getContentPane().add(btnReciprocal);
		
		JButton btnPower = new JButton("X^Y");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnPower.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnPower.setBounds(10, 331, 85, 62);
		frame.getContentPane().add(btnPower);
		
		JButton btnSquare = new JButton("X^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				a*=a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquare.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnSquare.setBounds(10, 475, 85, 62);
		frame.getContentPane().add(btnSquare);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFactorial.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnFactorial.setBounds(10, 547, 85, 62);
		frame.getContentPane().add(btnFactorial);
		
		JButton btnplusminus = new JButton("+/-");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplusminus.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnplusminus.setBounds(10, 619, 85, 62);
		frame.getContentPane().add(btnplusminus);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnLog.setBounds(105, 259, 85, 62);
		frame.getContentPane().add(btnLog);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnPercentage.setBounds(105, 331, 85, 62);
		frame.getContentPane().add(btnPercentage);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn7.setBounds(105, 403, 85, 62);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn4.setBounds(105, 475, 85, 62);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn1.setBounds(105, 547, 85, 62);
		frame.getContentPane().add(btn1);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnSinh.setBounds(200, 259, 85, 62);
		frame.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnClear.setBounds(200, 331, 85, 62);
		frame.getContentPane().add(btnClear);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn8.setBounds(200, 403, 85, 62);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn5.setBounds(200, 475, 85, 62);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn2.setBounds(200, 547, 85, 62);
		frame.getContentPane().add(btn2);
		
		final JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(105, 619, 180, 62);
		frame.getContentPane().add(btn0);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnCosh.setBounds(295, 259, 85, 62);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 17));
		btnBackSpace.setBounds(295, 331, 85, 62);
		frame.getContentPane().add(btnBackSpace);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn9.setBounds(295, 403, 85, 62);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn6.setBounds(295, 475, 85, 62);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn3.setBounds(295, 547, 85, 62);
		frame.getContentPane().add(btn3);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnDot.setBounds(295, 619, 85, 62);
		frame.getContentPane().add(btnDot);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnTanh.setBounds(391, 259, 85, 62);
		frame.getContentPane().add(btnTanh);
		
		btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAddition.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnAddition.setBounds(391, 331, 85, 62);
		frame.getContentPane().add(btnAddition);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSubtract.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnSubtract.setBounds(391, 403, 85, 62);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnMultiply.setBounds(391, 475, 85, 62);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnDivide.setBounds(391, 547, 85, 62);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%f", result);
							textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%f", result);
							textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%f", result);
							textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%f", result);
							textField.setText(answer);
				}
				else if(operation=="%") {
					
						result=first%second;
					    answer=String.format("%.1f", result);
						textField.setText(answer);
				}
				else if(operation=="X^Y") {
					double result=1;
					for(int i=0;i<second;i++) {
						result*=first;
					}
				    answer=String.format("%f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnEqual.setBounds(391, 619, 85, 62);
		frame.getContentPane().add(btnEqual);
		
		JButton Advanced = new JButton("Advanced");
		Advanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Advanced obj=new Advanced();
				 obj.setVisible(true);
			}
		});
		Advanced.setBounds(248, 146, 228, 31);
		frame.getContentPane().add(Advanced);
		
		JButton History = new JButton("History");
		History.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				History obj=new History();
				 obj.setVisible(true);
				 obj.Historynew();
			}
		});
		History.setBounds(10, 146, 228, 31);
		frame.getContentPane().add(History);
	}
}
