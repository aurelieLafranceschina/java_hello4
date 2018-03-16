package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Human();
        System.out.println(animal1.sayHello());
        System.out.println(animal2.sayHello());
    }
}



