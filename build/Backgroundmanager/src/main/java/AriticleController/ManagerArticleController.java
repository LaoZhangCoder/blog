package AriticleController;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import BlogService.Managerarticle;
import pojo.Article;
import pojo.Resultdata;

@Controller
public class ManagerArticleController {
	@Autowired
	private Managerarticle managerticle;
	@RequestMapping(value="/Mangermentarticles")
	public String Manager(Model model) {
		List<Article> list = managerticle.selectall();
		model.addAttribute("list", list);
	
		return "ManagerPage";
		
	}
	@RequestMapping(value="/Deletearticle")
	public String deletebyid(int id) {
		managerticle.deletebyid(id);
		return "redirect:/Mangermentarticles";
		
	}
	@RequestMapping(value="/topassword")
	public String topasswordpage() {
	
		return "password";
		
	}
	@RequestMapping(value="/updatepassword")
	public String updatepassword(String oldPassword,String newPassword,String username) throws LoginException {
	managerticle.updatepassword(oldPassword, newPassword,username);
		return "redirect:/topassword";
		
	}
	@RequestMapping(value="/homedata")
	@ResponseBody
	public Resultdata getdata() {
		Resultdata resultdata = new Resultdata();
		managerticle.getalldata(resultdata);
		
		return resultdata;
		
	} 
	@RequestMapping(value="/homedatacategory")
	@ResponseBody
	public Resultdata getcategory() {
		Resultdata resultdata = new Resultdata();
		managerticle.getallcategory(resultdata);
		return resultdata;
		
	} 
	
}
