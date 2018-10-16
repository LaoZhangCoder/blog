package mapper;

import java.util.List;

import pojo.Article;
import pojo.Categorye;
import pojo.Vo;

public interface CategoryMapper {
    List<Categorye> getCategory();
    int getallsize();
    List<Article> getthispagecontent(Vo vo);
    List<Article> getnewdata();
    List<Article> gettagdata(Vo vo);
    long getcoutbytag(Vo vo);
    List<Article> getdetailbyid(int id);
}
