 class Waz extends Zwierze {
    private boolean jadowity;

    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    @Override
    public String wydajDzwiek() {
        return "Sykanie";
    }

    @Override
    public String poruszajSie() {
        return "Pełza";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungla";
    }

    public void polujNaOfiare() {
        System.out.println(nazwa + (jadowity ? " poluje z użyciem jadu." : " poluje przez duszenie."));
    }
}
