/**
 * Created by Trevor Jackson on 01-Jan-2017.
 */
public class ConversionUtilityClass {

    private ConversionUtilityClass() {
        throw new AssertionError();
    }

    public double milesToKilometers(double miles) {
        return miles * 1.609344;
    }

    public double kilometersToMiles(double kilometers) {
        return kilometers / 1.609344;
    }

    public double litresToUSGallons(double liters) {
        return liters * 0.2641721;
    }

    public double USGallonsToLitres(double USGallons) {
        return USGallons / 0.2641721;
    }
}
