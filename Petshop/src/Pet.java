public class Pet {
    int age;
    String species;
    double adoptionCost;
    double dailyExpenses;

    @Override //Override method to format output
    public String toString(){
        return "Age:  " + this.age + "    Species: " + this.species;
    }

    public void speak(){
        System.out.println("I am just a pet");
    }

    public void speak(int x){
        for (int i = 0; i < x; i++)
        System.out.println("I am just a pet");
    }

    //Getters & Setters with Data Validation
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 10)
        this.age = age;
        else
        this.age = 2;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public double getAdoptionCost() {
        return adoptionCost;
    }
    public void setAdoptionCost(double adoptionCost) {
        if (adoptionCost > 0 && adoptionCost < 50)
        this.adoptionCost = adoptionCost;
        else
        this.adoptionCost = 20;
    }
    public double getDailyExpenses() {
        return dailyExpenses;
    }
    public void setDailyExpenses(double dailyExpenses) {
        if(dailyExpenses > 10 && dailyExpenses < 50)
        this.dailyExpenses = dailyExpenses;
        else
        this.dailyExpenses = 10;
    }
    
}
