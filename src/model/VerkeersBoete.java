package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class VerkeersBoete {
    private String naamDader;
    private String kentekenAuto;
    private double bedrag;

    private VerkeersBoete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = bedrag;
    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
    }

    public VerkeersBoete() {
    }

    public String toString() {
        return "Verkeersboete voor " + this.naamDader + ", kenteken " + this.kentekenAuto + ", " + this.bedrag + " euro";
    }

    public void bepaalBedrag() {

    }

//    public String getNaamDader() {
//        return naamDader;
//    }
//
//    public void setNaamDader(String naamDader) {
//        this.naamDader = naamDader;
//    }
//
//    public String getKentekenAuto() {
//        return kentekenAuto;
//    }
//
//    public void setKentekenAuto(String kentekenAuto) {
//        this.kentekenAuto = kentekenAuto;
//    }
//
//    public double getBedrag() {
//        return bedrag;
//    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;

    }
}
