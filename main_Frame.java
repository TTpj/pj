import java.awt.Color;
import javax.swing.*;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.Event;



public class main_Frame extends JFrame {
	
	//ͳһ����Ա�������ݿ��û���������
	
	private static String [] dataName = {"�Һ�Ա","ҽ��","�շ�Ա","ȡҩԱ"};  
	
	private static String [] dataPassword = {"guahao","doctor","shoufei","quyao"};
	
	private JMenuBar menuBar;
	
	private static final long serialVersionUID = 1L;

	private static boolean g_Statue = true;			//��־�Һ�Ա��½״̬��ʵ�ֻ���
	
	private static boolean s_Statue = true;			//��־�շ�Ա��½״̬��ʵ�ֻ���
	
	private static String userType = ""; 
	
	private static String adminType = "";

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
		this.setSize(this.getMaximumSize());	//��ʼ����ʱ�򴰿����
		this.setContentPane(getJPanel());
		this.setTitle("ҽԺ����ϵͳ");
		this.setJMenuBar(getJJMenuBar());
		
	}

	//����˵���
	private JMenuBar getJJMenuBar(){
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(217, 213, 213));
		JMenu m_men = new JMenu("���ﲿ");
		menuBar.add(m_men);
		JMenuItem m_gua = new JMenuItem("�ҺŴ�");
		m_gua.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK, false));
		m_gua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//�����û���������
				userType = "�ҺŴ�";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_gua);
		JMenuItem m_jiu= new JMenuItem("���ﴦ");
		m_jiu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.CTRL_MASK, false));
		m_jiu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//�����û���������
				userType = "��";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_jiu);
		JMenuItem m_shou = new JMenuItem("�շѴ�");
		m_shou.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK, false));
		m_shou.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//�����û���������
				userType = "�շѴ�";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_shou);
		JMenuItem m_qu = new JMenuItem("ȡҩ��");
		m_qu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK, false));
		m_qu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//�����û���������
				userType = "ȡҩ��";
				dialog login_Dialog = new dialog(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_men.add(m_qu);
		JMenu m_zhu= new JMenu("Ժ����");
		menuBar.add(m_zhu);
		JMenuItem m_login = new JMenuItem("�鿴�Һ���Ϣ");
		m_zhu.add(m_login);
		JMenuItem m_zhuang = new JMenuItem("�鿴ҩƷ�����");
		m_zhu.add(m_zhuang);
		JMenu m_employee = new JMenu("����Ա");
		menuBar.add(m_employee);
		JMenuItem m_adminYuangong = new JMenuItem("Ա����Ϣ����");
		m_adminYuangong.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK, false));
		m_adminYuangong.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//�����û���������
				adminType="Ա����Ϣ����";
				Dialog_admin login_Dialog = new Dialog_admin(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_employee.add(m_adminYuangong);
		JMenuItem m_adminkeshi = new JMenuItem("������Ϣ����");
		m_adminkeshi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK, false));
		m_adminkeshi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//�����û���������
				adminType="������Ϣ����";
				Dialog_admin login_Dialog = new Dialog_admin(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_employee.add(m_adminkeshi);
		JMenuItem m_adminyaowu = new JMenuItem("ҩ����Ϣ����");
		m_adminyaowu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK, false));
		m_adminyaowu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				//�����û���������
				adminType="ҩ����Ϣ����";
				Dialog_admin login_Dialog = new Dialog_admin(null);
				login_Dialog.setLocationRelativeTo(null);	
				login_Dialog.setVisible(true);
			}
		});
		m_employee.add(m_adminyaowu);
		return menuBar;
	}

	//���ڵ�½ʱ�����û����������Դﵽ����һ����½�Ի���
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
	public static String getAdminType(){
		return adminType;
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
	

	
