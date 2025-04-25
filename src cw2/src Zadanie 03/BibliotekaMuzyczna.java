import java.util.ArrayList;

public class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    private ArrayList<String> utwory;
    private ArrayList<Playlista> playlisty;

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }


    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }


    public void usunUtwor(String utwor) {
        utwory.remove(utwor);
        for (Playlista p : playlisty) {
            p.usunUtwor(utwor);
        }
    }


    public void wyswietlUtwory() {
        System.out.println("Utwory w bibliotece:");
        for (String utwor : utwory) {
            System.out.println("  " + utwor);
        }
    }


    public void wyszukajUtwory(String haslo) {
        System.out.println("Wyniki wyszukiwania dla hasła \"" + haslo + "\":");
        utwory.stream()
                .filter(utwor -> utwor.toLowerCase().contains(haslo.toLowerCase()))
                .forEach(utwor -> System.out.println("  " + utwor));
    }


    public void utworzPlayliste(String nazwa) {
        if (znajdzPlayliste(nazwa) == null) {
            playlisty.add(new Playlista(nazwa));
        }
    }


    private Playlista znajdzPlayliste(String nazwa) {
        for (Playlista p : playlisty) {
            if (p.getNazwa().equals(nazwa)) {
                return p;
            }
        }
        return null;
    }


    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty) {
        Playlista p = znajdzPlayliste(nazwaPlaylisty);
        if (p != null && utwory.contains(utwor)) {
            p.dodajUtwor(utwor);
        }
    }


    public void wyswietlPlayliste(String nazwaPlaylisty) {
        Playlista p = znajdzPlayliste(nazwaPlaylisty);
        if (p != null) {
            p.wyswietl();
        } else {
            System.out.println("Playlista o nazwie \"" + nazwaPlaylisty + "\" nie istnieje.");
        }
    }


    public void wyswietlWszystkiePlaylisty() {
        System.out.println("Wszystkie playlisty:");
        for (Playlista p : playlisty) {
            System.out.println("  " + p.getNazwa());
        }
    }


    public int getLiczbaUtworow() {
        return utwory.size();
    }


    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}



