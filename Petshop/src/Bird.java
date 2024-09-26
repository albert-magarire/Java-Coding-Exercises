public class Bird extends Pet{
    Bird(int age, double adoptionCost, double dailyExpenses){
        this.species = "Bird";
        setAdoptionCost(adoptionCost);
        setDailyExpenses(dailyExpenses);
        setAge(age);
    }
}
