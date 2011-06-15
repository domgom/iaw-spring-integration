package iaw.pc.messages;

import java.util.HashSet;
import java.util.Set;

//X2
//
//<CallRecords>
//
//  <PhoneCall> *
//    <Caller>
//      <EmployeeId> ... </EmployeeId>
//      <Name> ... </Name>
//      <Email> ... </Email>
//      <Phone> ... </Phone>
//      <Department> ... </Department>
//      <Terminal> ... </Terminal>
//    </Caller>
//
//    <Destination>
//      <Number> ... </Number>
//      <City> ... </City>
//      <Cost> ... </Cost>
//      <Duration> ... </Duration>
//    </Destination>
//  </PhoneCall>
//
//</CallRecords>

public class CallRecords {
	Set <PhoneCall> callRecords;

	public CallRecords(){
		this.callRecords = new HashSet<PhoneCall>();
	}
	
	public CallRecords(Set<PhoneCall> callRecords) {
		super();
		this.callRecords = callRecords;
	}


	public Set<PhoneCall> getCallRecords() {
		return callRecords;
	}

	public void setCallRecords(Set<PhoneCall> callRecords) {
		this.callRecords = callRecords;
	}

	@Override
	public String toString() {
		return "CallRecords [callRecords=" + callRecords + "]";
	}
	
	
}
