import java.util.Scanner;

/***   APP That  COUNTS THE DIAMETER OF A CIRCLE BASED ON THE USER RADIUS INPUT
 * @ author Mouloud El guellab
 * @ version 11/10/2022
 */


public class Main {
    public static void main(String[] args)
    {


        System.out.println("Hi there ! Welcome to diameter and area calculator of any circle :) "+"\n");
        System.out.println("****************************************************************"+"\n\tPlease foloow the" +
                " instruction below !"+"\n"+"\n*************************************************************"+"\n  ");
        System.out.println("Please enter the Radius of your Circle");
        Scanner Input = new Scanner(System.in);

        double radius ;
        radius =Input.nextDouble();
        final double  pi=3.142;
        double diameter = (2*radius),area =(radius*radius)*pi;
        System.out.println(" Thank you");
        System.out.println(" The diameter of your circle = " + diameter);
        System.out.println(" The area of your circle = "+ area);
        System.out.println(" Bye  thank you ");

    }
}