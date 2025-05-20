public class Phone extends Device{
    public int makeCall(){
        battery-=5;
        return battery;
    }
    public int playGame(){
        if (battery<25){
            System.out.println("the battery is too low to play");
        }
        else{
            battery-=20;
        }
        return battery;
    }
    public int Charge(){
        battery+=50;
        return battery;
    }
}
