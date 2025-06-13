abstract class Ssak extends Zwierze {
    protected String rodzajSiersci;

    public Ssak(String nazwa, int wiek, String rodzajSiersci) {
        super(nazwa, wiek);
        this.rodzajSiersci = rodzajSiersci;
    }

    public String getRodzajSiersci() {
        return rodzajSiersci;
    }
}

class Lew extends Ssak {
    public Lew(String nazwa, int wiek, String rodzajSiersci) {
        super(nazwa, wiek, rodzajSiersci);
    }

    @Override
    public String wydajDzwiek() {
        return "Ryczy: Roar!";
    }

    @Override
    public String poruszajSie() {
        return "Lew biega po sawannie.";
    }

    @Override
    public void wykonajSpecjalnaAkcje() {
        System.out.println("Lew poluje na antylopy.");
    }
}

class Slon extends Ssak {
    private double dlugoscTraby;

    public Slon(String nazwa, int wiek, String rodzajSiersci, double dlugoscTraby) {
        super(nazwa, wiek, rodzajSiersci);
        this.dlugoscTraby = dlugoscTraby;
    }

    public double getDlugoscTraby() {
        return dlugoscTraby;
    }

    @Override
    public String wydajDzwiek() {
        return "Trąbi: Pru!";
    }

    @Override
    public String poruszajSie() {
        return "Słoń powoli chodzi po dżungli.";
    }

    @Override
    public void wykonajSpecjalnaAkcje() {
        System.out.println("Słoń używa trąby do picia wody.");
    }
}