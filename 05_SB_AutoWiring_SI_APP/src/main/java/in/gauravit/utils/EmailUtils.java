package in.gauravit.utils;

import org.springframework.stereotype.Component;

@Component
public class EmailUtils {

	public EmailUtils() {
	System.out.println("EmailUtils::Constructor");
	}

	public void sendEmail() {
		System.out.println("sending Email for Registered Users...");
	}
}
