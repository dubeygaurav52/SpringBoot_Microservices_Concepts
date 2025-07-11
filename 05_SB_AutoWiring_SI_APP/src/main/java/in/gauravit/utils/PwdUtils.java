package in.gauravit.utils;

import org.springframework.stereotype.Component;

@Component
public class PwdUtils {

	public PwdUtils() {
		System.out.println("0-param PwdUtils::constructor");
	}

	public void encryptPwd() {
		System.out.println("Encrypting pwd for registered Users...");
	}
}
