import java.util.Scanner;

public class SatelliteCommandSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Satellite satellite = new Satellite();
        String command;

        System.out.println("Welcome to the Satellite Command System");
        
        do {
            satellite.displayStatus();
            System.out.println("Enter command (rotate, activate, deactivate, collect, exit):");
            command = scanner.nextLine().trim().toLowerCase();

            try {
                switch (command) {
                    case "rotate":
                        System.out.println("Enter direction (North, South, East, West):");
                        String direction = scanner.nextLine().trim();
                        satellite.rotate(direction);
                        break;
                    case "activate":
                        satellite.activatePanels();
                        break;
                    case "deactivate":
                        satellite.deactivatePanels();
                        break;
                    case "collect":
                        satellite.collectData();
                        break;
                    case "exit":
                        MyLogger.log("Exiting the Satellite Command System.");
                        break;
                    default:
                        MyLogger.log("Invalid command: " + command);
                        System.out.println("Unknown command. Please try again.");
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                MyLogger.log("Error: " + e.getMessage());
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                MyLogger.log("An unexpected error occurred: " + e.getMessage());
                System.out.println("An unexpected error occurred. Please try again.");
            }

        } while (!command.equals("exit"));

        scanner.close();
    }
}
