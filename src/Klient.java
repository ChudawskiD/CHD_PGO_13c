import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private List<Wydarzenie> rezerwacje;

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.rezerwacje = new ArrayList<>();
    }

    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }
    public String getEmail() { return email; }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        rezerwacje.add(wydarzenie);
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        if (rezerwacje.remove(wydarzenie)) {
            System.out.println("Rezerwacja na wydarzenie \"" + wydarzenie.getNazwa() + "\" została anulowana.");
        } else {
            System.out.println("Rezerwacja na wydarzenie \"" + wydarzenie.getNazwa() + "\" nie została znaleziona.");
        }
    }

    public void wyswietlRezerwacje() {
        if (rezerwacje.isEmpty()) {
            System.out.println("Brak rezerwacji.");
        } else {
            for (Wydarzenie w : rezerwacje) {
                System.out.println(w);
            }
        }
    }
}
