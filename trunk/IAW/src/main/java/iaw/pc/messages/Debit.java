package iaw.pc.messages;

//X8
//
//<Debit>
//<EmployeeId> ... </EmployeeId>
//<Amount> ... </Amount>
//<Description> ... </Description>
//</Debit>

public class Debit {
	String employeeId;
	Float amount;
	String description;
	
	
	
	public Debit() {
		super();
	}
	public Debit(String employeeId, Float amount, String description) {
		super();
		this.employeeId = employeeId;
		this.amount = amount;
		this.description = description;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Debit [employeeId=" + employeeId + ", amount=" + amount
				+ ", description=" + description + "]";
	}
	
}
