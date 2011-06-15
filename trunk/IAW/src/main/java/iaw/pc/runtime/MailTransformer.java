package iaw.pc.runtime;

import iaw.pc.messages.Mail;
import iaw.pc.messages.PhoneCall;

import org.springframework.integration.annotation.Transformer;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;


public class MailTransformer {

	@Transformer
	public Mail transform(PhoneCall call){
		//TODO
		return null;
		
	}
}
