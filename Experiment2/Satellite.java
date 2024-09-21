public class Satellite {
    private String orientation;
    private String solarPanels;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanels = "Inactive";
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        if (isValidDirection(direction)) {
            this.orientation = direction;
            MyLogger.log("Satellite rotated to " + this.orientation + ".");
        } else {
            throw new IllegalArgumentException("Invalid direction: " + direction);
        }
    }

    public void activatePanels() {
        this.solarPanels = "Active";
        MyLogger.log("Solar panels activated.");
    }

    public void deactivatePanels() {
        this.solarPanels = "Inactive";
        MyLogger.log("Solar panels deactivated.");
    }

    public void collectData() {
        if (this.solarPanels.equals("Active")) {
            this.dataCollected += 10;
            MyLogger.log("Data collected. Total: " + this.dataCollected + " units.");
        } else {
            throw new IllegalStateException("Cannot collect data. Solar panels are inactive.");
        }
    }

    public void displayStatus() {
        System.out.println("Current Status:");
        System.out.println("Orientation: " + this.orientation);
        System.out.println("Solar Panels: " + this.solarPanels);
        System.out.println("Data Collected: " + this.dataCollected + " units\n");
    }

    private boolean isValidDirection(String direction) {
        return direction.equals("North") || direction.equals("South") ||
               direction.equals("East") || direction.equals("West");
    }
}
