package week13;

public abstract class MentalState{
    protected Student brain;
    protected static int mentalLoad=0;

    public MentalState(Student student){
        this.brain=student;
    }
    public void study(){
        this.mentalLoad+=1;
    }
    public abstract void getCloserExam();
    public abstract void expressFeelings();
    public void goofOff(){
        System.out.println("I needed that time off");
    }
    public int getMentalLoad(){
        return this.mentalLoad;
    }
}