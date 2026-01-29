import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState) {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Error: Arm precision must be 0.0-1.0");
            return -1;
        }

        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Error: Worker density must be 1-20");
            return -1;
        }

        double machineRiskFactor = 1.0; // placeholder (mapping comes later)
        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Arm Precision (0.0 - 1.0):");
        double armPrecision = sc.nextDouble();

        System.out.println("Enter Worker Density (1 - 20):");
        int workerDensity = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
        String machineryState = sc.nextLine();

        double risk = calculateHazardRisk(armPrecision, workerDensity, machineryState);

        if (risk != -1) {
            System.out.println("Robot Hazard Risk Score: " + risk);
        }

        sc.close();
    }
}
