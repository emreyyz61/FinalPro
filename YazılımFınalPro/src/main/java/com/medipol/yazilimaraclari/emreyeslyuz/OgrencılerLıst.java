package com.medipol.yazilimaraclari.emreyeslyuz;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class OgrencılerLıst {

	private List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

	public OgrencılerLıst() {
		
	}
	
	public OgrencılerLıst(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	
	public class Ogrenci {
		String ad, soyad;
		public String getAd() { return ad;}
		public String getSoyad() { return soyad;}
	}

	@RequestMapping("/ogrenci/listele")
	public List<Ogrenci> ogrenciListele() {
		return ogrenciler;
	}

	
	@RequestMapping(value="/ogrenci/olustur",method = RequestMethod.GET)
	public synchronized Ogrenci ogrenciOlustur(String ad, String soyad) {
		return ogrenciEkle(ogrenciler, ad, soyad);
	}
	
	
	
	public synchronized Ogrenci ogrenciOlusturPost(String ad, String soyad) {
		return ogrenciEkle(ogrenciler, ad, soyad);
	}
	
	protected Ogrenci ogrenciEkle(List<Ogrenci> liste, String ad, String soyad) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.ad=ad;
		ogrenci.soyad=soyad;
		liste.add(ogrenci);
		return ogrenci;
	}
}
