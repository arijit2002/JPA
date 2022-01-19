package a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="arijit")
class Employee {
	@Id
	@Column(name="myid")
	private int id;
	@Column(name="myname")
	private String name;
	@Column(name="myaddress")
	private String address;
	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(final String address) {
		this.address = address;
	}
	Employee(final int id, final String name, final String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
