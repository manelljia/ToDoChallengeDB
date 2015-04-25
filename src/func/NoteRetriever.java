package func;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DBConnection;
import dto.Note;

public class NoteRetriever {

	public NoteRetriever(){}
	
	public Note getNote(int idNote){
		// SQL: SELECT * FROM NOTE WHERE IDNOTE =1;
		Note n = new Note();
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement pstmt =
			conn.prepareStatement("SELECT * FROM COURSE WHERE idNote = ?");
			pstmt.setInt(1, idNote);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				n.setNote(rs.getString("code"));
				}
		}
		
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return n;
	}
	
public ArrayList<Note> getAllNotes(){
		// SQL : SELECT * FROM Note;
		Connection conn 
			= DBConnection.getConnection();
		ArrayList<Note> courseList 
			= new ArrayList<Note>();
		try {
			PreparedStatement pstmt
				= conn.prepareStatement("SELECT * FROM note");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				Note c = new Note();
				c.setNote(rs.getString("Note"));
				c.setStatus(rs.getString("Status"));
				courseList.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return courseList;
}	

public void addNote(Note n){
		String sql = "INSERT INTO COURSE (note, status) VALUES (?,?)";
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getNote());
			pstmt.setString(2, "Pending");
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


}
