public class Main {
    public static void main(String[] args) {
        /* This little program will run through the methods on IssueBikeUI
         * calling each in turn, like a user with a front end would do. */
// First, create the UI
        IssueBikeUI ui = new IssueBikeUI();
//1. Show details for chosen bike
        ui.showBikeDetails(100);
// 2. Calculate cost of hiring this bike for 5 days
        ui.calculateCost(5);
// 3. Create new customer, payment and hire
        ui.createCustomer("Les Hargreaves", "PW2 6TR", 1462501339);
// 4. Calculate the total cost
        ui.calculateTotalPayment();
    }
}