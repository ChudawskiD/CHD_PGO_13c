
public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    // Gettery i settery
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public void setCena(double cena) {
        if (cena < 0) {
            System.out.println("Cena nie może być ujemna. Ustawiam cenę na 0.");
            this.cena = 0;
        } else {
            this.cena = cena;
        }
    }

    public double getCena() {
        return this.cena;
    }

    public void wyswietlInformacje() {
        System.out.println("Id: " + id);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Kategoria: " + kategoria);
        System.out.println("Cena: " + cena);
        System.out.println("Ilość w magazynie: " + iloscWMagazynie);
    }
}
