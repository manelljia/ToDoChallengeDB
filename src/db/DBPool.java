package db;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DBPool {
	static BasicDataSource ds;
	
	public DBPool(){
		ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/");
		ds.setDriverClassName("com.mysql.");
	}
}
