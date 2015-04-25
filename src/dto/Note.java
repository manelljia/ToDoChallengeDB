package dto;

public class Note {
	
	private int idNote;
	private String note;
	private String status;
	
	public Note(){}
	
	public Note(String note, String status){
		super();
		this.note = note;
		this.status = status;
	}
	
	public int getId(){
		return this.idNote;
	}
	
	public void setId(int id){
		this.idNote = id;
	}
	
	
	public String getNote(){
		return this.note;
	}
	
	public void setNote(String note){
		this.note = note;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
}
