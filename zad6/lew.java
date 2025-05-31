 class Lew extends Zwierze {
    private String typGrzywy;

    public Lew(String nazwa, int wiek, String typGrzywy) {
        super(nazwa, wiek);
        this.typGrzywy = typGrzywy;
    }

    @Override
    public String wydajDzwiek() {
        return "Ryk";
    }

    @Override
    public String poruszajSie() {
        return "Biega na czterech łapach";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna";
    }

    public void poluj() {
        System.out.println(nazwa + " poluje w stadzie.");
    }
}
