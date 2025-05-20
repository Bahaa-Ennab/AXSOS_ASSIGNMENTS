public class Device {
    public int battery = 100;

    public int batteryLife(){
        if(battery<10){
            System.out.println("battery is lower than 10");
        }
        else{
            System.out.println(battery);
        }
        return battery;
    }
}

