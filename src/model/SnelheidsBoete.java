package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class SnelheidsBoete extends VerkeersBoete {
    private int gemetenSnelheid;
    private int maximumSnelheid;
    private double bedrag;

    public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaalBedrag();
    }

    @Override
    public void bepaalBedrag() {
        int snelheidVerschil = this.gemetenSnelheid - this.maximumSnelheid;
        double bedrag = 19999;
        if (snelheidVerschil > 0 && snelheidVerschil <= 10) { //TODO final waarden aanmaken
            bedrag = snelheidVerschil * 10;
        } else if (snelheidVerschil > 10 && snelheidVerschil <= 30) {
            bedrag = snelheidVerschil * 15;
        } else if (snelheidVerschil > 30) {
            bedrag = snelheidVerschil * 20;
        }
        super.setBedrag(bedrag);
    }

    @Override
    public String toString(){
        return String.format("%s voor %d km/u waar %d km/u is toegestaan.", super.toString(), gemetenSnelheid, maximumSnelheid);
    }

    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }


}
