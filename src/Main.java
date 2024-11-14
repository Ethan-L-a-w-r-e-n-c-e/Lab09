import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] dataPoints = new int[100];
        int sum = 0;
        int average = 0;
        int min;
        int max;
        int userNum;
        int count = 0;
        boolean numFound = false;
        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = (int)(Math.random()*100)+1;
            System.out.print(dataPoints[i] + " ");
        }
        System.out.println();
        min = dataPoints[0];
        max = dataPoints[0];
        for (int x : dataPoints){
            sum += x;
            average += x;
            if(min > x){
                min = x;
            }
            if(max < x){
                max = x;
            }
        }
        average /= dataPoints.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        userNum =  InputHelper.getRangedInt(scan, "What num do you want look for", 1, 100);
        for (int x : dataPoints){
            if(userNum == x){
                count++;
            }
        }
        System.out.println("The number " + userNum + " was found " + count + " times.");
        userNum = InputHelper.getRangedInt(scan, "What num do you want look for", 1, 100);
        for (int i = 0; i < dataPoints.length; i++){
            if(userNum == dataPoints[i]){
                System.out.println("Your "+ userNum +" is in the index position " + i);
                numFound = true;
                break;
            }
        }

        if(!numFound){
            System.out.println("Your number was not in the array");
        }
    }
}