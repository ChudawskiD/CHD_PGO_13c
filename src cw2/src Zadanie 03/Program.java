public class Program {
    public static void main(String[] args) {
        BibliotekaMuzyczna mojaBiblioteka = new BibliotekaMuzyczna("Kolekcja Rockowa", "Jan Kowalski");

        mojaBiblioteka.dodajUtwor("Led Zeppelin - Stairway to Heaven");
        mojaBiblioteka.dodajUtwor("Queen - Bohemian Rhapsody");
        mojaBiblioteka.dodajUtwor("Pink Floyd - Comfortably Numb");
        mojaBiblioteka.dodajUtwor("AC/DC - Back in Black");
        mojaBiblioteka.dodajUtwor("Metallica - Nothing Else Matters");

        mojaBiblioteka.wyswietlUtwory();

        mojaBiblioteka.utworzPlayliste("Moje ulubione");
        mojaBiblioteka.utworzPlayliste("Na fajną imprezę");

        mojaBiblioteka.dodajUtworDoPlaylisty("Queen - Bohemian Rhapsody", "Moje ulubione");
        mojaBiblioteka.dodajUtworDoPlaylisty("Pink Floyd - Comfortably Numb", "Moje ulubione");
        mojaBiblioteka.dodajUtworDoPlaylisty("AC/DC - Back in Black", "Na fajną imprezę");
        mojaBiblioteka.dodajUtworDoPlaylisty("Metallica - Nothing Else Matters", "Na fajną imprezę");

        mojaBiblioteka.wyswietlWszystkiePlaylisty();
        mojaBiblioteka.wyswietlPlayliste("Moje ulubione");

        mojaBiblioteka.wyszukajUtwory("Queen");

        mojaBiblioteka.usunUtwor("AC/DC - Back in Black");
        mojaBiblioteka.wyswietlPlayliste("Na fajną imprezę");

        System.out.println("Łączna liczba utworów w bibliotece: " + mojaBiblioteka.getLiczbaUtworow());
        System.out.println("Łączna liczba playlist: " + mojaBiblioteka.getLiczbaPlaylist());
    }
}
