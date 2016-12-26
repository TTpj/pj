
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class guahao extends JDialog{
	
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanel = null;

	private JLabel jLabel = null;

	private JLabel jLabel1 = null;

	private JLabel jLabel2 = null;

	private JTextField jpatientName = null;

	private JLabel jLable4 = null;

	private JLabel jLabel3 = null;

	private JTextField jpatientAge = null;

	private JLabel jLabel4 = null;

	private JTextField jpatientTel = null;

	private JLabel jLabel5 = null;

	private JTextField jpatientAddress = null;

	private JButton jOK = null;

	private JButton jEixt = null;

	private JLabel jLabel6 = null;

	private JLabel jgno = null;
	
	private JTextField jdatetime = null;

	private JTextField jpatientNo = null;

	private JLabel jLabel7 = null;

	private JLabel jLabel8 = null;

	private JComboBox jtype = null;

	private JLabel jLabel9 = null;

	private JComboBox jpatientSex = null;

	private JTextField jcost = null;

	private JLabel jLabel10 = null;

	private JComboBox jdoctor = null;

	private JLabel jLabel11 = null;

	private JButton jagain = null;

	private JButton jundo = null;

	private JLabel jLabel12 = null;

	private JTextField jdno = null;

	private JComboBox jdepartment = null;
	
	//自定义参数
	
	private int count = 1 ;//就诊号自加参数

	private String patientNo;  //定义就诊号  
	
	private String datetime;
	
	private Calendar clr = Calendar.getInstance();//定义一个日历
	
	private final String [] sex = {"男","女"};
	
	private final String [] type = {"普通号","专家号"}; 
	
	private static int pcost ;		//普通号费用
	
	private static int zcost;		//专家号费用

	private JButton jButton = null;

	

	/**
	 * This is the default constructor
	 */
	public guahao() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(648, 443);
		this.setContentPane(getJContentPane());
		this.setTitle("病人挂号");	
		this.setResizable(false);
		this.addWindowListener(new java.awt.event.WindowAdapter() {   
			public void windowOpened(java.awt.event.WindowEvent e) {  
				//设置病历号，使它连续
				SimpleDateFormat dateformat1 = new SimpleDateFormat("yyyyMMdd00");	//设置时间显示格式
				String sql = "select 病历号 from 病人信息表";
				linkDataBase link = new linkDataBase(main_Frame.getdataName(0),main_Frame.getdataPassword(0));
				ResultSet rs = link.getResultSet(sql);
				try{
					if(rs.last()){		//判断是否有挂号记录
						String pno = rs.getString(1);
						//判断最后的病历号日期是否与当前时间一直
						if(pno.startsWith(dateformat1.format(clr.getTime()))){
								patientNo = dateformat1.format(clr.getTime());
								//获取最后自加参数
								count = Integer.valueOf(pno.substring(9).trim());
								System.out.println("最后的病历号："+count);
								count++;
								jpatientNo.setText(patientNo+String.valueOf(count));
						}
						else{				//如果不同重新设置当前病历开始号
							patientNo = dateformat1.format(clr.getTime());
						    jpatientNo.setText(patientNo+String.valueOf(count));
						}
						System.out.println("最后一条记录存在!");
					}
					else{
						//没有挂号记录则开始生成挂号记录
					    patientNo = dateformat1.format(clr.getTime());
					    jpatientNo.setText(patientNo+String.valueOf(count));
						System.out.println(patientNo+String.valueOf(count));
					}
					rs.close();
					link.getconnection().close();
				}catch(SQLException ee){
					System.out.println(ee.toString());
				}	
			}
			
			public void windowClosing(java.awt.event.WindowEvent e) {
				main_Frame.setg_Statue(true);
				dispose();
			}
		});
		
		//设置初始科室与挂号费
		try{
			setCost();
			setDepartment();
		}catch(Exception e4){
			System.out.println(e4.toString());
		}
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
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(374, 267, 54, 24));
			jLabel12.setText("医生号:");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(508, 213, 42, 24));
			jLabel11.setText("姓名：");
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(376, 212, 40, 24));
			jLabel10.setText("科室：");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(211, 211, 52, 25));
			jLabel9.setText("挂号费：");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(58, 210, 39, 24));
			jLabel8.setText("类别：");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(167, 19, 259, 45));
			jLabel7.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel7.setForeground(new Color(30, 189, 250));
			jLabel7.setText("病   人   挂   号");
			jgno = new JLabel();
			jgno.setBounds(new Rectangle(524, 99, 109, 24));
			jgno.setForeground(new Color(252, 4, 4));
			jgno.setText(dialog.getuserName());
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(459, 99, 65, 25));
			jLabel6.setText("操作员号：");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(51, 308, 39, 25));
			jLabel5.setText("地址：");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(27, 263, 67, 24));
			jLabel4.setText("联系方式：");		
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(376, 157, 39, 27));
			jLabel3.setText("年龄：");
			jLable4 = new JLabel();
			jLable4.setBounds(new Rectangle(224, 155, 40, 29));
			jLable4.setText("性别：");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(31, 157, 70, 24));
			jLabel2.setText("病人姓名：");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(211, 96, 55, 27));
			jLabel1.setText("病历号：");
			jLabel = new JLabel();
			jLabel.setText("挂号日期：");
			jLabel.setBounds(new Rectangle(32, 94, 65, 29));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBackground(new Color(33, 252, 236));
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(getJpatientName(), null);
			jPanel.add(jLable4, null);
			jPanel.add(jLabel3, null);
			jPanel.add(getJpatientAge(), null);
			jPanel.add(jLabel4, null);
			jPanel.add(getJpatientTel(), null);
			jPanel.add(jLabel5, null);
			jPanel.add(getJpatientAddress(), null);
			jPanel.add(getJOK(), null);
			jPanel.add(getJEixt(), null);
			jPanel.add(jLabel6, null);
			jPanel.add(jgno, null);
			jPanel.add(getJdatetime(), null);
			jPanel.add(getJpatientNo(), null);
			jPanel.add(jLabel7, null);
			jPanel.add(jLabel8, null);
			jPanel.add(getJtype(), null);
			jPanel.add(jLabel9, null);
			jPanel.add(getJpatientSex(), null);
			jPanel.add(getJcost(), null);
			jPanel.add(jLabel10, null);
			jPanel.add(getJdoctor(), null);
			jPanel.add(jLabel11, null);
			jPanel.add(getJagain(), null);
			jPanel.add(getJundo(), null);
			jPanel.add(jLabel12, null);
			jPanel.add(getJdno(), null);
			jPanel.add(getJdepartment(), null);
			jPanel.add(getJButton(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jpatientName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	