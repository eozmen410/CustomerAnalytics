import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerAnalysisC {

    private CustomerAnalysisV view;
    private CustomerListSet model;

    public CustomerAnalysisC(CustomerAnalysisV v) {
        view = v;
        model = v.getModel();
        view.addCustomerListener(new CustomerListener());
    }

    class CustomerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int age = view.getInputAge();
            String name = view.getInputName();
            Gender gender = view.getInputGender();
            model.addCustomer(name, age , gender);
            view.setNbFemale(model.numberOfFemaleCustomers());
            view.setNbMale(model.numberOfMaleCustomers());
            view.setNbSenior(model.numberOfSeniorCustomers());
            view.setNbAdult(model.numberOfAdultCustomers());
            view.setNbYoung(model.numberOfYoungCustomers());
        }
    }

}
