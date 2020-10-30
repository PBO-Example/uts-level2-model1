//Alamat.java
package uts.pck1;
public class Alamat{
	//atribut
	private String namaJalan;
	private int nmrJalan;
	private String namaKota;
	
	//konstruktor
	public Alamat(){
		namaJalan = "Jl. Rambutan";
		nmrJalan = 1;
		namaKota= "Kota Besar, Sumatera Utara";
	}
	public Alamat(String namaJalan, int nmrJalan, String namaKota){
		this.namaJalan = namaJalan;
		this.nmrJalan = nmrJalan;
		this.namaKota= namaKota;
	}
	public Alamat(Alamat a){
		namaJalan = a.namaJalan;
		nmrJalan = a.nmrJalan;
		namaKota= a.namaKota;
	}
	//setter
	public void setNamaJalan(String namaJalan){
		this.namaJalan = namaJalan;
	}
	public void setNmrJalan(int nmrJalan){
		this.nmrJalan = nmrJalan;
	}
	public void setNamaKota(String namaKota){
		this.namaKota = namaKota;
	}
	//getter
	public String getNamaJalan(){
		return namaJalan;
	}
	public int getNmrJalan(){
		return nmrJalan;
	}
	public String getNamaKota(){
		return namaKota;
	}
	public String toString(){
		return namaJalan+" No."+nmrJalan+ " "+namaKota;
	}
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Alamat){
			Alamat alamat = (Alamat) o;
			return (getNamaJalan().equalsIgnoreCase(alamat.getNamaJalan()) && getNmrJalan()== alamat.getNmrJalan() && getNamaKota().equals(alamat.getNamaKota()) );
		}
		return false;
	}
}