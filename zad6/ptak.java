 class Orzel extends Zwierze {
    private double rozpiętośćSkrzydeł;

    public Orzel(String nazwa, int wiek, double rozpiętośćSkrzydeł) {
        super(nazwa, wiek);
        this.rozpiętośćSkrzydeł = rozpiętośćSkrzydeł;
    }

    @Override
    public String wydajDzwiek() {
        return "Pisk";
    }

    @Override
    public String poruszajSie() {
        return "Lata wysoko";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry";
    }

    public void szybuj() {
        System.out.println(nazwa + " szybuje nad doliną.");
    }
}
