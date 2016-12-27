import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	private String a_3;
	private String a_4;
	private String a_5;
	private String a_6;
	private String a_7;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private  JComboBox comboBox;
	private  JComboBox comboBox_1;
	private  JComboBox comboBox_2;
	private  JComboBox comboBox_3;
	private  JComboBox comboBox_4 =new JComboBox();
	private  JComboBox comboBox_5 =new JComboBox();
	private  JComboBox comboBox_6 =new JComboBox();
	private  JComboBox comboBox_7 =new JComboBox();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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
		setBounds(100, 100, 644, 587);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 628, 24);
		contentPanel.add(panel);
		
		JButton button = new JButton("\u6DFB\u52A0\u5458\u5DE5\u4FE1\u606F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_3.setVisible(false);
			}
		});
		button.setBounds(0, 0, 130, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u5220\u9664\u5458\u5DE5\u4FE1\u606F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel_2.setVisible(true);
				panel_1.setVisible(false);
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(false);
			}
		});
		button_1.setBounds(242, 0, 121, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539\u5458\u5DE5\u4FE1\u606F");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(true);
				btnNewButton.setVisible(false);
				btnNewButton_1.setVisible(true);
			}
		});
		button_2.setBounds(487, 0, 141, 23);
		panel.add(button_2);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 25, 628, 156);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
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
				String sql_0 = "select 工作号  from 医务人员表 ";
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
		             JOptionPane.showMessageDialog(null,"员工编号不能为空","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if(textField_1.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"员工姓名不能为空","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if(textField_4.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"员工密码不能为空","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if((Integer.parseInt(textField_2.getText()))>60||(Integer.parseInt(textField_2.getText()))<18){
		             JOptionPane.showMessageDialog(null,"员工年龄必须在18到60之间","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if(flag==1){
		             JOptionPane.showMessageDialog(null,"员工已经存在","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else{
					int age=Integer.parseInt(textField_2.getText());
String sql = "insert into 医务人员表(工作号,姓名,性别,年龄,科室,职称,密码,联系方式,家庭地址) values('"+textField.getText()+"','"
			 +textField_1.getText()+"','"+a_2+"',"+age+",'"+a+"','"+a_1+"','"+textField_4.getText()+"','"+textField_7.getText()+"','"+textField_8.getText()+"')";
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
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(0, 25, 628, 176);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setVisible(false);
		
		JLabel label_3 = new JLabel("\u8BF7\u9009\u62E9\u5458\u5DE5\u6240\u5728\u79D1\u5BA4");
		label_3.setBounds(10, 10, 128, 34);
		panel_2.add(label_3);
		
		comboBox_3 = new JComboBox();
		SetComboBox_3();
		if(comboBox_3.getSelectedItem()!=null){
			a_3=comboBox_3.getSelectedItem().toString();
			}
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_3.getSelectedItem()!=null){
					a_3=comboBox_3.getSelectedItem().toString();
					comboBox_4.removeAllItems();
					SetComboBox_4();		
					}
			}
		});
		comboBox_3.setBounds(229, 17, 158, 21);
		panel_2.add(comboBox_3);
		
		SetComboBox_4();
		if(comboBox_4.getSelectedItem()!=null){
			a_4=comboBox_4.getSelectedItem().toString();
			}
		comboBox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_4.getSelectedItem()!=null){
					a_4=comboBox_4.getSelectedItem().toString();
					}
			}
		});
		comboBox_4.setBounds(229, 61, 158, 21);
		panel_2.add(comboBox_4);
		
		JLabel label_10 = new JLabel("\u8BF7\u9009\u62E9\u5458\u5DE5");
		label_10.setBounds(10, 54, 148, 34);
		panel_2.add(label_10);
		
		btnNewButton = new JButton("\u5220\u9664");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "delete from 医务人员表  where 工作号='"+a_4+"'";
				linkDataBase link = new linkDataBase("sa","sa");
	            link.ExecuteQuery(sql);
	            JOptionPane.showMessageDialog(null,"删除成功！","提示",JOptionPane.WARNING_MESSAGE);
	            SetComboBox_3();
	            SetComboBox_4();
			}
		});
		btnNewButton.setBounds(23, 115, 93, 23);
		panel_2.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\u9009\u62E9\u8BE5\u5458\u5DE5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "select * from 医务人员表  where 工作号='"+a_4+"'";
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
					  textField_3.setText(rs.getString(1));			
					  textField_5.setText(rs.getString(2));  
					  textField_6.setText(rs.getString(7));					
					  textField_9.setText(rs.getString(8));					 
					  textField_10.setText(rs.getString(9));					  
					  textField_11.setText(rs.getObject(4).toString());
					}
					rs.close();
					link.getconnection().close();
				}catch(Exception e4){
					System.out.println(e4.toString());
				}	
			}
		});
		btnNewButton_1.setBounds(23, 115, 135, 23);
		panel_2.add(btnNewButton_1);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(0, 191, 628, 348);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setVisible(false);
		
		JLabel label_11 = new JLabel("\u8BF7\u8F93\u5165\u5DE5\u4F5C\u53F7");
		label_11.setBounds(10, 10, 80, 24);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("\u8BF7\u8F93\u5165\u59D3\u540D");
		label_12.setBounds(10, 44, 80, 24);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("\u8BF7\u9009\u62E9\u6027\u522B");
		label_13.setBounds(10, 78, 80, 24);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("\u8BF7\u8F93\u5165\u767B\u5F55\u5BC6\u7801");
		label_14.setBounds(212, 15, 101, 24);
		panel_3.add(label_14);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(114, 12, 85, 23);
		panel_3.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(113, 46, 86, 23);
		panel_3.add(textField_5);
		
		if(comboBox_5.getSelectedItem()!=null){
			a_5=comboBox_5.getSelectedItem().toString();
			}
		comboBox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_5.getSelectedItem()!=null){
					a_4=comboBox_5.getSelectedItem().toString();
				}
			}
		});
		comboBox_5.setBounds(114, 80, 86, 21);
		panel_3.add(comboBox_5);
		
		JLabel label_15 = new JLabel("\u8BF7\u9009\u62E9\u79D1\u5BA4");
		label_15.setBounds(222, 49, 80, 24);
		panel_3.add(label_15);
		
		if(comboBox_6.getSelectedItem()!=null){
			a_6=comboBox_6.getSelectedItem().toString();
			}
		comboBox_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_6.getSelectedItem()!=null){
					a_6=comboBox_6.getSelectedItem().toString();
					}
			}
		});
		
		
		comboBox_6.setBounds(312, 86, 91, 21);
		panel_3.add(comboBox_6);
		
		if(comboBox_7.getSelectedItem()!=null){
			a_7=comboBox_7.getSelectedItem().toString();
			}
		comboBox_7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_7.getSelectedItem()!=null){
					a_7=comboBox_7.getSelectedItem().toString();
					}
			}
		});
		

		comboBox_7.setBounds(312, 51, 91, 21);
		panel_3.add(comboBox_7);
		
		JLabel label_16 = new JLabel("\u8BF7\u9009\u62E9\u804C\u79F0");
		label_16.setBounds(222, 83, 80, 24);
		panel_3.add(label_16);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(318, 12, 85, 23);
		panel_3.add(textField_6);
		
		JLabel label_17 = new JLabel("\u8BF7\u8F93\u5165\u8054\u7CFB\u65B9\u5F0F");
		label_17.setBounds(426, 15, 94, 24);
		panel_3.add(label_17);
		
		JLabel label_18 = new JLabel("\u8BF7\u8F93\u5165\u5730\u5740");
		label_18.setBounds(426, 49, 94, 24);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("\u8BF7\u8F93\u5165\u5E74\u9F84");
		label_19.setBounds(426, 83, 94, 24);
		panel_3.add(label_19);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(530, 12, 85, 23);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(530, 46, 85, 23);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(530, 80, 85, 23);
		panel_3.add(textField_11);
		
		JButton btnNewButton_2 = new JButton("\u4FEE\u6539");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_3.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"请输入正确的员工编号","提示",JOptionPane.WARNING_MESSAGE);
		             }
				else if(textField_5.getText().equals("")){
		             JOptionPane.showMessageDialog(null,"请输入正确的员工姓名","提示",JOptionPane.WARNING_MESSAGE);
		             }
		         else{
		        	 int age=Integer.parseInt(textField_11.getText());
 String sql_3 = "update 医务人员表  set 工作号='"+textField_3.getText()+"',姓名='"+textField_5.getText()+"',性别='"+a_5+"',年龄="+age+",科室='"+a_7
			  +"',职称='"+a_6+"',密码='"+textField_6.getText()+"',联系方式='"+textField_9.getText()
			   +"',家庭地址='"+textField_10.getText()+"' where 工作号='"+a_4+"'";
		            	linkDataBase link = new linkDataBase("sa","sa");
		                link.ExecuteQuery(sql_3);
		                JOptionPane.showMessageDialog(null,"修改成功！","提示",JOptionPane.WARNING_MESSAGE);
		                
		          }
			}
		});
		btnNewButton_2.setBounds(106, 139, 93, 23);
		panel_3.add(btnNewButton_2);
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
				comboBox_6.addItem(rs_1.getString(1));
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
		comboBox_5.addItem("男");
		comboBox_5.addItem("女");
	}
	
	private void SetComboBox_3(){
		String sql = "select 科室名 from 科室信息表 ";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
		try{
			ResultSet rs = link.getResultSet(sql);
			while(rs.next()){
				comboBox_3.addItem(rs.getString(1));
				comboBox_7.addItem(rs.getString(1));
			}
			rs.close();
			link.getconnection().close();
		    }catch(Exception e4){
				System.out.println(e4.toString());
			}
	}
	
	private void SetComboBox_4(){
		String sql = "select 工作号  from 医务人员表   where 科室='"+a_3+"'";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
		try{
			ResultSet rs = link.getResultSet(sql);
			while(rs.next()){
				comboBox_4.addItem(rs.getString(1));
			}
			rs.close();
			link.getconnection().close();
		    }catch(Exception e4){
				System.out.println(e4.toString());
			}
	}
}
