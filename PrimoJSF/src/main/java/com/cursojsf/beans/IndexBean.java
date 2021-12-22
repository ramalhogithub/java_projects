package com.cursojsf.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("bean")
@RequestScoped
public class IndexBean implements Serializable {
	
	public String getMensagem() {
		return "Esta é uma mensagem vinda do Bean!";
	}
	
	

}
