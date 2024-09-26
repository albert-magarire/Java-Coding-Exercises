public class MyPlayer{
    //declare your variables that define the player
    private int id;
    private String name;
    private int power;

    
    public MyPlayer(int id, String name, int power) {
        this.id = id;
        this.name = name;
        if(power <= 2){
            this.power = 10;
        }
        else {
            this.power = power;
        }
        
    }


    @Override
    public String toString() {
        return "Name : " + this.name + "       ID : " + this.id + "       Power : " + this.power;
    }
    
    
    public MyPlayer deepCopy(){
        return new MyPlayer(this.id, this.name, this.power);
    }

}