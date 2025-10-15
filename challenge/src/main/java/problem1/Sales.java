package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Salespeople:");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int max = 0;
        int maxId = 1;
        int min1 = 0;
        int minId = 1;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            if ( i == 0) {
                min1 = sales[i];
                max = sales[i];
            }
            if (max < sales[i]){
                max = sales[i];
                maxId = i+1;

            }
            if (min1 > sales[i]){
                min1 = sales[i];
                minId = i+1;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];

        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sale: " + sum/SALESPEOPLE);
        System.out.println("\nSalesperson " +maxId+"had the highest sale with $"+max);
        System.out.println("\nSalesperson " +minId+"had the lowest sale with $"+min1);
        System.out.println("Search for salesPeople who exceed this amount:");
        int amount = scan.nextInt();
        int counter = 0;
        for (int i = 0;i<sales.length;i++){
            if (sales[i]>=amount){
                counter++;
                System.out.println("The saleperson "+(i+1)+" has an amount of $"+sales[i]);
            }
        }
        System.out.println("The total number of salespeople whose sales exceeded this amount "+counter);
    }
}