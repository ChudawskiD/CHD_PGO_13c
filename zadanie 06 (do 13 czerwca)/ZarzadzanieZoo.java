public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = {
                new Lew("Simba", 5, "krótka"),
                new Slon("Dumbo", 12, "brak", 2.5),
                new Orzel("Bielik", 3, 2.1),
                new Pingwin("Pingwinek", 2, 0.5, "cesarski"),
                new Waz("Żmija", 1, true),
                new Krokodyl("Rex", 6, false, 4.3)
        };

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println(z.wydajDzwiek());
            System.out.println(z.poruszajSie());
            z.wykonajSpecjalnaAkcje();
            System.out.println("-------");
        }
    }
}