//Rumah.java
package uts.pck1;
public class Rumah{
	//atribut
	private Alamat alamat;
	private int tingkat;
	private int jmlKamarTidur;
	private int jmlKamarMandi;
	private double hargaSewaSetahun;
	private boolean statusSewa;
	
	//konstruktor
	public Rumah(){
		alamat=new Alamat();
		tingkat=1;
		jmlKamarTidur=2;
		jmlKamarMandi=1;
		hargaSewaSetahun=5000000;
		statusSewa=false;
	}
	public Rumah(Alamat alamat, int tingkat, int jmlKamarTidur, int jmlKamarMandi, double hargaSewaSetahun, boolean statusSewa){
		this.alamat=new Alamat(alamat);
		this.tingkat=tingkat;
		this.jmlKamarTidur=jmlKamarTidur;
		this.jmlKamarMandi=jmlKamarMandi;
		this.hargaSewaSetahun=hargaSewaSetahun;
		this.statusSewa=statusSewa;
		
	}
	public Rumah(Rumah r){
		alamat=new Alamat(r.alamat);
		tingkat=r.tingkat;
		jmlKamarTidur=r.jmlKamarTidur;
		jmlKamarMandi=r.jmlKamarMandi;
		hargaSewaSetahun=r.hargaSewaSetahun;
		statusSewa=r.statusSewa;
	}
	
	//setter
	public void setAlamat(Alamat alamat){
		this.alamat=alamat;
	}
	public void setTingkat(int tingkat){
		this.tingkat=tingkat;
	}
	public void setJmlKamarTidur(int jmlKamarTidur){
		this.jmlKamarTidur=jmlKamarTidur;
	}
	public void setJmlKamarMandi(int jmlKamarMandi){
		this.jmlKamarMandi=jmlKamarMandi;
	}
	public void setHargaSewaSetahun(double hargaSewaSetahun){
		this.hargaSewaSetahun=hargaSewaSetahun;
	}
	public void setStatusSewa(boolean statusSewa){
		this.statusSewa=statusSewa;
	}
	//getter
	public Alamat getAlamat(){
		return alamat;
	}
	public int getTingkat(){
		return tingkat;
	}
	public int getJmlKamarTidur( ){
		return jmlKamarTidur;
	}
	public int getJmlKamarMandi(){
		return jmlKamarMandi;
	}
	public double getHargaSewaSetahun(){
		return hargaSewaSetahun;
	}
	public boolean getStatusSewa( ){
		return statusSewa;
	}
	
	public double hitungHargaSewa(int tahun){
		return tahun*hargaSewaSetahun;
	}
	public String menyewa(int bulan){
		if (statusSewa==false){
			statusSewa=true;
			return("\nAnda bisa menyewa rumah selama "+ bulan+" bulan dengan membayar "+(hargaSewaSetahun/12)*bulan);
			
		}else{
			return("\nRumah tidak dapat disewa");
		}
	}
	
	public String toString(){
		return "Rumah "+tingkat+" tingkat, dengan "+jmlKamarTidur+" kamar tidur dan "+jmlKamarMandi+" kamar mandi"+ ", alamat:"+alamat+", harga sewa setahun: "+hargaSewaSetahun+", status:"+((statusSewa==true)?"sudah disewa":"belum disewa")+"";
	}
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object obj){
		if (obj instanceof Rumah){
			Rumah rumah = (Rumah) obj;
			return (getAlamat().equals(rumah.getAlamat()) && getTingkat()==rumah.getTingkat() && getJmlKamarTidur()== rumah.getJmlKamarTidur() && getJmlKamarMandi() == rumah.getJmlKamarMandi() && getHargaSewaSetahun()==rumah.getHargaSewaSetahun());
		}
		return false;
	}
}