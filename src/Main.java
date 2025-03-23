import java.util.Scanner;

public class Main {
    private double num1, num2;
    Main(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to my Calculator App");
        System.out.print("\nEnter num1: ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = in.nextDouble();

        Main ob = new Main(num1, num2);

        System.out.println("\nMenu:");
        System.out.println("\t1. Add");
        System.out.println("\t2. Subtract");
        System.out.println("\t3. Multiply");
        System.out.println("\t4. Divide");
        System.out.print("\t-> ");
        int opt = in.nextInt();

        switch (opt) {
            case 1:
                System.out.println("\n\tAddition of " + num1 + " and " + num2 + " = " + ob.add(num1, num2));
                break;

            case 2:
                System.out.println("\n\tSubtraction of " + num2 + " from " + num1 + " = " + ob.subtract(num1, num2));
                break;

            case 3:
                System.out.println("\n\tMultiplication of " + num1 + " and " + num2 + " = " + ob.multiply(num1, num2));
                break;

            case 4:
                System.out.println("\n\tDivision of " + num1 + " by " + num2 + " = " + ob.divide(num1, num2));
                break;
        
            default:
                break;
        }        
        
        in.close();
    }
}
