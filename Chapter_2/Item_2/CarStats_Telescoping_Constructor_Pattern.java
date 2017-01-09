/**
 * Created by Trevor Jackson on 01-Jan-2017.
 */
public class CarStats_Telescoping_Constructor_Pattern {
    private final double weightInKiloGrams;
    private final Color primaryColor;
    private final Color secondaryColor;
    private final int milesPerGallon;
    private final double lengthInMillimeters;
    private final int brakeHorsePower;
    private final double zeroToSixty;


    public CarStats_Telescoping_Constructor_Pattern(double weightInKiloGrams) {
        this(weightInKiloGrams, Color.UNKNOWN);
    }

    public CarStats_Telescoping_Constructor_Pattern(double weightInKiloGrams, Color primaryColor) {
        this(weightInKiloGrams, primaryColor, Color.UNKNOWN);
    }

    public CarStats_Telescoping_Constructor_Pattern(double weightInKiloGrams, Color primaryColor, Color secondaryColor) {
        this(weightInKiloGrams, primaryColor, secondaryColor, 0);
    }

    public CarStats_Telescoping_Constructor_Pattern(double weightInKiloGrams, Color primaryColor, Color secondaryColor, int milesPerGallon) {
        this(weightInKiloGrams, primaryColor, secondaryColor, milesPerGallon, 0.00);
    }

    public CarStats_Telescoping_Constructor_Pattern(double weightInKiloGrams, Color primaryColor, Color secondaryColor, int milesPerGallon, double lengthInMillimeters) {
        this(weightInKiloGrams, primaryColor, secondaryColor, milesPerGallon, lengthInMillimeters, 0);
    }

    public CarStats_Telescoping_Constructor_Pattern(double weightInKiloGrams, Color primaryColor, Color secondaryColor, int milesPerGallon, double lengthInMillimeters, int brakeHorsePower) {
        this(weightInKiloGrams, primaryColor, secondaryColor, milesPerGallon, lengthInMillimeters, brakeHorsePower, 0.00);
    }

    public CarStats_Telescoping_Constructor_Pattern(double weightInKiloGrams, Color primaryColor, Color secondaryColor, int milesPerGallon, double lengthInMillimeters, int brakeHorsePower, double zeroToSixty) {
        this.weightInKiloGrams = weightInKiloGrams;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.milesPerGallon = milesPerGallon;
        this.lengthInMillimeters = lengthInMillimeters;
        this.brakeHorsePower = brakeHorsePower;
        this.zeroToSixty = zeroToSixty;
    }
}
