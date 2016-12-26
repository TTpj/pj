import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class AdminYG extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private String a;
	private String a_1;
	private String a_2;
	private  JComboBox comboBox;
	private  JComboBox comboBox_1;
	private  JComboBox comboBox_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_4;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AdminYG dialog = new AdminYG();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AdminYG() {
		setBounds(100, 100, 644, 502);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 628, 24);
		contentPanel.add(panel);
		
		JButton button = new JButton("\u6DFB\u52A0\u5458\u5DE5\u4FE1\u606F");
		button.setBounds(0, 0, 130, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u5220\u9664\u5458\u5DE5\u4FE1\u606F");
		button_1.setBounds(242, 0, 121, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539\u5458\u5DE5\u4FE1\u606F");
		button_2.setBounds(487, 0, 141, 23);
		panel.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 25, 628, 165);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u5DE5\u4F5C\u53F7");
		label.setBounds(10, 10, 80, 24);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u59D3\u540D");
		label_1.setBounds(10, 44, 80, 24);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u9009\u62E9\u6027\u522B");
		label_2.setBounds(10, 78, 80, 24);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(101, 12, 85, 23);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 46, 86, 23);
		panel_1.add(textField_1);
		
		JLabel label_4 = new JLabel("\u8BF7\u9009\u62E9\u79D1\u5BA4");
		label_4.setBounds(213, 49, 80, 24);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("\u8BF7\u9009\u62E9\u804C\u79F0");
		label_5.setBounds(213, 83, 80, 24);
		panel_1.add(label_5);
		
		JLabel label_7 = new JLabel("\u8BF7\u8F93\u5165\u8054\u7CFB\u65B9\u5F0F");
		label_7.setBounds(402, 10, 94, 24);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("\u8BF7\u8F93\u5165\u5730\u5740");
		label_8.setBounds(402, 44, 94, 24);
		panel_1.add(label_8);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(522, 11, 85, 23);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(522, 45, 85, 23);
		panel_1.add(textField_8);
		
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
		comboBox.setBounds(288, 46, 85, 21);
		panel_1.add(comboBox);
		
		comboBox_1 = new JComboBox();
		SetComboBox_1();
		if(comboBox_1.getSelectedItem()!=null){
			a_1=comboBox_1.getSelectedItem().toString();
			}
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_1.getSelectedItem()!=null){
					a_1=comboBox_1.getSelectedItem().toString();
				}
			}
		});
		comboBox_1.setBounds(288, 80, 85, 21);
		panel_1.add(comboBox_1);
		
		JButton button_3 = new JButton("\u63D0\u4EA4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"员工编号不能为空","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if(textField_1.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"员工姓名不能为空","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if(textField_4.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"员工密码不能为空","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else{
					String id=textField.getText();
					String name=textField_1.getText();
					//int age=Integer.parseInt(textField_3.getText());
					String psw=textField_4.getText();
					String date="";
					String lianxi="";
					String zhuzhi="";
String sql = "insert into 医务人员表(工作号,姓名,性别,科室,职称,密码) values('"+textField.getText()+"','"
			 +textField_1.getText()+"','"+a_2+"','"+a+"','"+a_1+"','"+textField_4.getText()+"')";
		            	linkDataBase link = new linkDataBase("sa","sa");
		                link.ExecuteQuery(sql);
		                JOptionPane.showMessageDialog(null,"添加成功！","提示",JOptionPane.WARNING_MESSAGE);
		          }
			}
			
		});
		button_3.setBounds(28, 128, 93, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("\u53D6\u6D88");
		button_4.setBounds(183, 128, 93, 23);
		panel_1.add(button_4);
		
		JLabel label_9 = new JLabel("\u8BF7\u8F93\u5165\u767B\u5F55\u5BC6\u7801");
		label_9.setBounds(192, 10, 101, 24);
		panel_1.add(label_9);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(288, 11, 85, 23);
		panel_1.add(textField_4);
		
		comboBox_2 = new JComboBox();
		SetComboBox_2();
		if(comboBox_2.getSelectedItem()!=null){
			a_2=comboBox_2.getSelectedItem().toString();
			}
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_2.getSelectedItem()!=null){
					a_2=comboBox_2.getSelectedItem().toString();
				 }
			}
		});
		comboBox_2.setBounds(100, 80, 86, 21);
		panel_1.add(comboBox_2);
		
		JLabel label_6 = new JLabel("\u8BF7\u8F93\u5165\u5E74\u9F84");
		label_6.setBounds(402, 83, 94, 24);
		panel_1.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(522, 80, 85, 23);
		panel_1.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(0, 189, 628, 175);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_3 = new JLabel("\u8BF7\u9009\u62E9\u5458\u5DE5\u6240\u5728\u79D1\u5BA4");
		label_3.setBounds(10, 10, 128, 34);
		panel_2.add(label_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	private void SetComboBox(){
		String sql = "select 科室名 from 科室信息表 ";
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
	
	private void SetComboBox_1(){
		String sql_1= "select 职称名 from 员工职称表 ";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
		try{
			ResultSet rs_1 = link.getResultSet(sql_1);
			while(rs_1.next()){
				comboBox_1.addItem(rs_1.getString(1));
			}
			rs_1.close();
			link.getconnection().close();
		    }catch(Exception e4){
				System.out.println(e4.toString());
	   }
	}
	private void SetComboBox_2(){
		comboBox_2.addItem("男");
		comboBox_2.addItem("女");
	}
}
