public class Modely {
    private Modelar vlastnik;
    private String nazev;
    private int meritko;
    private int datumVyroby;

    private boolean jeZarazen;


    public Modely(Modelar vlastnik, String nazev, int meritko, int datumVyroby, boolean jeZarazen) {
        this.vlastnik = vlastnik;
        this.nazev = nazev;
        this.meritko = meritko;
        this.datumVyroby = datumVyroby;

        this.jeZarazen = jeZarazen;
    }

    public Modelar getVlastnik() {
        return vlastnik;
    }

    public void setVlastnik(Modelar vlastnik) {
        this.vlastnik = vlastnik;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getMeritko() {
        return meritko;
    }

    public void setMeritko(int meritko) {
        this.meritko = meritko;
    }

    public int getDatumVyroby() {
        return datumVyroby;
    }

    public void setDatumVyroby(int datumVyroby) {
        this.datumVyroby = datumVyroby;
    }


    public boolean getJeZarazen() {
        return jeZarazen;
    }

    public void setJeZarazen(boolean jeZarazen) {
        this.jeZarazen = jeZarazen;
    }
}
