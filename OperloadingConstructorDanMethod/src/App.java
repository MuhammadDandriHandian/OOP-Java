public class App {
    public static void main(String[] args) throws Exception {
        // overloading constructor
        Player player1 = new Player("Udin");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player("Ucup");

        player1.show();
        player2.show();
        player3.show();
        player4.show();
        player5.show();

        // overloading pada method
        int a = Matematika.tambah(3,4);
        System.out.println(a);
        double b = Matematika.tambah(4, 3.2);
        System.out.println(b);
        double c = Matematika.tambah(3.8, 3.2);
        System.out.println(c);

    }
}
