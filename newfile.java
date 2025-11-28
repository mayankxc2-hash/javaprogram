class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("Dog barks");
    }
}

public class newfile {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.barks();
    }
}
