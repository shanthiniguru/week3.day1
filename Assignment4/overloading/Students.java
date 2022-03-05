package org.overloading;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("This is the Student Id: " +id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("This is the Student Id: " +id +"and Studen Name: " +name);

	}
	
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println("This is the Student emaild: " +email +" and Phonenumber: " +phonenumber);

	}
	
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(1231212);
		obj.getStudentInfo(1231212,"SHANTHINI");
		obj.getStudentInfo("abc@gmail.com", 9962727909L);
	}
}
