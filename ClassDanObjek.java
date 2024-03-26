
// membuat class sebagai template
class Mahasiswa{
    String nama, jurusan;
    int umur, nim;
}

public class ClassDanObjek {

    public static void main(String[] args) {

        // instansiasi objek / membuat objek 
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ucup";
        mahasiswa1.umur = 21;
        mahasiswa1.jurusan = "Komunikasi";
        mahasiswa1.nim = 10115049;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.nim);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Udin";
        mahasiswa2.umur = 21;
        mahasiswa2.jurusan = "Desain";
        mahasiswa2.nim = 10115433;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.umur);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.nim);
        
    }
}