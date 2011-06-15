package iaw.pc.messages;

//X4
//
//<EmployeeRequest>
//  <EmployeeId> ... </EmployeeId>
//</EmployeeRequest>

public class EmployeeRequest {
	String employeeId;

	
	public EmployeeRequest() {
		super();
	}

	public EmployeeRequest(String employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [employeeId=" + employeeId + "]";
	}
	
}
