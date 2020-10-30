//Alamat.java
package uts.pck1;
public class Alamat{
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
	
	
	
	/*tulis method toString() di sini*/
	/*Method toString() akan mengembalikan sebuah string, baca file Readme.md*/
	

	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Alamat){
			Alamat alamat = (Alamat) o;
			return (getNamaJalan().equalsIgnoreCase(alamat.getNamaJalan()) && getNmrJalan()== alamat.getNmrJalan() && getNamaKota().equals(alamat.getNamaKota()) );
		}
		return false;
	}
}