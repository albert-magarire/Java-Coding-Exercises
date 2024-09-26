public class Dog extends Pet{
    Dog(int age, double adoptionCost, double dailyExpenses){
        this.species = "Dog";
        setAdoptionCost(adoptionCost);
        setDailyExpenses(dailyExpenses);
        setAge(age);
    }

    @Override
    public void speak(){
        System.out.println("Wooff Wooff");
    }
}
