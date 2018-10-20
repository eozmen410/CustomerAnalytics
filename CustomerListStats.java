public class CustomerListStats implements CustomerAnalytics {

    private int numberOfFemaleCustomers, numberOfMaleCustomers,
            numberOfSeniorCustomers,  numberOfAdultCustomers, numberOfYoungCustomers;

    public CustomerListStats() {
        numberOfAdultCustomers = 0;
        numberOfFemaleCustomers = 0;
        numberOfMaleCustomers = 0;
        numberOfSeniorCustomers = 0;
        numberOfYoungCustomers = 0;
    }

    public void addCustomer(Customer customer) {
        checkGender(customer);
        checkAge(customer);
    }

    private void checkGender(Customer customer) {
        if(customer.isFemale()) {
            numberOfFemaleCustomers++;
        } else if(customer.isMale()) {
            numberOfMaleCustomers++;
        }
    }

    private void checkAge(Customer customer) {
        if(customer.isSenior()) {
            numberOfSeniorCustomers++;
        } else if (customer.isAdult()) {
            numberOfAdultCustomers++;
        } else {
            numberOfYoungCustomers++;
        }
    }

    public int numberOfFemaleCustomers() {
        return numberOfFemaleCustomers;
    }

    public int numberOfMaleCustomers() {
        return numberOfMaleCustomers;
    }

    public int numberOfSeniorCustomers() {
        return numberOfSeniorCustomers;
    }

    public int numberOfAdultCustomers() {
        return numberOfAdultCustomers;
    }

    public int numberOfYoungCustomers() {
        return numberOfYoungCustomers;
    }

    public String toString() {
        return "Number of Female Customers: " + numberOfFemaleCustomers +
                "\nNumber of Male Customers: " + numberOfMaleCustomers + "\nNumber of Senior Customers: " +
                numberOfSeniorCustomers +"\nNumber of Adult Customers: " + numberOfAdultCustomers +
                "\nNumber of Young Customers: " + numberOfYoungCustomers;
    }



}
