import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Dimension;
import java.awt.event.MouseEvent;


public class jiuzhen_Window extends JDialog implements Runnable{

	private static final long serialVersionUID = 1L;
	private JPanel jPanel = null;  
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jdno = null;
	private JScrollPane jScrollPane = null;
	private JLabel jLabel2 = null;
	private JTable jPatientInfo = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jChufa_Table = null;
	private JButton jButton = null;
	private JButton jExit = null;
	private JLabel jcno = null;
	private JComboBox jM_Type = null;
	private JComboBox jM_Name = null;
	private JLabel jM_No = null;
	private JLabel jM_price = null;
	private JLabel jLabel7 = null;
	private JTextField jcount = null;
	private DefaultTableModel tableModel;	//������Ϣ��ģʽ
	private DefaultTableModel tableModel2;	//������ģʽ
	private JLabel jLabel8 = null;
	private JLabel jpno = null;
	private Thread thread ;
	private int count = 1;		//����������ԼӲ���
	private JMenuItem delete = new JMenuItem("ɾ��");
	private JMenuItem Item = new JMenuItem("ˢ��");
	private Calendar clr = Calendar.getInstance();
	private DateFormat dateformat = new SimpleDateFormat("yyyyMMdd");	//����ʱ���ʽ
	public void run(){
		while(true){
		try{
			setPatientInfo(jdno.getText());
			Thread.sleep(5000);		//�����̣߳�ÿ��5��ˢ�¹Һ����
		}catch(InterruptedException e){
			System.out.println(e.toString());
		}
		}
	}
	
	public void start(){
		run();
	}
	/**
	 * This is the default constructor
	 */
	public jiuzhen_Window() {
		super();
		initialize();
		thread = new Thread(this);
		thread.start();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(jChufa_Table.getSelectedRowCount() >0){
					tableModel2.removeRow(jChufa_Table.getSelectedRow());
				}else if(jChufa_Table.getSelectedRowCount() == 0){
					JOptionPane.showMessageDialog(null,"��ѡ��Ҫɾ�����У�","��ʾ��",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		Item.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				setPatientInfo(jdno.getText().trim());
			}
		});
		this.setSize(754, 472);
		this.setContentPane(getJPanel());
		this.setTitle("���ﴦ");
		this.setResizable(false);
		this.addWindowListener(new java.awt.event.WindowAdapter() {   
			public void windowOpened(java.awt.event.WindowEvent e) {    
				setjcno();
				setM_Type();
			}
			public void windowClosing(java.awt.event.WindowEvent e) {
				thread.stop();		//�����߳�
				dispose();
			}
		});
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jpno = new JLabel();
			jpno.setBounds(new Rectangle(632, 131, 109, 18));
			jpno.setForeground(Color.red);
			jpno.setText("������");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(580, 131, 52, 18));
			jLabel8.setText("�����ţ�");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(626, 98, 33, 22));
			jLabel7.setText("����:");
			jM_price = new JLabel();
			jM_price.setBounds(new Rectangle(520, 130, 59, 21));
			jM_price.setText("�۸�");
			jM_No = new JLabel();
			jM_No.setBounds(new Rectangle(357, 131, 93, 20));
			jM_No.setText("Y000000001");
			jcno = new JLabel();
			jcno.setBounds(new Rectangle(90, 127, 175, 21));
			jcno.setForeground(Color.red);
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(454, 130, 66, 22));
			jLabel6.setText("ҩƷ�۸�");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(291, 130, 66, 21));
			jLabel5.setText("ҩƷ��ţ�");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(454, 97, 67, 22));
			jLabel4.setText("ҩƷ���ƣ�");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(291, 96, 65, 23));
			jLabel3.setText("ҩƷ���ࣺ");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(29, 127, 62, 23));
			jLabel2.setText("��������");
			jdno = new JLabel();
			jdno.setBounds(new Rectangle(93, 91, 172, 28));
			jdno.setText(dialog.getuserName());
			jdno.setForeground(Color.red);
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(218, 14, 250, 48));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel1.setForeground(Color.blue);
			jLabel1.setText("��   ��   ��   ��");
			jLabel = new JLabel();
			jLabel.setText("�����ţ�");
			jLabel.setBounds(new Rectangle(30, 93, 61, 25));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setSize(new Dimension(738, 438));
			jPanel.setBackground(new Color(77, 255, 248));
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jdno, null);
			jPanel.add(getJScrollPane(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(jLabel3, null);
			jPanel.add(jLabel4, null);
			jPanel.add(jLabel5, null);
			jPanel.add(jLabel6, null);
			jPanel.add(getJScrollPane1(), null);
			jPanel.add(getJButton(), null);
			jPanel.add(getJExit(), null);
			jPanel.add(jcno, null);
			jPanel.add(getJM_Type(), null);
			jPanel.add(getJM_Name(), null);
			jPanel.add(jM_No, null);
			jPanel.add(jM_price, null);
			jPanel.add(jLabel7, null);
			jPanel.add(getJcount(), null);
			jPanel.add(jLabel8, null);
			jPanel.add(jpno, null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(29, 153, 237, 190));
			jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			jScrollPane.setViewportView(getJPatientInfo());
			jScrollPane.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if(e.getButton() == MouseEvent.BUTTON3){
						getPopupMenu1().show(e.getComponent(), e.getX(), e.getY());
					}
				}
			});
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jPatientInfo	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJPatientInfo() {
		if (jPatientInfo == null) {
			jPatientInfo = new JTable();
			tableModel = new DefaultTableModel();
			tableModel.addColumn("������");
			tableModel.addColumn("����");
			tableModel.addColumn("�Ա�");
			tableModel.addColumn("����");
			jPatientInfo.setModel(tableModel);
			jPatientInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			jPatientInfo.setSelectionBackground(Color.green);
			
			jPatientInfo.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if(e.getButton()== MouseEvent.BUTTON1){
						int row = jPatientInfo.getSelectedRow();
						jpno.setText(((String)tableModel.getValueAt(row, 0)).trim());
					}else if(e.getButton() == MouseEvent.BUTTON3){
						getPopupMenu1().show(e.getComponent(), e.getX(), e.getY());
					}
				}
			});
			setPatientInfo(dialog.getuserName());
		}
		return jPatientInfo;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setBounds(new Rectangle(290, 154, 444, 186));
			jScrollPane1.setViewportView(getJChufa_Table());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jChufa_Table	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJChufa_Table() {
		if (jChufa_Table == null) {
			jChufa_Table = new JTable();
			tableModel2 = new DefaultTableModel();
			tableModel2.addColumn("ҩƷ���");
			tableModel2.addColumn("ҩƷ����");
			tableModel2.addColumn("ҩƷ����");
			tableModel2.addColumn("�����");
			jChufa_Table.setModel(tableModel2);
			jChufa_Table.setSelectionBackground(Color.green);
			jChufa_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//����ֻ��ѡ��һ��
			jChufa_Table.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if(e.getButton()==MouseEvent.BUTTON3)
					{	
						getJPopupMenu().show(e.getComponent(), e.getX(), e.getY());
					}
				}
			});
		}
		return jChufa_Table;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(168, 381, 93, 29));
			jButton.setText("��ҩ");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					insertJandC();
					updatePatient();	//���»�����Ϣ
					updateMedicine();	//����ҩƷ��Ϣ
					jcno.setText(jdno.getText().substring(1)+String.valueOf(++count));
					JOptionPane.showMessageDialog(null, "��ҩ�ɹ���");
					tableModel2.setRowCount(0);
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJExit() {
		if (jExit == null) {
			jExit = new JButton();
			jExit.setBounds(new Rectangle(501, 383, 97, 27));
			jExit.setText("�˳�");
			jExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					thread.stop();
					dispose();
				}
			});
		}
		return jExit;
	}

	/**
	 * This method initializes jM_Type	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJM_Type() {
		if (jM_Type == null) {
			jM_Type = new JComboBox();
			jM_Type.setBounds(new Rectangle(358, 96, 91, 21));
			jM_Type.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					jM_Name.removeAllItems();
					setM_Name((String)jM_Type.getSelectedItem());
				}
			});
		}
		return jM_Type;
	}

	/**
	 * This method initializes jM_Name	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJM_Name() {
		if (jM_Name == null) {
			jM_Name = new JComboBox();
			jM_Name.setBounds(new Rectangle(521, 97, 104, 21));
			jM_Name.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					setM_NoAndsetM_price((String)jM_Name.getSelectedItem());	
					//����???Ϊ����jM_Name.getSelectedItem().toString()����
				}
			});
		}
		return jM_Name;
	}

	/**
	 * This method initializes jcount	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJcount() {
		if (jcount == null) {
			jcount = new JTextField();
			jcount.setBounds(new Rectangle(660, 97, 69, 22));
			jcount.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//����嵥��¼
					try{
						Integer.valueOf(jcount.getText());
						setCList();
						jcount.setText("");
					}catch(Exception ee){
						JOptionPane.showMessageDialog(null, "����ȷ����ҩƷ��������","���棡",JOptionPane.WARNING_MESSAGE);
						System.out.println(ee.toString());
					}
				}
			});
		}
		return jcount;
	}
	
	//��ʼ�����˹Һ����
	private void setPatientInfo(String doctorName){
			linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
			String sql = "select ������,����,�Ա�,���� from ������Ϣ�� where ҽ���� = '"
							+doctorName+"' and �Ƿ���� = '��'";
			tableModel.setRowCount(0);
			try{
				ResultSet rs = link.getResultSet(sql);
				while(rs.next()){
					Vector<String> vc = new Vector<String>();
					vc.addElement(rs.getString(1));
					vc.addElement(rs.getString(2));
					vc.addElement(rs.getString(3));
					vc.addElement(rs.getString(4));
					tableModel.addRow(vc);
				}
				rs.close();
				link.getconnection().close();
			}catch(SQLException e){
				e.toString();
			}
			
	}
	
	//�Զ����ô����ţ��Կ�������ҽ����Ϊ����
	private void setjcno(){
		String Dno = jdno.getText().substring(1);
		String sql = "select ��������� from ������Ϣ�� where ��������� like '"+Dno+"%'";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		ResultSet rs = link.getResultSet(sql);
		try{
			if(rs.last()){
				String cno = rs.getString(1);
				count = Integer.valueOf(cno.substring(7));
				System.out.println(count);
				count++;
				jcno.setText(Dno+String.valueOf(count));
			}
			else{
				jcno.setText(Dno+String.valueOf(count));
			}
			rs.close();
			link.getconnection().close();
		}catch(SQLException e){
			System.out.println(e.toString());
		}
		
	}
	
	//������ȡ��ʼ��ʱҩƷ������
	private void setM_Type(){
		String sql = "select distinct ���� from ҩƷ��Ϣ��";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		ResultSet rs = link.getResultSet(sql);
		try{
			while(rs.next()){
				jM_Type.addItem(rs.getString(1).trim());
			}
		}catch(SQLException e){
			System.out.println(e.toString());
		}
	}
	
	//��̬����ҩƷ������
	private void setM_Name(String mtype){
		String sql = "select ���� from ҩƷ��Ϣ�� where ���� = '"+mtype+"'";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		ResultSet rs = link.getResultSet(sql);
		try{
			while(rs.next()){
				jM_Name.addItem(rs.getString(1).trim());
			}
			rs.close();
			link.getconnection().close();
		}catch(SQLException e){
			System.out.println(e.toString());
		}	
	}
	
	//��̬����ҩƷ�����ƺͼ۸�
	private void setM_NoAndsetM_price(String name){
		String sql = "select ���,���� from ҩƷ��Ϣ�� where ���� = '"+name+"'";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		ResultSet rs = link.getResultSet(sql);
		try{
			if(rs.next()){
				jM_No.setText(rs.getString(1).trim());
				jM_price.setText(rs.getString(2).trim());
			}else{
				System.out.println("��ȡҩƷ��źͼ۸�ʧ�ܣ�");
			}
			rs.close();
			link.getconnection().close();
		}catch(SQLException e){
			System.out.println(e.toString());			
		}
	}
	
	//�����ѡҩƷ���嵥��¼
	private  void setCList(){
		String no = jM_No.getText().trim();							//��ȡҩƷ���
		String name = ((String)jM_Name.getSelectedItem()).trim();	//��ȡҩƷ����
		String number = jcount.getText().trim();//��ȡҩƷ������
		int Allcount = searchM_all(no);
		Vector<String> vc = new Vector<String>();
		vc.addElement(no);
		vc.addElement(name);
		vc.addElement(number);
		vc.addElement(String.valueOf(Allcount));
		tableModel2.addRow(vc);
	}
	
	//������Ϣ��Ͳ����嵥�����
	private void insertJandC(){
		String cno = jcno.getText();
		String m_no;
		//String m_name;
		String m_number;
		String pno = jpno.getText().trim();
		String jiuzhen_sql = "insert into ������Ϣ��(���������,������,��������) values(?,?,?)";
		String insert_sql = "insert into �����嵥��(���������,ҩƷ���,����) values(?,?,?)";
		int rowcount = tableModel2.getRowCount();
		//�嵥���
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		Connection conn = link.getconnection();
		try{
			PreparedStatement pstmt1 = conn.prepareStatement(jiuzhen_sql);
			pstmt1.setString(1,cno);
			pstmt1.setString(2, pno);
			pstmt1.setString(3, dateformat.format(clr.getTime()));
			pstmt1.executeUpdate();
			System.out.println("������Ϣ�����ɹ�");
			pstmt1.close();
			
		}catch(SQLException e1){
			System.out.println(e1.toString());
		}
		
		try{	
			PreparedStatement pstmt = conn.prepareStatement(insert_sql);
			pstmt.setString(1, cno);
			for(int row = 0; row < rowcount;row++){
				m_no = (String)tableModel2.getValueAt(row, 0);
				//m_name = (String)tableModel2.getValueAt(row, 1);
				m_number = (String)tableModel2.getValueAt(row, 2);
				pstmt.setString(2, m_no.trim());
				//pstmt.setString(3, m_name.trim());
				pstmt.setString(3, m_number.trim());
				pstmt.executeUpdate();
			}
			pstmt.close();
			conn.close();
			System.out.println("�嵥���ɹ�!");
		}catch(SQLException ee){
			System.out.println(ee.toString());
		}
	}
	
	//�����ı����״̬
	private void updatePatient(){
		String pno = jpno.getText().trim();
		String sql = "update ������Ϣ�� set �Ƿ���� = '��' where ������ = ?";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		try{
			PreparedStatement pstmt = link.getconnection().prepareStatement(sql);
			pstmt.setString(1, pno);
			pstmt.executeUpdate();
			pstmt.close();
			link.getconnection().close();
		}catch(SQLException e){
			System.out.println(e.toString());
		}
	}
	
	//����ҩƷ����ҩƷ�Ŀ����
	private void updateMedicine(){
		int row = tableModel2.getRowCount();
		String mno;			//ҩƷ���
		int number;			//��ҩ������
		int Allcount;		//�����
		String sql = "update ҩƷ��Ϣ�� set ����� = (?) where ��� = (?)";
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		try{
			PreparedStatement pstmt = link.getconnection().prepareStatement(sql);
			for(int i = 0; i < row; i++){
				mno = (String)tableModel2.getValueAt(i, 0);
				pstmt.setString(2, mno.trim());
				number = Integer.valueOf((String)tableModel2.getValueAt(i, 2));
				Allcount = searchM_all(mno);
				System.out.println("�������"+Allcount+"��ҩ����"+number);
				pstmt.setInt(1, Allcount - number);
				pstmt.executeUpdate();
			}
			pstmt.close();
			link.getconnection().close();
			
		}catch(SQLException e){
			System.out.println(e.toString());
		}
	}
	
	//���ô�������ڵ���ʽ�˵�
	private JPopupMenu getJPopupMenu(){
		JPopupMenu pmenu = new JPopupMenu();
		pmenu.add(delete);
		return pmenu;
	}
	
	//���ò�����Ϣ���ˢ�µ���ʽ�˵�
	private JPopupMenu getPopupMenu1(){
		JPopupMenu pmenu = new JPopupMenu();
		pmenu.add(Item);
		return pmenu;
	}
	
	//��ѯҩƷ�Ŀ����
	private int searchM_all(String mno){
		String sql = "select ����� from ҩƷ��Ϣ�� where ��� = '"+mno+"'";
		int count = 0;
		linkDataBase link = new linkDataBase(main_Frame.getdataName(1),main_Frame.getdataPassword(1));
		ResultSet rs = link.getResultSet(sql);
		try{
			if(rs.next()){
				count = rs.getInt(1);
			}
			rs.close();
			link.getconnection().close();
		}catch(SQLException e){
			System.out.println("��ȡ�����ʧ�ܣ�"+e.toString());
		}
		return count;
	}
	
	
}  
