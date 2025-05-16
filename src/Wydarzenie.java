public class Wydarzenie {
    private String nazwa;
    private double cena;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca;

    public Wydarzenie(String nazwa, double cena) {
        this(nazwa, cena, "01.01.2025", "Hala Widowiskowa");
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena, data, "Hala Widowiskowa");
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
        this.dostepneMiejsca = this.maxLiczbaMiejsc;
    }

    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }

    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getMiejsce() { return miejsce; }
    public void setMiejsce(String miejsce) { this.miejsce = miejsce; }

    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public int getDostepneMiejsca() { return dostepneMiejsca; }

    public boolean zarezerwujMiejsce() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
            return true;
        }
        return false;
    }

    public String toString() {
        return nazwa + " (" + data + " w miejscu " + miejsce + ") - " + cena + " zł";
    }
}
