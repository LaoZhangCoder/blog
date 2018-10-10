package BlogService;

import java.util.List;

import javax.security.auth.login.LoginException;

import pojo.Article;

public interface Managerarticle {
public List<Article> selectall();
public void deletebyid(int id);
void updatepassword(String oldPassword,String newPassword,String username) throws LoginException;
}
