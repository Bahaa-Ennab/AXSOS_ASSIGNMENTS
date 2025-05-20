public class Bat extends Mammals{
    public Bat(){
        energy=300;
    }
    public void fly(){
        energy-=50;
        System.out.println("Death from abooooovvveeeeeeee!!!"); 
    }
    public void eatHumans(){
        energy+=50;
        System.out.println("Cruncy Bones (Eating sounds)"); 
    }
    public void attackTown(){
        energy-=100;
        System.out.println("Thsoe who lived will suffer from their memories"); 
    }
    

}


