package hotel_management;

import java.util.Date;

public class User {
	
	//Data fields
	private String name;
	private String surname;
	private char gender;
	private String idCard;
	private int age;
	private int roomNumber;
	private int roomType;
	private Date checkIn;
	private String userName;
	private String password;
	
	//No args Constructor
	public User(){
	}
	
	//Constructor with specified arguments
	public User(String name, String surname, char gender, String idCard, int age,
			int roomNumber, int roomType, String userName, String password){
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.idCard = idCard;
		this.age = age;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.userName = userName;
		this.password = password;
		this.checkIn = new Date();
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomType() {
		return roomType;
	}

	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}