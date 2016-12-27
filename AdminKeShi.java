import java.awt.Color;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


@SuppressWarnings("serial")
public class AdminKeShi extends JDialog{

	private JFrame frame;
	private JPanel jContentPane = null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private String a=new String();
	private String a_1=new String();
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminKeShi window = new AdminKeShi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public AdminKeShi() {
		super();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    this.setSize(526, 500);	
	    jContentPane=new JPanel();
        this.setContentPane(jContentPane);
        jContentPane.setBackground(Color.CYAN);
        jContentPane.setLayout(null);
        jContentPane.setBounds(500, 400, 511, 494);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 32);
		jContentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\u6DFB\u52A0\u79D1\u5BA4\u4FE1\u606F");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(0, 5, 117, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\u5220\u9664\u79D1\u5BA4\u4FE1\u606F");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(165, 5, 117, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539\u79D1\u5BA4\u4FE1\u606F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_4.setVisible(true);
			}
		});
		btnNewButton.setBounds(352, 5, 112, 23);
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 35, 510, 132);
		jContentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u79D1\u5BA4\u540D\u79F0");
		lblNewLabel.setBounds(10, 10, 102, 24);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(170, 11, 110, 23);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u79D1\u5BA4\u5730\u5740");
		lblNewLabel_1.setBounds(10, 44, 102, 24);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 45, 110, 23);
		panel_1.add(textField_1);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u79D1\u5BA4\u7535\u8BDD");
		label.setBounds(10, 86, 102, 24);
		panel_1.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 87, 110, 23);
		panel_1.add(textField_2);
		
		JButton btnNewButton_3 = new JButton("\u63D0\u4EA4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String sql_0 = "select 科室名 from 科室信息表 ";
			 int flag=0;
			 linkDataBase link_0 = new linkDataBase("sa","sa");
			 ResultSet rs_0 = link_0.getResultSet(sql_0);
			 try {
				while(rs_0.next()){
					if(rs_0.getString(1).indexOf(textField.getText().toString())>=0){
						flag=1;
					}
				 }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
             if(textField.getText().equals("")){
             JOptionPane.showMessageDialog(null,"请输入正确的科室名称","提示",JOptionPane.WARNING_MESSAGE);
             }
            else if(flag==1){
                 JOptionPane.showMessageDialog(null,"科室已经存在","提示",JOptionPane.WARNING_MESSAGE);
                 }
             else{
            	 String sql = "insert into 科室信息表(科室名,地址,电话) values('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"')";
            	 linkDataBase link = new linkDataBase("sa","sa");
                 link.ExecuteQuery(sql);
                 JOptionPane.showMessageDialog(null,"添加成功！","提示",JOptionPane.WARNING_MESSAGE);
                 comboBox.removeAllItems();
                 SetComboBox();
                 comboBox_1.removeAllItems();
                 SetComboBox_1();
             }
			}
		});
		
		btnNewButton_3.setBounds(351, 11, 93, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("\u53D6\u6D88");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_5.setBounds(351, 87, 93, 23);
		panel_1.add(btnNewButton_5);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 173, 510, 53);
		jContentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("\u8BF7\u9009\u62E9\u4F60\u8981\u5220\u9664\u7684\u79D1\u5BA4");
		lblNewLabel_2.setBounds(10, 10, 164, 32);
		panel_2.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		SetComboBox();
		if(comboBox.getSelectedItem()!=null){
			a=comboBox.getSelectedItem().toString();
			}
		comboBox.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent e) {
				if(comboBox.getSelectedItem()!=null){
				a=comboBox.getSelectedItem().toString();
				}
			}
		});
		comboBox.setBounds(159, 16, 130, 26);
		panel_2.add(comboBox);
		
		JButton btnNewButton_4 = new JButton("\u5220\u9664");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(a);
				String sql="delete from 科室信息表 where 科室名='"+a+"'";
				linkDataBase link = new linkDataBase("sa","sa");
                link.ExecuteQuery(sql);
                JOptionPane.showMessageDialog(null,"删除成功！","提示",JOptionPane.WARNING_MESSAGE);
                comboBox.removeAllItems();
                SetComboBox();
                comboBox_1.removeAllItems();
                SetComboBox_1();
			}
		});
		btnNewButton_4.setBounds(316, 19, 93, 23);
		panel_2.add(btnNewButton_4);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 236, 510, 210);
		jContentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setVisible(false);
		
		JLabel label_1 = new JLabel("\u8BF7\u9009\u62E9\u4F60\u8981\u4FEE\u6539\u7684\u79D1\u5BA4");
		label_1.setBounds(10, 10, 164, 32);
		panel_3.add(label_1);
		
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
				SetTextField();
			}
		});
		comboBox_1.setBounds(160, 10, 123, 29);
		panel_3.add(comboBox_1);
		
		panel_4 = new JPanel();
		panel_4.setBounds(0, 40, 511, 135);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setVisible(false);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u79D1\u5BA4\u540D\u79F0");
		label_2.setBounds(10, 10, 102, 32);
		panel_4.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 16, 110, 23);
		panel_4.add(textField_3);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_3.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"请输入正确的科室名称","提示",JOptionPane.WARNING_MESSAGE);
		             }
		         else{
		            	String sql_3 = "update 科室信息表  set 科室名='"+textField_3.getText()+"',地址='"+textField_4.getText()+"',电话='"+textField_5.getText()+"' where 科室名='"+a_1+"'";
		            	linkDataBase link = new linkDataBase("sa","sa");
		                link.ExecuteQuery(sql_3);
		                JOptionPane.showMessageDialog(null,"修改成功！","提示",JOptionPane.WARNING_MESSAGE);
		                comboBox.removeAllItems();
		                SetComboBox();
		                comboBox_1.removeAllItems();
		                SetComboBox_1();
		          }
			}
		});
		button.setBounds(279, 15, 93, 23);
		panel_4.add(button);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u79D1\u5BA4\u5730\u5740");
		label_3.setBounds(10, 52, 102, 24);
		panel_4.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 49, 110, 23);
		panel_4.add(textField_4);
		
		JLabel label_4 = new JLabel("\u8BF7\u8F93\u5165\u79D1\u5BA4\u7535\u8BDD");
		label_4.setBounds(10, 86, 102, 24);
		panel_4.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 88, 110, 23);
		panel_4.add(textField_5);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.setBounds(279, 87, 93, 23);
		panel_4.add(button_1);
		SetTextField();
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
		String sql = "select 科室名 from 科室信息表 ";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
		try{
			ResultSet rs = link.getResultSet(sql);
			while(rs.next()){
				comboBox_1.addItem(rs.getString(1));
			}
			rs.close();
			link.getconnection().close();
		}catch(Exception e4){
			System.out.println(e4.toString());
		}	
	}
	
	private void SetTextField(){
		textField_3.setText(a_1);
		String sql_1="select 地址  from 科室信息表 where 科室名='"+a_1+"'";
		String sql_2="select 电话  from 科室信息表  where 科室名='"+a_1+"'";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
		try{
			ResultSet rs_1 = link.getResultSet(sql_1);
			ResultSet rs_2 = link.getResultSet(sql_2);
			while(rs_1.next()){
				textField_4.setText(rs_1.getString(1));
			}
			while(rs_2.next()){
				textField_5.setText(rs_2.getString(1));
			}
			rs_1.close();
			rs_2.close();
			link.getconnection().close();
		}catch(Exception e4){
			System.out.println(e4.toString());
		}	
		
	}
}
