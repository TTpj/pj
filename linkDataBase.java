import java.sql.*;

public class linkDataBase {
	
	//jdbc����
	private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private final String url = "jdbc:sqlserver://localhost:1433;DatabaseName=ҽԺ����ϵͳ";
	
	private String DBuser = "sa";			//SQL���ݿ��û���
	
	private String DBpassword = "sa";			//�û�������
	
	private Connection conn;
	
	private ResultSet rs;
	
	private static Statement stmt;
	//	Ա���û���������
	//private String userName;			
	
	//private String userPassword;
	
	/*public linkDataBase(String DBuser, String DBpassword,String user, String userpassword){
		this.DBuser = DBuser;
		this.DBpassword = DBpassword;	
		this.userName = user;
		this.userPassword = userpassword;
	}*/
	
	public linkDataBase(String DBuser, String DBpassword){
		this.DBuser = DBuser;
		this.DBpassword = DBpassword;
	}
	
	public Connection getconnection(){
		try{
			Class.forName(driver);
			System.out.println("�ҵ�����");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=ҽԺ����ϵͳ","sa","sa");
		}catch(ClassNotFoundException e){
			System.out.println("δ�ҵ�Ҫ���ص������࣡");
		}catch(SQLException e){
			System.out.println("SQL������ʾ��"+e.toString());
		}
		System.out.println("����������");
		return conn;
		}	

	//���ؽ����
	public ResultSet getResultSet(String sql){
		try{
		    stmt = getconnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(sql);
		}catch(SQLException e){
			e.toString();
		}
		return rs;	
	}
}
