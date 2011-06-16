package iaw.pc.runtime;

import iaw.pc.messages.EmployeeRequest;
import iaw.pc.messages.PhoneCall;

import org.springframework.integration.annotation.Transformer;


public class HRSTransformer {

	@Transformer
	public EmployeeRequest transform(PhoneCall message){
		String employeeId = message.getCaller().getEmployeeId();
		if(employeeId==null){
			throw new NullPointerException("EmployeeId is null");
		}
		return new EmployeeRequest(employeeId);
	}
}
