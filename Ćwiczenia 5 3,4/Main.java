public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();
        Dog dog = new Dog();

        lion.makeNoise();
        cat.makeNoise();
        wolf.makeNoise();
        dog.makeNoise();

        lion.sleep();
        cat.roam();
    }}