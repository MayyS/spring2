package test;

public class Animal {
    private String name="animal";
    public Animal(){
        a();
    }
    public void a(){
        System.out.println("animal="+name);
    }
}

class Dog extends Animal{
    private String name="animal";
    public void a(){
        System.out.println("dog name="+name);
    }
    public Dog(){
        System.out.println("Dog");

    }

    public static void main(String[] args){
        Animal animal=new Dog();
         animal.a();
    }
}