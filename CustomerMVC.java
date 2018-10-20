public class CustomerMVC {

    public static void main(String[] args) {
        CustomerAnalysisV view = new CustomerAnalysisV();
        CustomerAnalysisC cont = new CustomerAnalysisC(view);
        view.setVisible(true);
    }
}
