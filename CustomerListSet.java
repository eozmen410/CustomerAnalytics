public class CustomerListSet implements CustomerAnalytics{

    private LinkedSet<Customer> femaleCustomers, maleCustomers,
            seniorCustomers, adultCustomers, youngCustomers;

    public CustomerListSet() {
        femaleCustomers = new LinkedSet<>();
        maleCustomers = new LinkedSet<>();
        seniorCustomers =  new LinkedSet<>();
        adultCustomers =  new LinkedSet<>();
        youngCustomers =  new LinkedSet<>();
    }

    public void addCustomer(Customer customer) {
        checkGender(customer);
        checkAge(customer);
    }

    public void addCustomer(String name, int age, Gender gender) {
        Customer customer = new Customer(name, age, gender);
        addCustomer(customer);
    }

    public void addCustomerSet(java.util.List<Customer> customerList) {
        for (Customer customer : customerList) {
            this.addCustomer(customer);
        }
    }

    private void checkGender(Customer customer) {
        if(customer.isFemale()) {
            femaleCustomers.add(customer);
        } else if(customer.isMale()) {
            maleCustomers.add(customer);
        }
    }

    private void checkAge(Customer customer) {
        if(customer.isSenior()) {
            seniorCustomers.add(customer);
        } else if (customer.isAdult()) {
            adultCustomers.add(customer);
        } else {
            youngCustomers.add(customer);
        }
    }

    public int numberOfFemaleCustomers() {
        return femaleCustomers.size();
    }


    public int numberOfMaleCustomers() {
        return maleCustomers.size();
    }


    public int numberOfSeniorCustomers() {
        return seniorCustomers.size();
    }


    public int numberOfAdultCustomers() {
        return adultCustomers.size();
    }


    public int numberOfYoungCustomers() {
        return youngCustomers.size();
    }

    public String toString() {
        String message = "Female Customers: " + femaleCustomers.toString() +
                "\nMale Customers: " + maleCustomers.toString() + "\nSenior Customers: " +
                seniorCustomers.toString() + "\nAdult Customers: " + adultCustomers.toString() +
                "\nYoung Customers: " + youngCustomers.toString();
        return message;
    }
}
