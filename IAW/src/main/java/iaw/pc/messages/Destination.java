package iaw.pc.messages;


//X3 *
//
//  <Destination>
//    <Number> ... </Number>
//    <City> ... </City>
//    <Cost> ... </Cost>
//    <Duration> ... </Duration>
//  </Destination>

public class Destination {

	String number;
	String city;
	float cost;
	long duration;
	
	public Destination() {
		super();
	}
	
	
	public Destination(String number, String city, float cost, long duration) {
		super();
		this.number = number;
		this.city = city;
		this.cost = cost;
		this.duration = duration;
	}


	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Destination [number=" + number + ", city=" + city + ", cost="
				+ cost + ", duration=" + duration + "]";
	}
	
}
