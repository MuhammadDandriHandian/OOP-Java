public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Programmer("Udin", "Bandung", "java");
        person1.greeting();

        System.out.println(((Programmer)person1).technology);
    }
}
