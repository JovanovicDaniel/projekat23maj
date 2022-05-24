public class RekreativniPlaninar extends Planinar{
    private int tezinaOpremeRekreativniPlaninar;
    private String okrugRekreativniPlaninar;
    private int maksimalnUsponBezOpremeRekreativniPlaninar;
    private final static double clanarinaRekreativniPlaninar = 1000;


    public RekreativniPlaninar(int jedinstveniBrojPlaninar, String imePlaninar, String prezimePlaninar, int tezinaOpremeRekreativniPlaninar, String okrugRekreativniPlaninar, int maksimalnUsponBezOpremeRekreativniPlaninar) {
        super(jedinstveniBrojPlaninar, imePlaninar, prezimePlaninar);
        this.tezinaOpremeRekreativniPlaninar = tezinaOpremeRekreativniPlaninar;
        this.okrugRekreativniPlaninar = okrugRekreativniPlaninar;
        this.maksimalnUsponBezOpremeRekreativniPlaninar = maksimalnUsponBezOpremeRekreativniPlaninar;
    }

    public int getTezinaOpremeRekreativniPlaninar() {
        return tezinaOpremeRekreativniPlaninar;
    }

    public void setTezinaOpremeRekreativniPlaninar(int tezinaOpremeRekreativniPlaninar) {
        this.tezinaOpremeRekreativniPlaninar = tezinaOpremeRekreativniPlaninar;
    }

    public String getOkrugRekreativniPlaninar() {
        return okrugRekreativniPlaninar;
    }

    public void setOkrugRekreativniPlaninar(String okrugRekreativniPlaninar) {
        this.okrugRekreativniPlaninar = okrugRekreativniPlaninar;
    }

    public int getMaksimalnUsponBezOpremeRekreativniPlaninar() {
        return maksimalnUsponBezOpremeRekreativniPlaninar;
    }

    public void setMaksimalnUsponBezOpremeRekreativniPlaninar(int maksimalnUsponBezOpremeRekreativniPlaninar) {
        this.maksimalnUsponBezOpremeRekreativniPlaninar = maksimalnUsponBezOpremeRekreativniPlaninar;
    }

    public double getClanarinaRekreativniPlaninar() {
        return clanarinaRekreativniPlaninar;
    }

    public void ispisPodatakaOPlaninaru (){
        System.out.println("Rekreativac, id: " + super.getJedinstveniBrojPlaninar());
        System.out.println("ime: " + super.getImePlaninar() + " " + super.getPrezimePlaninar() + " Okrug: " + okrugRekreativniPlaninar);
    }


    @Override
    public String toString() {
        return "RekreativniPlaninar{" +
                "tezinaOpremeRekreativniPlaninar=" + tezinaOpremeRekreativniPlaninar +
                ", okrugRekreativniPlaninar='" + okrugRekreativniPlaninar + '\'' +
                ", maksimalnUsponBezOpremeRekreativniPlaninar=" + maksimalnUsponBezOpremeRekreativniPlaninar +
                ", clanarinaRekreativniPlaninar=" + clanarinaRekreativniPlaninar +
                '}';
    }

    public void stampajPlaninar() {
        System.out.println(getImePlaninar() + " " + getPrezimePlaninar());

    }

    public double vracaClanarimuPlaninar (){
        return clanarinaRekreativniPlaninar;
    }
    public boolean uspesnoSePopeoNaPlaninuPlaninar (Planina planina ) {

        boolean uspeh = false;
        int x = maksimalnUsponBezOpremeRekreativniPlaninar - (50 * tezinaOpremeRekreativniPlaninar);
        if (maksimalnUsponBezOpremeRekreativniPlaninar >= planina.getVisinaPlanina() && planina.getVisinaPlanina()<= x){
            uspeh = true;
        }
        return  uspeh;
    }
}
