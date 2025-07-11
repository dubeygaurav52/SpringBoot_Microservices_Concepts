package in.gauravit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gauravit.dao.UserDao;

@Service
public class UserService {


private UserDao userDao=null;

	@Autowired 
	public UserService(UserDao userDao) {
		this.userDao=userDao;
		System.out.println("1-params::constructor");
	}

	public UserService() {
		System.out.println("0-params::constructor");
	}
	
public void registerUser() {
	
	boolean isSaved=userDao.saveUser("Ashok", "Ashok@gmail.com", "pass1234");
	
	if(isSaved) {
		System.out.println("Record is saved");
	}else {
		System.out.println("Failed to saved");
	}
}

}
