package week13;

public class Chillin extends MentalState{
    public  Chillin(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("I'm that kind of student");
    }
    public void getCloserExam(){
        System.out.println("that was a nightmare, I'm done");
    }
    public void expressFeelings(){
        System.out.println("I finished!");
    }
    public void goofOff(){
        System.out.println("I always goof off");
    }
}