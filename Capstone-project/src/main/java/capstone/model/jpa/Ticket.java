package capstone.model.jpa;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ticket", schema = "dbo", catalog = "Repairs")
public class Ticket {

	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="Ticket#", unique=true, nullable=false)
	private Integer ticket;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Customer", nullable = false)
	private Customer customer;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Asigned_To")
	private Employee employee;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Equipment", nullable = false)
	private Equipment equipment;
	@Column(name = "Description", nullable = false)
	private String description;
	@Column(name = "Summary")
	private String summary;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Due_Date", length = 23)
	private Date dueDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Closed", length = 23)
	private Date closed;
	@Column(name = "Serial_Number", nullable = false)
	private String serialNumber;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_Closed", length = 23)
	private Date dateClosed;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_Created", length = 23)
	private Date dateCreated;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Last_Updated", length = 23)
	private Date lastUpdated;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_Opened", length = 23)
	private Date dateOpened;
	
	@Column(name = "Notes")
	private String notes;

	public Ticket() {
	}

	public Ticket(Customer customer, Equipment equipment, String description, String serialNumber) {
		this.customer = customer;
		this.equipment = equipment;
		this.description = description;
		this.serialNumber = serialNumber;
	}

	public Ticket(Customer customer, Employee employee, Equipment equipment, String description,
			String summary, Date dueDate, Date closed, String serialNumber, Date dateClosed,
			Date dateCreated, Date lastUpdated, Date dateOpened, String notes) {
		this.customer = customer;
		this.employee = employee;
		this.equipment = equipment;
		this.description = description;
		this.summary = summary;
		this.dueDate = dueDate;
		this.closed = closed;
		this.serialNumber = serialNumber;
		this.dateClosed = dateClosed;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.dateOpened = dateOpened;
		this.notes = notes;
	}


    public Integer getTicket()
	{
        return this.ticket;
    }

	public void setTicket(Integer ticket)
	{
        this.ticket = ticket;
    }

	
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Equipment getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	
	public Date getClosed() {
		return this.closed;
	}

	public void setClosed(Date closed) {
		this.closed = closed;
	}


	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public Date getDateClosed() {
		return this.dateClosed;
	}

	public void setDateClosed(Date dateClosed) {
		this.dateClosed = dateClosed;
	}

	
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	
	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	
	public Date getDateOpened() {
		return this.dateOpened;
	}

	public void setDateOpened(Date dateOpened) {
		this.dateOpened = dateOpened;
	}

	
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
