class Animal {
    public void sleep() {
        System.out.println("Zwierzę śpi.");
    }

    public void makeNoise() {
        System.out.println("Zwierzę wydaje dźwięk.");
    }

    public void roam() {
        System.out.println("Zwierzę się przemieszcza.");
    }
}

class Feline extends Animal {
    public void roam() {
        System.out.println("Zwierzę z rodziny kotowatych wędruje.");
    }
}

class Canine extends Animal {
    public void roam() {
        System.out.println("Zwierzę z rodziny psowatych wędruje.");
    }
}

class Lion extends Feline {
    public void makeNoise() {
        System.out.println("Lew ryczy.");
    }
}

class Cat extends Feline {
    public void makeNoise() {
        System.out.println("Kot miauczy.");
    }
}

class Wolf extends Canine {
    public void makeNoise() {
        System.out.println("Wilk wyje.");
    }
}

class Dog extends Canine {
    public void makeNoise() {
        System.out.println("Pies szczeka.");
    }
}
