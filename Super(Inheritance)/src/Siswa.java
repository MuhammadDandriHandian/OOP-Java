public class Siswa extends Mahasiswa {
    String name = "ini adalah siswa";

    void show(){
        // super.name akan memanggil dari super class/main class
        System.out.println("Nama : " + super.name);
        System.out.println("Nama Sekolah : " + this.name);
    }
    
}
