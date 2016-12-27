import java.awt.Color;
import javax.swing.*;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.Event;



public class main_Frame extends JFrame {
	
	//统一设置员工的数据库用户名和密码
	
	private static String [] dataName = {"挂号员","医生","收费员","取药员"};  
	
	private static String [] dataPassword = {"guahao","doctor","shoufei","quyao"};
	
	private JMenuBar menuBar;
	
	private static final long serialVersionUID = 1L;

	private static boolean g_Statue = true;			//标志挂号员登陆状态，实现互锁
	
	private static boolean s_Statue = true;			//标志收费员登陆状态，实现互锁
	
	private static String userType = "";  

	private JPanel jPanel = null;

	/**
	 * This is the default constructor
	 */
	public main_Frame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(568, 310);
		this.setSize(this.getMaximumSize());	//初始化的时候窗口最大
		this.setContentPane(getJPanel());
		this.setTitle("医院管理系统");
		this.setJMenuBar(getJJMenuBar());
		
	}

	//定义菜单栏
	private JMenuBar getJJMenuBar(){
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(217, 213, 213));
		JMenu m_men = new JMenu("门诊部");
		menuBar.add(m_men);
		JMenuItem m_gua = new JMenuItem("挂号处");
		m_gua.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK, false));
		m_gua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//设置用户所属科室
				userType = "挂号处";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_gua);
		JMenuItem m_jiu= new JMenuItem("就诊处");
		m_jiu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.CTRL_MASK, false));
		m_jiu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//设置用户所属科室
				userType = "科";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_jiu);
		JMenuItem m_shou = new JMenuItem("收费处");
		m_shou.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK, false));
		m_shou.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//设置用户所属科室
				userType = "收费处";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_shou);
		JMenuItem m_qu = new JMenuItem("取药处");
		m_qu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK, false));
		m_qu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//设置用户所属科室
				userType = "取药处";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_qu);
		JMenu m_zhu= new JMenu("住院部");
		menuBar.add(m_zhu);
		JMenuItem m_login = new JMenuItem("住院登记");
		m_zhu.add(m_login);
		JMenuItem m_zhuang = new JMenuItem("床位更换");
		m_zhu.add(m_zhuang);
		JMenu m_employee = new JMenu("员工管理");
		menuBar.add(m_employee);
		JMenuItem m_add = new JMenuItem("添加新员工");
		m_employee.add(m_add);
		JMenuItem m_search = new JMenuItem("员工信息修改");
		m_employee.add(m_search);
		return menuBar;
	}

	//用于登陆时传送用户名和密码以达到共用一个登陆对话框
	public static String getdataName(int i){
		return dataName[i];
	}
	
	public static String getdataPassword(int i){
		return dataPassword[i];
	}
	
	public static boolean getg_Statue(){
		return g_Statue;
	}
	
	public static void setg_Statue(boolean statue){
		g_Statue = statue;
	}
	
	public static void sets_Statue(boolean statue){
		s_Statue = statue;
	}
	
	public static boolean gets_Statue(){
		return s_Statue;
	}
	
	public static String getUserType(){
		return userType;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(null);
		}
		return jPanel;
	}
	
	public static void main(String [] args){
		main_Frame thisClass = new main_Frame();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}
}  
	

	
