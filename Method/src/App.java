public class App {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Dandri", 22);

        // panggil method
        mahasiswa1.show();

        //panggil method dengan parameter
        mahasiswa1.setNama("Apip");
        mahasiswa1.show();

        // panggil method dengan return tanpa parameter
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getUmur());

        // panggil method dengan retrun dan parameter
        String data = mahasiswa1.sayHi("Selamat Pagi");
        System.out.println(data);
    }
}
