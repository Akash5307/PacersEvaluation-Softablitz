import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Advanced extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advanced frame = new Advanced();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Advanced() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton btnParenthesisOpen = new JButton("(");
		btnParenthesisOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnParenthesisOpen.getText();
				textField.setText(number);
				}
		});
		btnParenthesisOpen.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnParenthesisOpen.setBounds(10, 361, 85, 62);
		contentPane.add(btnParenthesisOpen);
		
		final JButton btnParenthesisClose = new JButton(")");
		btnParenthesisClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnParenthesisClose.getText();
				textField.setText(number);
			}
		});
		btnParenthesisClose.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnParenthesisClose.setBounds(10, 433, 85, 62);
		contentPane.add(btnParenthesisClose);
		
		final JButton btnPower = new JButton("^");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnPower.getText()+"(";
				textField.setText(number);
			}
		});
		btnPower.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnPower.setBounds(10, 289, 85, 62);
		contentPane.add(btnPower);
		
		final JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnPercentage.getText();
				textField.setText(number);
			}
		});
		btnPercentage.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnPercentage.setBounds(200, 217, 85, 62);
		contentPane.add(btnPercentage);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn7.setBounds(105, 289, 85, 62);
		contentPane.add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn4.setBounds(105, 361, 85, 62);
		contentPane.add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				}
		});
		btn1.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn1.setBounds(105, 433, 85, 62);
		contentPane.add(btn1);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn0.setBounds(105, 506, 180, 62);
		contentPane.add(btn0);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
				}
		});
		btn2.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn2.setBounds(200, 433, 85, 62);
		contentPane.add(btn2);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn5.setBounds(200, 361, 85, 62);
		contentPane.add(btn5);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				}
		});
		btn8.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn8.setBounds(200, 289, 85, 62);
		contentPane.add(btn8);
		
		final JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				}
		});
		btnClear.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnClear.setBounds(10, 217, 180, 62);
		contentPane.add(btnClear);
		
		final JButton btnBackSpace = new JButton("");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 17));
		btnBackSpace.setBounds(295, 218, 85, 62);
		contentPane.add(btnBackSpace);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
				}
		});
		btn9.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn9.setBounds(295, 289, 85, 62);
		contentPane.add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
				}
		});
		btn6.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn6.setBounds(295, 361, 85, 62);
		contentPane.add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		btn3.setBounds(295, 433, 85, 62);
		contentPane.add(btn3);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnDot.setBounds(10, 505, 85, 62);
		contentPane.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ArithmaticExpression converter = new ArithmaticExpression();
				String number=textField.getText();
				double answer=0;
				
				try{answer = converter.evaluate(converter.convertToPostfix(number));
				String s=answer+"";
				textField.setText(s);
				}
				catch(Exception exp){
					textField.setText("invalid input");
				}
				if(!(textField.getText()=="invalid input")) {
				String s2=textField.getText();
				String tosend="insert into History values(1, '"+number+"','"+s2+"');";
				Connection connection = null;
		        try
		        {
		          // create a database connection
		          connection = DriverManager.getConnection("jdbc:sqlite:Evaluation.db");
		          Statement statement = connection.createStatement();
		          statement.setQueryTimeout(30);  // set timeout to 30 sec.

//		          statement.executeUpdate("drop table if exists History");

		          try{statement.executeUpdate("create table History(id integer, expression string PRIMARY KEY,answer string)");
		          } catch(Exception exp){

		          }
		          try{
		        	  
		        	  statement.executeUpdate("DELETE FROM History WHERE id=10;");
		        	  statement.executeUpdate("UPDATE History SET id=id+1 WHERE id<10;");
		        	  statement.executeUpdate(tosend);
		          }
		          catch(Exception exp){}
		          

//		          ResultSet rs = statement.executeQuery("select * from History");
//		          while(rs.next())
//		          {
//		            // read the result set
//		            System.out.println("expression ="+rs.getString("expression"));
//		            System.out.println("id = " + rs.getInt("id"));
//		            System.out.println("answer= " + rs.getString("answer"));
//		          }
		        }
		        // java -classpath ".;sqlite-jdbc-3.39.3.0.jar" Sample.java
		        catch(SQLException exp)
		        {
		          // if the error message is "out of memory",
		          // it probably means no database file is found
		          System.err.println(exp.getMessage());
		        }
				
				finally
		        {
		          try
		          {
		            if(connection != null)
		              connection.close();
		          }
		          catch(SQLException exp)
		          {
		            // connection close failed.
		            System.err.println(exp.getMessage());
		          }
		        }}
			}
		});
		btnEqual.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnEqual.setBounds(295, 505, 181, 62);
		contentPane.add(btnEqual);
		
		final JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDivide.getText();
				textField.setText(number);	
			}
		});
		btnDivide.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnDivide.setBounds(391, 433, 85, 62);
		contentPane.add(btnDivide);
		
		final JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnMultiply.getText();
				textField.setText(number);
				}
		});
		btnMultiply.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnMultiply.setBounds(391, 361, 85, 62);
		contentPane.add(btnMultiply);
		
		final JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnSubtract.getText();
				textField.setText(number);
				}
		});
		btnSubtract.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnSubtract.setBounds(391, 289, 85, 62);
		contentPane.add(btnSubtract);
		
		final JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnAddition.getText();
				textField.setText(number);
			}
		});
		btnAddition.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		btnAddition.setBounds(391, 217, 85, 62);
		contentPane.add(btnAddition);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setColumns(10);
		textField.setBounds(10, 66, 466, 70);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Pacers Evaluation");
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lblNewLabel.setBounds(128, 10, 244, 46);
		contentPane.add(lblNewLabel);
		
		JButton History = new JButton("History");
		History.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				History obj=new History();
				 obj.setVisible(true);
				 obj.Historynew();
			}
		});
		History.setBounds(10, 151, 227, 56);
		contentPane.add(History);
		
		JButton btnConversion = new JButton("Conversion");
		btnConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConversion.setBounds(247, 151, 229, 56);
		contentPane.add(btnConversion);
	}
}
