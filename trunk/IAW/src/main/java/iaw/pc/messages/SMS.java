package iaw.pc.messages;

//X7
//
//<SMS>
//<From> ... </From>
//<To> ... </To>
//<Body> ... </Body>
//</SMS>

public class SMS {
	String from;
	String to;
	String body;
	
	
	public SMS() {
		super();
	}
	public SMS(String from, String to, String body) {
		super();
		this.from = from;
		this.to = to;
		this.body = body;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "SMS [from=" + from + ", to=" + to + ", body=" + body + "]";
	}
	
}
