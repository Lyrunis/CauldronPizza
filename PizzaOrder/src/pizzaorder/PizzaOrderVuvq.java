package pizzaorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.UIManager;

public class PizzaOrderVuvq extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrderVuvq frame = new PizzaOrderVuvq();
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
	public PizzaOrderVuvq() {
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 582);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panelCrust = new JPanel();
		panelCrust.setBackground(new Color(128, 255, 128));
		panelCrust.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Crust", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelSize = new JPanel();
		panelSize.setBackground(new Color(128, 255, 128));
		panelSize.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelToppings = new JPanel();
		panelToppings.setBackground(new Color(128, 255, 128));
		panelToppings.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Toppings", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelOrderReceipt = new JPanel();
		panelOrderReceipt.setBackground(new Color(255, 255, 255));
		panelOrderReceipt.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ORDER", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelOrderButtons = new JPanel();
		panelOrderButtons.setOpaque(false);
		
		JTextArea txtrChrisWitcheria = new JTextArea();
		txtrChrisWitcheria.setBackground(UIManager.getColor("Button.background"));
		txtrChrisWitcheria.setFont(new Font("Papyrus", Font.PLAIN, 36));
		txtrChrisWitcheria.setText("Chris' Witcheria");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(30, Short.MAX_VALUE)
							.addComponent(panelCrust, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panelSize, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelToppings, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(36))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(74)
							.addComponent(txtrChrisWitcheria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(panelOrderButtons, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(panelOrderReceipt, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panelOrderReceipt, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(panelToppings, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(panelSize, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
											.addComponent(panelCrust, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)))
									.addGap(26)
									.addComponent(txtrChrisWitcheria, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(235)
							.addComponent(panelOrderButtons, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(304, Short.MAX_VALUE))
		);
		
		JButton btnClear = new JButton("Clear");
		panelOrderButtons.add(btnClear);
		
		JButton btnOrder = new JButton("Order");
		panelOrderButtons.add(btnOrder);
		
		
		JButton btnQuit = new JButton("Quit");
		panelOrderButtons.add(btnQuit);
		
		JScrollPane scrollOrderPane = new JScrollPane();
		scrollOrderPane.setBackground(new Color(255, 255, 255));
		scrollOrderPane.setMinimumSize(new Dimension(50, 50));
		GroupLayout gl_panelOrderReceipt = new GroupLayout(panelOrderReceipt);
		gl_panelOrderReceipt.setHorizontalGroup(
			gl_panelOrderReceipt.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollOrderPane, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
		);
		gl_panelOrderReceipt.setVerticalGroup(
			gl_panelOrderReceipt.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollOrderPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
		);
		
		JTextArea textOrderArea = new JTextArea();
		scrollOrderPane.setViewportView(textOrderArea);
		panelOrderReceipt.setLayout(gl_panelOrderReceipt);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Snake - $1.00+");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Newt's Eye - $1.00+");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Frog Toe - $1.00+");
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Bat Wool - $1.00+");
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("Dog Tongue - $1.00+");
		
		JCheckBox chckbxNewCheckBox_2_3 = new JCheckBox("Spider Legs - $1.00+");
		GroupLayout gl_panelToppings = new GroupLayout(panelToppings);
		gl_panelToppings.setHorizontalGroup(
			gl_panelToppings.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelToppings.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panelToppings.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox_2_3)
						.addComponent(chckbxNewCheckBox_2_2)
						.addComponent(chckbxNewCheckBox_2_1)
						.addComponent(chckbxNewCheckBox_2)
						.addComponent(chckbxNewCheckBox_1)
						.addComponent(chckbxNewCheckBox))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panelToppings.setVerticalGroup(
			gl_panelToppings.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelToppings.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_2_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_2_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_2_3)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		panelToppings.setLayout(gl_panelToppings);
		
		JComboBox comboBoxPizzaSize = new JComboBox();
		comboBoxPizzaSize.setModel(new DefaultComboBoxModel(new String[] {"Small - $8.00", "Medium - $12.00", "Large - $16.00", "Super - $20.00"}));
		GroupLayout gl_panelSize = new GroupLayout(panelSize);
		gl_panelSize.setHorizontalGroup(
			gl_panelSize.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelSize.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBoxPizzaSize, 0, 109, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelSize.setVerticalGroup(
			gl_panelSize.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSize.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBoxPizzaSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(155, Short.MAX_VALUE))
		);
		panelSize.setLayout(gl_panelSize);
		
		// Create the radio buttons
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Thin");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Regular");
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Deep");

		// Create a ButtonGroup to group the radio buttons
		ButtonGroup crustGroup = new ButtonGroup();
		crustGroup.add(rdbtnNewRadioButton);
		crustGroup.add(rdbtnNewRadioButton_1);
		crustGroup.add(rdbtnNewRadioButton_2);

		// Layout the radio buttons in the panel
		GroupLayout gl_panelCrust = new GroupLayout(panelCrust);
		gl_panelCrust.setHorizontalGroup(
		    gl_panelCrust.createParallelGroup(Alignment.LEADING)
		        .addGroup(gl_panelCrust.createSequentialGroup()
		            .addContainerGap()
		            .addGroup(gl_panelCrust.createParallelGroup(Alignment.LEADING)
		                .addComponent(rdbtnNewRadioButton_2)
		                .addComponent(rdbtnNewRadioButton_1)
		                .addComponent(rdbtnNewRadioButton))
		            .addContainerGap(44, Short.MAX_VALUE))
		);
		gl_panelCrust.setVerticalGroup(
		    gl_panelCrust.createParallelGroup(Alignment.LEADING)
		        .addGroup(gl_panelCrust.createSequentialGroup()
		            .addGap(15)
		            .addComponent(rdbtnNewRadioButton)
		            .addGap(18)
		            .addComponent(rdbtnNewRadioButton_1)
		            .addGap(18)
		            .addComponent(rdbtnNewRadioButton_2)
		            .addContainerGap(66, Short.MAX_VALUE))
		);
		panelCrust.setLayout(gl_panelCrust);
		contentPane.setLayout(gl_contentPane);

		
		btnClear.addActionListener(e -> {
		    comboBoxPizzaSize.setSelectedIndex(0); // Reset size
		    rdbtnNewRadioButton.setSelected(true); // Set default crust
		    
		    // Uncheck all toppings
		    chckbxNewCheckBox.setSelected(false);
		    chckbxNewCheckBox_1.setSelected(false);
		    chckbxNewCheckBox_2.setSelected(false);
		    chckbxNewCheckBox_2_1.setSelected(false);
		    chckbxNewCheckBox_2_2.setSelected(false);
		    chckbxNewCheckBox_2_3.setSelected(false);

		    // Clear order receipt area
		    textOrderArea.setText("");
		});

		// Quit button functionality
		btnQuit.addActionListener(e -> {
		    System.exit(0);
		});
		
		btnOrder.addActionListener(e -> {
		    String size = (String) comboBoxPizzaSize.getSelectedItem();
		    String crust = "";
		    if (rdbtnNewRadioButton.isSelected()) crust = "Thin";
		    else if (rdbtnNewRadioButton_1.isSelected()) crust = "Regular";
		    else if (rdbtnNewRadioButton_2.isSelected()) crust = "Deep-dish";

		    Pizza pizzaOrder = new Pizza(size, crust);

		    // Add selected toppings
		    if (chckbxNewCheckBox.isSelected()) pizzaOrder.addTopping("Snake");
		    if (chckbxNewCheckBox_1.isSelected()) pizzaOrder.addTopping("Newt's Eye");
		    if (chckbxNewCheckBox_2.isSelected()) pizzaOrder.addTopping("Frog Toe");
		    if (chckbxNewCheckBox_2_1.isSelected()) pizzaOrder.addTopping("Bat Wool");
		    if (chckbxNewCheckBox_2_2.isSelected()) pizzaOrder.addTopping("Dog Tongue");
		    if (chckbxNewCheckBox_2_3.isSelected()) pizzaOrder.addTopping("Spider Legs");

		    // Display order details
		    textOrderArea.setText(pizzaOrder.getOrderDetails());
		});
	}
}
