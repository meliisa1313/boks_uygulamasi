public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void MatchRun(){
        if (isCheck())
        {while(this.f1.health>0&&this.f2.health>0){
           this.f2.health=f1.hit(this.f2);

           this.f1.health=f2.hit(this.f1);


        }

        }
       else
       {
            System.out.println("bu mac oynananamaz");
       }
    }


    boolean isCheck() {
        return ((this.f1.weight > minWeight) && (this.f1.weight <= maxWeight) && (this.f2.weight > minWeight) && (this.f2.weight <= maxWeight));
    }
}
