package BlogService;

import pojo.Article;
import pojo.Links;
import pojo.Rootuser;

public interface AriticleSerivice {
	void addariticle(Article ariticle);
	Article toeditor(int article_id);
	void toupdate(int article_id,Article article);
    void addlink(Links link);
    
	

}
