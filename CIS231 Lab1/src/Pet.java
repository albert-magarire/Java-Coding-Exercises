public class Pet {
    // Decalaring all instance variables 
    private String name;
    private int age;
    private double adoptionCost;

    // Constructor for the defaukt object
    public Pet() {
        this.name = "Unknown";
        this.age = 0;
        this.adoptionCost = 0.0;
    }

    // CReating constructor with arguments/parameters
    public Pet(String _name, int _age, double _adoptionCost) {
        this.name = _name;
        this.age = _age;
        this.adoptionCost = _adoptionCost;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCost() {
        return adoptionCost;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCost(double cost) {
        this.adoptionCost = cost;
    }

    // Using an override in the toString method to format how the output will look
    @Override
    public String toString() {
        return "Name: " + name + "      Age: " + age + " years      Adoption Cost: $" + adoptionCost;
    }
}
