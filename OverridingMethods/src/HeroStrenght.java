public class HeroStrenght extends Hero {
    double strenght;
    
    // ini overriding
    // klo gak ada method di subclass ini maka methodnya akan pake yg ada di main class
    void show(){
        System.out.println("Hero : " + name);
        System.out.println("Hero Strenght : " + strenght);
    }
}
