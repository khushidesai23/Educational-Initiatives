import java.util.ArrayList;
import java.util.List;

// Subject
class WeatherData {
    private List<Observer> observers;
    private float temperature;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

// Observer
interface Observer {
    void update(float temperature);
}

// Concrete Observer
class CurrentConditionsDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Current temperature: " + temperature);
    }
}
