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
