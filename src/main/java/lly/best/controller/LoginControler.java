package lly.best.controller;





/**
 * 类描述: 
 * 修改人: 程文席
 * 修改时间: 2015-12-12 12:00
 * 修改备注: 
 * @version V1.0
 * @param <HttpServletResponse>
 */

public class LoginControler{
	
	private String username;  
	  
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
      
    public  String execute(){  
    	
        return "SUCCESS";  
        
    }  
}
