package iaw.pc.runtime;

import iaw.pc.messages.Mail;
import iaw.pc.messages.SMS;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
	private static final String SMTP_HOST_NAME = "smtp.gmail.com";
	private static final int SMTP_HOST_PORT = 465;
	private static final String SMTP_AUTH_USER = "-";//TODO
	private static final String SMTP_AUTH_PWD = "-";//TODO

	public void send(Mail mail) {
		System.err.println("MAIL GATEWAY ");
		System.out.println(mail);
		
		sendMail(mail);
	}
	private void sendMail(Mail mail){
		Properties props = new Properties();

		props.put("mail.transport.protocol", "smtps");
		props.put("mail.smtps.host", SMTP_HOST_NAME);
		props.put("mail.smtps.auth", "true");
		// props.put("mail.smtps.quitwait", "false");
		try {
			Session mailSession = Session.getDefaultInstance(props);
			mailSession.setDebug(false);

			Transport transport = mailSession.getTransport();

			MimeMessage mimeMessage = new MimeMessage(mailSession);
			mimeMessage.setSubject(mail.getSubject());
			mimeMessage.setContent(mail.getBody(), "text/plain");

			mimeMessage.addRecipient(Message.RecipientType.TO,
					new InternetAddress(mail.getTo()));

			transport.connect(SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER,
					SMTP_AUTH_PWD);

			transport.sendMessage(mimeMessage,
					mimeMessage.getRecipients(Message.RecipientType.TO));
			transport.close();
		} catch (Exception e) {
			System.out.println("Error enviando correo");
		}
	}

}
