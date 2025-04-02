

import java.time.LocalDate;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];  // Tablica produktów
    private Klient[] klienci = new Klient[10];      // Tablica klientów
    private Zamowienie[] zamowienia = new Zamowienie[10]; // Tablica zamówień
    private int liczbaProduktow = 0;  // Liczba produktów w sklepie
    private int liczbaKlientow = 0;   // Liczba klientów w sklepie
    private int liczbaZamowien = 0;   // Liczba zamówień


    public int liczbaZamowien() {
        return liczbaZamowien;
    }


    public void dodajProdukt(Produkt produkt) {
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow] = produkt;
            liczbaProduktow++;
        } else {
            System.out.println("Brak miejsca na nowy produkt.");
        }
    }


    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow] = klient;
            liczbaKlientow++;
        } else {
            System.out.println("Brak miejsca na nowego klienta.");
        }
    }


    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produktyZamowienia, int[] ilosciZamowienia) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setId(liczbaZamowien + 1);
        zamowienie.setKlient(klient);
        zamowienie.setProdukty(produktyZamowienia);
        zamowienie.setIlosci(ilosciZamowienia);
        zamowienie.setDataZamowienia(LocalDate.now().toString());
        zamowienie.setStatus("Nowe");

        if (liczbaZamowien < zamowienia.length) {
            zamowienia[liczbaZamowien] = zamowienie;
            liczbaZamowien++;
        } else {
            System.out.println("Brak miejsca na nowe zamówienie.");
        }

        return zamowienie;
    }


    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        Produkt[] produktyZamowienia = zamowienie.getProdukty();
        int[] ilosci = zamowienie.getIlosci();

        for (int i = 0; i < produktyZamowienia.length; i++) {
            for (int j = 0; j < liczbaProduktow; j++) {
                if (produkty[j].getId() == produktyZamowienia[i].getId()) {
                    produkty[j].setIloscWMagazynie(produkty[j].getIloscWMagazynie() - ilosci[i]);
                    break;
                }
            }
        }
    }


    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
                break;
            }
        }
    }


    public void wyswietlProduktyWKategorii(String kategoria) {
        System.out.println("Produkty w kategorii: " + kategoria);
        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].getKategoria().equalsIgnoreCase(kategoria)) {
                produkty[i].wyswietlInformacje();
            }
        }
    }


    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("Zamówienia klienta o ID: " + idKlienta);
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getKlient().getId() == idKlienta) {
                zamowienia[i].wyswietlSzczegoly();
            }
        }
    }
}

