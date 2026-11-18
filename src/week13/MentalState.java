package week13;

public abstract class MentalState{
    protected Student brain;

    public MentalState(Student student){
        this.brain=student;
    }
    public abstract void study();
    public abstract void getCloserExam();
    public abstract void expressFeelings();
    public void goofOff(){
        System.out.println("I needed that time off");
    }
}