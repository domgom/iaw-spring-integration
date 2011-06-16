package iaw.pc.messages;


//X3
//
//<?xml version="1.0" encoding="iso-8859-1"?>
//<PhoneCall>
//  <Caller>
//    <EmployeeId> ... </EmployeeId>
//    <Name> ... </Name>
//    <Email> ... </Email>
//    <Phone> ... </Phone>
//    <Department> ... </Department>
//    <Terminal> ... </Terminal>
//  </Caller>
//
//  <Destination>
//    <Number> ... </Number>
//    <City> ... </City>
//    <Cost> ... </Cost>
//    <Duration> ... </Duration>
//  </Destination>
//</PhoneCall>

public class PhoneCall {
	Caller caller;
	Destination destination;
	
	
	public PhoneCall() {
		super();
		this.caller = new Caller();
		this.destination = new Destination();
	}
	
	
	public PhoneCall(Caller caller, Destination destination) {
		super();
		this.caller = caller;
		this.destination = destination;
	}


	public Caller getCaller() {
		return caller;
	}
	public void setCaller(Caller caller) {
		this.caller = caller;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "PhoneCall [caller=" + caller + ", destination=" + destination
				+ "]";
	}
	
}
