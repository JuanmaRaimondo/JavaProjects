package JavaProjects.primerProyecto;

public class Main {
    public static void main(String[] args) {
       /* int numOfSeconds = 0;
        int hour, sec, min;
        int saveNumOfSec;

        numOfSeconds = 3405;
        saveNumOfSec = numOfSeconds;

        if((numOfSeconds > 8400) || (numOfSeconds < 0)){
            System.out.println("Incorrect value");
            return;
        }

        hour = numOfSeconds / 3600;
        numOfSeconds = numOfSeconds - hour * numOfSeconds ;
        min = numOfSeconds / 60;
        numOfSeconds = numOfSeconds - min * 60;
        sec = numOfSeconds; 

        System.out.println("In " + saveNumOfSec + " Seconds " + hour + "h " + min + "min " + sec + "sec"); 


        int a = 16, b = 18, c = 11, d = 3;

        int count = 0;

        if(a % 2 == 0){
            count ++;
        }
        if(b % 2 == 0){
            count ++;
        }
        if(c % 2 == 0){
            count ++;
        }
        if(d % 2 == 0){
            count ++;
        }
        if (count > 2){
            System.out.println("YES. There are more than two even numbers in the sequence");
        }else{
            System.out.println("NO. There are no more than two even numbers in the sequence");}

          */  double a = 10, b = 8;
		double x = 9, y = 9, z = 20;
 
		if ((a > x) & (b > y)) {
			System.out.println("It will pass.");
		} else if ((a > y) & (b > x)) {
			System.out.println("It will pass.");
		} else if ((a > x) & (b > z)) {
			System.out.println("It will pass.");
		} else if ((a > z) & (b > x)) {
			System.out.println("It will pass.");
		} else if ((a > y) & (b > z)) {
			System.out.println("It will pass.");
		} else if ((a > z) & (b > y)) {
			System.out.println("It will pass.");
		} else {
			System.out.println("Will not pass.");
		}
    }
}
