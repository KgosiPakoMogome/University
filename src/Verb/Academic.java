package src.Verb;
public class Academic{
    private double gpa;

    public Academic(double gpa){
        SetGpa(gpa);
    }
    public void SetGpa(double gpa){
        if (gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        }
        else{
            this.gpa = 0.0;
        }
    }

}