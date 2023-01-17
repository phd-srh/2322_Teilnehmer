public class Teilnehmer {

    // Attributen
    private int teilnehmernummer;
    private String vorname;
    private String nachname;
    private int alter;
    private String fachgebiet;
    private int klasse;
    private double notenschnitt;

    public Teilnehmer(int teilnehmernummer, String vorname,
                      String nachname, int alter,
                      String fachgebiet, int klasse,
                      double notenschnitt) {
        this.teilnehmernummer = teilnehmernummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.fachgebiet = fachgebiet;
        this.klasse = klasse;
        this.notenschnitt = notenschnitt;
    }

    public int getTeilnehmernummer() {
        return teilnehmernummer;
    }

    public void setTeilnehmernummer(int teilnehmernummer) {
        this.teilnehmernummer = teilnehmernummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public double getNotenschnitt() {
        return notenschnitt;
    }

    public void setNotenschnitt(double notenschnitt) {
        this.notenschnitt = notenschnitt;
    }

    // Methoden
    public void ausgeben() {
        // TODO
    }

    public void eingeben() {
        // wie soll hier was eingegeben werden?
    }

    public boolean unterrichtBesuchen(String fach) {
        return false;
    }

    public int wieAlt() {
        return this.alter;
    }

    public void studieren() {
        System.out.println("jetzt wird studiert");
    }


}
