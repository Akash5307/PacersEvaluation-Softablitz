import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;

import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class conversion extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextField textEntered;
	JComboBox comboBoxFrom;
	JComboBox comboBoxPhy;
	JComboBox comboBoxTo;
	private JTextField textOutput;

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
		
		textEntered = new JTextField();
		textEntered.setHorizontalAlignment(SwingConstants.TRAILING);
		textEntered.setBounds(207, 77, 259, 53);
		contentPane.add(textEntered);
		textEntered.setColumns(10);
		
//		setLayout(null);
		String Options[]={"Select","Length", "Area", "Mass", "Time", "Temperature", "Currency", "Energy", "Angle"};
	 comboBoxPhy = new JComboBox(Options);
//		comboBoxPhy.setModel(new DefaultComboBoxModel(new String[] {"Length", "Area", "Mass", "Time", "Temperature", "Currency", "Energy", "Angle"}));
		comboBoxPhy.setBounds(207, 152, 259, 53);
		comboBoxPhy.addItemListener(this);
		contentPane.add(comboBoxPhy);
		
		
//		String [] Temperature ={"Kelvin", "Celcius", "Fahrenheight"};
		 comboBoxFrom = new JComboBox();
		comboBoxFrom.addItemListener(this);
		comboBoxFrom.setEnabled(false);
		
		
//		if(comboBoxPhy.getSelectedItem().equals("Length")) {
//			comboBoxFrom.setEnabled(true);
////			comboBoxFrom.setModel(new DefaultComboBoxModel(new String[] {}));
//			
//			comboBoxFrom.setBounds(207, 226, 259, 53);
//			contentPane.add(comboBoxFrom);
//			}
//		
//		else if(comboBoxPhy.getSelectedItem().equals("Mass")) {
//			comboBoxFrom.setEnabled(true);
////			comboBoxFrom.setModel(new DefaultComboBoxModel(new String[] {}));	
//			for(int i=0;i<Mass.length;i++) {
//				comboBoxFrom.addItem(Mass[i]);
//			}	
//				comboBoxFrom.setBounds(207, 226, 259, 53);
//				contentPane.add(comboBoxFrom);
//				}
//		else {}
		comboBoxFrom.setBounds(207, 226, 259, 53);
		contentPane.add(comboBoxFrom);
		
		comboBoxTo = new JComboBox();
		comboBoxFrom.addItemListener(this);
		comboBoxFrom.setEnabled(false);
		comboBoxTo.setBounds(207, 302, 259, 53);
		contentPane.add(comboBoxTo);
		
		textOutput = new JTextField();
		textOutput.setHorizontalAlignment(SwingConstants.CENTER);
		textOutput.setBounds(207, 387, 259, 59);
		contentPane.add(textOutput);
		textOutput.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Entered=Double.parseDouble(textEntered.getText());
				double g=9.81;
				if(comboBoxPhy.getSelectedItem().equals("Length")) {
					if(comboBoxFrom.getSelectedItem().equals("Meter")) {
						if(comboBoxTo.getSelectedItem().equals("Meter")){
							textOutput.setText(Entered.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilometer")){
							Double result=Entered/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centimeter")){
							Double result=Entered*100;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Millimeter")){
							Double result=Entered*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Miles")){
							Double result=Entered*0.000621371;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Foot")){
							Double result=Entered*3.28084;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Inches")){
							Double result=Entered*39.3701;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Kilometer")){
						if(comboBoxTo.getSelectedItem().equals("Kilometer")){
							textOutput.setText(Entered.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Meter")){
							Double result=Entered*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centimeter")){
							Double result=Entered*100000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Millimeter")){
							Double result=Entered*1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Miles")){
							Double result=Entered*0.621371;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Foot")){
							Double result=Entered*3.28084*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Inches")){
							Double result=Entered*39.3701*1000;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Centimeter")) {
						if(comboBoxTo.getSelectedItem().equals("Centimeter")){
							textOutput.setText(Entered.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Meter")){
							Double result=Entered/100;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilometer")){
							Double result=Entered/100000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Millimeter")){
							Double result=Entered*10;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Miles")){
							Double result=Entered*0.00000621371;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Foot")){
							Double result=Entered*3.28084/100;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Inches")){
							Double result=Entered*39.3701/100;
							textOutput.setText(result.toString());
						}
					}
					else if(comboBoxFrom.getSelectedItem().equals("Miles")) {
						if(comboBoxTo.getSelectedItem().equals("Miles")){
							textOutput.setText(Entered.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Meter")){
							Double result=Entered*1609.34;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilometer")){
							Double result=Entered*1.60934;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Millimeter")){
							Double result=Entered*1609340;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centimeter")){
							Double result=Entered*160934;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Foot")){
							Double result=Entered*5280;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Inches")){
							Double result=Entered*5280*12;
							textOutput.setText(result.toString());
						}

						
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Inches")) {
						if(comboBoxTo.getSelectedItem().equals("Inches")){
							textOutput.setText(Entered.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Meter")){
							Double result=Entered*0.0254;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilometer")){
							Double result=Entered*0.0000254;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Millimeter")){
							Double result=Entered*25.4;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centimeter")){
							Double result=Entered*2.54;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Foot")){
							Double result=Entered/12;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Miles")){
							Double result=Entered*0.000015783;
							textOutput.setText(result.toString());
						}

					}
					else if(comboBoxFrom.getSelectedItem().equals("Foot")) {
						if(comboBoxTo.getSelectedItem().equals("Foot")){
							textOutput.setText(Entered.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Meter")){
							Double result=Entered*0.0254*12;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilometer")){
							Double result=Entered*0.0000254*12;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Millimeter")){
							Double result=Entered*25.4*12;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centimeter")){
							Double result=Entered*2.54*12;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Inches")){
							Double result=Entered*12;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Miles")){
							Double result=Entered*0.000015783*12;
							textOutput.setText(result.toString());
						}
					}
					else if(comboBoxFrom.getSelectedItem().equals("Millimeter")) {
						if(comboBoxTo.getSelectedItem().equals("Millimeter")){
							textOutput.setText(Entered.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Meter")){
							Double result=Entered/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilometer")){
							Double result=Entered/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centimeter")){
							Double result=Entered/10;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Miles")){
							Double result=Entered*0.000000621371;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Foot")){
							Double result=Entered*3.28084/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Inches")){
							Double result=Entered*39.3701/1000;
							textOutput.setText(result.toString());
						}
					}
					
				
					// Length conversion Completed  
					// Mass conversion started 
					
					
				}
				else if(comboBoxPhy.getSelectedItem().equals("Mass")) {
					
					if(comboBoxFrom.getSelectedItem().equals("Gram")) {
						if(comboBoxTo.getSelectedItem().equals("Gram")) {
							Double result=Entered*1;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilogram")) {
							Double result=Entered/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Pound")) {
							Double result=Entered*0.00220462;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Weight")) {
							Double result=Entered*g/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milligrams")) {
							Double result=Entered*1000;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Tonnes")) {
							Double result=Entered/1000000;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Ounces")) {
							Double result=Entered*0.035274;
							textOutput.setText(result.toString());
						}
					}
					else if(comboBoxFrom.getSelectedItem().equals("Kilogram")) {
						if(comboBoxTo.getSelectedItem().equals("Gram")) {
							Double result=Entered*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilogram")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Pound")) {
							Double result=Entered*2.20462;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Weight")) {
							Double result=Entered*g;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milligrams")) {
							Double result=Entered*1000000;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Tonnes")) {
							Double result=Entered/1000;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Ounces")) {
							Double result=Entered*0.035274*1000;
							textOutput.setText(result.toString());
						}
					}
					else if(comboBoxFrom.getSelectedItem().equals("Pound")) {
						
						if(comboBoxTo.getSelectedItem().equals("Gram")) {
							Double result=Entered*453.592;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilogram")) {
							Double result=Entered*453.592/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Pound")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Weight")) {
							Double result=Entered*g*453.592/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milligrams")) {
							Double result=Entered*453592;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Tonnes")) {
							Double result=Entered*0.000453592;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Ounces")) {
							Double result=Entered*16;
							textOutput.setText(result.toString());
						}
						
						
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Weight")) {
						
						if(comboBoxTo.getSelectedItem().equals("Gram")) {
							Double result=(Entered/g)*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilogram")) {
							Double result=Entered/g;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Pound")) {
							Double result=Entered*2.20462/g;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Weight")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milligrams")) {
							Double result=Entered*1000000/g;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Tonnes")) {
							Double result=Entered/1000000;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Ounces")) {
							Double result=Entered*16/1000;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Milligrams")) {
						
						if(comboBoxTo.getSelectedItem().equals("Gram")) {
							Double result=Entered/1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilogram")) {
							Double result=Entered/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Pound")) {
							Double result=Entered*2.20462/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Weight")) {
							Double result=Entered*g/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milligrams")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Tonnes")) {
							Double result=Entered/(1000*1000000);
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Ounces")) {
							Double result=Entered*0.035274*1000/1000000;
							textOutput.setText(result.toString());
						}
						
					}else if(comboBoxFrom.getSelectedItem().equals("Tonnes")) {
						
						if(comboBoxTo.getSelectedItem().equals("Gram")) {
							Double result=Entered*1000*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilogram")) {
							Double result=Entered*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Pound")) {
							Double result=Entered*2.20462*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Weight")) {
							Double result=Entered*g*1000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milligrams")) {
							Double result=Entered*1000000*1000;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Tonnes")) {
							Double result=Entered/1000 *1000;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Ounces")) {
							Double result=Entered*0.035274*1000*1000;
							textOutput.setText(result.toString());
						}
						
					}else if(comboBoxFrom.getSelectedItem().equals("Ounces")) {
						if(comboBoxTo.getSelectedItem().equals("Gram")) {
							Double result=Entered*1000*35.274;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Kilogram")) {
							Double result=Entered*35.274;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Pound")) {
							Double result=Entered*2.20462*35.274;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Weight")) {
							Double result=Entered*g*35.274;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milligrams")) {
							Double result=Entered*1000000*35.274;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Tonnes")) {
							Double result=Entered/1000*35.274;
							textOutput.setText(result.toString());
						}else if(comboBoxTo.getSelectedItem().equals("Ounces")) {
							Double result=Entered*0.035274*1000*35.274;
							textOutput.setText(result.toString());
						}
						else {}
						
					}
					
				}
				else if(comboBoxPhy.getSelectedItem().equals("Time")) {
					if(comboBoxFrom.getSelectedItem().equals("Second")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Second")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hours")) {
							Double result=Entered/(60*60);
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Minute")) {
							Double result=Entered/(60);
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Days")) {
							Double result=Entered/(24*60*60);
							textOutput.setText(result.toString());
						}
						 
					}
					
					else if(comboBoxFrom.getSelectedItem().equals("Hours")) {
						if(comboBoxTo.getSelectedItem().equals("Second")) {
							Double result=Entered*60*60;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hours")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Minute")) {
							Double result=Entered*(60);
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Days")) {
							Double result=Entered/(24);
							textOutput.setText(result.toString());
						}
					}
					else if(comboBoxFrom.getSelectedItem().equals("Minute")) {
						if(comboBoxTo.getSelectedItem().equals("Second")) {
							Double result=Entered*60;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hours")) {
							Double result=Entered/(60);
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Minute")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Days")) {
							Double result=Entered/(24*60);
							textOutput.setText(result.toString());
						}
					}
					else if(comboBoxFrom.getSelectedItem().equals("Days")) {
						if(comboBoxTo.getSelectedItem().equals("Second")) {
							Double result=Entered*24*60*60;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hours")) {
							Double result=Entered*24;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Minute")) {
							Double result=Entered*24*(60);
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Days")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
					}
					
				}
				// Time completed 
				// temperature started 
				else if(comboBoxPhy.getSelectedItem().equals("Temperature")) {
					if(comboBoxFrom.getSelectedItem().equals("Kelvin")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Kelvin")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Celcius")) {
							Double result=Entered-273.15;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Fahrenheit")) {
							Double result=(Entered-273.25)*9/5+32;
							textOutput.setText(result.toString());
						}
						
						 
					}
					
					else if(comboBoxFrom.getSelectedItem().equals("Celcius")) {
						if(comboBoxTo.getSelectedItem().equals("Kelvin")) {
							Double result=Entered+273.15;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Celcius")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Fahrenheit")) {
							Double result=Entered*9/5+32;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Fahrenheit")) {
						if(comboBoxTo.getSelectedItem().equals("Kelvin")) {
							Double result=((Entered-32)*5/9)+273.15;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Celcius")) {
							Double result=(Entered-32)*5/9;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Fahrenheit")) {
							Double result=Entered;
							textOutput.setText(result.toString());
							
						}
					}
					
					
				}
			// Temperature Khatam
				
			// Area Start
				else if(comboBoxPhy.getSelectedItem().equals("Area")) {
					if(comboBoxFrom.getSelectedItem().equals("Meter Square")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Meter Square")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hectare")) {
							Double result=Entered/10000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Acers")) {
							Double result=Entered*0.000247105;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centi-Meter Square")) {
							Double result=Entered*10000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milli-Meter Square")) {
							Double result=Entered*1000000;
							textOutput.setText(result.toString());
						}
						
						 
					}
					
					
					else if(comboBoxFrom.getSelectedItem().equals("Centi-Meter Square")) {
						
						if(comboBoxTo.getSelectedItem().equals("Meter Square")) {
							Double result=Entered/10000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hectare")) {
							Double result=Entered/100000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Acers")) {
							Double result=Entered*0.0000000247105;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centi-Meter Square")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milli-Meter Square")) {
							Double result=Entered*100;
							textOutput.setText(result.toString());
						}
						
						
					}
					
					else if(comboBoxFrom.getSelectedItem().equals("Hectare")) {
						
						if(comboBoxTo.getSelectedItem().equals("Meter Square")) {
							Double result=Entered*10000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hectare")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Acers")) {
							Double result=Entered*2.47105;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centi-Meter Square")) {
							Double result=Entered*100000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milli-Meter Square")) {
							Double result=Entered;
							textOutput.setText(result.toString()+" *1e10");
						}
						
						
					}
					
					else if(comboBoxFrom.getSelectedItem().equals("Acers")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Meter Square")) {
							Double result=Entered/0.000247105;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hectare")) {
							Double result=(Entered/10000)/0.000247105;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Acers")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centi-Meter Square")) {
							Double result=(Entered*10000)/0.000247105;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milli-Meter Square")) {
							Double result=(Entered*1000000)/0.000247105;
							textOutput.setText(result.toString());
						}
						
						 
					}
					else if(comboBoxFrom.getSelectedItem().equals("Milli-Meter Square")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Meter Square")) {
							Double result=Entered/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Hectare")) {
							Double result=(Entered/10000)/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Acers")) {
							Double result=Entered*0.000247105/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Centi-Meter Square")) {
							Double result=Entered*10000/1000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Milli-Meter Square")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						
						 
					}
					
					}
				
					// Area Khatam
				// Angle Started 
				else if(comboBoxPhy.getSelectedItem().equals("Angle")) {
					if(comboBoxFrom.getSelectedItem().equals("Degree")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Degree")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Radian")) {
							Double result=Entered*3.141592/180;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Radian")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Degree")) {
							Double result=Entered*180/3.141592;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Radian")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						
					}
				}
				// Angle Khatam
				
				// Energy Started
				else if(comboBoxPhy.getSelectedItem().equals("Energy")) {
					if(comboBoxFrom.getSelectedItem().equals("Joules")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Joules")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Calories")) {
							Double result=Entered/4.184;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Electron-Volts")) {
							Double result=Entered*6.242;
							textOutput.setText(result.toString()+" *1e18");
						}
						else if(comboBoxTo.getSelectedItem().equals("Ergs")) {
							Double result=Entered*10000000;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Calories")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Joules")) {
							Double result=Entered*4.184;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Calories")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Electron-Volts")) {
							Double result=Entered*2.611;
							textOutput.setText(result.toString()+" *1e16");
						}
						else if(comboBoxTo.getSelectedItem().equals("Ergs")) {
							Double result=Entered*41840000;
							textOutput.setText(result.toString());
						}
						
					}
					
					else if(comboBoxFrom.getSelectedItem().equals("Electron-Volts")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Joules")) {
							Double result=Entered*1.602;
							textOutput.setText(result.toString()+ " *1e-19");
						}
						else if(comboBoxTo.getSelectedItem().equals("Calories")) {
							Double result=Entered*3.829;
							textOutput.setText(result.toString()+" *1e-23");
						}
						else if(comboBoxTo.getSelectedItem().equals("Electron-Volts")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Ergs")) {
							Double result=Entered*1.602;
							textOutput.setText(result.toString()+" *1e-12");
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Ergs")) {
						
						 if(comboBoxTo.getSelectedItem().equals("Joules")) {
							Double result=Entered/10000000;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Calories")) {
							Double result=Entered*2.39;
							textOutput.setText(result.toString()+" *1e-11");
						}
						else if(comboBoxTo.getSelectedItem().equals("Electron-Volts")) {
							Double result=Entered*6.242;
							textOutput.setText(result.toString()+" *1e11");
						}
						else if(comboBoxTo.getSelectedItem().equals("Ergs")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						
					}
					
					
					
				}else if(comboBoxPhy.getSelectedItem().equals("Currency")) {
					if(comboBoxFrom.getSelectedItem().equals("US-Dollar")) {
						
						 if(comboBoxTo.getSelectedItem().equals("US-Dollar")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Indian-Rupee")) {
							Double result=Entered*80.775;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("UK-Pound")) {
							Double result=Entered*0.853;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Switzerland-Franc")) {
							Double result=Entered*0.9603;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Qatar-Riyal")) {
							Double result=Entered*3.64;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("China-Yuan")) {
							Double result=Entered*7.1249;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Japan-Yen")) {
							Double result=Entered*139.82;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Indian-Rupee")) {
						
						 if(comboBoxTo.getSelectedItem().equals("US-Dollar")) {
							Double result=Entered*0.01238;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Indian-Rupee")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("UK-Pound")) {
							Double result=Entered*0.01056;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Switzerland-Franc")) {
							Double result=Entered*0.01189;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Qatar-Riyal")) {
							Double result=Entered*0.04506;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("China-Yuan")) {
							Double result=Entered*0.08821;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Japan-Yen")) {
							Double result=Entered*1.731;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("UK-Pound")) {
						
						 if(comboBoxTo.getSelectedItem().equals("US-Dollar")) {
							Double result=Entered*1.1723;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Indian-Rupee")) {
							Double result=Entered*94.6952;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("UK-Pound")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Switzerland-Franc")) {
							Double result=Entered*1.1258;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Qatar-Riyal")) {
							Double result=Entered*4.2673;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("China-Yuan")) {
							Double result=Entered*8.3528;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Japan-Yen")) {
							Double result=Entered*163.9156;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Switzerland-Franc")) {
						
						 if(comboBoxTo.getSelectedItem().equals("US-Dollar")) {
							Double result=Entered*1.0413;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Indian-Rupee")) {
							Double result=Entered*84.1143;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("UK-Pound")) {
							Double result=Entered*0.8883;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Switzerland-Franc")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Qatar-Riyal")) {
							Double result=Entered*3.7905;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("China-Yuan")) {
							Double result=Entered*7.4195;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Japan-Yen")) {
							Double result=Entered*145.6003;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Qatar-Riyal")) {
						
						 if(comboBoxTo.getSelectedItem().equals("US-Dollar")) {
							Double result=Entered*0.2747;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Indian-Rupee")) {
							Double result=Entered*22.1909;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("UK-Pound")) {
							Double result=Entered*0.2343;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Switzerland-Franc")) {
							Double result=Entered*0.2638;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Qatar-Riyal")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("China-Yuan")) {
							Double result=Entered*1.9574;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Japan-Yen")) {
							Double result=Entered*38.4121;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("China-Yuan")) {
						
						 if(comboBoxTo.getSelectedItem().equals("US-Dollar")) {
							Double result=Entered*0.1404;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Indian-Rupee")) {
							Double result=Entered*11.337;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("UK-Pound")) {
							Double result=Entered*0.1197;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Switzerland-Franc")) {
							Double result=Entered*0.1348;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Qatar-Riyal")) {
							Double result=Entered*0.5109;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("China-Yuan")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Japan-Yen")) {
							Double result=Entered*19.6241;
							textOutput.setText(result.toString());
						}
						
					}
					else if(comboBoxFrom.getSelectedItem().equals("Japan-Yen")) {
						
						 if(comboBoxTo.getSelectedItem().equals("US-Dollar")) {
							Double result=Entered*0.007152;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Indian-Rupee")) {
							Double result=Entered*0.5777;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("UK-Pound")) {
							Double result=Entered*0.006101;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Switzerland-Franc")) {
							Double result=Entered*0.006868;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Qatar-Riyal")) {
							Double result=Entered*0.02603;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("China-Yuan")) {
							Double result=Entered*0.05096;
							textOutput.setText(result.toString());
						}
						else if(comboBoxTo.getSelectedItem().equals("Japan-Yen")) {
							Double result=Entered;
							textOutput.setText(result.toString());
						}
						
					}
					
					
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(49, 387, 118, 59);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Pacers Evaluation");
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lblNewLabel.setBounds(137, 10, 244, 46);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String [] Length={"Meter", "Kilometer", "Centimeter", "Miles", "Inches", "Foot", "Millimeter"};
		String [] Mass ={"Gram", "Kilogram", "Pound", "Weight", "Milligram", "Tonnes", "Ounces"};
        String Area[] = { "Meter Square", "Hectare", "Acers", "Centi-Meter Square", "Milli-Meter Square" };
        String Time[]= {"Second","Minute","Hours","Days"};
        String [] Temperature ={"Kelvin", "Celcius", "Fahrenheit"};
        String Currency[]= {"US-Dollar","Indian-Rupee","UK-Pound","Switzerland-Franc","Qatar-Riyal","China-Yuan","Japan-Yen"};
        String Energy[]= {"Joules","Calories","Electron-Volts","Ergs"};
        String Angle[]= {"Degree","Radian"};

        if (e.getSource() == comboBoxPhy) {
        	if(comboBoxPhy.getSelectedItem().equals("Select")) {comboBoxFrom.setEnabled(false);comboBoxTo.setEnabled(false);}
        else if (comboBoxPhy.getSelectedItem().equals("Length")) {
        			comboBoxFrom.setEnabled(true);
        			comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                    for (int i = 0; i < Length.length; i++) {
                    	comboBoxFrom.addItem(Length[i]);
                    	comboBoxTo.addItem(Length[i]);
                    }
                } else if (comboBoxPhy.getSelectedItem().equals("Mass")) {
                	comboBoxFrom.setEnabled(true);
                	comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                        for (int i = 0; i < Mass.length; i++) {
                        	comboBoxFrom.addItem(Mass[i]);
                        	comboBoxTo.addItem(Mass[i]);
                        }
                } else if (comboBoxPhy.getSelectedItem().equals("Area")) {
                	comboBoxFrom.setEnabled(true);
                	comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                        for (int i = 0; i < Area.length; i++) {
                        	comboBoxFrom.removeItem(Area[i]);
                        	comboBoxFrom.addItem(Area[i]);
                        	comboBoxTo.addItem(Area[i]);
                        }
                } else if (comboBoxPhy.getSelectedItem().equals("Time")) {
                	comboBoxFrom.setEnabled(true);
                	comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                        for (int i = 0; i < Time.length; i++) {
                        	comboBoxFrom.addItem(Time[i]);
                        	comboBoxTo.addItem(Time[i]);
                        }
                } else if (comboBoxPhy.getSelectedItem().equals("Temperature")) {
                	comboBoxFrom.setEnabled(true);
                	comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                        for (int i = 0; i < Temperature.length; i++) {
                        	comboBoxFrom.addItem(Temperature[i]);
                        	comboBoxTo.addItem(Temperature[i]);
                        }
                } else if (comboBoxPhy.getSelectedItem().equals("Currency")) {
                	comboBoxFrom.setEnabled(true);
                	comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                        for (int i = 0; i < Currency.length; i++) {
                        	comboBoxFrom.addItem(Currency[i]);
                        	comboBoxTo.addItem(Currency[i]);
                        }
                } else if (comboBoxPhy.getSelectedItem().equals("Energy")) {
                	comboBoxFrom.setEnabled(true);
                	comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                        for (int i = 0; i < Energy.length; i++) {
                        	comboBoxFrom.addItem(Energy[i]);
                        	comboBoxTo.addItem(Energy[i]);
                        }
                }else if (comboBoxPhy.getSelectedItem().equals("Angle")) {
                	comboBoxFrom.setEnabled(true);
                	comboBoxTo.setEnabled(true);
                	comboBoxFrom.removeAllItems();
                	comboBoxTo.removeAllItems();
                        for (int i = 0; i < Angle.length; i++) {
                        	comboBoxFrom.addItem(Angle[i]);
                        	comboBoxTo.addItem(Angle[i]);
                        }
                }
        }
		
		
	}
}
