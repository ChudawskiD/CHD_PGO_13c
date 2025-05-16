import java.util.ArrayList;
import java.util.List;

public class SystemRezerwacji {
    private List<Wydarzenie> wydarzenia;
    private List<Klient> klienci;

    public SystemRezerwacji() {
        this.wydarzenia = new ArrayList<>();
        this.klienci = new ArrayList<>();
    }

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            klient.dodajRezerwacje(wydarzenie);
        } else {
            System.out.println("Brak dostępnych miejsc na to wydarzenie.");
        }
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : klienci) {
            if (k.getNazwisko().equals(nazwisko)) {
                return k;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            System.out.println("Zmiana ceny wydarzenia \"" + nazwa + "\" z " + wydarzenie.getCena() + " zł na " + nowaCena + " zł.");
            wydarzenie.setCena(nowaCena);
        } else {
            System.out.println("Wydarzenie o nazwie \"" + nazwa + "\" nie zostało znalezione.");
        }
    }
}
