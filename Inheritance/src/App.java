// INHERITANCE
/* atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain. Sehingga bisa membuat class parent dan class child atau istilah lainnya yaitu super class dan sub class */
// Class Hero adalah super class/parent class/base class
// Class HeroStrenght dan HeroIntelligent adalah subclass/child class/derived class

public class App {
    public static void main(String[] args) throws Exception {
        
        Hero hero1 = new Hero();
        hero1.name = "Ucup";
        hero1.show();

        HeroStrenght hero2 = new HeroStrenght();
        hero2.name = "Udin";
        hero2.show();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Otong";
        hero3.show();
    }
}
