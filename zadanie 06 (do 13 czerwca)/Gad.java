abstract class Gad extends Zwierze {
    protected boolean jadowity;

    public Gad(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    public boolean isJadowity() {
        return jadowity;
    }
}

class Waz extends Gad {
    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek, jadowity);
    }

    @Override
    public String wydajDzwiek() {
        return "Wąż: Sss!";
    }

    @Override
    public String poruszajSie() {
        return "Wąż pełza po ziemi.";
    }

    @Override
    public void wykonajSpecjalnaAkcje() {
        if (jadowity) {
            System.out.println("Wąż kąsa i wstrzykuje jad.");
        } else {
            System.out.println("Wąż owija się wokół ofiary.");
        }
    }
}

class Krokodyl extends Gad {
    private double dlugosc;

    public Krokodyl(String nazwa, int wiek, boolean jadowity, double dlugosc) {
        super(nazwa, wiek, jadowity);
        this.dlugosc = dlugosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    @Override
    public String wydajDzwiek() {
        return "Krokodyl: Wrrr!";
    }

    @Override
    public String poruszajSie() {
        return "Krokodyl pływa w rzece.";
    }

    @Override
    public void wykonajSpecjalnaAkcje() {
        System.out.println("Krokodyl nurkuje pod wodę.");
    }
}
