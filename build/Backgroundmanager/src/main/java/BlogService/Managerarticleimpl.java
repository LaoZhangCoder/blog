package BlogService;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Untils.MD5Utils;
import mapper.ArticleMapper;
import mapper.CategoryMapper;
import mapper.RootuserMapper;
import pojo.Article;
import pojo.ArticleExample;
import pojo.Rootuser;
import pojo.RootuserExample;
import pojo.ArticleExample.Criteria;
import pojo.Categorye;
import pojo.Resultdata;
@Service
public class Managerarticleimpl implements Managerarticle {
@Autowired
private ArticleMapper articlemapper;
@Autowired 
CategoryMapper cm;
@Autowired
private RootuserMapper rm;
	public List<Article> selectall() {
		// TODO Auto-generated method stub
		List<Article> list = articlemapper.selectByExample(null);
		
		return list;
	}
	public void deletebyid(int id) {
		ArticleExample example=new ArticleExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(id);
		// TODO Auto-generated method stub
		articlemapper.deleteByExample(example);
	}
	public void updatepassword(String oldPassword,String newPassword,String username) throws LoginException {
		// TODO Auto-generated method stub
		
		List<Rootuser> selectByExample = rm.selectByExample(null);
		Rootuser rootuser = selectByExample.get(0);
		String password = rootuser.getPassword();
		
		String md5oldPassword = MD5Utils.md5(oldPassword);
		String md5newPassword = MD5Utils.md5(newPassword);
		
		if(md5oldPassword.equals(password)) {
			rootuser.setPassword(md5newPassword);
			rootuser.setUsername(MD5Utils.md5(username));
			RootuserExample example1=new RootuserExample();
			pojo.RootuserExample.Criteria  a=example1.createCriteria();
			a.andPasswordEqualTo(password);
			rm.updateByExample(rootuser, example1);
		}else {
			throw new LoginException("danger change!");
		}
}
	public void getalldata(Resultdata data) {
		// TODO Auto-generated method stub
		List<Article> list = articlemapper.selectByExampleWithBLOBs(null);
		if(list!=null) {
		data.setList(list);
		data.setOk(true);}
		
	}
	public void getallcategory(Resultdata data) {
		// TODO Auto-generated method stub
		List<Categorye> category = cm.getCategory();
		if(category!=null) {
			data.setListcategory(category);
			data.setOk(true);}
	}
}