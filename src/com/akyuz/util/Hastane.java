package com.akyuz.util;
import java.util.ArrayList;
import java.util.List;

public class Hastane{
	private String adi;
	private List<Hasta> hastaList;
	
	
	public Hastane(String adi) {
		this.adi = adi;
		hastaList = new ArrayList<>();
	}


	public String getAdi() {
		return adi;
	}


	public void setAdi(String adi) {
		this.adi = adi;
	}


	public List<Hasta> getHastaList() {
		return hastaList;
	}


	public void setHastaList(List<Hasta> hastaList) {
		this.hastaList = hastaList;
	}
	
	public void hastaEkle(Hasta hasta) {
		hastaList.add(hasta);
	}
	public String accept(Visitor visitor) {
		return visitor.visitHastane(this);
	}
	
	
	

}
