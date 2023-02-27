package com.akyuz.util;
import java.util.ArrayList;
import java.util.List;

public class Ülke {
	private String adi;
	private List<İl> ilList;

	public Ülke(String adi) {
		this.adi = adi;
		ilList = new ArrayList<>();
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public List<İl> getIlList() {
		return ilList;
	}

	public void setIlList(List<İl> ilList) {
		this.ilList = ilList;
	}

	public void hastaEkle(İl il) {
		ilList.add(il);
	}
	
	public String accept(Visitor visitor) {
		return visitor.visitÜlke(this);
		
	}

}
