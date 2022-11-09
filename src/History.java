import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;

public class History extends JFrame {

	private JPanel contentPane;
	private static JTextField textField_Expression_1;
	private static JTextField textField_Ans_1;
	private static JTextField textField_Expression_10;
	private static JTextField textField_Ans_10;
	private static JTextField textField_Expression_9;
	private static JTextField textField_Ans_9;
	private static JTextField textField_Expression_8;
	private static JTextField textField_Ans_8;
	private static JTextField textField_Expression_7;
	private static JTextField textField_Ans_7;
	private static JTextField textField_Expression_6;
	private static JTextField textField_Ans_6;
	private static JTextField textField_Expression_5;
	private static JTextField textField_Ans_5;
	private static JTextField textField_Expression_4;
	private static JTextField textField_Ans_4;
	private static JTextField textField_Expression_3;
	private static JTextField textField_Ans_3;
	private static JTextField textField_Expression_2;
	private static JTextField textField_Ans_2;
	private static JLabel lblExpression;
	private static JLabel lblResult;

	/**
	 * Launch the application.
	 */
	
	public static void Historynew(){
		Connection connection = null;
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:Evaluation.db");
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.

//          statement.executeUpdate("drop table if exists History");

//          statement.executeUpdate("UPDATE History SET id=id-1 WHERE id<20;");
          ResultSet rs = statement.executeQuery("select * from History");
          while(rs.next())
          {
            // read the result set
            
            if(rs.getInt("id")==1) {
            	textField_Expression_1.setText(rs.getString("expression"));
            	textField_Ans_1.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==2) {
            	textField_Expression_2.setText(rs.getString("expression"));
            	textField_Ans_2.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==3) {
            	textField_Expression_3.setText(rs.getString("expression"));
            	textField_Ans_3.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==4) {
            	textField_Expression_4.setText(rs.getString("expression"));
            	textField_Ans_4.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==5) {
            	textField_Expression_5.setText(rs.getString("expression"));
            	textField_Ans_5.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==6) {
            	textField_Expression_6.setText(rs.getString("expression"));
            	textField_Ans_6.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==7) {
            	textField_Expression_7.setText(rs.getString("expression"));
            	textField_Ans_7.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==8) {
            	textField_Expression_8.setText(rs.getString("expression"));
            	textField_Ans_8.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==9) {
            	textField_Expression_9.setText(rs.getString("expression"));
            	textField_Ans_9.setText(rs.getString("answer"));
            		
            }
            if(rs.getInt("id")==10) {
            	textField_Expression_10.setText(rs.getString("expression"));
            	textField_Ans_10.setText(rs.getString("answer"));
            		
            }
          }
        }
        // java -classpath ".;sqlite-jdbc-3.39.3.0.jar" Sample.java
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
        
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e.getMessage());
          }
        }
        
        
        
        
        
        
        
        
        
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History frame = new History();
					frame.setVisible(true);
					
					Connection connection = null;
			        try
			        {
			          // create a database connection
			          connection = DriverManager.getConnection("jdbc:sqlite:Evaluation.db");
			          Statement statement = connection.createStatement();
			          statement.setQueryTimeout(30);  // set timeout to 30 sec.

//			          statement.executeUpdate("drop table if exists History");

//			          statement.executeUpdate("UPDATE History SET id=id-1 WHERE id<20;");
			          ResultSet rs = statement.executeQuery("select * from History");
			          while(rs.next())
			          {
			            // read the result set
			            
			            if(rs.getInt("id")==1) {
			            	textField_Expression_1.setText(rs.getString("expression"));
			            	textField_Ans_1.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==2) {
			            	textField_Expression_2.setText(rs.getString("expression"));
			            	textField_Ans_2.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==3) {
			            	textField_Expression_3.setText(rs.getString("expression"));
			            	textField_Ans_3.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==4) {
			            	textField_Expression_4.setText(rs.getString("expression"));
			            	textField_Ans_4.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==5) {
			            	textField_Expression_5.setText(rs.getString("expression"));
			            	textField_Ans_5.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==6) {
			            	textField_Expression_6.setText(rs.getString("expression"));
			            	textField_Ans_6.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==7) {
			            	textField_Expression_7.setText(rs.getString("expression"));
			            	textField_Ans_7.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==8) {
			            	textField_Expression_8.setText(rs.getString("expression"));
			            	textField_Ans_8.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==9) {
			            	textField_Expression_9.setText(rs.getString("expression"));
			            	textField_Ans_9.setText(rs.getString("answer"));
			            		
			            }
			            if(rs.getInt("id")==10) {
			            	textField_Expression_10.setText(rs.getString("expression"));
			            	textField_Ans_10.setText(rs.getString("answer"));
			            		
			            }









			            
			          }
			        }
			        // java -classpath ".;sqlite-jdbc-3.39.3.0.jar" Sample.java
			        catch(SQLException e)
			        {
			          // if the error message is "out of memory",
			          // it probably means no database file is found
			          System.err.println(e.getMessage());
			        }
			        finally
			        {
			          try
			          {
			            if(connection != null)
			              connection.close();
			          }
			          catch(SQLException e)
			          {
			            // connection close failed.
			            System.err.println(e.getMessage());
			          }
			        }
			      
					
					
					
					
					
					
					
					
					
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public History() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pacers Evaluation");
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lblNewLabel.setBounds(267, -4, 244, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lblHistory.setBounds(335, 42, 99, 46);
		contentPane.add(lblHistory);
		
		textField_Expression_1 = new JTextField();
		textField_Expression_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_1.setBackground(new Color(170, 227, 255));
		textField_Expression_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_1.setColumns(10);
		textField_Expression_1.setBounds(10, 150, 565, 38);
		contentPane.add(textField_Expression_1);
		
		textField_Ans_1 = new JTextField();
		textField_Ans_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_1.setBackground(new Color(170, 227, 255));
		textField_Ans_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_1.setColumns(10);
		textField_Ans_1.setBounds(609, 150, 191, 38);
		contentPane.add(textField_Ans_1);
		
		textField_Expression_10 = new JTextField();
		textField_Expression_10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_10.setBackground(new Color(170, 227, 255));
		textField_Expression_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_10.setColumns(10);
		textField_Expression_10.setBounds(10, 646, 565, 38);
		contentPane.add(textField_Expression_10);
		
		textField_Ans_10 = new JTextField();
		textField_Ans_10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_10.setBackground(new Color(170, 227, 255));
		textField_Ans_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_10.setColumns(10);
		textField_Ans_10.setBounds(609, 646, 191, 38);
		contentPane.add(textField_Ans_10);
		
		textField_Expression_9 = new JTextField();
		textField_Expression_9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_9.setBackground(new Color(170, 227, 255));
		textField_Expression_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_9.setColumns(10);
		textField_Expression_9.setBounds(10, 590, 565, 38);
		contentPane.add(textField_Expression_9);
		
		textField_Ans_9 = new JTextField();
		textField_Ans_9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_9.setBackground(new Color(170, 227, 255));
		textField_Ans_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_9.setColumns(10);
		textField_Ans_9.setBounds(609, 590, 191, 38);
		contentPane.add(textField_Ans_9);
		
		textField_Expression_8 = new JTextField();
		textField_Expression_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_8.setBackground(new Color(170, 227, 255));
		textField_Expression_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_8.setColumns(10);
		textField_Expression_8.setBounds(10, 536, 565, 38);
		contentPane.add(textField_Expression_8);
		
		textField_Ans_8 = new JTextField();
		textField_Ans_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_8.setBackground(new Color(170, 227, 255));
		textField_Ans_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_8.setColumns(10);
		textField_Ans_8.setBounds(609, 536, 191, 38);
		contentPane.add(textField_Ans_8);
		
		textField_Expression_7 = new JTextField();
		textField_Expression_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_7.setBackground(new Color(170, 227, 255));
		textField_Expression_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_7.setColumns(10);
		textField_Expression_7.setBounds(10, 482, 565, 38);
		contentPane.add(textField_Expression_7);
		
		textField_Ans_7 = new JTextField();
		textField_Ans_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_7.setBackground(new Color(170, 227, 255));
		textField_Ans_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_7.setColumns(10);
		textField_Ans_7.setBounds(609, 482, 191, 38);
		contentPane.add(textField_Ans_7);
		
		textField_Expression_6 = new JTextField();
		textField_Expression_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_6.setBackground(new Color(170, 227, 255));
		textField_Expression_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_6.setColumns(10);
		textField_Expression_6.setBounds(10, 428, 565, 38);
		contentPane.add(textField_Expression_6);
		
		textField_Ans_6 = new JTextField();
		textField_Ans_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_6.setBackground(new Color(170, 227, 255));
		textField_Ans_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_6.setColumns(10);
		textField_Ans_6.setBounds(609, 428, 191, 38);
		contentPane.add(textField_Ans_6);
		
		textField_Expression_5 = new JTextField();
		textField_Expression_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_5.setBackground(new Color(170, 227, 255));
		textField_Expression_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_5.setColumns(10);
		textField_Expression_5.setBounds(10, 369, 565, 38);
		contentPane.add(textField_Expression_5);
		
		textField_Ans_5 = new JTextField();
		textField_Ans_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_5.setBackground(new Color(170, 227, 255));
		textField_Ans_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_5.setColumns(10);
		textField_Ans_5.setBounds(609, 369, 191, 38);
		contentPane.add(textField_Ans_5);
		
		textField_Expression_4 = new JTextField();
		textField_Expression_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_4.setBackground(new Color(170, 227, 255));
		textField_Expression_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_4.setColumns(10);
		textField_Expression_4.setBounds(10, 310, 565, 38);
		contentPane.add(textField_Expression_4);
		
		textField_Ans_4 = new JTextField();
		textField_Ans_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_4.setBackground(new Color(170, 227, 255));
		textField_Ans_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_4.setColumns(10);
		textField_Ans_4.setBounds(609, 310, 191, 38);
		contentPane.add(textField_Ans_4);
		
		textField_Expression_3 = new JTextField();
		textField_Expression_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_3.setBackground(new Color(170, 227, 255));
		textField_Expression_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_3.setColumns(10);
		textField_Expression_3.setBounds(10, 256, 565, 38);
		contentPane.add(textField_Expression_3);
		
		textField_Ans_3 = new JTextField();
		textField_Ans_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_3.setBackground(new Color(170, 227, 255));
		textField_Ans_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_3.setColumns(10);
		textField_Ans_3.setBounds(609, 256, 191, 38);
		contentPane.add(textField_Ans_3);
		
		textField_Expression_2 = new JTextField();
		textField_Expression_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Expression_2.setBackground(new Color(170, 227, 255));
		textField_Expression_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Expression_2.setColumns(10);
		textField_Expression_2.setBounds(10, 203, 565, 38);
		contentPane.add(textField_Expression_2);
		
		textField_Ans_2 = new JTextField();
		textField_Ans_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_Ans_2.setBackground(new Color(170, 227, 255));
		textField_Ans_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Ans_2.setColumns(10);
		textField_Ans_2.setBounds(609, 203, 191, 38);
		contentPane.add(textField_Ans_2);
		
		lblExpression = new JLabel("Expression");
		lblExpression.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lblExpression.setBounds(187, 88, 148, 52);
		contentPane.add(lblExpression);
		
		lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lblResult.setBounds(647, 93, 127, 52);
		contentPane.add(lblResult);
	}

}
