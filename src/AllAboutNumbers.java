import  java.util.Scanner;

public class AllAboutNumbers
{
    public static void main(String args[])
    {

    Scanner keyboard = new Scanner(System.in);

    int num1,num2, num3;
    int highest =0;
    int lowest =0;
    int sum =0;
    int product =0;
    double average =0;

        System.out.println("please enter 3 numbers?");
        num1 =keyboard.nextInt();
        num2 =keyboard.nextInt();
        num3 =keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Your numbers are " + num1 +", " +num2 +" and " + num3);

        // calculate the highest number
        highest = getHighest(num1,num2,num3);
        System.out.println("The highest number is " + highest);

        // calculate the lowest number
        lowest = getLowest(num1,num2,num2);
        System.out.println("The lowest number is " + lowest);

        // calculate the sum of the numbers
        sum = getSum(num1, num2, num3);
        System.out.println("The sum of the numbers is " + sum);

        // calculate the product
        product = getproduct(num1,num2,num3);
        System.out.println("The product of the numbers is " + product);

        // calcutate the average
        average = getaverage(num1,num2,num3);
        double averageRound = Math.round (average * 100.0) / 100.0;
        System.out.println("The average of the numbers is "+ averageRound);

}
public static int getHighest(int num1, int num2, int num3){
        if (num1 > num2){
            if (num1 > num3){
                return num1;


            }else if (num2 > num3)
                return num2;
                else return num3;

            } else if (num2 > num3)
                return num2;
        else return num3;



}
    public static int getLowest(int num1, int num2, int num3){
        if (num1 < num2){
            if (num1 < num3){
                return num1;


            }else if (num2 < num3)
                return num2;
            else return num3;

        } else if (num2 < num3)
            return num2;
        else return num3;



    }

public static int getSum(int num1, int num2, int num3){
        return num1+num2+num3;

}
    public static int getproduct(int num1, int num2, int num3){
        return num1*num2*num3;

    }
    public static double getaverage(int num1, int num2, int num3){
        double localSum = num1+num2+num3;
        return localSum/3;

    }
}
