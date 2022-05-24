public class Planina {
    private String imePlanina;
    private String drzavaPlanina;
    private int visinaPlanina;

    public Planina() {

    }

    public Planina(String imePlanina, String drzavaPlanina, int visinaPlanina) {
        this.imePlanina = imePlanina;
        this.drzavaPlanina = drzavaPlanina;
        this.visinaPlanina = visinaPlanina;
    }

    public String getImePlanina() {
        return imePlanina;
    }

    public void setImePlanina(String imePlanina) {
        this.imePlanina = imePlanina;
    }

    public String getDrzavaPlanina() {
        return drzavaPlanina;
    }

    public void setDrzavaPlanina(String drzavaPlanina) {
        this.drzavaPlanina = drzavaPlanina;
    }

    public int getVisinaPlanina() {
        return visinaPlanina;
    }

    public void setVisinaPlanina(int visinaPlanina) {
        this.visinaPlanina = visinaPlanina;
    }

    @Override
    public String toString() {
        return "Planina{" +
                "imePlanina='" + imePlanina + '\'' +
                ", drzavaPlanina='" + drzavaPlanina + '\'' +
                ", visinaPlanina=" + visinaPlanina +
                '}';
    }
}
