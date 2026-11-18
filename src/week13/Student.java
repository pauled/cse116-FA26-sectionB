package week13;

public class Student{
    private MentalState state;

    public Student(){
        this.state=new Calm(this);
    }
    public void setState(MentalState state){
        this.state=state;
    }
    public void study(){
        this.state.study();
    }
    public void getCloserExam(){
        this.state.getCloserExam();
    }
    public void expressFeelings(){
        this.state.expressFeelings();
    }
    public void passClass(){
        this.state=new Chillin(this);
    }
    public void goofOff(){
        this.state.goofOff();
    }
}