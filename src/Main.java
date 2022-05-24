import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planina planina = new Planina("Fruska Gora", "Srbija", 1000);


        ArrayList<Planinar> planinari = new ArrayList<>();
        planinari.add(new RekreativniPlaninar(45654, "Petar", "Petrovic", 4, "Srem", 2500));
        planinari.add(new RekreativniPlaninar(4515, "Ivan", "Ivanovic",5, "Backi", 3252));
        planinari.add(new RekreativniPlaninar(45154,"Zoran", "Zoranovic", 3, "Macvanski", 3000));

        planinari.add(new Alpinista(45154,"Goran", "Goranovic", 5, 1500));
        planinari.add(new Alpinista(4518, "Jelena", "Jelenovic", 7, 1500));
        planinari.add(new Alpinista(145, "Velja", "Veljovic", 6, 1500));

        double ukupnaClanarina = 0;
        for (Planinar pl: planinari) {
            pl.stampajPlaninar();
            System.out.println(pl.uspesnoSePopeoNaPlaninuPlaninar(planina));
            ukupnaClanarina += pl.vracaClanarimuPlaninar();
        }
        System.out.println(" Zbir svih clanarina je "+ ukupnaClanarina + " .");
    }
}
