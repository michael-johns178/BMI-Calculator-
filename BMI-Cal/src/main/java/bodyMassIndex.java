import java.text.DecimalFormat;
import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much do you weigh?");
        double weight = input.nextDouble();

        System.out.println("How tall are you?");
        int heightFeet = input.nextInt();

        System.out.println("Enter height inches.");
        int heightInInches = input.nextInt();

        int totalHeightInInches = (heightFeet * 12) + heightInInches;
        input.close();
        double bmi = weight / Math.pow(totalHeightInInches,2) * 703;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is: " + df.format(bmi));

    }
}
