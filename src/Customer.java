public class Customer {
    // set up member variables
    private String name = null;
    private String postcode = null;
    private int telephone = 0;
    private int customerId = 0;
    private static int customerCount = 001;
    public Customer(String cName, String pcode, int tel) {
// set the member variables
        name = cName;
        postcode = pcode;
        telephone = tel;
        customerId = customerCount++;
    }
    public int getCustomerNumber () {
        return customerId;
    }
    public String getName () {
        return name;
    }
    public String getPostcode () {
        return postcode;
    }
}