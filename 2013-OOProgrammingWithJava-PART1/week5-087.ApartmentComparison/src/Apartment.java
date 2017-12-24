
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        // Compare size of this apartment to another apartment instance,
        // return true if this apartment is larger, otherwise return false.
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int price(Apartment apartment) {
        // Return the price of the apartment instance passed as argument
        return apartment.pricePerSquareMeter * apartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        // Return absolute price difference between this apartment and
        // the apartment passed as argument
        return Math.abs(price(this) - price(otherApartment));
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        // Return true of this apartment has a higher price than the apartment
        // passed as argument, otherwise return false.
        return (price(this) > price(otherApartment));
    }
    
}
