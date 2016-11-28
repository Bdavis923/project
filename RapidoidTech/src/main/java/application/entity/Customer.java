package application.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Customer", schema = "dbo", catalog = "Repairs")
public class Customer  {

	@Id
	@Column(name = "VID", unique = true, nullable = false)
	private Integer vid;
	
	@Column(name = "Last_Name", nullable = false)
	private String lastName;
	
	@Column(name = "First_Name", nullable = false)
	private String firstName;
	
	@Column(name = "MI")
	private String mi;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Column(name = "Phone_Number", nullable = false)
	private String phoneNumber;
	
/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ticket", targetEntity=Ticket.class)
	private Set<Ticket> tickets = new HashSet<Ticket>(0);*/
	
	@Column(name = "password")
	private String password;


	public Customer() {
}

	public Customer(Integer vid, String lastName, String firstName, String email,
			String phoneNumber) {
		this.vid = vid;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

/*	public Customer(Integer vid, String lastName, String firstName, String mi, String email,
			String phoneNumber, Set<Ticket> tickets) {
		this.vid = vid;
		this.lastName = lastName;
		this.firstName = firstName;
		this.mi = mi;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.tickets = tickets;
	}*/

	
	public Integer getVid() {
		return this.vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
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

	
	public String getMi() {
		return this.mi;
	}

	public void setMi(String mi) {
		this.mi = mi;
	}

	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
/*	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}*/

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}