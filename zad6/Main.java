//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Lew Afrykański", 5, "Gęsta grzywa");
        Zwierze orzel = new Orzel("Orzeł Bielik", 3, 2.2);
        Zwierze waz = new Waz("Pyton", 4, false);

        Zwierze[] zoo = {lew, orzel, waz};

        for (Zwierze z : zoo) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Ruch: " + z.poruszajSie());
            System.out.println("Środowisko: " + z.srodowiskoNaturalne());
            System.out.println();
        }


        ((Lew)lew).poluj();
        ((Orzel)orzel).szybuj();
        ((Waz)waz).polujNaOfiare();
    }
}
