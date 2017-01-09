/**
 * Created by Trevor Jackson on 01-Jan-2017.
 */
public class CarStats_JavaBeans_Pattern {
    private double weightInKiloGrams = 0.00;
    private Color primaryColor = Color.UNKNOWN;
    private Color secondaryColor = Color.UNKNOWN;
    private int milesPerGallon = 0;
    private double lengthInMillimeters = 0.00;
    private int brakeHorsePower = 0;
    private double zeroToSixty = 0.00;

    public CarStats_JavaBeans_Pattern() {
    }

    public void setWeightInKiloGrams(double weightInKiloGrams) {
        this.weightInKiloGrams = weightInKiloGrams;
    }

    public void setPrimaryColor(Color primaryColor) {
        this.primaryColor = primaryColor;
    }

    public void setSecondaryColor(Color secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void setLengthInMillimeters(double lengthInMillimeters) {
        this.lengthInMillimeters = lengthInMillimeters;
    }

    public void setBrakeHorsePower(int brakeHorsePower) {
        this.brakeHorsePower = brakeHorsePower;
    }

    public void setZeroToSixty(double zeroToSixty) {
        this.zeroToSixty = zeroToSixty;
    }
}
