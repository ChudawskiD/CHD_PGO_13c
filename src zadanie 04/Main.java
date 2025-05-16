public class Main {
  public static void main(String[] args) {
    SystemRezerwacji system = new SystemRezerwacji();

    Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
    Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0, "15.06.2025");
    Wydarzenie wystawa = new Wydarzenie("Wystawa sztuki", 50.0, "20.06.2025", "Galeria Miejska");

    system.dodajWydarzenie(koncert);
    system.dodajWydarzenie(teatr);
    system.dodajWydarzenie(wystawa);

    Klient klient1 = new Klient("Bartek", "Nowaczkiewicz", "bartek@example.com");
    Klient klient2 = new Klient("Beata", "Nosowska", "beata@example.com");
    system.dodajKlienta(klient1);
    system.dodajKlienta(klient2);

    system.dokonajRezerwacji(klient1, koncert);
    system.dokonajRezerwacji(klient1, teatr);
    system.dokonajRezerwacji(klient2, koncert);

    Wydarzenie koncertRef = system.znajdzWydarzenie("Koncert Symphony");
    System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");
      koncertRef.setCena(150.0);

    System.out.println("\nRezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + " po zmianie ceny:");
    klient1.wyswietlRezerwacje();

    System.out.println("\nRezerwacje klienta " + klient2.getImie() + " " + klient2.getNazwisko() + " po zmianie ceny:");
    klient2.wyswietlRezerwacje();

    System.out.println("\nKlient " + klient1.getImie() + " anuluje rezerwację na teatr:");
    klient1.anulujRezerwacje(teatr);
    klient1.wyswietlRezerwacje();

    System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostepneMiejsca() + " z " + koncert.getMaxLiczbaMiejsc());
  }
}
