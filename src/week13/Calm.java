package week13;

public class Calm extends MentalState{
    public Calm(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("remaining calm");
    }
    public void getCloserExam(){
        this.brain.setState(new Panic(this.brain));
    }
    public void expressFeelings(){
        System.out.println("I am a leaf on the wind");
    }
}