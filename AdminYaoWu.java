import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.sql.ResultSet;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;


public class AdminYaoWu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel_1;
	private JPanel panel_2;
	private JComboBox comboBox;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private String a;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AdminYaoWu dialog = new AdminYaoWu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AdminYaoWu() {
		setBounds(100, 100, 560, 442);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 544, 24);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JButton btnNewButton = new JButton("\u6DFB\u52A0\u836F\u54C1\u4FE1\u606F");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(true);
				}
			});
			btnNewButton.setBounds(0, 0, 130, 23);
			panel.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("\u5220\u9664\u836F\u54C1\u4FE1\u606F");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_2.setVisible(true);
					btnNewButton_7.setVisible(false);
					btnNewButton_6.setVisible(true);
				}
			});
			btnNewButton_1.setBounds(221, 0, 121, 23);
			panel.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("\u4FEE\u6539\u836F\u54C1\u4FE1\u606F");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_2.setVisible(true);
					btnNewButton_7.setVisible(true);
					btnNewButton_6.setVisible(false);
				}
			});
			btnNewButton_2.setBounds(423, 0, 121, 23);
			panel.add(btnNewButton_2);
		}
		
	    panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setVisible(false);
		panel_1.setBounds(0, 26, 544, 140);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C1\u7F16\u53F7");
		label.setBounds(10, 10, 102, 24);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C1\u540D\u79F0");
		label_1.setBounds(10, 44, 102, 24);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C1\u79CD\u7C7B");
		label_2.setBounds(10, 78, 102, 24);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(122, 12, 110, 23);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 46, 110, 23);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 80, 110, 23);
		panel_1.add(textField_2);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C1\u5355\u4EF7");
		label_3.setBounds(286, 15, 110, 24);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("\u8BF7\u9009\u62E9\u836F\u54C1\u5355\u4F4D");
		label_4.setBounds(286, 49, 117, 24);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C1\u5E93\u5B58\u91CF");
		label_5.setBounds(286, 83, 117, 24);
		panel_1.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(424, 16, 110, 23);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(424, 80, 110, 23);
		panel_1.add(textField_5);
		
		comboBox = new JComboBox();
		SetComboBox();
		if(comboBox.getSelectedItem()!=null){
			a=comboBox.getSelectedItem().toString();
			}
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem()!=null){
				a=comboBox.getSelectedItem().toString();
			     }
			}
		});
		comboBox.setBounds(424, 46, 110, 22);
		panel_1.add(comboBox);
		
		JButton btnNewButton_3 = new JButton("\u63D0\u4EA4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"请输入正确的药品编号","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if(textField_1.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"请输入正确的药品名称","提示",JOptionPane.WARNING_MESSAGE);
		             }
				  else{
		String sql = "insert into 药品信息表(编号,名称,种类,单价,单位,库存量) values('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"
		  +textField_4.getText()+"','"+a+"','"+textField_5.getText()+"')";
		            	linkDataBase link = new linkDataBase("sa","sa");
		                link.ExecuteQuery(sql);
		                JOptionPane.showMessageDialog(null,"添加成功！","提示",JOptionPane.WARNING_MESSAGE);
		          }
			}
		});
		btnNewButton_3.setBounds(132, 117, 93, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u53D6\u6D88");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		btnNewButton_4.setBounds(377, 117, 93, 23);
		panel_1.add(btnNewButton_4);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(0, 171, 544, 213);
		contentPanel.add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		JLabel label_6 = new JLabel("\u8BF7\u8F93\u5165\u836F\u7269\u7F16\u53F7");
		label_6.setBounds(10, 10, 128, 34);
		panel_2.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 17, 143, 23);
		panel_2.add(textField_3);
		
		JButton btnNewButton_5 = new JButton("\u67E5\u627E");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "select * from 药品信息表  where 名称='"+textField_3.getText()+"'";
				linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
				try{
					ResultSet rs = link.getResultSet(sql);
					/*if(rs.getFetchSize()){
						lblNewLabel.setText("找到该药物！");
					}
					else{
						lblNewLabel.setText("未找到该药物！");
						}*/	
					while(rs.next()){
					  textField_6.setText(rs.getString(1));
					  textField_6.setEditable(false);
					  textField_7.setText(rs.getString(2));
					  textField_7.setEditable(false);
					  textField_8.setText(rs.getString(3));
					  textField_8.setEditable(false);
					  textField_9.setText(rs.getString(4));
					  textField_9.setEditable(false);
					  textField_10.setText(rs.getString(5));
					  textField_10.setEditable(false);
					  textField_11.setText(rs.getString(6));
					  textField_11.setEditable(false);
					}
					if(textField_6.getText().equals("")){
					lblNewLabel.setText("未找到该药物！");
				}
				else{
					lblNewLabel.setText("找到该药物！");
					}
					rs.close();
					link.getconnection().close();
				}catch(Exception e4){
					System.out.println(e4.toString());
				}	
			}
		});
		btnNewButton_5.setBounds(316, 16, 93, 23);
		panel_2.add(btnNewButton_5);
		
	    lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 47, 93, 23);
		panel_2.add(lblNewLabel);
		
		JLabel label_7 = new JLabel(" \u836F\u54C1\u7F16\u53F7");
		label_7.setBounds(10, 70, 69, 23);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel(" \u836F\u54C1\u540D\u79F0");
		label_8.setBounds(101, 70, 69, 23);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel(" \u836F\u54C1\u79CD\u7C7B");
		label_9.setBounds(194, 70, 69, 23);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel(" \u836F\u54C1\u5355\u4EF7");
		label_10.setBounds(292, 70, 69, 23);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel(" \u836F\u54C1\u5355\u4F4D");
		label_11.setBounds(371, 70, 69, 23);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel(" \u836F\u54C1\u5E93\u5B58\u91CF");
		label_12.setBounds(450, 70, 84, 23);
		panel_2.add(label_12);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(0, 91, 79, 23);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(89, 92, 82, 23);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(188, 92, 75, 23);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(287, 92, 69, 23);
		panel_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(371, 92, 69, 23);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(450, 92, 69, 23);
		panel_2.add(textField_11);
		
		btnNewButton_6 = new JButton("\u5220\u9664");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String sql = "delete from 药品信息表  where 名称='"+textField_3.getText()+"'";
			linkDataBase link = new linkDataBase("sa","sa");
            link.ExecuteQuery(sql);
            JOptionPane.showMessageDialog(null,"删除成功！","提示",JOptionPane.WARNING_MESSAGE);
            textField_3.setText("");   
            textField_6.setText("");
			textField_7.setText("");
			textField_8.setText("");
			textField_9.setText("");
			textField_10.setText("");
			textField_11.setText("");
			lblNewLabel.setText("");			
	
			}
		});
		btnNewButton_6.setBounds(213, 134, 93, 23);
		panel_2.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("\u4FEE\u6539");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(213, 134, 93, 23);
		panel_2.add(btnNewButton_7);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	private void SetComboBox(){
		String sql = "select 单位 from 药品单位表 ";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
		try{
			ResultSet rs = link.getResultSet(sql);
			while(rs.next()){
				comboBox.addItem(rs.getString(1));
			}
			rs.close();
			link.getconnection().close();
		}catch(Exception e4){
			System.out.println(e4.toString());
		}	
	}
}
