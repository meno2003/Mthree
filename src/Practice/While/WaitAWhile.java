package Practice.While;

public class WaitAWhile {


    public static void main(String[] args){
        int timeNow = 5;
        int bedTime = 10;


        while(timeNow<bedTime){
            System.out.println(" its ok its not your bedtime yet, its only " + timeNow + " O Clock");
            timeNow++;
         }
        System.out.println("oh its " + timeNow);
        System.out.println("guess i shd go to sleep now");

    }
}