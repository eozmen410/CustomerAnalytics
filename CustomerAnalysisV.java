import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CustomerAnalysisV extends JFrame {

    private JPanel content;
    private JLabel welcomeMessage, ageLabel, nameLabel, genderLabel, femaleLabel,
            maleLabel, youngLabel, adultLabel, seniorLabel;
    private JTextField ageIn, nameIn, nbFemale, nbMale, nbSenior, nbAdult, nbYoung;
    private JButton addCustomerButton;
    private ButtonGroup genderButtons;
    private JRadioButton femaleButton;
    private JRadioButton maleButton;
    private CustomerListSet model;

    public CustomerAnalysisV() {
        super("Customer Stats");
        model = new CustomerListSet();
        content = new JPanel();
        this.setContentPane(content);
        this.pack();
        content.setLayout(new GridLayout(32,0));
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComponents();
        addComponents();
    }

    private void initializeComponents() {
        welcomeMessage = new JLabel("Enter customer stats.");
        ageLabel = new JLabel("Age:", SwingConstants.LEFT);
        nameLabel = new JLabel("Name:", SwingConstants.LEFT);
        genderLabel = new JLabel("Gender:", SwingConstants.LEFT);
        ageIn = new JTextField(8);
        nameIn = new JTextField(9);
        genderButtons = new ButtonGroup();
        femaleButton = new JRadioButton("Female");
        maleButton = new JRadioButton("Male");
        genderButtons.add(femaleButton);
        genderButtons.add(maleButton);
        addCustomerButton = new JButton("Add Customer");
        femaleLabel = new JLabel("Number of Female Customers: ");
        maleLabel = new JLabel("Number of Male Customers: ");
        adultLabel = new JLabel("Number of Adult Customers: ");
        seniorLabel = new JLabel("Number of Senior Customers: ");
        youngLabel = new JLabel("Number of Young Customers:");
        nbFemale = new JTextField();
        nbMale = new JTextField();
        nbAdult = new JTextField();
        nbSenior = new JTextField();
        nbYoung = new JTextField();
        nbFemale.setEditable(false);
        nbMale.setEditable(false);
        nbSenior.setEditable(false);
        nbAdult.setEditable(false);
        nbYoung.setEditable(false);
    }

    private void addComponents() {
        this.add(welcomeMessage);
        this.add(nameLabel);
        this.add(nameIn);
        this.add(ageLabel);
        this.add(ageIn);
        this.add(genderLabel);
        this.add(femaleButton);
        this.add(maleButton);
        this.add(addCustomerButton);
        this.add(femaleLabel);
        this.add(nbFemale);
        this.add(maleLabel);
        this.add(nbMale);
        this.add(seniorLabel);
        this.add(nbSenior);
        this.add(adultLabel);
        this.add(nbAdult);
        this.add(youngLabel);
        this.add(nbYoung);
    }

    public int getInputAge() {
        return Integer.parseInt(ageIn.getText());
    }

    public Gender getInputGender() {
        if(femaleButton.isSelected()) {
            return Gender.FEMALE;
        } else {
            return Gender.MALE;
        }
    }

    public String getInputName() {
        return nameIn.getText();
    }

    public void setNbFemale(int number) {
        nbFemale.setText(number+"");
        nbFemale.setBackground(Color.ORANGE);
    }

    public void setNbMale (int number) {
        nbMale.setText(number + "");
        nbMale.setBackground(Color.ORANGE);
    }

    public void setNbSenior(int number) {
        nbSenior.setText(number + "");
        nbSenior.setBackground(Color.ORANGE);
    }

    public void setNbAdult(int number) {
        nbAdult.setText(number + "");
        nbAdult.setBackground(Color.ORANGE);
    }

    public void setNbYoung(int number) {
        nbYoung.setText(number + "");
        nbYoung.setBackground(Color.ORANGE);
    }

    public void addCustomerListener (ActionListener actionListener) {
        addCustomerButton.addActionListener(actionListener);
    }

    public CustomerListSet getModel() {
        return model;
    }
}
