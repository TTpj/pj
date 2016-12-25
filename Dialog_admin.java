import javax.swing.JPanel;
import java.awt.Frame;
import javax.swing.JDialog;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.sql.*;


public class Dialog_admin extends JDialog {
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanel = null;

	private JLabel jLabel = null;

	private JLabel jLabel1 = null;

	private JLabel jLabel2 = null;

	private JTextField jadminName = null;

	private JPasswordField jadminPsw = null;

	private JButton jOK = null;

	private JButton jUndo = null;

	private JButton jExit = null;
	
	private static String adminName = "";  
	
	private String adminPsw = ""; 
	
	public Dialog_admin(Frame owner) {
		super(owner);
		initialize();
	}
	
	private void initialize() {
		this.setSize(441, 316);
		this.setModal(true);
		this.setTitle("管理员登录");
		this.setResizable(false);
		this.setContentPane(getJContentPane());
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(1);
			jContentPane = new JPanel();
			jContentPane.setLayout(gridLayout);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(43, 150, 43, 24));
			jLabel2.setText("密码：");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(10, 108, 85, 24));
			jLabel1.setText("管理员名称：");
			jLabel = new JLabel();
			jLabel.setText("\u6B22\u8FCE\u7BA1\u7406\u5458\u767B\u5F55\uFF0C \u795D\u4F60\u5DE5\u4F5C\u987A\u5229");
			jLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 26));
			jLabel.setForeground(new Color(252, 5, 5));
			jLabel.setBounds(new Rectangle(10, 22, 415, 38));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(getJadminName(), null);
			jPanel.add(getJAdminpsw(), null);
			jPanel.add(getJOK(), null);
			jPanel.add(getJUndo(), null);
			jPanel.add(getJExit(), null);
		}
		return jPanel;
	}
	
	private JButton getJOK() {
		if (jOK == null) {
			jOK = new JButton();
			jOK.setBounds(new Rectangle(62, 200, 71, 26));
			jOK.setText("登录");
			jOK.addActionListener(new java.awt.event.ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(java.awt.event.ActionEvent e) {		
					adminName = jadminName.getText();
					adminPsw = jadminPsw.getText();
					System.out.println("cai dao zhe");
					String sql = "select * from 管理员信息表  where admin_name = '"+adminName+"' and admin_psw='"+adminPsw+"'";
					linkDataBase link = new linkDataBase("sa","sa");	//,userName,userPassword);
			try{   
					ResultSet rs = link.getResultSet(sql);
					if(!rs.next()){
					JOptionPane.showMessageDialog(null,"你输入用户名和密码不正确，请重新输入用户名和密码!","提示",JOptionPane.WARNING_MESSAGE);
					jadminPsw.setText("");
					System.out.println("你的用户名和密码不正确，请重新输入用户名和密码");
				}
				 else if(main_Frame.getAdminType().equals("员工信息管理")){
					System.out.println("管理员登陆成功！");
				    dispose();
					AdminYG adminyg=new  AdminYG();
					adminyg.setLocationRelativeTo(null);
					adminyg.setVisible(true);
				 }
				else if(main_Frame.getAdminType().equals("科室信息管理")){
						System.out.println("管理员登陆成功！");
						dispose();
						AdminKeShi adminKeshi=new  AdminKeShi();
						adminKeshi.setLocationRelativeTo(null);
						adminKeshi.setVisible(true);
					}
				else if(main_Frame.getAdminType().equals("药物信息管理")){
					System.out.println("管理员登陆成功！");
					dispose();
					AdminYaoWu adminyaowu=new  AdminYaoWu();
					adminyaowu.setLocationRelativeTo(null);
					adminyaowu.setVisible(true);
				}
				    rs.close();
				    link.getconnection().close();
			}catch(SQLException ee){
				System.out.println("登陆时出错："+ee);
			}
				}
			});
		}
		return jOK;
	}

	private JTextField getJadminName() {
		if (jadminName == null) {
			jadminName = new JTextField();
			jadminName.setBounds(new Rectangle(105, 110, 193, 22));
		}
		return jadminName;
	}
	private JPasswordField getJAdminpsw() {
		if (jadminPsw == null) {
			jadminPsw= new JPasswordField();
			jadminPsw.setBounds(new Rectangle(104, 152, 195, 22));
		}
		return jadminPsw;
	}
	private JButton getJUndo() {
		if (jUndo == null) {
			jUndo = new JButton();
			jUndo.setBounds(new Rectangle(157, 197, 69, 27));
			jUndo.setText("取消");
			jUndo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jadminName.setText("");
					jadminPsw.setText("");
				}
			});
		}
		return jUndo;
	}

	/**
	 * This method initializes jExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJExit() {
		if (jExit == null) {
			jExit = new JButton();
			jExit.setBounds(new Rectangle(249, 200, 74, 24));
			jExit.setText("退出");
			jExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return jExit;
	}
	
}
