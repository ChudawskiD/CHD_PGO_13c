public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Tiger(),
                new Wolf()
        };

        for (Animal a : animals) {
            a.makeNoise();
            a.roam();
            System.out.println();
        }
    }
}