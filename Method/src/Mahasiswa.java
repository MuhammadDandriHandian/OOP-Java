public class Mahasiswa {
    // data member
    String nama;
    int umur;

    // constructor
    Mahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;

        System.out.println(nama);
        System.out.println(umur);
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("nama : " + this.nama);
        System.out.println("umur : " + this.umur);
    }

    // method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }
    int getUmur(){
        return this.umur;
    }

    // method dengan retrun dan dengan parameter
    String sayHi(String message){
        return message + " ,selamat beraktifitas " + this.nama;
    }
    
}
