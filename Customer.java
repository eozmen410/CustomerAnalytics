public class Customer {

    private String name;
    private Gender gender;
    private int age;

    public Customer(String name, int age, Gender gender) {
        if (name.length() >20 || age < 18 || age > 79) {
            throw  new IllegalArgumentException("Invalid input.");
        }
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Customer() {
        name = "";
        gender = null;
        age = 0;
    }

    public Customer(Customer copying) {
        this(copying.name, copying.age, copying.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >20) {
            throw  new IllegalArgumentException("Invlaid input.");
        }
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 79) {
            throw  new IllegalArgumentException("Invlaid input.");
        }
        this.age = age;
    }

    public String toString() {
        return  name + " " + age + " " + gender.toString();
    }

    public boolean isSenior() {
        return age>60;
    }

    public boolean isAdult() {
        return age>30 && age<59;
    }

    public boolean isYoung() {
        return age<30;
    }

    public boolean isFemale() {
        return gender == Gender.FEMALE;
    }

    public boolean isMale() {
        return gender == Gender.MALE;
    }



}
