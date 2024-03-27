
// class dengan constructor
class Mahasiswa{
    String nama, jurusan;
    int nim;

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputJurusan, int inputNim){
        nama = inputNama;
        jurusan = inputJurusan;
        nim = inputNim;

        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(nim);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("dandri", "Teknik Informatika", 1011902);
        Mahasiswa mahasiswa2 = new Mahasiswa("Ucup", "Teknik Komunikasi", 237823728);
    }
}
