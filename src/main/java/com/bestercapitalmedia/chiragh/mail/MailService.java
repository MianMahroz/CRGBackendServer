package com.bestercapitalmedia.chiragh.mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**
 * The Class MailService.
 */
@Service
public class MailService {

	/** The from email. */
	@Value("${app.email.from}")
	private String fromEmail;

	/** The app url. */
	@Value("${app.url}")
	private String appUrl;

	/** The reset password url. */
	@Value("${resetPassword.url}")
	private String resetPasswordUrl;

	/** The support email. */
	@Value("${app.email.support}")
	private String supportEmail;

	/** The mail sender. */
	@Autowired
	private MailSender mailSender;

	/** The java mail sender. */
	@Autowired
	private JavaMailSender javaMailSender;

	/**
	 * Send mail 1.
	 *
	 * @param to
	 *            the to
	 * @param subject
	 *            the subject
	 * @param text
	 *            the text
	 */
	public void sendMail1(String to, String subject, String text) {
		try {
			SimpleMailMessage email = new SimpleMailMessage();
			email.setTo(to);
			email.setSubject(subject);
			email.setFrom(fromEmail);
			email.setText(text);
			mailSender.send(email);
			System.out.println("SENT EMAIL: TO=" + to + "|SUBJECT:" + subject + "|TEXT:" + text);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Send mail.
	 *
	 * @param to
	 *            the to
	 * @param subject
	 *            the subject
	 * @param body
	 *            the body
	 */
	public String sendMail(String to, String subject, String body) {
		final String username = "mianmahroz@gmail.com";
		final String password = "mianmian";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mianmahroz@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(body);
			Transport.send(message);
			return "Email Sent";
		} catch (Exception e) {
			e.printStackTrace();
			return "Email Sending fail";
		}
	}

	/**
	 * Send reset password.
	 *
	 * @param to
	 *            the to
	 * @param token
	 *            the token
	 */
	public void sendResetPassword(String to, String token) {
		String url = resetPasswordUrl + token;
		String subject = "Chiragh Reset Password";
		String text = "Please click the following link to reset your password: " + url;
		sendMail(to, subject, text);
	}

	/**
	 * Send new registration.
	 *
	 * @param to
	 *            the to
	 * @param token
	 *            the token
	 */
	public void sendNewRegistration(String to, String token) {
		String url = appUrl + token;
		String subject = "Please activate your account";
		String text = "Please click the following link to activate your account: " + url;
		sendMail(to, subject, text);
	}

	// public void sendErrorEmail(Exception e, HttpServletRequest req, User user) {
	// String subject = "Application Error: " + req.getRequestURL();
	// String text = "An error occured in your application: " + e + "\r\nFor User: "
	// + user.getEmail();
	// sendMail(supportEmail, subject, text);
	// }
}
