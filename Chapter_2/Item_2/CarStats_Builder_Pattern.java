/**
 * Created by Trevor Jackson on 01-Jan-2017.
 */
public class CarStats_Builder_Pattern {

    private final double weightInKiloGrams;
    private final Color primaryColor;
    private final Color secondaryColor;
    private final int milesPerGallon;
    private final double lengthInMillimeters;
    private final int brakeHorsePower;
    private final double zeroToSixty;

    public static class Builder {

        private double weightInKiloGrams = 0.00;
        private Color primaryColor = Color.UNKNOWN;
        private Color secondaryColor = Color.UNKNOWN;
        private int milesPerGallon = 0;
        private double lengthInMillimeters = 0.00;
        private int brakeHorsePower = 0;
        private double zeroToSixty = 0.00;

        public Builder() {
        }

        public Builder weightInKiloGrams(double weightInKiloGrams) {
            this.weightInKiloGrams = weightInKiloGrams;
            return this;
        }

        public Builder primaryColor(Color primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        public Builder secondaryColor(Color secondaryColor) {
            this.secondaryColor = secondaryColor;
            return this;
        }

        public Builder milesPerGallon(int milesPerGallon) {
            this.milesPerGallon = milesPerGallon;
            return this;
        }

        public Builder lengthInMillimeters(double lengthInMillimeters) {
            this.lengthInMillimeters = lengthInMillimeters;
            return this;
        }

        public Builder brakeHorsePower(int brakeHorsePower) {
            this.brakeHorsePower = brakeHorsePower;
            return this;
        }

        public Builder zeroToSixty(double zeroToSixty) {
            this.zeroToSixty = zeroToSixty;
            return this;
        }

        public CarStats_Builder_Pattern build() {
            return new CarStats_Builder_Pattern(this);
        }
    }

    private CarStats_Builder_Pattern(Builder builder) {
        weightInKiloGrams = builder.weightInKiloGrams;
        primaryColor = builder.primaryColor;
        secondaryColor = builder.secondaryColor;
        milesPerGallon = builder.milesPerGallon;
        lengthInMillimeters = builder.lengthInMillimeters;
        brakeHorsePower = builder.brakeHorsePower;
        zeroToSixty = builder.zeroToSixty;
    }
}
