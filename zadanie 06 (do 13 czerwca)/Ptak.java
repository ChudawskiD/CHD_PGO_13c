abstract class Ptak extends Zwierze {
    protected double rozpietoscSkrzydel;

    public Ptak(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    public double getRozpietoscSkrzydel() {
        return rozpietoscSkrzydel;
    }
}
class Orzel extends Ptak {
    public Orzel(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek, rozpietoscSkrzydel);
    }

    @Override
    public String wydajDzwiek() {
        return "Orzeł: Krii!";
    }

    @Override
    public String poruszajSie() {
        return "Orzeł szybując w powietrzu.";
    }

    @Override
    public void wykonajSpecjalnaAkcje() {
        System.out.println("Orzeł lata wysoko nad górami.");
    }
}

class Pingwin extends Ptak {
    private String gatunek;

    public Pingwin(String nazwa, int wiek, double rozpietoscSkrzydel, String gatunek) {
        super(nazwa, wiek, rozpietoscSkrzydel);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    @Override
    public String wydajDzwiek() {
        return "Pingwin: Kwa!";
    }

    @Override
    public String poruszajSie() {
        return "Pingwin ślizga się po lodzie brzuchem.";
    }

    @Override
    public void wykonajSpecjalnaAkcje() {
        System.out.println("Pingwin pływa pod wodą.");
    }
}
