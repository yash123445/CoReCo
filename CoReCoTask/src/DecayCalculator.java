import java.util.*;

public class DecayCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the initial mass of the material: ");
            double initialMass = scanner.nextDouble();

            System.out.print("Enter the time in years for a half life to elapse: ");
            double halfLifeYears = scanner.nextDouble();

            System.out.print("Enter the number of half lives: ");
            int halfLives = scanner.nextInt();

            calculateDecay(initialMass, halfLifeYears, halfLives);
        }

        public static void calculateDecay(double initialMass, double halfLifeYears, int halfLives) {
            double remainingMass = initialMass / Math.pow(2, halfLives);
            double years = halfLifeYears * halfLives;

            System.out.println("Remaining mass: " + remainingMass);
            System.out.println("Years: " + years);
        }
    }
