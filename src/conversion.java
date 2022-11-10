import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class conversion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversion frame = new conversion();
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
	public conversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JlbEnterValue = new JLabel("Enter Value");
		JlbEnterValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlbEnterValue.setHorizontalAlignment(SwingConstants.CENTER);
		JlbEnterValue.setBounds(23, 85, 133, 35);
		contentPane.add(JlbEnterValue);
		
		JLabel JlbPhyQuantity = new JLabel("Pysical Quantity");
		JlbPhyQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlbPhyQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		JlbPhyQuantity.setBounds(23, 159, 133, 35);
		contentPane.add(JlbPhyQuantity);
		
		JLabel JlbFrom = new JLabel("From");
		JlbFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlbFrom.setHorizontalAlignment(SwingConstants.CENTER);
		JlbFrom.setBounds(23, 233, 133, 35);
		contentPane.add(JlbFrom);
		
		JLabel JlbTo = new JLabel("To");
		JlbTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlbTo.setHorizontalAlignment(SwingConstants.CENTER);
		JlbTo.setBounds(23, 309, 133, 35);
		contentPane.add(JlbTo);
		
		textField = new JTextField();
		textField.setBounds(207, 77, 259, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBoxPhy = new JComboBox();
		comboBoxPhy.setModel(new DefaultComboBoxModel(new String[] {"Length", "Area", "Mass", "Time", "Temperature", "Currency", "Energy", "Angle"}));
		comboBoxPhy.setBounds(207, 152, 259, 53);
		contentPane.add(comboBoxPhy);
		
		JComboBox comboBoxFrom = new JComboBox();
		if(comboBoxPhy.getSelectedItem().toString()=="Length") {
			comboBoxFrom.setModel(new DefaultComboBoxModel(new String[] {"Meter", "Kilometer", "Centimeter", "Miles", "Inches", "Foot", "Millimeter"}));	
			comboBoxFrom.setBounds(207, 226, 259, 53);
			contentPane.add(comboBoxFrom);
			}
		
		else if(comboBoxPhy.getSelectedItem().toString()=="Mass") {
				comboBoxFrom.setModel(new DefaultComboBoxModel(new String[] {"Gram", "Kilogram", "Pound", "Weight", "Milligram", "Tonnes", "Ounces"}));	
				comboBoxFrom.setBounds(207, 226, 259, 53);
				contentPane.add(comboBoxFrom);
				}
		else {}
		comboBoxFrom.setBounds(207, 226, 259, 53);
		contentPane.add(comboBoxFrom);
		
		JComboBox comboBoxTo = new JComboBox();
		comboBoxTo.setBounds(207, 302, 259, 53);
		contentPane.add(comboBoxTo);
	}
}
