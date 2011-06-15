package iaw.pc.runtime;

import iaw.pc.messages.SMS;

public class Sms {
	
	public void send(SMS sms) {
		System.err.println("SMS GATEWAY: ");
		System.out.println(sms);
	}
}
