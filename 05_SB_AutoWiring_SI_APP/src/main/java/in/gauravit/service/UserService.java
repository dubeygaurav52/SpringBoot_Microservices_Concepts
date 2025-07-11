package in.gauravit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gauravit.dao.UserDao;
import in.gauravit.utils.EmailUtils;
import in.gauravit.utils.PwdUtils;

@Service
public class UserService {

	private PwdUtils pwdUtils;
	
	private EmailUtils emailUtils;

	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setPwdUtils(PwdUtils pwdUtils) {
		this.pwdUtils = pwdUtils;
	}

	@Autowired
	public void setEmailUtils(EmailUtils emailUtils) {
		this.emailUtils = emailUtils;
	}
	
	public void registerUser() {
		pwdUtils.encryptPwd();
		userDao.save();
		emailUtils.sendEmail();
		System.out.println("User Record Saved");
	}
}
