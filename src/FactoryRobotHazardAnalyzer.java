import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Arm Precision (0.0 - 1.0):");
        double armPrecision = sc.nextDouble();

        System.out.println("Enter Worker Density (1 - 20):");
        int workerDensity = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
        String machineryState = sc.nextLine();

        // UC3: calculate risk score (no validation, no mapping yet)
        double machineRiskFactor = 1.0; // placeholder for now
        double riskScore = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);

        System.out.println("Robot Hazard Risk Score: " + riskScore);

        sc.close();
    }
}
