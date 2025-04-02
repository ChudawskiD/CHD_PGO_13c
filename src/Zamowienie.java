

public class Zamowienie {

    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double obliczWartoscZamowienia() {
        double wartoscZamowienia = 0.0;
        for (int i = 0; i < produkty.length; i++) {
            wartoscZamowienia += produkty[i].getCena() * ilosci[i];
        }
        return wartoscZamowienia;
    }


    public void zastosujZnizke() {
        if (klient.isCzyStaly()) {
            double wartoscZamowienia = obliczWartoscZamowienia();
            double znizka = 0.1;
            double nowaWartosc = wartoscZamowienia * (1 - znizka);
            System.out.println("Zastosowano zniżkę dla stałego klienta!");
            System.out.println("Wartość zamówienia po zniżce: " + nowaWartosc + " PLN");
        } else {
            System.out.println("Klient nie jest stały, brak zniżki.");
        }
    }


    public void wyswietlSzczegoly() {
        System.out.println("Identyfikator zamówienia: " + id);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        System.out.println("Data zamówienia: " + dataZamowienia);
        System.out.println("Status zamówienia: " + status);
        System.out.println("Produkty w zamówieniu: ");
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("- " + produkty[i].getNazwa() + " | Ilość: " + ilosci[i] + " | Cena: " + produkty[i].getCena());
        }
        System.out.println("Łączna wartość zamówienia: " + obliczWartoscZamowienia() + " PLN");
    }
}