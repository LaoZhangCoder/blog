package pojo;

import java.io.Serializable;
import java.util.List;

public class Resultdata implements Serializable{
	private boolean ok;
	private List<Article> list;
	private List<Categorye> listcategory;
	public List<Categorye> getListcategory() {
		return listcategory;
	}
	public void setListcategory(List<Categorye> listcategory) {
		this.listcategory = listcategory;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public List<Article> getList() {
		return list;
	}
	public void setList(List<Article> list) {
		this.list = list;
	}
	

}
