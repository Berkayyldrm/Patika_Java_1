public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(checkWeight()){
            long select = whoStart();
            if (select == 0) System.out.println(f1.name + " Started to fight");
            else System.out.println(f2.name + " Started to fight");

            while(f1.health>0 && f2.health>0) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("New Round");
                if (select == 0) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                } else if (select == 1) {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        }else System.out.println("No capable of fighter weight for fight.");

    }

    public boolean checkWeight(){
        return (f1.weight <= this.maxWeight && f1.weight >= minWeight) && (f2.weight <= this.maxWeight && f2.weight >= minWeight);
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Health \t:" + f1.health);
        System.out.println(f2.name + " Health \t:" + f2.health);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Winner : " + f1.name);
            return true;
        }

        return false;
    }

    public long whoStart() {
        return Math.round(Math.random());
    }

}
