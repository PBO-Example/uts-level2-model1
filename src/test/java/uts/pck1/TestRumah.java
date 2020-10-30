//TestRumah.java
package uts.pck1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestRumah {

	Rumah rum;
	Alamat alamat;
	
	static Stream<Arguments> rumArray1() {
    return Stream.of(
        Arguments.of(new Alamat(),3,6,4,9000000,true),
        Arguments.of(new Alamat("Jalan Sutomo",7,"Tarutung"),2,4,2,4000000,false),
		Arguments.of(new Alamat("Jl. Patimura",20,"Gunungsitoli"),2,4,2,5000000,true)
    );}
	static Stream<Arguments> rumArray2() {
    return Stream.of(
        Arguments.of(new Rumah(new Alamat(),3,6,4,9000000,true)),
        Arguments.of(new Rumah(new Alamat("Jalan Sutomo",7,"Tarutung"),2,4,2,4000000,false)),
		Arguments.of(new Rumah(new Alamat("Jl. Patimura",20,"Gunungsitoli"),2,4,2,5000000,true))
    );}
	
	static Stream<Arguments> rumArray3() {
    return Stream.of(
        Arguments.of(new Alamat(),3,6,4,9000000,true,new Rumah(new Alamat(),3,6,4,9000000,true)),
        Arguments.of(new Alamat("Jalan Sutomo",7,"Tarutung"),2,4,2,4000000,false,new Rumah(new Alamat("Jalan Sutomo",7,"Tarutung"),2,4,2,4000000,false)),
		Arguments.of(new Alamat("Jl. Patimura",20,"Gunungsitoli"),2,4,2,5000000,true,new Rumah(new Alamat("Jl. Patimura",20,"Gunungsitoli"),2,4,2,5000000,true))
    );}

	static Stream<Arguments> rumArray4() {
    return Stream.of(
        Arguments.of(new Rumah(new Alamat(),3,6,4,9000000,true),"Rumah 3 tingkat, dengan 6 kamar tidur dan 4 kamar mandi, alamat:Jl. Rambutan No.1 Kota Besar, Sumatera Utara, harga sewa setahun: 9000000.0, status:sudah disewa"),
		
        Arguments.of(new Rumah(new Alamat("Jalan Sutomo",7,"Tarutung"),2,4,2,4000000,false),"Rumah 2 tingkat, dengan 4 kamar tidur dan 2 kamar mandi, alamat:Jalan Sutomo No.7 Tarutung, harga sewa setahun: 4000000.0, status:belum disewa"),
		
		Arguments.of(new Rumah(new Alamat("Jl. Patimura",20,"Gunungsitoli"),2,4,2,5000000,true),"Rumah 2 tingkat, dengan 4 kamar tidur dan 2 kamar mandi, alamat:Jl. Patimura No.20 Gunungsitoli, harga sewa setahun: 5000000.0, status:sudah disewa")
    );}
	
	static Stream<Arguments> rumArray5() {
    return Stream.of(
        Arguments.of(new Rumah(new Alamat(),3,6,4,9000000,true), 1, 9000000.00),
        Arguments.of(new Rumah(new Alamat("Jalan Sutomo",7,"Tarutung"),2,4,2,4000000,false), 2, 8000000.00),
		Arguments.of(new Rumah(new Alamat("Jl. Patimura",20,"Gunungsitoli"),2,4,2,5000000,true), 5, 25000000.00)
    );}
	
	static Stream<Arguments> rumArray6() {
    return Stream.of(
        Arguments.of(new Rumah(new Alamat(),3,6,4,9000000,true), 10, true, "\nRumah tidak dapat disewa"),
        Arguments.of(new Rumah(new Alamat("Jalan Sutomo",7,"Tarutung"),2,4,2,4000000,false), 6, true, "\nAnda bisa menyewa rumah selama 6 bulan dengan membayar 2000000.0"),
		Arguments.of(new Rumah(new Alamat("Jl. Patimura",20,"Gunungsitoli"),2,4,2,5000000,true), 5, true,"\nRumah tidak dapat disewa")
    );}
	
	
	@Test
	public void testKonstruktorI()
	{ 
		 rum = new Rumah();
		 assertEquals(new Alamat(),rum.getAlamat());
		 assertEquals(1, rum.getTingkat());
		 assertEquals(2, rum.getJmlKamarTidur());
		 assertEquals(1, rum.getJmlKamarMandi()); 
		 assertEquals(5000000, rum.getHargaSewaSetahun()); 
		 assertEquals(false, rum.getStatusSewa()); 
	}
	@ParameterizedTest
	@MethodSource("rumArray1")
	public void testKonstruktorII(Alamat jln, int tkt, int tdr, int mnd, int hrg, boolean sta) {
		rum = new Rumah(jln,tkt,tdr,mnd,hrg,sta);
		assertEquals(jln, rum.getAlamat());
		 assertEquals(tkt, rum.getTingkat());
		 assertEquals(tdr, rum.getJmlKamarTidur());
		 assertEquals(mnd, rum.getJmlKamarMandi()); 
		 assertEquals(hrg, rum.getHargaSewaSetahun()); 
		 assertEquals(sta, rum.getStatusSewa());  
	}

	@ParameterizedTest
	@MethodSource("rumArray2")
	public void testKopiKonstruktor(Rumah r) {
		rum = new Rumah(r);
		assertEquals(r.getAlamat(), rum.getAlamat());
		 assertEquals(r.getTingkat(), rum.getTingkat());
		 assertEquals(r.getJmlKamarTidur(), rum.getJmlKamarTidur());
		 assertEquals(r.getJmlKamarMandi(), rum.getJmlKamarMandi()); 
		 assertEquals(r.getHargaSewaSetahun(), rum.getHargaSewaSetahun()); 
		 assertEquals(r.getStatusSewa(), rum.getStatusSewa()); 
		 assertNotSame(r.getAlamat(), rum.getAlamat(),"should not point to same Object");
		 assertNotSame(r,rum, "should not point to same Object");
	}

	@ParameterizedTest
	@MethodSource("rumArray3")
	void testSetter(Alamat jln, int tkt, int tdr, int mnd, int hrg, boolean sta,Rumah r) {
		rum = new Rumah();
		rum.setAlamat(jln);
		rum.setTingkat(tkt);
		rum.setJmlKamarTidur(tdr);
		rum.setJmlKamarMandi(mnd);
		rum.setHargaSewaSetahun(hrg);
		rum.setStatusSewa(sta);
		assertEquals(r, rum); 
	}
	
	@ParameterizedTest
	@MethodSource("rumArray4")
	void testToString(Rumah r, String s) {
		assertThat(r.toString(), containsString(s));
	}
	
	@ParameterizedTest
	@MethodSource("rumArray5")
	void testHitungHargaSewa(Rumah r, int thn, double tot){
		assertEquals(tot, r.hitungHargaSewa(thn));
	}
	
	@ParameterizedTest
	@MethodSource("rumArray6")
	void testMenyewa(Rumah r, int bulan, boolean status, String psn){
		assertEquals(psn, r.menyewa(bulan));
		assertEquals(status, r.getStatusSewa());
	}
}