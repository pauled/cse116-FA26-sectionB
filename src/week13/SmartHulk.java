package week13;

public class SmartHulk implements State{
    private BruceBanner banner;

    public SmartHulk(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        System.out.println("yes, I'm angry");
    }
    public void calmDown(){
        System.out.println("I'm calm, so?");
    }
    public void useCar(Car car){
        car.drive(true);
    }
    public void fight(){
        System.out.println("Smash delicately");
    }
}