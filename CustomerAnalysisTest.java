import java.util.Arrays;
import java.util.List;

public class CustomerAnalysisTest {

    public static void main(String[] args) {
        Customer c1 = new Customer("A", 65, Gender.MALE);
        Customer c2 = new Customer("B", 23, Gender.FEMALE);
        Customer c3 = new Customer("C", 43, Gender.MALE);
        Customer c4 = new Customer("D", 32, Gender.MALE);
        Customer c5 =  new Customer("E", 19, Gender.FEMALE);

        List<Customer> customers = Arrays.asList(c1, c2, c3, c4, c5);

        CustomerListSet testList = new CustomerListSet();
        testList.addCustomerSet(customers);
        System.out.println(testList);
    }
}
