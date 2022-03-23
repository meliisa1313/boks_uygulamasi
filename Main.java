
public class Main {
    public static void main(String[] args) {
    Fighter f1=new Fighter("Muhammet Ali",10,120,100);
    Fighter f2=new Fighter("Recep ",20,85,85);

    Match match=new Match(f1,f2,80,110);
    match.MatchRun();


    }
}
