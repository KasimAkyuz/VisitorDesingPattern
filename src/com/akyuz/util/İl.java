package com.akyuz.util;
import java.util.ArrayList;
import java.util.List;

public class İl{
	private String adi;
	private List<Hastane> hastaneList;
	
	
	public İl(String adi) {
		this.adi = adi;
		hastaneList = new ArrayList<>();
	}


	public String getAdi() {
		return adi;
	}


	public void setAdi(String adi) {
		this.adi = adi;
	}


	public List<Hastane> getHastaneList() {
		return hastaneList;
	}


	public void setHastaneList(List<Hastane> hastaneList) {
		this.hastaneList = hastaneList;
	}
	
	public void hastaEkle(Hastane hastane) {
		hastaneList.add(hastane);
	}
	
	public String accept(Visitor visitor) {
		return visitor.visitİl(this);
	}
	

}
