package controller;

/*
*This is where requests to the server with the extension /del come
*This should probably be changed to a post or a put request, but now it is a get
* Used to delete organizations with the appropriate name parameter
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
public class deleteController{

    @GetMapping ("/del")
    public String delete(@RequestParam(name="name", required = true) String name)throws Exception{

		DataAccess.deleteItem("agencies", name);
		return "deleted";
    }
}
