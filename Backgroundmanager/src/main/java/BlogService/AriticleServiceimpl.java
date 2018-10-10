package BlogService;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Untils.MD5Utils;
import mapper.ArticleMapper;
import mapper.LinksMapper;
import mapper.RootuserMapper;
import pojo.Article;
import pojo.ArticleExample;
import pojo.ArticleExample.Criteria;
import pojo.Links;
import pojo.Rootuser;
import pojo.RootuserExample;


@Service
public class AriticleServiceimpl implements AriticleSerivice {
@Autowired
private ArticleMapper ariticlemapper;
@Autowired
private LinksMapper linksmapper;

public void addariticle(Article ariticle) {
		// TODO Auto-generated method stub
		
		ariticle.setDate(new Date());
		
		ariticlemapper.insert(ariticle);
		
	}
	public Article toeditor(int article_id) {
		ArticleExample example =new ArticleExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(article_id);
		// TODO Auto-generated method stub
		List<Article> selectByExample = ariticlemapper.selectByExampleWithBLOBs(example);
		Article at=selectByExample.get(0);
		
		return at;
		
	}
	public void toupdate(int article_id,Article article) {
		article.setDate(new Date());
		
		ArticleExample example=new ArticleExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(article_id);
		List<Article> list = ariticlemapper.selectByExample(example);
		Article article2 = list.get(0);
		article.setBackimghref(article2.getBackimghref());
		 ariticlemapper.updateByExampleWithBLOBs(article, example);
		
		 
		
	}
	public void addlink(Links link) {
		// TODO Auto-generated method stub
		linksmapper.insert(link);
		
	}
	
		
		
		
	}
	


