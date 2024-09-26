public class Cat extends Pet{
    Cat(int age, double adoptionCost, double dailyExpenses){
        this.species = "Cat";
        setAdoptionCost(adoptionCost);
        setDailyExpenses(dailyExpenses);
        setAge(age);
    }

    @Override
    public void speak(){
        System.out.println("Meow Meow");
    }
}
