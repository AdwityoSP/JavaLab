package app;

public class Mahasiswa {
	int NIM;
	String nama;
	String alamat;
	
	Mahasiswa(){}
	
	Mahasiswa(int NIM, String nama){
		this.NIM=NIM;
		this.nama=nama;
	}
	
	public void setNIM(int NIM) {
		this.NIM=NIM;
	}
	
	public void setNama(String nama) {
		this.nama=nama;
	}

	public int getNIM() {
		return this.NIM;
	}
	public String getNama() {
		return this.nama;
	}
}
