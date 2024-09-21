class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private DatabaseConnection() {
        // private constructor
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Connected to database");
    }
}
