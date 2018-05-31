package com.medipol.yazilimaraclari.emreyeslyuz;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class OgrencılerSıl {

	private List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

	public OgrencılerSıl() {
		
	}
	
	public OgrencılerSıl(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	
	public class Ogrenci {
		String ad, soyad;
		public String getAd() { return ad;}
		public String getSoyad() { return soyad;}
	}

	
	protected Ogrenci ogrenciEkle(List<Ogrenci> liste, String ad, String soyad) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.ad=ad;
		ogrenci.soyad=soyad;
		liste.add(ogrenci);
		return ogrenci;
	}
}
