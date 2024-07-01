package qsp;

public class Student {
	
	// to achieve data hiding we use private keyword
	private String name;
	private int rollNo;
	
	
	// to read the data we use getter methods
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	
	// to write the data we use setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	

	

}
