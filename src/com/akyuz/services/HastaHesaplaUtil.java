package com.akyuz.services;

import java.util.Iterator;
import java.util.List;

import com.akyuz.util.EnumHastaDurumu;
import com.akyuz.util.EnumHastalik;
import com.akyuz.util.Hasta;
import com.akyuz.util.Hastane;

public class HastaHesaplaUtil {
	
	public static int hastaSayisiHesapla(Hastane hastane,EnumHastalik hastalik) {
		int hastaSayisi=0;
		List<Hasta> list=hastane.getHastaList();
		for(Hasta hasta : list) {
			if(hastalik.equals(hasta.getHastalik()))
				hastaSayisi++;
		}
		
		return hastaSayisi;
	}
	
	public static int hastaSayisiHesapla(Hastane hastane,EnumHastalik hastalik,EnumHastaDurumu hastaDurumu) {
		int hastaSayisi=0;
		List<Hasta> list=hastane.getHastaList();
		for(Hasta hasta : list) {
			if(hastalik.equals(hasta.getHastalik()))
				if(hastaDurumu.equals(hasta.getDurumu()))
					hastaSayisi++;
		}
		
		return hastaSayisi;
	}

}
