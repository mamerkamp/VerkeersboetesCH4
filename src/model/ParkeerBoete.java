package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class ParkeerBoete extends VerkeersBoete{

    private int zone;

    public ParkeerBoete(String naamDader, String kentekenAuto, int zone) {
        super(naamDader, kentekenAuto);
        this.zone = zone;
        bepaalBedrag();
    }

    @Override
    public void bepaalBedrag(){
      if (zone == 1) {
          super.setBedrag(60.00);
      }
      if (zone == 2) {
          super.setBedrag(100.00);
      }
      if (zone == 3) {
          super.setBedrag(180.00);
      }

    }

    public String toString() {
        return String.format("%s, in zone %d", super.toString(), zone);
    }


    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
