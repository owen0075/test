package org.spring.DBManage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class mysqlManage {
	
	public static void main(String args[]){
		mysqlManage mm = new mysqlManage();
		mm.ConnDB();
	}
	
	public Object ConnDB(){
		
		String strRet = "";
		List<Map<String,  Object>> mapRet = new ArrayList<Map<String,  Object>>();
	    //声明Connection对象
	    Connection con;
	    //驱动程序名
	    
	    String driver = "com.mysql.jdbc.Driver";
	    //URL指向要访问的数据库名mydata
	    String url = "jdbc:mysql://localhost:3306/sqltestdb";
	    //MySQL配置时的用户名
	    String user = "root";
	    //MySQL配置时的密码
	    String password = "root";

	    //遍历查询结果集
	    try {
	        //加载驱动程序
	        Class.forName(driver);
	        //1.getConnection()方法，连接MySQL数据库！！
	        con = DriverManager.getConnection(url,user,password);
	        if(!con.isClosed())
	            System.out.println("Succeeded connecting to the Database!");
	        //2.创建statement类对象，用来执行SQL语句！！
	        Statement statement = con.createStatement();
	        //要执行的SQL语句
	        String sql = "select * from emp";
	        //3.ResultSet类，用来存放获取的结果集！！
	        ResultSet rs = statement.executeQuery(sql);
	        System.out.println("-----------------");
	        System.out.println("执行结果如下所示:");  
	        System.out.println("-----------------");  
	        System.out.println("姓名" + "\t" + "职称");  
	        System.out.println("-----------------");  
	         
	        String job = null;
	        String id = null;
	        while(rs.next()){
	            //获取stuname这列数据
	            job = rs.getString("job");
	            //获取stuid这列数据
	            id = rs.getString("ename");

	            Map<String, Object> map = new HashMap<String, Object>();
	            map.put("job", job);
	            map.put("ename", id);
	            //输出结果
	            mapRet.add(map);
	        }
	        rs.close();
	        con.close();
	        
	        return mapRet;
	    } catch (Exception e) {
	        return e.getMessage();
	    }finally{
	        System.out.println(strRet);
	    }
		
	}
}
