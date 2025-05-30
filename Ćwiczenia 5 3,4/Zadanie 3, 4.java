class Animal {
    public void makeNoise() {
        System.out.println("Zwierzę wydaje dźwięk.");
    }

    public void roam() {
        System.out.println("Zwierzę się przemieszcza.");
    }
}

class Feline extends Animal {
    public void roam() {
        System.out.println("Kocie zwierzę wędruje samotnie.");
    }
}

class Canine extends Animal {
    public void roam() {
        System.out.println("Piesowate zwierzę wędruje w grupie.");
    }
}

class Cat extends Feline {
    public void makeNoise() {
        System.out.println("Kot miauczy.");
    }
}

class Dog extends Canine {
    public void makeNoise() {
        System.out.println("Pies szczeka.");
    }
}

class Tiger extends Feline {
    public void makeNoise() {
        System.out.println("Tygrys ryczy.");
    }
}

class Wolf extends Canine {
    public void makeNoise() {
        System.out.println("Wilk wyje.");
    }
}

