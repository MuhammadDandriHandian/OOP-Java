// membuat class untuk template
class Mahasiswa{
    String nama, jurusan;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi / membuat objek
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Dandri";
        mahasiswa.umur = 21;
        mahasiswa.jurusan = "Teknik Komunikasi";

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.jurusan);
        System.out.println(mahasiswa.umur);
        
        // membuat objek 2
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Udin";
        mahasiswa2.umur = 22;
        mahasiswa2.jurusan = "Desain Informatika";

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.umur);
    }
    
}
