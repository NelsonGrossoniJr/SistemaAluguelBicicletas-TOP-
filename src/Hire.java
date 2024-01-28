import java.util.Date;

public class Hire {
    private Date startDate = null;
    private Customer customer = null;
    private Bike bike = null;
    private int numberOfDays = 0;
    private int hireId = 0;
    private static int hireCount = 001;

    public Hire(Date sDate, int numDays, Bike bikeToHire, Customer cust) {
        startDate = sDate;
        numberOfDays = numDays;
        customer = cust;
        bike = bikeToHire;
        hireId = hireCount++;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Bike getBike() {
        return bike;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public Date getStartDate() {
        return startDate;
    }
}