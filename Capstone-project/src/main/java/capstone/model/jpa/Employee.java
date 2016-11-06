package capstone.model.jpa;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name = "Employee", schema = "dbo", catalog = "Repairs")
public class Employee {

	@Id
	@Column(name = "Employee_ID", unique = true, nullable = false)
	private int employeeId;
	
	@Column(name = "Last_Name", nullable = false)
	private String lastName;
	@Column(name = "First_Name", nullable = false)
	private String firstName;
	@Column(name = "Job_Title", nullable = false)
	private String jobTitle;
	@Column(name = "E_Mail", nullable = false)
	private String EMail;
	@Column(name = "Phone_Number", nullable = false)
	private String phoneNumber;
	@Column(name = "Address", nullable = false)
	private String address;
	@Column(name = "City", nullable = false)
	private String city;
	@Column(name = "State", nullable = false)
	private String state;
	@Column(name = "Zip", nullable = false)
	private String zip;
	@Column(name = "Certification", nullable = false)
	private boolean certification;
	@Column(name = "Notes")
	private String notes;
	@Column(name = "Employed", nullable = false)
	private boolean employed;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private Set<Ticket> tickets = new HashSet<Ticket>(0);
	@Column(name = "password")
	private String password;

	public Employee() {
	}

	public Employee(int employeeId, String lastName, String firstName, String jobTitle,
			String EMail, String phoneNumber, String address, String city, String state,
			String zip, boolean certification, boolean employed) {
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.jobTitle = jobTitle;
		this.EMail = EMail;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.certification = certification;
		this.employed = employed;
	}


	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	
	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	
	public boolean isCertification() {
		return this.certification;
	}

	public void setCertification(boolean certification) {
		this.certification = certification;
	}

	
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	
	public boolean isEmployed() {
		return this.employed;
	}

	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

	
	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
