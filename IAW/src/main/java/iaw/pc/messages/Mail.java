package iaw.pc.messages;

//X6
//
//<Mail>
//<From> ... </From>
//<To> ... </To>
//<Subject> ... </Subject>
//<Body> ... </Body>
//</Mail>

public class Mail {
	String from;
	String to;
	String body;
	String subject;
	
	public Mail() {
		super();
	}
	public Mail(String from, String to, String subject, String body) {
		super();
		this.from = from;
		this.to = to;
		this.body = body;
		this.subject=subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Mail [from=" + from + ", to=" + to + ", body=" + body
				+ ", subject=" + subject + "]";
	}
	
}
