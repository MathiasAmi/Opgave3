import java.lang.Math;
import java.util.Scanner;

public class Opgave3_1 {

    public static void main(String[] args) {
//Opgave 3.1

        System.out.println("");
        System.out.println("Opgave 3.1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b c:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = Math.pow(b, 2) - 4*a*c;

        if (discriminant > 0){
            double r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
            System.out.println("root 1 is:" + r1 + "and the second root is:" + r2);
        }
            else if (discriminant == 0){
            double root = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
            System.out.println("There is only one root, which is:" + root);
        }
            else{
            System.out.println("There are no roots");


        }

//Opgave 3.2
        System.out.println("Opgave 3.2");
            int nr1 = (int) Math.floor((Math.random()*100)+1);
            int nr2 = (int) Math.floor((Math.random()*100)+1);
        System.out.println(nr1 + " + " + nr2 + " = ?");
        int answer = nr1 + nr2;
        int input = sc.nextInt();

        if (answer == input) {
            System.out.println("Correct");}
            else {
            System.out.println("Wrong");}

//Opgave 3.3
        System.out.println("Opgave 3.3");
        System.out.println("Enter a, b, c, d, e and f:");
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();
            double D = sc.nextDouble();
            double E = sc.nextDouble();
            double F = sc.nextDouble();

        if((A * D) - (B * C) != 0){
            double x = ((E * D) - (b * F)) / ((a * D) - (b * c));
            double y = ((A * F) - (E * c)) / ((a * D) - (b * c));
            System.out.println("x is " + x + " and y is " + y);
        } else {
            System.out.println("The equation has no solution");
            }
//Opgave 3.4
        System.out.println("Opgave 3.4");
        int randomMonth = ((int) (System.currentTimeMillis() %12))-1;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Random month: " + months[randomMonth]);

        


        }

        }




