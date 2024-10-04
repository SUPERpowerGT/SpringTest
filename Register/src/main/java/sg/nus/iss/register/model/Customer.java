package sg.nus.iss.register.model;



import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	@Column(length = 50)
	@NotBlank(message = "Code is required")
	private String userName;
	@Column(length = 25)
	private String name;
	@Column(length = 25)
	private String email;
	@Column(length = 25)
	private String password;
	@Column
	private String gender;
	@Column(length = 50)
	private String address;
	@Column
	private LocalDate birthDate;
	@Column(length = 25)
	private String phoneNumber;


	
	public Customer() {super();}
	
	public Customer(
			long userId,String userName,String name,
			String email,String password,String address,
			String gender,LocalDate birthDate,String phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.gender = gender;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;

	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
