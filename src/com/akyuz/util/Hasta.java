package com.akyuz.util;

public class Hasta {
	private String name;
	private EnumHastalik hastalik;
	private EnumHastaDurumu durumu;
	
		public Hasta(String name, EnumHastalik hastalik, EnumHastaDurumu durumu) {

		this.name = name;
		this.hastalik = hastalik;
		this.durumu = durumu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnumHastalik getHastalik() {
		return hastalik;
	}

	public void setHastalik(EnumHastalik hastalik) {
		this.hastalik = hastalik;
	}

	public EnumHastaDurumu getDurumu() {
		return durumu;
	}

	public void setDurumu(EnumHastaDurumu durumu) {
		this.durumu = durumu;
	}
	
	

}
