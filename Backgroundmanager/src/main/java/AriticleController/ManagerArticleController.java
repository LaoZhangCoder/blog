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
import pojo.Vo;

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
	public Resultdata getdata(String tag,int thispage) {
		Resultdata resultdata = new Resultdata();
		managerticle.getthispageitem(resultdata,tag,thispage);
		return resultdata;
		
	} 
	@RequestMapping(value="/homedatacategory")
	@ResponseBody
	public Resultdata getcategory() {
		Resultdata resultdata = new Resultdata();
		managerticle.getallcategory(resultdata);
		return resultdata;
		
	} 
	@RequestMapping(value="/getcount")
	@ResponseBody
	public long getitemcount() {
		
		long getcount = managerticle.getcount();
		return getcount;
		
	} 
	@RequestMapping(value="/newarticle")
	@ResponseBody
	public Resultdata getnewitems() {
		Resultdata resultdata = new Resultdata();
	 managerticle.getnewsarticle(resultdata);
	return resultdata;
	 
		
		
	} 
	@RequestMapping(value="/Category")
	@ResponseBody
	public Resultdata gettagdata(String tag,int thispage) {
		Resultdata resultdata = new Resultdata();
		
		 managerticle.gettagdata(tag, thispage, resultdata);
		
		return resultdata;
	}
	@RequestMapping(value="/Category/count")
	@ResponseBody
	public long getcategorycount(String tag) {
		long getcount = managerticle.getcountbytag(tag);
		return getcount;
		
	} 
	@RequestMapping(value="/Category/detail")
	@ResponseBody
	public Article getdetailbyid(int id) {
	 Article article = managerticle.getdetailbyid(id);
		return article;
		
	} 
	
}
