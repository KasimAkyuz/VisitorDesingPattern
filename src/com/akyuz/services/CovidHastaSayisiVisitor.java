package com.akyuz.services;

import java.util.List;

import com.akyuz.util.EnumHastalik;
import com.akyuz.util.Hasta;
import com.akyuz.util.Hastane;
import com.akyuz.util.Visitor;
import com.akyuz.util.Ülke;
import com.akyuz.util.İl;

public class CovidHastaSayisiVisitor implements Visitor {

	@Override
	public String visitHastane(Hastane hastane) {
		int hastaSayisi = hastaSayisiHesapla(hastane);
		return String.valueOf(hastaSayisi);
	}

	@Override
	public String visitİl(İl il) {
		int hastaSayisi = hastaSayisiHesapla(il);
		return String.valueOf(hastaSayisi);
	}

	@Override
	public String visitÜlke(Ülke ülke) {
		int hastaSayisi = hastaSayisiHesapla(ülke);
		return String.valueOf(hastaSayisi);
	}

	private int hastaSayisiHesapla(Ülke ülke) {
		int hastaSayisi=0;
		
		List<İl> list =ülke.getIlList();
		for(İl il : list) {
		  hastaSayisi=hastaSayisi+hastaSayisiHesapla(il);
		}
		return hastaSayisi;
	}

	private int hastaSayisiHesapla(İl il) {
		int hastaSayisi =0;
		List<Hastane> list = il.getHastaneList();
		for(Hastane hastane : list) {
			hastaSayisi = hastaSayisi+ hastaSayisiHesapla(hastane);
		}
		return hastaSayisi;
		
	}

	private int hastaSayisiHesapla(Hastane hastane) {
		return HastaHesaplaUtil.hastaSayisiHesapla(hastane, EnumHastalik.COVİD);
		
	}

}
