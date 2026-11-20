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
        if (this.state.getMentalLoad()<10){
            this.state.study();
        } else {
         this.state=new BurnOut(this);   
        }
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