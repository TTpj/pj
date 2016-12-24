import java.sql.*;

public class linkDataBase {
	
	//jdbc驱动
	private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private final String url = "jdbc:sqlserver://localhost:1433;DatabaseName=医院管理系统";
	
	private String DBuser = "sa";			//SQL数据库用户名
	
	private String DBpassword = "sa";			//用户名密码
	
	private Connection conn;
	
	private ResultSet rs;
	
	private static Statement stmt;
	//	员工用户名和密码
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
			System.out.println("找到驱动");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=医院管理系统","sa","sa");
		}catch(ClassNotFoundException e){
			System.out.println("未找到要加载的驱动类！");
		}catch(SQLException e){
			System.out.println("SQL错误提示："+e.toString());
		}
		System.out.println("建立了连接");
		return conn;
		}	

	//返回结果集
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
