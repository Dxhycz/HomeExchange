package com.hotel.action;

import com.hotel.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private  User user;
	
	@Override
	public User getModel() {
		if(user==null) user = new User();
		return user;
	}
	
}  
