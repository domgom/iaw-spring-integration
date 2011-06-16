package iaw.pc.runtime;

import iaw.pc.messages.Mail;
import iaw.pc.messages.PhoneCall;

import org.springframework.integration.annotation.Transformer;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;


public class MailTransformer {

	@Transformer
	public Mail transform(PhoneCall call){
		String body="This is an automatic email generated by the Phone Call Management System\n";
		body += "Call to " + call.getDestination().getNumber() + " was succesfully charged in your account.\n";
		body += "From: " + call.getCaller().getPhone()+"\n";
		body += "City: " + call.getDestination().getCity()+"\n";
		body += "Duration: "+ call.getDestination().getDuration()+"\n";
		body += "Cost: " + call.getDestination().getCost()+"\n";
		
		return new Mail("noreply@unijui.br",call.getCaller().getEmail(),"Phone Call Management System", body);
		
	}
}
