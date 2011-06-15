package iaw.pc.messages;

//X3
//
//  <Caller>
//    <EmployeeId> ... </EmployeeId>
//    <Name> ... </Name>
//    <Email> ... </Email>
//    <Phone> ... </Phone>
//    <Department> ... </Department>
//    <Terminal> ... </Terminal>
//  </Caller>

public class Caller {
	String employeeId;
	String name;
	String email;
	String phone;
	String department;
	String terminal;
	
	
	public Caller() {
		super();
	}
	
	
	public Caller(String employeeId, String name, String email, String phone,
			String department, String terminal) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.terminal = terminal;
	}


	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	@Override
	public String toString() {
		return "Caller [employeeId=" + employeeId + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", department="
				+ department + ", terminal=" + terminal + "]";
	}
	
}
