import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> inputList = MyFile.readFile("PetData.csv");
        ArrayList<String> petList = new ArrayList(); 

        for (int i = 0; i < inputList.size(); i++){
            String info = inputList.get(i);
            String fields[] = info.split(",");
            int choice = Integer.parseInt(fields[0].trim());
            
            Pet pet;
            if(choice == 1){

                Cat cat = new Cat(Integer.parseInt(fields[1].trim()),
                Double.parseDouble(fields[2].trim()),
                Double.parseDouble(fields[3].trim()));
                petList.add(cat);

            } else if (choice == 2){

                Dog dog = new Dog(Integer.parseInt(fields[1].trim()),
                Double.parseDouble(fields[2].trim()),
                Double.parseDouble(fields[3].trim()));
                petList.add(dog);
            }
        }
        ArrayList<Pet> pet = new ArrayList();
        Cat cat1 = new Cat(4, 25, 12.45);
        Dog dog1 = new Dog(7, 18, 15.92);
        Bird bird1 = new Bird(7, 18, 15.92);
        pet.add(cat1);
        pet.add(dog1);
        pet.add(bird1);

        for( int i=0; i<10; i++){
            int num=(int)(Math.random()*100+1)%3;
            if(num==1){
              Cat cat1=new Cat(4,25,12.45);
              pet.add(cat1);
            }
            else if(num==2){
              Dog dog1= new Dog(4,35.50,10.80);
              pet.add(dog1);
            }
            else{
        Bird bird1= new Bird(4,25.50,20.80);
        pet.add(bird1);
            }
 
       
        }
        for(int i = 0; i < pet.size(); i++){
            pet.get(i).speak();
            System.out.println(pet.get(i).toString());
        }
    }
}
