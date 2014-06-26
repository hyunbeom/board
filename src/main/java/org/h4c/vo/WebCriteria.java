package org.h4c.vo;

import java.util.Arrays;

public class WebCriteria {

	private static int PER_PAGE = 10;
	
	private int pageno;
	private String keyword;
	private String[] types;
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	
	public int getStart() {

		return (this.pageno * PER_PAGE) - PER_PAGE;

	}

	public int getEnd() {

		return (this.pageno * PER_PAGE);

	}
	
	public String getTypesStr(){
		
		return Arrays.toString(this.types);
		
	}
	
	public String isChecked(String text, String defaultValue){
	      
	      if(types == null || types.length == 0){
	         return defaultValue;
	      }
	      
	      for(int i = 0; i < types.length; i++){
	         if(types[i].equals(text)){
	            return "checked";
	         }
	      }   
	      return defaultValue;
	   }
	
	@Override
	public String toString() {
		return "WebCriteria [pageno=" + pageno + ", keyword=" + keyword
				+ ", types=" + Arrays.toString(types) + "]";
	}
	
	
	
}

