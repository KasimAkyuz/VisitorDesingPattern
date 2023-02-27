package com.akyuz.app;

import com.akyuz.services.CovidHastaSayisiVisitor;
import com.akyuz.services.OlümHastaSayisiVisitor;
import com.akyuz.util.EnumHastaDurumu;
import com.akyuz.util.EnumHastalik;
import com.akyuz.util.Hasta;
import com.akyuz.util.Hastane;
import com.akyuz.util.Ülke;
import com.akyuz.util.İl;

public class Test {

	public static void main(String[] args) {

		Hasta KASIM = new Hasta("KASIM", EnumHastalik.COVİD, EnumHastaDurumu.AĞIR_HASTA);
		Hasta AHMET = new Hasta("AHMET", EnumHastalik.COVİD, EnumHastaDurumu.İYİLEŞTİ);
		Hasta MEHMET = new Hasta("MEHMET", EnumHastalik.COVİD, EnumHastaDurumu.AĞIR_HASTA);
		Hasta ALİ = new Hasta("ALİ", EnumHastalik.COVİD, EnumHastaDurumu.ÖLÜM);
		Hasta VELİ = new Hasta("VELİ", EnumHastalik.COVİD, EnumHastaDurumu.AĞIR_HASTA);

		Hastane bakirköy = new Hastane("Bakirköy");
		bakirköy.hastaEkle(KASIM);
		bakirköy.hastaEkle(AHMET);
		bakirköy.hastaEkle(MEHMET);
		bakirköy.hastaEkle(ALİ);
		bakirköy.hastaEkle(VELİ);
		
		İl İstanbul = new İl("İSTANBUL");
		İstanbul.hastaEkle(bakirköy);

		Ülke turkiye = new Ülke("Türkiye");
		turkiye.hastaEkle(İstanbul);
		

		raporYaz(turkiye);

	}

	private static void raporYaz(Ülke ulke) {
		CovidHastaSayisiVisitor hastaSayisiVisitor = new CovidHastaSayisiVisitor();
		String hastaSayisi = hastaSayisiVisitor.visitÜlke(ulke);
		OlümHastaSayisiVisitor ölHastaSayisiVisitor = new OlümHastaSayisiVisitor();
		String ölüsayisi= ölHastaSayisiVisitor.visitÜlke(ulke);
		 
		System.out.println("Hasta Sayisi :  "+hastaSayisi);
		System.out.println("Olum Sayisi  :  "+ölüsayisi);

	}

}
