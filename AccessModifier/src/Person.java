public class Person {
    String name, address;
    
    public Person(String name, String address){
        super();
        this.name = name;
        this.address = address;
    }

    public Person(){
        super();
    }

    void greeting(){
        System.out.println("Hello my names " + name);
        System.out.println("I come from " + address);
    }
}
