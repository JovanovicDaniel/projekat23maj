public class Alpinista extends Planinar{
    private int poeniAlpinista;
    private final static int maxUsponAlpinista = 4000;
    public double clanarinaAlpinista = 1500;

    public Alpinista(int jedinstveniBrojPlaninar, String imePlaninar, String prezimePlaninar, int poeniAlpinista, double clanarinaAlpinista) {
        super(jedinstveniBrojPlaninar, imePlaninar, prezimePlaninar);
        this.poeniAlpinista = poeniAlpinista;
        this.clanarinaAlpinista = clanarinaAlpinista;
    }

    public int getPoeniAlpinista() {
        return poeniAlpinista;
    }

    public void setPoeniAlpinista(int poeniAlpinista) {
        this.poeniAlpinista = poeniAlpinista;
    }

    public int getMaxUsponAlpinista() {
        return maxUsponAlpinista;
    }

    public double getClanarinaAlpinista() {
        return clanarinaAlpinista;
    }

    public void setClanarinaAlpinista(double clanarinaAlpinista) {
        this.clanarinaAlpinista = clanarinaAlpinista;
    }

    public double promenaPoenaAlpinista(double poeniAlpinista){
        clanarinaAlpinista = clanarinaAlpinista * 1.0 / ( 2 * poeniAlpinista);
        return clanarinaAlpinista;
    }

    @Override
    public String toString() {
        return "Alpinista{" +
                "poeniAlpinista=" + poeniAlpinista +
                ", maxUsponAlpinista=" + maxUsponAlpinista +
                ", clanarinaAlpinista=" + clanarinaAlpinista +
                '}';
    }

    public void stampajPlaninar(){
        System.out.println(getImePlaninar() + " " + getPrezimePlaninar());
    }

    @Override
    public double vracaClanarimuPlaninar() {
        clanarinaAlpinista = clanarinaAlpinista - (50 * poeniAlpinista);
        return clanarinaAlpinista;
    }

    public boolean uspesnoSePopeoNaPlaninuPlaninar (Planina planina) {
        boolean uspeh = false;
        if (planina.getVisinaPlanina()<= 4000){
            uspeh= true;
        }
        return uspeh;
    }
}