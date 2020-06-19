package app;

public class KelasUtama {

	public static void main(String[] args) {
	Mahasiswa Unyil=new Mahasiswa(); //kita buat objek mhssw dgn nama Unyil
	Mahasiswa Usro=new Mahasiswa(); //kita buat objek mhssw dgn nama Usro

	Unyil.setNIM(15202201);
	Unyil.nama="Unyil Surunyil"; //melanggar prinsip OOP
	Unyil.setNama("Unyil Surunyil"); //seharusnya begini
	Usro.setNIM(15202202);
	
	Mahasiswa Ucrit=new Mahasiswa(15202204, "Ucrit");
	
	System.out.println("NIM mahasiswa 1 "+Unyil.getNIM());
	System.out.println("NIM mahasiswa 2 "+Usro.getNIM());
	System.out.println("NIM mahasiswa 3 "+Ucrit.getNIM()+
			"Nama "+Ucrit.getNama());
	}

}