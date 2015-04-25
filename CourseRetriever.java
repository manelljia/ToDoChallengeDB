import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.webapde.db.DBConnection;
import edu.webapde.dto.Course;

public class NoteRetriever {
	public NoteRetriever(){}
	
	public Course getCourse(int idcourse){
		// SQL: SELECT * FROM COURSE WHERE IDCOURSE =1;
		Course c = new Course();
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement pstmt =
			conn.prepareStatement("SELECT * FROM COURSE WHERE IDCOURSE = ?");
			pstmt.setInt(1, idcourse);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				c.setCode(rs.getString("code"));
				c.setName(rs.getString("name"));
				c.setNumOfUnits(rs.getInt("numOfUnits"));
				c.setDescription(rs.getString("description"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	public ArrayList<Course> getAllCourses(){
		// SQL : SELECT * FROM course;
		Connection conn 
			= DBConnection.getConnection();
		ArrayList<Course> courseList 
			= new ArrayList<Course>();
		try {
			PreparedStatement pstmt
				= conn.prepareStatement("SELECT * FROM course");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				Course c = new Course();
				c.setId(rs.getInt("idcourse"));
				c.setCode(rs.getString("code"));
				c.setName(rs.getString("name"));
				c.setNumOfUnits(rs.getInt("numOfUnits"));
				c.setDescription(rs.getString("description"));
				courseList.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return courseList;
	}
	
	public void addCourse(Course c){
		String sql = "INSERT INTO COURSE (code, name, numOfUnits, description) VALUES (?,?,?,?)";
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getCode());
			pstmt.setString(2, c.getName());
			pstmt.setInt(3, c.getNumOfUnits());
			pstmt.setString(4, c.getDescription());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteCourse(int id){
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM COURSE WHERE IDCOURSE = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
