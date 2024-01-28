import java.util.Date;
public class IssueBikeUI {
    // Set up the member variables
    private Bike chosenBike = null;
    private Customer customer = null;
    private Payment payment = null;
    private Hire hire = null;
    private int numberOfDays = 0;

    public void showBikeDetails(int bikeNum) {
// Find the bike by its number
        chosenBike = Bike.findBikeByNumber(bikeNum);
        if (chosenBike != null) {
// then ask it for its details
            chosenBike.showDetails();
        }
    }

    public void calculateCost(int numDays) {
// set the member variable so it can be used later
        numberOfDays = numDays;
// then ask the bike for the cost
        chosenBike.calculateCost(numDays);
    }

    public void createCustomer(String name, String postcode, int telephone) {
// Create a customer and associated hire and payment
        customer = new Customer(name, postcode, telephone);
        payment = new Payment(customer);
        hire = new Hire(new Date(), numberOfDays, chosenBike, customer);
    }

    public void calculateTotalPayment() {
// get the total payment from the payment object
        payment.calculateTotalPayment(hire);
    }
}