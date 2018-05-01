package controller;

/*
*This is where requests to the server with the extension /changeBeds come to
* This should also not be a get request
* Used to change the number of beds available for a given organization
* 
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
public class bedController{

    @GetMapping("/changeBeds")
    public String changeBeds(@RequestParam(required = true) String name,
			     @RequestParam(required = true) String noOfBeds)throws Exception{
	System.out.println("KKKKKKKKKKKKKKKKK");
	DataAccess.changeBeds(name, noOfBeds);
	return "updated successfully";
    }
}

