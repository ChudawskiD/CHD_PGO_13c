import java.util.ArrayList;

public class Playlista {
    private String nazwa;
    private ArrayList<String> utwory;

    public Playlista(String nazwa) {
        this.nazwa = nazwa;
        this.utwory = new ArrayList<>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }

    public void usunUtwor(String utwor) {
        utwory.remove(utwor);
    }

    public void wyswietl() {
        System.out.println("Playlista: " + nazwa);
        if (utwory.isEmpty()) {
            System.out.println("  (brak utworów)");
        } else {
            for (String utwor : utwory) {
                System.out.println("  " + utwor);
            }
        }
    }
}

