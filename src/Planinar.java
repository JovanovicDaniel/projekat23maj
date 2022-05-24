public abstract class Planinar {
    private int jedinstveniBrojPlaninar;
    private String imePlaninar;
    private String prezimePlaninar;

    public Planinar(int jedinstveniBrojPlaninar, String imePlaninar, String prezimePlaninar) {
        this.jedinstveniBrojPlaninar = jedinstveniBrojPlaninar;
        this.imePlaninar = imePlaninar;
        this.prezimePlaninar = prezimePlaninar;
    }

    public int getJedinstveniBrojPlaninar() {
        return jedinstveniBrojPlaninar;
    }

    public void setJedinstveniBrojPlaninar(int jedinstveniBrojPlaninar) {
        this.jedinstveniBrojPlaninar = jedinstveniBrojPlaninar;
    }

    public String getImePlaninar() {
        return imePlaninar;
    }

    public void setImePlaninar(String imePlaninar) {
        this.imePlaninar = imePlaninar;
    }

    public String getPrezimePlaninar() {
        return prezimePlaninar;
    }

    public void setPrezimePlaninar(String prezimePlaninar) {
        this.prezimePlaninar = prezimePlaninar;
    }

    public abstract void stampajPlaninar();

    public abstract double vracaClanarimuPlaninar ();

    public abstract boolean uspesnoSePopeoNaPlaninuPlaninar (Planina planina);
}
