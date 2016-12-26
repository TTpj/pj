import javax.swing.JPanel;
import java.awt.Frame;
import javax.swing.JDialog;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.sql.*;


public class dialog extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanel = null;

	private JLabel jLabel = null;

	private JLabel jLabel1 = null;

	private JLabel jLabel2 = null;

	private JTextField juserName = null;

	private JPasswordField jPassword = null;

	private JButton jOK = null;

	private JButton jUndo = null;

	private JButton jExit = null;
	
	private static String userName = "";  
	
	private String userPassword = ""; 

	/**
	 * @param owner
	 */
	public dialog(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(441, 316);
		this.setModal(true);
		this.setTitle("员工登录");
		this.setResizable(false);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
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
			jLabel2.setBounds(new Rectangle(61, 151, 43, 24));
			jLabel2.setText("密码：");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(52, 110, 53, 24));
			jLabel1.setText("用户名：");
			jLabel = new JLabel();
			jLabel.setText("欢迎员工登录     祝您工作愉快");
			jLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 26));
			jLabel.setForeground(new Color(252, 5, 5));
			jLabel.setBounds(new Rectangle(33, 22, 372, 38));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(getJuserName(), null);
			jPanel.add(getJPassword(), null);
			jPanel.add(getJOK(), null);
			jPanel.add(getJUndo(), null);
			jPanel.add(getJExit(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes juserName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJuserName() {
		if (juserName == null) {
			juserName = new JTextField();
			juserName.setBounds(new Rectangle(105, 110, 193, 22));
		}
		return juserName;
	}

	/**
	 * This method initializes jPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJPassword() {
		if (jPassword == null) {
			jPassword = new JPasswordField();
			jPassword.setBounds(new Rectangle(104, 152, 195, 22));
		}
		return jPassword;
	}

	/**
	 * This method initializes jOK	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

}  
private JButton getJOK() {
		if (jOK == null) {
			jOK = new JButton();
			jOK.setBounds(new Rectangle(62, 200, 71, 26));
			jOK.setText("登录");
			jOK.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//员工登陆
					int index = 0;			//标记登陆数据位置，获取相应用户名和密码
					if(main_Frame.getUserType().equals("挂号处")){
						index = 0;
					}
					else if(main_Frame.getUserType().equals("科")){
						index = 1;
					}
					else if(main_Frame.getUserType().equals("收费处")){
						index = 2;
					}
					else if(main_Frame.getUserType().equals("取药处")){
						index = 3;
					}
					System.out.println(main_Frame.getdataName(index));
					//获取登陆数据库的用户名和密码
					String DBuser = main_Frame.getdataName(index);
					String DBpassword = main_Frame.getdataPassword(index);
					
					//获取登陆用户的用户名和密码
					userName = juserName.getText();
					userPassword = jPassword.getText();
					System.out.println("cai dao zhe");
					String sql = "select * from 医务人员表 where 工作号 = '"+userName+"' and 密码 ='"+userPassword
								+"' and 科室 like '%"+main_Frame.getUserType()+"'";
					linkDataBase link = new linkDataBase(DBuser,DBpassword);	//,userName,userPassword);
			try{	
					ResultSet rs = link.getResultSet(sql);
					if(!rs.next()){
					JOptionPane.showMessageDialog(null,"你输入用户名和密码不正确，请重新输入用户名和密码!","提示",JOptionPane.WARNING_MESSAGE);
					jPassword.setText("");
					System.out.println("你的用户名和密码不正确，请重新输入用户名和密码");
				}else if(main_Frame.getUserType().equals("科")){			//医生登陆
					System.out.println("医生登陆成功！");
					dispose();
					jiuzhen_Window J_Window = new jiuzhen_Window();
					J_Window.setLocationRelativeTo(null);
					J_Window.setVisible(true);
				}else if(main_Frame.getUserType().equals("挂号处")){		//挂号员登陆
					if(main_Frame.getg_Statue()){
					main_Frame.setg_Statue(false);
					dispose();
					System.out.println("登陆成功！");
					guahao g_Window = new guahao();
					g_Window.setLocationRelativeTo(null);
					g_Window.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null,"已经有挂号员登陆!","警告!",JOptionPane.WARNING_MESSAGE);
					dispose();
					}	
				}else if(main_Frame.getUserType().equals("收费处")){		//收费员登陆
					if(main_Frame.gets_Statue()){
						System.out.println("收费员登陆");
						main_Frame.sets_Statue(false);
						dispose();
						shoufei_Window S_Window = new shoufei_Window();
						S_Window.setLocationRelativeTo(null);
						S_Window.setVisible(true);
					}else{
						JOptionPane.showMessageDialog(null, "已经有收费员登陆！", "警告！", JOptionPane.WARNING_MESSAGE);
						dispose();
					}
					
				}else if(main_Frame.getUserType().equals("取药处")){
					System.out.println("取药员登陆");
					quyao_window Q_Window = new quyao_window(null);
					Q_Window.setLocationRelativeTo(null);
					Q_Window.setVisible(true);
					dispose();
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

	/**
	 * This method initializes jUndo	
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
	
	public static String getuserName(){
		return userName;
	}

}  
