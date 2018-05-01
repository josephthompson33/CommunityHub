package controller;

/*
*This is where requests to the server with the extension /login come to
*probably needs a bit more security than this
* also shouldn't be a get
* used to authenticate users
*/

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import DataAccess.*;

@RestController
public class loginController{
    
    @GetMapping("/login")
    public String login(@RequestParam(name = "name",  required = false, defaultValue = " ") String name,
			 @RequestParam(name = "password", required = false, defaultValue = " ") String password)
	
	throws Exception {
	DataAccess.establishConnection();
	DataAccess.LoadData();
	Map<String, Object> organization = DataAccess.getItemByPrimaryKey("organizations", name);
	System.out.println(name);
	System.out.println(password);
	if(organization != null){
	    if(organization.get("password").equals(password)){
		return "true";
	    }
	}
	return "false";
    }
}
