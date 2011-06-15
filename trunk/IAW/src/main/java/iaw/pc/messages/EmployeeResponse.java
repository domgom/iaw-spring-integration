package iaw.pc.messages;

//X5
//------------------------------------------------------
//<EmployeeResponse>
//  <EmployeeId> ... </EmployeeId>
//  <Name> ... </Name>
//  <Email> ... </Email>
//  <Phone> ... </Phone>
//  <Department> ... </Department>
//  <Category> ... </Category>
//  <Hours> ... </Hours>
//  <Title> ... </Title>
//</EmployeeResponse>

public class EmployeeResponse {
	String employeeId;
	String name;
	String email;
	String phone;
	String department;
	String category;
	Float hours;
	String title;

	public EmployeeResponse() {
		super();
	}

	public EmployeeResponse(String employeeId, String name, String email,
			String phone, String department, String category, Float hours,
			String title) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.category = category;
		this.hours = hours;
		this.title = title;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Float getHours() {
		return hours;
	}

	public void setHours(Float hours) {
		this.hours = hours;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "EmployeeResponse [employeeId=" + employeeId + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", department="
				+ department + ", category=" + category + ", hours=" + hours
				+ ", title=" + title + "]";
	}

}
