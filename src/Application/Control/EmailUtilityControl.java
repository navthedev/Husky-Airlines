package Application.Control;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtilityControl {

	public static void sendEmail(String toEmail, String subject, String body){
		try
	    {
			Properties properties = System.getProperties();

			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.socketFactory.port", "465");    
		       properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");     
		       properties.put("mail.smtp.port", "465");    
			Session session = Session.getInstance(properties,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication("mohittanejaldh@gmail.com", "m1o2h3i4t5");
						}
					});
	      MimeMessage msg = new MimeMessage(session);
	      //set message headers
	      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	      msg.addHeader("format", "flowed");
	      msg.addHeader("Content-Transfer-Encoding", "8bit");

	      msg.setFrom(new InternetAddress("mohittanejaldh@gmail.com", "NoReply-Husky Airines"));

	      msg.setReplyTo(InternetAddress.parse(toEmail, false));

	      msg.setSubject(subject);

	      msg.setText(body);

	      msg.setSentDate(new Date());

	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
	      System.out.println("Message is ready");
    	  Transport.send(msg);  

	      System.out.println("Email Sent Successfully!!");
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	}
}