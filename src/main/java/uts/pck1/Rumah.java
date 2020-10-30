//Rumah.java
package uts.pck1;
public class Rumah{
	//atribut
	/*deklarasikan atribut di sini*/
	
	//konstruktor
	/*tulis konstruktor tanpa parameter di sini*/
	
	
	/*tulis konstruktor dengan  parameter di sini*/
	
	
	/*tulis kopi konstruktor di sini*/
	
	//setter
	/*tulis semua setter di sini*/
	
	
	
	
	//getter
	/*tulis semua getter di sini*/
	
	
	/*tulis method hitungHargaSewa() di sini*/
	/*Method hitungHargaSewa() akan mengembalikan perkalian tahun dengan hargaSewaSetahun*/
	
	
	/*tulis method menyewa() di sini*/
	/*Method menyewa() akan mengembalikan sebuah string, baca file Readme.md*/
	
	
	/*tulis method toString() di sini*/
	/*Method toString() akan mengembalikan sebuah string, baca file Readme.md*/
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object obj){
		if (obj instanceof Rumah){
			Rumah rumah = (Rumah) obj;
			return (getAlamat().equals(rumah.getAlamat()) && getTingkat()==rumah.getTingkat() && getJmlKamarTidur()== rumah.getJmlKamarTidur() && getJmlKamarMandi() == rumah.getJmlKamarMandi() && getHargaSewaSetahun()==rumah.getHargaSewaSetahun());
		}
		return false;
	}
}