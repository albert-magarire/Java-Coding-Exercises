import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<MyPlayer> list = new ArrayList();

        MyPlayer p1 = new MyPlayer(1, "Liv", 2);
        MyPlayer p2 = new MyPlayer(2, "Jim", 14);
        MyPlayer p3 = new MyPlayer(3, "Tim", 15);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        //displaying list items
        for (int i=0; i<list.size(); i++){

            MyPlayer p=list.get(i);
            System.out.println(p.toString());
        }
    }

    public MyPlayer deepCopy(){
        return new MyPlayer(this.id, this.name, this.power);
    }
}
