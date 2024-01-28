public class Bike {
    // create the BikeList
    protected static Bike[] bikeList = new Bike[5];
    // set up member variables
    protected int deposit = 0;
    protected int rate = 0;
    protected int bikeNumber = 0;

    /* This block is run when the class is loaded and sets up our bike store.
     * It arbitrarily populates the attributes: deposit, rate and bikeNumber */
    static {
        int j = 0;
        for (int i = 10; i < 15; i++) {
            Bike b = new Bike(i, i, (j * 100));
            bikeList[j] = b;
            j++;
        }
    }
    public Bike( int dep, int rat, int num){
// set the member variables
        deposit = dep;
        rate = rat;
        bikeNumber = num;
    }

    public int getDeposit () {
        return deposit;
    }
    public int getRate () {
        return rate;
    }
    public int getBikeNumber () {
        return bikeNumber;
    }
    public static Bike findBikeByNumber ( int bikeNum) {
        int numberOfBikes = bikeList.length;
// iterate over the list of bikes
        for (int i = 0; i < numberOfBikes; i++) {
// if we find the bike with the correct number...
            if (bikeList[i].getBikeNumber() == bikeNum) {
// tell user that we've found it
                System.out.println("Bike with number '" + bikeNum + "' found" + "\n");
// and return it to the UI
                return bikeList[i];
            }
        }
// if we don't find the bike, tell the user and return nothing
        System.out.println("Bike with number '" + bikeNum + "' not found" + "\n");
        return null;
    }
    public void showDetails() {
// print out all the details
        System.out.println("Details for bike number '" + bikeNumber + "'");
        System.out.println("DEPOSIT: " + deposit);
        System.out.println("RATE: " + rate + "\n");
    }
    public void calculateCost(int numberOfDays){
// work out the cost
        int cost = deposit + (rate * numberOfDays);
        System.out.println("COST would be $" + cost + "\n");
    }
}