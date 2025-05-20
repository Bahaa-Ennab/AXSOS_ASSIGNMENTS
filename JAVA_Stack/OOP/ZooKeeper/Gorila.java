public class Gorila extends Mammals {

    public int throwSomething(){
        energy-=5;
        System.out.println("the gorila threw something");
        return energy;
    }
    public int eatBananas(){
        energy-=10;
        System.out.println("the gorila says 'YAM YAM!'");
        return energy;
    }
        public int climp(){
        energy-=10;
        System.out.println("Ahh-ee-ahh-ee-ahh-ee-ahh!");
        return energy;
    }

}
