package capstone.model.jpa;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Equipment", schema = "dbo", catalog = "Repairs")
public class Equipment  {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "Equipment_ID", unique = true, nullable = false)
	private Integer equipmentId;
	
	@Column(name = "Equipment_Type", nullable = false)
	private String equipmentType;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipment")
	private Set<Ticket> tickets = new HashSet<Ticket>(0);

	public Equipment() {
	}

	public Equipment(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public Equipment(String equipmentType, Set<Ticket> tickets) {
		this.equipmentType = equipmentType;
		this.tickets = tickets;
	}

	
	public Integer getEquipmentId() {
		return this.equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	
	public String getEquipmentType() {
		return this.equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	
	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	
}
