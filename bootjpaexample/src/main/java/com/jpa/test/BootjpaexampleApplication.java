package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserReposetory;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
	
		UserReposetory userReposetory=context.getBean(UserReposetory.class);
	
		/*
		 * User user=new User(); user.setName("Gaurav"); user.setCity("Mumbai");
		 * user.setStatus("working");
		 * 
		 * User user1=userReposetory.save(user); System.out.println(user1);
		 */
	
		
		
//		  User user1=new User(); User user2=new User();
//		  
//		  user1.setName("Raunak"); user1.setCity("UP");
//		  user1.setStatus("Working as a java programmer");
//		  
//		  user2.setName("Kiran"); user2.setCity("Assam");
//		  user2.setStatus("Working as a Automation tester");
//		  
//		  List <User> users = List.of(user1,user2); //in java 9 version //User
//		//  resultUser = userReposetory.save( user1); //saving single user
//		  
//		  Iterable<User> result = userReposetory.saveAll(users);
//		  
//		  result.forEach(user->{ System.out.println(user); });
//		 
	//	System.out.println("saved user "+resultUser);
		//System.out.println("done");
		
	/*
	 * //Update Optional<User> optional = userReposetory.findById(1); User user =
	 * optional.get();
	 * 
	 * user.setStatus("Working as seniour software developer");
	 * 
	 * User updatedUser = userReposetory.save(user);
	 * System.out.println("updated user data "+updatedUser);
	 * 
	 * System.out.println(user);
	 */
		
		/*how to get the data 
		 * findById(id)-return optional Containing  your data
		 * */
	//	Iterable<User> itr = userReposetory.findAll();
		/*
		 * Iterator<User> iterator = itr.iterator();
		 * 
		 * while(iterator.hasNext()) {
		 * 
		 * User user=iterator.next(); System.out.println(user); }
		 */
		
		
		/*
		 * itr.forEach(new Consumer<User>() {
		 * 
		 * @Override public void accept(User t) { System.out.println(t);
		 * 
		 * } });
		 */
	//	itr.forEach(user->{System.out.println(user);});//By using lambda functions
		
		//Deleting the user element
		//for single delete
//		userReposetory.deleteById(53);
//		System.out.println("deleted");
		
		/*
		 * Iterable<User> allUsers = userReposetory.findAll();
		 * allUsers.forEach(user->{System.out.println(user);});
		 * 
		 * userReposetory.deleteAll(allUsers);
		 */
		/*
		 * List<User> byName = userReposetory.findByName("Raunak");
		 * 
		 * byName.forEach(e->System.out.println(e));
		 * 
		 * List<User> usersByNameAndCity = userReposetory.findByNameAndCity("Raunak",
		 * "UP");
		 * 
		 * usersByNameAndCity.forEach(user->System.out.println(user));
		 */
	
		List<User> allUser = userReposetory.getAllUser();
		allUser.forEach(e->System.out.println(e));
		System.out.println("________________________________________________");
		
		List<User> userByName = userReposetory.getUserByName("kiran","assam");
		userByName.forEach(e->System.out.println(e));
		
		System.out.println("________________________________________________");
		userReposetory.getUsers().forEach(e->System.out.println(e));
	}

}
