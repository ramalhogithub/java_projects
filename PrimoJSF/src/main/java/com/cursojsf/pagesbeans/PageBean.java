package com.cursojsf.pagesbeans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable{
	
	public enum Pages{
		page_a,page_b;
	}
	
	@Inject
	Flash flash;
	
	private String page;
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPage() {
		return page;
	}
	
	public void setPage(String page) {
		this.page = page;
	}
	
	public String processar() {
		//Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		
		flash.put("nomeUsuario", nome);
		return "result?faces-redirect=true";
	}
	
//	public String goTo() {
//		
//		String retorno = "";
//		
//		if("a".equals(page)) {
//			retorno = "page_a";
//		}else {
//			retorno = "page_b";
//		}
//		
//		return retorno;
//				
//		
//	}
	
	public Pages goTo() {
		
		Pages retorno = null;
		
		if("a".equals(page)) {
			retorno = Pages.page_a;
		}else {
			retorno = Pages.page_b;
		}
		
		return retorno;
				
		
	}	

}
